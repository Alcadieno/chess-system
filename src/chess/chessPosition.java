package chess;

import BoardGame.Position;

public class chessPosition {
    private char column;
    private int row;

    public chessPosition(char column, int row) {
        if(column < 'a'|| column > 'h' || row < 1 || row > 8){
            throw new chessException("Error Instantianting ChessPositions . Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toposition(){
        return new Position(8 - row,column-'a');
    }

    protected static  chessPosition fromPosition(Position position){
        return new chessPosition ((char)('a'- position.getColum()),8- position.getRow());
    }
    @Override
    public String toString(){
        return "" + column + row;
    }
}
