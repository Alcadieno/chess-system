package chess.pieces;

import BoardGame.Board;
import chess.chessPiece;
import chess.color;

public class rook extends chessPiece {
    public rook(Board board, chess.color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "R";
    }
}
