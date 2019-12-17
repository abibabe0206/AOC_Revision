import java.util.*;

public class DemoClassCollection {

    public static void main(String[] args) {

        Collection<Double> values = new ArrayList<Double>();
        values.add(3.0);
        values.add(4.5);
        values.add(602.2);
        values.add(10004.1);

        // Collection<Double> is the inPut
        // Double is the return value
       /* Function<Collection<Double>, Double> test = m -> Collections.max(m);

        // apply the function to get the result
        System.out.println(test.apply(values));*/

        MaxFinder<Double> maxValue = new MaxFinderSequentail<Double>();
        double result = maxValue.getMaximum(values, (d) -> Collections.max(d));
        System.out.println(result);
    }
}
