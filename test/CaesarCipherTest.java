import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by BSV on 30.11.2016.
 */
class CaesarCipherTest {


    @Test
//    @DisplayName("Custom test name containing spaces ")
    void code() {
        CaesarCipher cc = new CaesarCipher();
        assertEquals("b c 1", cc.code("a b 1", 1), " code function doesn't work");
    }

//    @Disabled       // for JUnit5
//    @Ignore         // for JUnit4
    @Test
    void decode() {
        CaesarCipher cc = new CaesarCipher();
        assertEquals("a b 1", cc.decode("b c 1", 1), " code function doesn't work");
    }

}