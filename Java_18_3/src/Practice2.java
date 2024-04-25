<<<<<<< HEAD
//정수형 숫자를 로마자로 표기

/*
아이디어:
1. 크기가 같은 배열 두가지의 인덱스를 관련되게 생성하여 적용
2. 큰 수부터 표기 하기 때문에 배열에 큰 수부터 삽입
3. 큰 수 부터 빼면서 문자열 추가
 */
public class Practice2 {

    public static String solution(int num){
        String result = "";

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int i  = 0;
        while (num >0) {
            while (num >= value[i]) {  // if가 아니라 while 임 ex) 1을 여러번 반복해야 할 경우 index가 늘어나면 안돼
                num -= value[i];
                result += roman[i];
            }
            i++;
        }

        return result;
=======
import java.util.ArrayList;

public class Practice2 {
    public static ArrayList<Integer> solution(int[] nums) {

        return null;
>>>>>>> 14c122c (자바 연습문제 3)
    }

    public static void main(String[] args) {
        // Test code
<<<<<<< HEAD
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(6));
        System.out.println(solution(13));
        System.out.println(solution(26));
        System.out.println(solution(1994));
=======
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(solution(nums));

        nums = new int[]{1, 3, 1, 3, 5, 5};
        System.out.println(solution(nums));
>>>>>>> 14c122c (자바 연습문제 3)
    }
}
