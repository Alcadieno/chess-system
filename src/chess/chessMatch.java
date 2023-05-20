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
        chessPiece[][]matriz = new chessPiece[board.getRows()][board.getColumns()];
        for(int i = 0 ; i < board.getRows(); i++){
            for (int j = 0 ; j < board.getColumns();j++){
                matriz[i][j] = (chessPiece) board.piece(i,j); // downcasting , pois esta classe precisa do tipo chesspiece e nao piece
            }
        }
        return matriz;
    }
    private void initialSetup(){ //Colocar as peças no tabuleiro
        board.placePiece(new rook(board,color.WHITE),new Position(2,1));
        board.placePiece(new King(board,color.BLACK),new Position(2,2));
    }
}
