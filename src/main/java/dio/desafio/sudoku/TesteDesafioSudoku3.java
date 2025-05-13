package dio.desafio.sudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class TesteDesafioSudoku3 {

    private static Map<Integer, Integer> board = new HashMap<Integer, Integer>();

    private static Integer[][] matriz = new Integer[9][9];


    public static void main(String[] args) {
        zeraBoard();
        preencheBoard();
        imprimeBoard();
    }

    public static void zeraBoard() {
        for(int linha = 0; linha <= 8; linha++) {
            for(int coluna = 0; coluna <= 8; coluna++) {
                matriz[linha][coluna] = null;
            }
        }
    }

    public static void preencheBoard() {
        for(int linha = 0; linha <= 8; linha++) {
            for(int coluna = 0; coluna <= 8; coluna++) {
                while (matriz[linha][coluna] == null) {
                    //Integer numero = (int) ((Math.random() * 9) + 1);
                    List<Integer> itensDisponiveis = itensLivresLinha(linha, coluna);
                    //System.out.println("Itens Livres: " + linha + " | " + itensDisponiveis.toString());

                    System.out.println("posicao[" + linha + "][" + coluna +  "] > " + itensDisponiveis.size());
                    Integer numero = 0;
                    if (itensDisponiveis.size() > 0)
                        numero = itensDisponiveis.get(new Random().nextInt(itensDisponiveis.size()));

                    //Integer ocorrencias = 0;
                   // ocorrencias += isValidInLine(linha, numero);
                    //ocorrencias += isValidInColumn(coluna, numero);
                    
                    //System.out.println("posicao[" + linha + "][" + coluna +  "] > " + numero + " Ocorrencias:" + ocorrencias);

                    //if (ocorrencias == 0)
                    matriz[linha][coluna] = numero;
                }
            }

            // for(int coluna = 0; coluna <= 8; coluna++) {
            //     System.out.print(" " + matriz[linha][coluna]);
            // }
            // System.out.println("");
        }
    }

    public static List<Integer> itensLivresLinha(Integer linha, Integer coluna) {
        List<Integer> itensDisponiveis = new ArrayList<Integer>();

        Set<Integer> itensExistentes = new HashSet<Integer>();
        for (int c = 0; c <= 8; c++)
            if (matriz[linha][c] != null)
                itensExistentes.add(matriz[linha][c]);
    
        for (int l = 0; l <= 8; l++)
            if (matriz[l][coluna] != null)
                itensExistentes.add(matriz[l][coluna]);

        //System.out.println(itensExistentes.toString());

        for (int n = 1; n <= 9; n++)
            if (!itensExistentes.contains(n))
                itensDisponiveis.add(n);

        return itensDisponiveis;
    }

    public static Integer isValidInLine(Integer linha, Integer numeroPreenchido) {
        Integer contador = 0;
        for (int coluna = 0; coluna <= 8; coluna++) {
            if (matriz[linha][coluna] != null && matriz[linha][coluna].equals(numeroPreenchido))
                contador++;
        }
        return contador;
    }

    public static Integer isValidInColumn(Integer coluna, Integer numeroPreenchido) {
        Integer contador = 0;
        for (int linha = 0; linha <= 8; linha++) {
            if (matriz[linha][coluna] != null && matriz[linha][coluna].equals(numeroPreenchido))
                contador++;
        }
        return contador;
    }

    public static boolean verificaNumeroValidoQuadrante(Map<Integer, Integer> quadrante, Integer numero) {
        //procura no quadrante se existe o numero
        return true;
    }
    
    public static void imprimeBoard() {
        Integer grupoLinha = 1;
        Integer grupoColuna = 1;

        System.out.println("-------------------------");
        for(int linha = 0; linha <= 8; linha++) {
            System.out.print("|");
            for(int coluna = 0; coluna <= 8; coluna++) {
                System.out.print(" " + matriz[linha][coluna]);

                grupoColuna++;
                if (grupoColuna == 4) {
                    System.out.print(" |");
                    grupoColuna = 1;
                }
            }
            System.out.println("");

            grupoLinha++;
            if (grupoLinha == 4) {
                System.out.println("-------------------------");
                grupoLinha = 1;
            }
        }
    }

}
