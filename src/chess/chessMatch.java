package chess;

import BoardGame.Board;
import BoardGame.Position;
import chess.pieces.King;
import chess.pieces.rook;

//Essa classe  implementa as REGRAS DO JOGO, O tamanho o tabuleiro
public class chessMatch {
    private Board board;

    public chessMatch(){
        board = new Board(8,8);//Inicializa o tabuleiro , colunas e linhas
        initialSetup();
    }
    public  chessPiece[][] getPieces(){
        chessPiece[][]matriz = new chessPiece[board.getRows()][board.getColumns()]; // Instanciar um objeto do tipo chessPiece e matriz
        for(int i = 0 ; i < board.getRows(); i++){
            for (int j = 0 ; j < board.getColumns();j++){
                matriz[i][j] = (chessPiece) board.piece(i,j); // downcasting , pois esta classe precisa do tipo chesspiece e nao piece
            }
        }
        return matriz;
    }
    private  void placeNewPiece ( char column , int row , chessPiece piece){
        board.placePiece(piece,new chessPosition(column,row).toposition());
    }
    private void initialSetup(){ //Colocar as peças no tabuleiro
        placeNewPiece('c', 2, new rook(board, color.WHITE));
        placeNewPiece('d', 2, new rook(board, color.WHITE));
        placeNewPiece('e', 2, new rook(board, color.WHITE));
        placeNewPiece('e', 1, new rook(board, color.WHITE));
        placeNewPiece('d', 1, new King(board, color.WHITE));

        placeNewPiece('c', 7, new rook(board, color.BLACK));
        placeNewPiece('c', 8, new rook(board, color.BLACK));
        placeNewPiece('d', 7, new rook(board, color.BLACK));
        placeNewPiece('e', 7, new rook(board, color.BLACK));
        placeNewPiece('e', 8, new rook(board, color.BLACK));
        placeNewPiece('d', 8, new King(board, color.BLACK));
    }
}
