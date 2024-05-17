public class Main {
    public static int arraySum() {
        int sum = 0;
        int[] scores = {1, 2, 3, 4, 5};
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(arraySum());
    }
}