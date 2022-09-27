package reader;

import java.io.IOException;

public interface Readable {
    String read() throws IOException;
    void readAsBatch(int batch_size);
}
