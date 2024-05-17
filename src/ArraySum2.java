public class ArraySum2 {
    public static int arraySum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] examScores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = arraySum(examScores);
        System.out.println(sum);
    }
}
