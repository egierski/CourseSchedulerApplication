import edu.bsu.nicegierski.DatabaseParser;
import org.junit.Test;

import java.io.IOException;

public class DatabaseParserTest {

    @Test
    public void databaseParserTest() throws IOException {
        String csvFile = "resources/fullFall2017.csv";
        DatabaseParser databaseParser = new DatabaseParser();
        databaseParser.parseDatabase(csvFile);
    }

}
