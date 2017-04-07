package starter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Christopher Travers on 07/04/2017.
 */
public class MessageStructTest {
    @Test
    public static void Properties() throws Exception {
        MessageStruct sut = new MessageStruct(1l, "This is a test");
        assertEquals(sut.id.intValue(), 1);
        assertEquals(sut.message, "This is a test");
    }

}