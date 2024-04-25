<<<<<<< HEAD

public class Practice4 {
    public static String solution(int[] keyLog) {
        final int BACK_SPACE = 8;
        final int SHIFT = 16;
        final int CAPS_LOCK = 20;
        final int SPACE_BAR = 32;
        final int KEY_LEFT = 37;
        final int KEY_RIGHT = 39;
        final int INSERT = 155;
        final int DELETE = 127;

        StringBuffer sb = new StringBuffer();

        int step = (int) 'a' - 'A';

        int cmdIdx = 0;
        int curSor = 0;
        boolean isShift = false;
        boolean isCapslock = false;
        boolean isInsert = false;
        while (cmdIdx != keyLog.length) {
            int cur = keyLog[cmdIdx];
            if (cur == BACK_SPACE) {
                if (curSor == 0) {
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor - 1, curSor);
                curSor = Math.max(0, curSor - 1);
            } else if (cur == SHIFT) {
                isShift = true;
            } else if (cur == CAPS_LOCK) {
                isCapslock = !isCapslock;
            } else if (cur == SPACE_BAR) {
                inputData(sb, ' ', curSor, isInsert);
                curSor += 1;
            } else if (cur == KEY_LEFT) {
                curSor = Math.max(0, curSor - 1);
            } else if (cur == KEY_RIGHT) {
                curSor = Math.min(sb.length(), curSor + 1);
            } else if (cur == INSERT) {
                isInsert = !isInsert;
            } else if (cur == DELETE) {
                if (curSor == sb.length()) {
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor, curSor + 1);
            } else if (cur >= 97 && cur <= 122) {
                int data = cur;

                if (isCapslock && isShift) {
                    data = cur;
                } else if ( isCapslock || isShift) {
                    data -= step;
                }
                inputData(sb, (char)data, curSor, isInsert);
                isShift = false;
                curSor++;
            } else if (cur >= 46 && cur <= 57) {
                if (isShift) {
                    char[] specialKey =  {'(', '!', '@', '#', '$', '%', '^', '&', '*', '('};
                    inputData(sb, specialKey[cur - '0'], curSor, isInsert);
                } else {
                    inputData(sb, (char)cur, curSor, isInsert);
                }
                isShift = false;
                curSor += 1;
            }

            cmdIdx++;
        }

        return sb.toString();
    }

    public static void inputData(StringBuffer sb, char data, int curSor, boolean isInsert) {
        if (isInsert == false) {
            sb.insert(curSor, data);
        } else {
            sb.setCharAt(curSor, data);
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] keyLog = {16, 106, 101, 108, 108, 111, 37, 37, 37, 37, 37, 155, 16, 104};
        System.out.println(solution(keyLog));

        keyLog = new int[]{20, 104, 16, 105, 32, 20, 16, 106, 97, 118, 97};
        System.out.println(solution(keyLog));

        keyLog = new int[]{49, 51, 8, 50, 51, 53, 55, 37, 37, 127, 127, 52, 53};
        System.out.println(solution(keyLog));

        keyLog = new int[]{20, 97, 98, 16, 99, 16, 100, 16, 49, 16, 50, 16, 51};
        System.out.println(solution(keyLog));
=======
import java.util.ArrayList;

public class Practice4 {
    public static ArrayList<Integer> solution(int[][] matrix) {

        return null;
    }
    
    public static void main(String[] args) {
        // Test code
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println((solution(matrix)));

        matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10 ,11 ,12}};
        System.out.println((solution(matrix)));
>>>>>>> 14c122c (자바 연습문제 3)
    }
}
