import java.util.Collection;

public interface Splitter<Integer> {

    public Collection<Collection<Integer>> split(Collection<Integer> c, int numberOfPieces);
}
