// 배열 내 중복 숫자 찾기

/*
[1,n] 범위의 숫자가 들어올 수 있기 때문에
(숫자 -1)을 인덱스로 하여 사용

숫자를 확인 했을 때 (숫자 - 1) 인덱스 자리를 음수로 바꾸어줌
따라서 같은 숫자를 확인 했을 때 그 인덱스 자리의 숫자가 음수일 경우
중복 된 숫자 이므로 해당 숫자 출력
 */


import java.util.ArrayList;

public class Practice2 {
    public static ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // 배열의 숫자를 인덱스화 해서 변수에 저장

            if (nums[index] < 0) {
                list.add(Math.abs(index + 1)); // 인덱스에 해당하는 배열의 값이 이미 음수라면 그 수는 중복된 수이기 때문에 list에 저장
            }

            nums[index] = -nums[index]; // 인덱스에 해당하는 배열의 값이 음수가 아닌 경우 음수로 바꿔줌

        }

        return list;
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(solution(nums));

        nums = new int[]{1, 3, 1, 3, 5, 5};
        System.out.println(solution(nums));
    }
}
