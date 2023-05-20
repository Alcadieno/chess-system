package chess;
import BoardGame.Board;
import BoardGame.Piece;

public class chessPiece extends Piece {
    private color color;

    public chessPiece(Board board, chess.color color) {
        super(board);
        this.color = color;
    }

    public chess.color getColor() {
        return color;
    }

}
