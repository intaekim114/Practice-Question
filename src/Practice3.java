// 편집기 구현

/*
아이디어:
1. StringBuffer 사용 (문자열의 변동이 많기 때문)
2. 커서의 인덱스 변수 지정
3. Math.max or min 으로 index 범위 조절
 */

import java.util.ArrayList;

public class Practice3 {
    public static String solution(String input, String cmd) {
        StringBuffer sb = new StringBuffer(input);
        ArrayList<String> cmdArr = new ArrayList<>();

        for (String s : cmd.split(" ")) {
            cmdArr.add(s);
        }


        int curSor = sb.length();
        int cmdIdx = 0;

        while (cmdIdx != cmdArr.size()) {
            String cur = cmdArr.get(cmdIdx);

            if (cur.equals("L")) {
                curSor = Math.max(0, curSor - 1);
            } else if (cur.equals("D")) {
                curSor = Math.min(sb.length(), curSor + 1);
            } else if (cur.equals("B")) {
                if (curSor == 0) {
                    cmdIdx++;
                    continue;
                }

                sb.delete(curSor -1 , curSor);
                curSor = Math.max(0, curSor - 1);

            } else if (cur.equals("P")) {
                String s = cmdArr.get(++cmdIdx);
                sb.insert(curSor, s);
                curSor++;
            }
            cmdIdx++;
        }



        return sb.toString();
    }

    public static void main(String[] args) {
        // test code
        System.out.println(solution("aba", "L B"));
        System.out.println(solution("abcd", "P x L P y"));
        System.out.println(solution("abc", "L L L P x L B P y"));
        System.out.println(solution("a", "B B L L D D P a P b P c"));
    }
}
