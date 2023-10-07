package exercises;

public class SeriesOfSums {

    int number_1 = 1;
    int number_2 = 3;
    float sum = 0;

    public void seriesOfSums() {
        do {
            sum += (float) number_1/number_2;

            number_1+= 2;
            number_2+= 2;
        } while (number_2 < 100);
        System.out.println("Sum of this series: " + sum);
    }
}
