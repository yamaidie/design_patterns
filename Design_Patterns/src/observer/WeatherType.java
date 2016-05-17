package observer;

/**
 * Created by Administrator on 2016/5/11 0011.
 */
public enum WeatherType
{
    SUNNY, RAINY, WINDY, COLD;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
