<<<<<<< HEAD
//로마 숫자 표기

import java.util.HashMap;

public class Practice1 {
    public static void solution(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        int sum = 0;
        char[] arr = s.toCharArray(); // String s로 넘어온 문자열을 하나하나 배열로 넣기
        for (int i = 0; i < arr.length - 1; i++) {
            if (map.get(arr[i]) < map.get(arr[i + 1])) {
                sum -= map.get(arr[i]);
            } else {
                sum += map.get(arr[i]);
            }
        }
        sum += map.get(arr[arr.length - 1]);
        System.out.println(sum);

=======

public class Practice1 {
    public static void solution(int[] nums) {
>>>>>>> 14c122c (자바 연습문제 3)

    }

    public static void main(String[] args) {
        // Test code
<<<<<<< HEAD
        solution("III");
        solution("IV");
        solution("VI");
        solution("XIII");
        solution("XXVI");
        solution("MCMXCIV");
=======
        solution(new int[] {1, 1, 2});
        solution(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
>>>>>>> 14c122c (자바 연습문제 3)
    }
}
