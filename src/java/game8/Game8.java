package game8;

import mindustry.mod.Mod;
import mindustry.io.*;
import java.io.*;

// i might actually need this

public class Game8 extends Mod {
    @Override
    public void loadContent() {
        SaveVersion.addCustomChunk("G8-Source", new SaveFileReader.CustomChunk() {
            @Override
            public void write(DataOutput stream) throws IOException {}

            @Override
            public void read(DataInput stream) throws IOException {}
        });
    }
}