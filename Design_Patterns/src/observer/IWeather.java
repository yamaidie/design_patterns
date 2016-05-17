package observer;

/**
 * Created by Administrator on 2016/5/11 0011.
 */
public interface IWeather
{
    public void addObserver(WeatherObserver obs);
    public void removeObserver(WeatherObserver obs);
}
