// 사탕 나눠주기

/*
아이디어: 앞 숫자보다 뒷 숫자가 더 클 때 upCnt를 추가해주고
반대의 상황에서는 downCnt를 추가해준다.

downCnt가 더 많을 경우 사탕을 한개씩 더 나눠주는 패턴을 이용한다.
 */
public class Practice5 {
    public static int solution(int[] ratings) {
        if ( ratings == null || ratings.length == 0) {
            return 0;
        }

        int upCnt = 1;
        int downCnt = 0;
        int peak = 0;
        int result = 1;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1] ) {
                upCnt++;
                downCnt = 0;
                peak = upCnt;
                result += upCnt;
            } else if (ratings[i] == ratings[i - 1]) {
                upCnt = 1;
                downCnt = 0;
                peak = 0;
                result += 1;
            } else if (ratings[i] < ratings[i - 1]) {
                upCnt = 1;
                downCnt++;
                result += downCnt;

                if( downCnt >= peak) {
                    result += 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test code
        int[] ratings = {1, 2, 3};
        System.out.println(solution(ratings));

        ratings = new int[]{3, 2, 1};
        System.out.println(solution(ratings));

        ratings = new int[]{1, 0, 2};
        System.out.println(solution(ratings));

        ratings = new int[]{1, 2, 2};
        System.out.println(solution(ratings));

        ratings = new int[]{1, 3, 5, 3, 1, 3, 5, 7, 5, 3, 1, 0};
        System.out.println(solution(ratings));
    }
}
