package game8.type.weather;

import mindustry.type.*;
import arc.math.geom.*;
import arc.graphics.g2d.*;
import mindustry.entities.*;
import arc.graphics.*;
import arc.audio.*;
import game8.type.weather.live.VESource;

public class VolcanicEruption extends Weather {
    public TextureRegion RockTexture = new TextureRegion();
    public Effect lavaPop = new Effect();
    public Effect initialEffect = new Effect();
    public Effect sourceEffect = new Effect();
    public Color lavaInitialColor = new Color();
    public Color lavaFinalColor = new Color();
    public Color lavaMedColor = new Color();
    public float lavaLifetime = 0f;
    public Sound lavaPopSound = new Sound();
    public Sound intialSound = new Sound();
    public Sound burnSound = new Sound();

    public VolcanicEruption(String name) {
        super(name);
    }

    public void invoke(int x, int y, int level) {
        VESource.invoke(x, y, level)
    }
}