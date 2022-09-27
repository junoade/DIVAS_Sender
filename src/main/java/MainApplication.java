import reader.JsonReader;
import reader.Readable;
import validator.AbstractHash;
import validator.SHA256;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class MainApplication {
    Readable reader;
    AbstractHash hash;

    MainApplication() {
        reader = new JsonReader();
        hash = new SHA256();
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        MainApplication app = new MainApplication();
        String converted = app.hash.getHashCode(app.reader.read());
        System.out.println(converted);
    }
}
