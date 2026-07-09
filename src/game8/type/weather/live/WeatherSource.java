package game8.type.weather.live;

import game8.type.weather.*;

public class WeatherSource {
    transient float x, y, time;

    transient DynamicWeather weather;

    /** Create new instance of this source with parameters: */
    public void invoke(float x, float y, float time) {}
}