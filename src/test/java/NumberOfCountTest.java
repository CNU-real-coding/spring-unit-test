import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NumberOfCountTest {

    @Test
    public void 소문자에서자음의개수확인(){
        NumberOfCount numberOfCount = new NumberOfCount();
        String lowercase = "secret";
        numberOfCount.getNumberOfCount(lowercase);

        assertThat(numberOfCount.getConsonantCount(),is(4));

    }

}