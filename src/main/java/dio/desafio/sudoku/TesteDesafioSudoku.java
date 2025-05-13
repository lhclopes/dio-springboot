package dio.desafio.sudoku;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TesteDesafioSudoku {

    private static Map<Integer, Map<Integer, Integer>> boardMap = new HashMap<Integer, Map<Integer, Integer>>();

    private static Map<Integer, Integer> board = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        for(int linha = 1; linha <= 9; linha ++) {
            for(int coluna = 1; coluna <= 9; coluna ++) {
                Integer posicao = linha * coluna;

                while (board.get(posicao) == null) {
                    Integer numero = (int) ((Math.random() * 9) + 1);

                    if (verificaNumeroValidoLinha(linha, numero))
                        board.put(posicao, numero);      
                }
            }
        }

        imprimeBoard();
    }

    public static boolean verificaNumeroValidoLinha(Integer numeroLinha, Integer numeroPreenchido) {
        return true;
    }

    public static boolean verificaNumeroValidoColuna(Integer numeroPreenchido, Integer numeroColuna) {
        return true;
    }

    public static boolean verificaNumeroValidoQuadrante(Integer numeroPreenchido, Integer numeroQuadrante) {
        return true;
    }

    public static void imprimeBoard() {
        int grupoLinha = 1;
        int grupoColuna = 1;

        System.out.println("Metodo Antigo");
        System.out.println("-------------------------");
        for(int linha = 1; linha <= 9; linha ++) {
            System.out.print("|");
            for(int coluna = 1; coluna <= 9; coluna ++) {
                //int numero = (int) ((Math.random() * 9) + 1);

                Integer posicao = linha * coluna;
                System.out.print(" " + board.get(posicao));

                if (grupoColuna == 3) {
                    grupoColuna = 0;
                    System.out.print(" |");
                }
                grupoColuna++;
            }
            System.out.println(" ");

            if (grupoLinha == 3) {
                grupoLinha = 0;
                System.out.println("-------------------------");
            }
            grupoLinha++;
        }
    }
}
