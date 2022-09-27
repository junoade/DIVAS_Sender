package util;

public class FilePathConfig {
    private static FilePathConfig testConfig;
    private final String filePath;

    private FilePathConfig(String filePath) {
        this.filePath = filePath;
    }

    public synchronized static FilePathConfig getInstance() {
        if (testConfig == null) {
            testConfig = new FilePathConfig(setTestFilePath());
        }
        return testConfig;
    }

    private static String setTestFilePath() {
        return "src/main/resources/data01.json";
    }

    public String getTestFilePath(){
        return filePath;
    }
}
