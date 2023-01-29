package designprinciples.solid.dip.encoding.refectored;

import java.io.IOException;

public interface Writable {
    void write(String encodedString) throws IOException;
}
