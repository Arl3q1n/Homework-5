package exercises;

public class DivisibleNumbers {
    public void divisibleNumbers() {

        int iteration = 0;

        for (int number = 100; number <= 1000; number ++){

            if (number % 5 == 0 && number % 6 == 0) {
                System.out.print(number + " ");
                iteration ++;

                if (iteration % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
