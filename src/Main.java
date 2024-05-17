public class Main {
    public static int arraySum() {
        int sum = 0;
        int[] scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    //There are several ways to do this. This is a bit of hardcoding.
    //I could still write it in such a way that the code could be more reusable.
    //Check it out in the next class.

    public static void main(String[] args) {
        System.out.println(arraySum());
    }
}