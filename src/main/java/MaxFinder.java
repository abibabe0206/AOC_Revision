import java.util.Collection;
import java.util.function.Function;

public interface MaxFinder<Double> {

    public Double getMaximum(Collection<Double> input, Function<Collection<Double>,Double> function);
}

