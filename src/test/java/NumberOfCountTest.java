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

    @Test
    public void 대문자에서자음의개수확인(){
        NumberOfCount numberOfCount = new NumberOfCount();
        String uppercase = "SECRET";
        numberOfCount.getNumberOfCount(uppercase);

        assertThat(numberOfCount.getConsonantCount(),is(4));

    }

}