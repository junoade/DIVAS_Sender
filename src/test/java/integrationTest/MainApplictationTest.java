package integrationTest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reader.JsonReader;
import reader.Readable;
import validator.AbstractHash;
import validator.SHA256;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

public class MainApplictationTest {
    Readable reader;
    AbstractHash hash;

    @BeforeEach
    public void init(){
        reader = new JsonReader();
        hash = new SHA256();
    }

    @Test
    public void mainTest() throws IOException, NoSuchAlgorithmException {
        String converted = hash.getHashCode(reader.read());
        assertEquals(converted , "dea6d77699e777326275b97345a648af645e1957b1847a7a685f7f64bcb0fc53");

    }
}
