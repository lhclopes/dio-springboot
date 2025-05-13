package dio.desafio.sudoku;

import java.util.HashMap;
import java.util.Map;

public class TesteDesafioSudoku2 {

    private static Map<Integer, Map<Integer, Integer>> board = new HashMap<Integer, Map<Integer, Integer>>();
    private static Map<Integer, Map<Integer, Integer>> boardLinhas = new HashMap<Integer, Map<Integer, Integer>>();

    public static void main(String[] args) {

        Map<Integer, Integer> quadrante1 = preencheQuadrante();
        Map<Integer, Integer> quadrante2 = preencheQuadrante();
        Map<Integer, Integer> quadrante3 = preencheQuadrante();
        Map<Integer, Integer> quadrante4 = preencheQuadrante();
        Map<Integer, Integer> quadrante5 = preencheQuadrante();
        Map<Integer, Integer> quadrante6 = preencheQuadrante();
        Map<Integer, Integer> quadrante7 = preencheQuadrante();
        Map<Integer, Integer> quadrante8 = preencheQuadrante();
        Map<Integer, Integer> quadrante9 = preencheQuadrante();

        board.put(1, quadrante1);
        board.put(2, quadrante2);
        board.put(3, quadrante3);
        board.put(4, quadrante4);
        board.put(5, quadrante5);
        board.put(6, quadrante6);
        board.put(7, quadrante7);
        board.put(8, quadrante8);
        board.put(9, quadrante9);

        imprimeQuadrante(quadrante1);
        imprimeQuadrante(quadrante2);
        imprimeQuadrante(quadrante3);

        System.out.println("SEGUNDO BLOCO");
        imprimeQuadrante(quadrante4);
        imprimeQuadrante(quadrante5);
        imprimeQuadrante(quadrante6);

        System.out.println("TERCEIRO BLOCO");
        imprimeQuadrante(quadrante7);
        imprimeQuadrante(quadrante8);
        imprimeQuadrante(quadrante9);

        System.out.println("BOARD");
        imprimeBoard();
    }

    public static Map<Integer, Integer> preencheQuadrante() {
        Map<Integer, Integer> quadrante = new HashMap<Integer, Integer>();

        for(int x = 1; x <= 9; x++) {
            while (quadrante.get(x) == null) {
                Integer numero = (int) ((Math.random() * 9) + 1);

                if (verificaNumeroValidoQuadrante(quadrante, numero))
                    quadrante.put(x, numero);      
            }
        }

        return quadrante;
    }

    public static void imprimeQuadrante(Map<Integer, Integer> quadrante) {
        int coluna = 1;
        //System.out.println("-------");
        System.out.print("|");
        for (Integer numero : quadrante.values()) {
            if (coluna < 3) {
                System.out.print(" " + numero);
                coluna++;
            } else {
                System.out.println(" " + numero + " |");
                System.out.print("|");
                coluna = 1;
            }
        }
        System.out.println("-------|");
    }
    
    public static void imprimeBoard() {
        Integer quadranteInicial = 1;

        for (int bloco = 1; bloco <= 3; bloco++) {
            Integer colunaInicial = 1;

            for(int linha = 1; linha <= 3; linha++ ) {
                Map<Integer, Integer> linhaMap = new HashMap<Integer, Integer>();
    
                Integer posicao = 1;
                for (int quadrante = quadranteInicial; quadrante <= (quadranteInicial + 2); quadrante++) {
                    for (int coluna = colunaInicial; coluna <= (colunaInicial + 2); coluna++) {
                        linhaMap.put(posicao, board.get(quadrante).get(coluna));
                        posicao++;
                    }
                }
        
                System.out.println(linhaMap.values());
                boardLinhas.put(linha, linhaMap);
    
                colunaInicial = colunaInicial + 3;
            }

            quadranteInicial = quadranteInicial + 3;
        }
    }

    public static boolean verificaNumeroValidoLinha(Integer numeroLinha, Integer numeroPreenchido) {
        return true;
    }

    public static boolean verificaNumeroValidoColuna(Integer numeroPreenchido, Integer numeroColuna) {
        return true;
    }

    public static boolean verificaNumeroValidoQuadrante(Map<Integer, Integer> quadrante, Integer numero) {
        if (quadrante.containsValue(numero))
            return false;
        else
            return true;
    }

}
