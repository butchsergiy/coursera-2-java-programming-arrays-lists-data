import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by BSV on 30.11.2016.
 */
class CaesarCipherTest {
    @Test
    void encryptUsingStringBuffer() {
        CaesarCipher cc = new CaesarCipher();
        assertEquals("CFOPQ IBDFLK XQQXZH BXPQ CIXKH!", cc.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
    }

    @Test
    void encryptUsingStringBuffer2() {
        CaesarCipher cc = new CaesarCipher();
        assertEquals("Wzijk Cvxzfe", cc.encrypt("First Legion", 17));
    }


    @Test
//    @DisplayName("Custom test name containing spaces ")
    void encrypt() {
        CaesarCipher cc = new CaesarCipher();
        assertEquals("b c 1", cc.encryptV2("a b 1", 1), " encryptV2 function doesn't work");
    }


//    @Disabled       // for JUnit5
//    @Ignore         // for JUnit4
    @Test
    void decode() {
        CaesarCipher cc = new CaesarCipher();
        assertEquals("a b 1", cc.decode("b c 1", 1), " encryptV2 function doesn't work");
    }


    @Test
    void encryptTwoKeys() {

        CaesarCipher cc = new CaesarCipher();
        assertEquals("Czojq Ivdzle", cc.encryptTwoKeys("First Legion",23,17));
    }


}