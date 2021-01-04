package java2_hw2;

public class MyArrayDataException extends RuntimeException{
    private int line;
    private int column;

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public MyArrayDataException(String message, int line, int column) {
        super(message);
        this.line = line;
        this.column = column;
    }
}
