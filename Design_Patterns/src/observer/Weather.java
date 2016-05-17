package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/11 0011.
 */
public class Weather implements IWeather
{
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<WeatherObserver>();
        currentWeather = WeatherType.SUNNY;
    }

    @Override
    public void addObserver(WeatherObserver obs)
    {
        observers.add(obs);
    }

    @Override
    public void removeObserver(WeatherObserver obs)
    {
        observers.remove(obs);
    }


    /**
     * Makes time pass for weather
     */
    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to " + currentWeather + ".");
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver obs : observers) {
            obs.update(currentWeather);
        }
    }
}
