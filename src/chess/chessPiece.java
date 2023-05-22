package chess;
import BoardGame.Board;
import BoardGame.Piece;
//ESSA CLASSE IMPLEMENTA O QUE CADA PEÇA DO JOGO PRECISA TER EM COMUM
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
