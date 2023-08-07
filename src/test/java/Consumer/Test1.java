package Consumer;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Consumer;

public class Test1 {
    @Test
    public void testConsumer() {
        String[] array = {"大雄，男", "静香，女", "胖虎，男"};
        Consumer<String> splitName = person -> person.split("，");
        Consumer<String> printName = name -> System.out.println(name);
        Arrays.stream(array)
                .peek(splitName)
                .forEach(printName);
    }


}
