package day02;

import org.junit.Test;

/**
 * Created by apex on 2017-01-03.
 */
public class AlgebraTest {

    @Test public void  subtractTest() {
        Algebra algebra = new Algebra();
        assertThat("3-1=2", algebra.subtract(3, 1), is(equalTo(2)));
    }
}
