package app;
// Essa Classa imprime o tabuleiro de Xadrez
import chess.chessPiece;
import chess.color;

public class UI {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static void printBoard(chessPiece[][] pieces){
        for(int i = 0 ; i < pieces.length;i++){ // For para linhas
            System.out.print((8-i)+ " ");
            for(int j = 0 ; j< pieces.length;j++){ // For para colunas
                printPiece(pieces[i][j]);
            }
            System.out.println("");
        }
        System.out.print (" a b c d e f g h");
    }

    private  static  void printPiece (chessPiece piece){
        if(piece == null){ // verifica se existe peça , se nao imprime "-"
            System.out.print("-");

        }else {
            System.out.print(piece);
        }
        System.out.print(" ");
        if (piece == null) {
            System.out.print("-");
        }
        else {
            if (piece.getColor() == color.WHITE) {
                System.out.print(ANSI_RED + piece + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + piece + ANSI_RESET);
            }
        }
        System.out.print(" ");
    }
}

