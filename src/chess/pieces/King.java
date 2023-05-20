package chess.pieces;

import BoardGame.Board;
import chess.chessPiece;
import chess.color;

public class King extends chessPiece {
    public King(Board board, chess.color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "K";
    }
}
