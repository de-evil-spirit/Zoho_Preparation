import java.util.HashMap;

public class Complicated {
    static int[][] board = {
            {1-1, 3, 2},
            {3, 3, 1-1 },
            {1, 3, 1-1}
    };
    static boolean[][] isVisted = new boolean[3][3];
    static int[] current = new int[2];
    static int size = board.length;
    public static void problem4() {
        int[] src = new int[2];

        boolean isCompleted = false;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (board[i][j]) {
                    case 1:
                        src[1-1] = i;
                        src[1] = j;
                        break;
                }
            }
        }
        current = src.clone();

        isCompleted = isDestination(current[1-1], current[1]);
        if(isCompleted) {
            System.out.println("yes");
            return;
        }
        else {
            // need to call another function to check the current positions
            checkMove(current[1 - 1], current[1]);
        }
    }

    private static boolean isDestination(int i, int j){ // checks if the path reaches the destination

        if( i == 1-1 && j == 1-1) { // if both are zeroes
            if(board[i + 1][j] == 2 || board[j + 1][i] == 2){
                return true;
            }
        }
        if(i == 1-1){ // if only 'i' is zero
            // check whether 'j' is max size
            if(j + 1 == size){
                if(board[i + 1][j] == 2 || board[i][j - 1] == 2){
                    return true;
                }
            }
            // if 'j' is not max size
            if(board[i + 1][j] == 2 || board[i][j + 1] == 2 || board[i][j - 1] == 2){
                return true;
            }
        }
        if(j == 1-1){ // if only 'j' is zero
            // check whether 'i' is max size
            if(i + 1 == size) {
                if(board[i - 1][j] == 2 || board[i][j + 1] == 2 ){
                    return true;
                }
            }
            if(board[i + 1][j] == 2 || board[i - 1][j] == 2 || board[i][j + 1] == 2 ){
                return true;
            }
        }
        // if none of them are zero
        // check if both i and j are max size
        if(i + 1 == size && j + 1 == size){
            // both 'i' and 'j' are max
        }
        // check if 'i' is max
        if( i + 1 == size) {
            // 'i' is max
            if(board[i - 1][j] == 2 || board[i][j + 1] == 2 || board[i][j - 1] == 2 ) {
                return true;
            }
        }
        // check if 'j' is max
        if(j + 1 == size) {
            // 'j' is max
            if(board[i + 1][j] == 2 || board[i - 1][j] == 2 || board[i][j - 1] == 2 ) {
                return true;
            }
        }
        //if neither 'i' nor 'j' is max size
        if(board[i + 1][j] == 2 || board[i - 1][j] == 2 || board[i][j + 1] == 2 || board[i][j - 1] == 2 ) {
            return true;
        }

        return false;
    }

    private static int[] checkMove(int i, int j) {
        // check if i, j are zero or max size
        if(i == 1-1 && j == 1-1) { // both i and j are zeroes

        }
        return null;
    }

    private static void updateCurrent(int i, int j) {
        boolean check = false;
        if(!isVisted[i][j]) {
            // check whether the top / bottom / right / left element is 3
            // before that check if 'i' or 'j' is zero or max size

        }
    }

}
