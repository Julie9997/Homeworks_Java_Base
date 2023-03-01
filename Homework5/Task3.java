package Homework5;

import java.util.HashMap;
import java.util.Map;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.

public class Task3 {

    private static final int BOARD_SIZE = 8;
    private static Map<Integer, Integer> positions = new HashMap<>();

    public static void main(String[] args) {
        placeQueens(0);
        showBoard();
    }

    private static void placeQueens(int row) {
        for (int col = 0; col < BOARD_SIZE; col++) {
            if (isSafe(row, col)) {
                positions.put(row, col);
                placeQueens(row + 1);
                if (positions.size() == BOARD_SIZE) {
                    return;
                } else {
                    positions.remove(row);
                }
            }
        }
    }

    private static boolean isSafe(int row, int col) {
        for (Map.Entry<Integer, Integer> entry : positions.entrySet()) {
            int otherRow = entry.getKey();
            int otherCol = entry.getValue();
            if (col == otherCol || Math.abs(col - otherCol) == row - otherRow) {
                return false;
            }
        }
        return true;
    }

    private static void showBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (positions.get(row) == col) {
                    System.out.print("Х ");
                } else {
                    System.out.print("О ");
                }
            }
            System.out.println();
        }
    }
}
