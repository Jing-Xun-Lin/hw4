

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MainTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void main() throws IOException {
        String data = "80";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(new String[0]);
        Main.main(new String[0]);
    }
}