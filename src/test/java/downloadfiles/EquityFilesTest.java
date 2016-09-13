package downloadfiles;

import org.junit.Test;

/**
 * Created by sanjay on 9/13/16.
 */
public class EquityFilesTest {

    @Test
    public void checkDownloadFiles() {
        EquityFiles files = new EquityFiles();
        files.equityBhavcopyDownload("01012010").getAbsolutePath();
    }

}
