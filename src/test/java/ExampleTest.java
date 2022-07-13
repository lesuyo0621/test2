import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    public void When_Add1And2_Expect_3(){
        Example ex = new Example();
        assertEquals(3, ex.add(1, 2));
    }

    @Test
    public void When_multiple3And4_Expect_12(){
        Example ex = new Example();
        assertEquals(13, ex.multiple(3,4));
    }
}
