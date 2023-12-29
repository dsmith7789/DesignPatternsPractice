import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject {
    // members
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            //observer.update(temperature, humidity, pressure);   // push based
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        Random r = new Random();
        double random = 10.0 + r.nextDouble() * (90.0 - 10.0);
        return (float) random;
    }

    public float getHumidity() {
        Random r = new Random();
        double random = 0.0 + r.nextDouble() * (100.0 - 0.0);
        return (float) random;
    }

    public float getPressure() {
        Random r = new Random();
        double random = 29.6 + r.nextDouble() * (30.2 - 29.6);
        return (float) random;
    }

}
