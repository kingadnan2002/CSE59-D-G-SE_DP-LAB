class Sensor {
    String name;
    int batteryLevel;

    void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Sensor mySensor = new Sensor();
        mySensor.name = "Temperature_Sensor_01";
        mySensor.batteryLevel = 45; // Initial level before charging

        mySensor.charge();
        System.out.println("New battery level: " + mySensor.batteryLevel + "%");
    }
}
