public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float lastPressure;
    private float currentPressure = 29.92f;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // push based update
    // public void update(float temperature, float humidity, float pressure) {
    //     lastPressure = currentPressure;
    //     currentPressure = pressure;
    //     display();
    // }

    // pull based update
    public void update() {
        float pressure = this.weatherData.getPressure();
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
