import com.sdabyd2.programowanie.PTestImp;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;

public class PTest {

    @Test
    public void shouldFindLastElementFromList() throws Exception {

        assertThat(PTestImp.last(asList("a", "b", "c", "d")), is(equalTo("d")));

    }
}