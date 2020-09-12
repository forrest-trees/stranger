public class Stats
{
    public static void main(String[] args)
    {
        Bag<Double> numbers = new Bag<Double>();

        while (!StdIn.isEmpty())
           numbers.add(StdIn.readDouble());
        int N = numbers.size();

        double num = 0.0;
        for (double x : numbers)
           num += x;
        double mean = num / N;

        num = 0.0;
        for (double x : numbers)
           num += (x - mean) * (x - mean);
        double std = Math.sqrt(num / (N - 1));

        StdOut.printf("Mran : %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);


    
    }
}