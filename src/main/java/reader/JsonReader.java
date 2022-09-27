package reader;

import util.FilePathConfig;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader implements Readable {

    FilePathConfig filePathConfig;

    /**
     * 사전에 지정된 하나의 Json 파일을 읽고 목적 시스템으로 전송한다.
     */
    @Override
    public String read() throws IOException {
        String path = selectPath();
        String data = readAsString(path);
        System.out.println(data);
        return data;
    }

    @Override
    public void readAsBatch(int batch_size) {

    }

    /**
     * 사전에 지정된 파일 경로를 갖는 config 객체를 불러온다.
     * @return
     */
    String selectPath() {
        filePathConfig = FilePathConfig.getInstance();
        return filePathConfig.getTestFilePath();
    }

    /**
     * json 파일을 byte 단위로 읽어 들인 후 String으로 변환한다.
     * @param path
     * @return
     * @throws IOException
     */
    String readAsString(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
