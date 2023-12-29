public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // members
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // push based update
    // public void update(float temperature, float humidity, float pressure) {
    //     this.temperature = temperature;
    //     this.humidity = humidity;
    //     display();
    // }

    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity");
    }
}
