import java.util.stream.IntStream;

public class MultipleOf3Or5 {
    public static int solution(final int number) {
        if (number < 3) return 0;
        return IntStream.range(3, number).filter(value -> value % 3 == 0 || value % 5 == 0)
                .sum();
    }
}
