package EXE_1;

public class Main {
    public static void main(String[] args) {
        PrintBoard print = new PrintBoard();
        int[][] mat = new int[10][10];
        PrintBoard.RandomMat(mat);
        PrintBoard.printMat(mat);
    }
}
