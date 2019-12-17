

import java.util.Collection;
import java.util.function.Function;

public class MaxFinderSequentail<Double> implements MaxFinder<Double> {

    public MaxFinderSequentail() {
    }

    @Override
    public Double getMaximum(Collection<Double> input, Function<Collection<Double>, Double> function) {
        return function.apply(input);
    }
}
