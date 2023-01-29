package designprinciples.solid.dip.encoding.refectored;

import java.io.IOException;

public class DatabaseWriter implements Writable {
    @Override
    public void write(String encodedString) throws IOException {
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
        System.out.println(database);
    }
}
