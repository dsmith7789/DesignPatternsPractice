public interface Observer {
    //public void update(float temp, float humidity, float pressure); // push based
    public void update();   // pull based
}
