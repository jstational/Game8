package game8.type;

import arc.graphics.g2d.*;

/** a segment meant to be attached to a block */
public class Out {
    public int x, y, size;
    public int direction;
    public boolean directional;
    public TextureRegion texture;

    public Out(int x, int y, int s, int dn, boolean dl, TextureRegion txt) {
        this.x = x;
        this.y = y;
        this.size = s;
        this.direction = dn;
        this.directional = dl;
        this.texture = txt;
    }

    public Out(int x, int y, int s, TextureRegion txt) {
        this(x, y, s, 0, false, txt);
    }

    public Out(int x, int y, TextureRegion txt) {
        this(x, y, 1, 0, false, txt);
    }

    public void draw(int x, int y) {
        Draw.rect(texture, this.x + x, this.y + y, size, size);
    }
}