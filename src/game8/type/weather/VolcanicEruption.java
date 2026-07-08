package game8.type.weather;

import mindustry.type.*;
import arc.math.geom.*;
import arc.graphics.g2d.*;
import mindustry.entities.*;
import arc.graphics.*;
import arc.audio.*;

public class VolcanicEruption extends Weather {
    public Point2 SourcePosition = new Pos2(0,0);
    public AtlasRegion RockTexture = new TextureRegion();
    public Effect LavaPop = new Effect();
    public Effect InitialEffect = new Effect();
    public Color LavaInitialColor = new Color();
    public Color LavaFinalColor = new Color();
    public Color LavaMedColor = new Color();
    public float LavaLifetime = 0f;
    public Sound LavaPopSound = new Sound();
    public Sound IntialSound = new Sound();
    public Sound BurnSound = new Sound();

    public VolcanicEruption(String name) {
        super(name);
    }
}