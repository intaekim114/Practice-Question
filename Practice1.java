// 오름차순 중복 숫자 제거

/*
아이디어: 배열을 하나만 사용해야 하기 때문에
배열을 검색하면서 중복이 있을 때는 넘어가고 중복 되지 않은 수가 나올 때 마다
이미 검색한 앞 배열에 추가 하여 배열을 두개처럼 사용
 */
public class Practice1 {
    public static void solution(int[] nums) {
        int idx = 0;
        for (int num : nums) {
            if (idx == 0 || num > nums[idx - 1]) {
                nums[idx++] = num;
            }
        }

        System.out.print("[" + idx + "] ");
        for (int i = 0; i <idx; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test code
        solution(new int[] {1, 1, 2});
        solution(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
}
