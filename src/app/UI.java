package app;
// Essa Classa imprime o tabuleiro de Xadrez
import chess.chessPiece;

public class UI {
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
    }
}
