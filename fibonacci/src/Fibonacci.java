public class Fibonacci {
    public static void main(String[] args){
        int[] arrayFibonacci = {1, 1};

        System.out.println(arrayFibonacci[0]);

        int prox;
        for (int i = 0; i < 29; i ++) {
            prox = arrayFibonacci[0] + arrayFibonacci[1];
            System.out.println(arrayFibonacci[1]);

            arrayFibonacci[0] = arrayFibonacci[1];
            arrayFibonacci[1] = prox;
        }
    }
}
