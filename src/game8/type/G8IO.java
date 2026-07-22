package game8.type;

import game8.entities.weather.*;

public class G8IO {
    public byte[] cSource(Source source) {
        return source.compress();
    }
}