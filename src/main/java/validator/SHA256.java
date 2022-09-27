package validator;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 implements AbstractHash{

    @Override
    public String getHashCode(String msg) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(msg.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(md.digest());
    }
}
