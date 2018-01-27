import com.sdabyd2.programowanie.PTestImp;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;

public class PTest {

    @Test
    public void shouldFindLastElementFromList() throws Exception {
        assertThat(PTestImp.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }

    @Test
    public void shouldFindListOfNonEmptyList() throws Exception {
        assertThat(PTestImp.length(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5)));
    }

    @Test
    public void shouldReverseAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(PTestImp.reverse(numbers), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
    }

}