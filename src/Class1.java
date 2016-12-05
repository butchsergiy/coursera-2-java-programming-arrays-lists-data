import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

/**
 * Created by BSV on 30.11.2016.
 */


public class Class1 {

    public static void main(String... args) {

        CaesarCipher cc = new CaesarCipher();
/**
 * Simple stopWatch to measure operation last time.
 */
        String label = "CaesarCipher.encryptV2()";
        Monitor mon = MonitorFactory.start(label);

        String tocode = "abc def";

        for (int i = 0; i < 10; i++) {

            tocode = tocode + " " + cc.encryptV2(tocode, 5) + " " + i;

        }

        mon.stop();

        System.out.println(tocode);

    }

}
