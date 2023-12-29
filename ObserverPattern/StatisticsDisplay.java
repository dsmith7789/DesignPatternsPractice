public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemp = 0.0f;
    private float maxTemp = 200.0f;
    private float sumTemp = 0.0f;
    private int countTemp;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // push based update
    // public void update(float temperature, float humidity, float pressure) {
    //     this.minTemp = Math.min(this.minTemp, temperature);
    //     this.maxTemp = Math.max(this.maxTemp, temperature);
    //     this.sumTemp += temperature;
    //     this.countTemp += 1;
    //     display();
    // }

    // pull based update
    public void update() {
        float temp = this.weatherData.getTemperature();
        this.minTemp = Math.min(this.minTemp, temp);
        this.maxTemp = Math.max(this.maxTemp, temp);
        this.sumTemp += temp;
        this.countTemp += 1;
        display();
    }

    public void display() {
        float avgTemp = sumTemp / countTemp;
        System.out.println("Avg/Min/Max temperature = " + avgTemp + "/" + minTemp + "/" + maxTemp);
    }
}
