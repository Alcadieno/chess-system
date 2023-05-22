package BoardGame;

public class Board {
    private int rows;
    private int columns;
    private  Piece [][] pieces;
//ESSA CLASSE TRATA DAS POSICOES NO TABULEIRO
    public Board(int rows, int columns) {
        if(rows < 1|| columns < 1 ){
            throw new BoardException("ERROR CREATING BOARD: There must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece (int row, int column){
        if(!positionExists(row,column)){
            throw new BoardException("POSITION NOT ON THE BOARD!!");
        }
        return pieces [row][column];
    }
    public Piece piece (Position position){
        if(!positionExists(position)){
            throw new BoardException("POSITION NOT ON THE BOARD!!");
        }
        return pieces[position.getRow()][position.getColum()];
    }
    public void placePiece(Piece piece, Position position){ //COLOCA A PECA EM UMA POSICAO
        if(thereIsAPiece(position)){
            throw new BoardException("THERE IIS ALREADY A PIECE ON POSITION"+ position);
        }
        pieces[position.getRow()][position.getColum()]= piece;
        piece.position = position;
    }
    private  boolean positionExists(int row , int column){ //VERIFICA SE A POSICAO EXISTE UTILIZANDO ROW E COLUMN
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }
    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColum()); //VERIFICA SE A POSICIÇÂO EXISTE UTILIZANDO UM TIPO POSITION
    }
    public boolean thereIsAPiece(Position position){ //VERIFICA SE EXISTE UMA PEÇA NA POSIÇÂO
        if(!positionExists(position)){
            throw new BoardException("POSITION NOT ON THE BOARD!!");
        }
        return piece(position) != null;

    }
}
