// 특정 숫자 기준으로 가까운 숫자 출력

/*
HashMap을 이용하여 절대값의 차이를 모은다.
이 때 새로 들어오는 값과 원래 있던 값을 비교하여 더 작은 수를 앞으로 정렬한다.

 */
public class Practice3 {
    public static void solution(int[] arr, int k, int x) {

    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr, 4, 3);

        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        solution(arr, 5, 5);

        arr = new int[]{2, 4};
        solution(arr, 1, 3);

        arr = new int[]{2, 4};
        solution(arr, 3, 3);
    }
}
