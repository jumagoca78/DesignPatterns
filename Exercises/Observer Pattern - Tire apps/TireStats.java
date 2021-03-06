/**
 *
 * @author estefaniapitolmartinez
 */
import java.util.ArrayList;

public class TireStats implements Observer, Display {    
    private Double pressure, humidity, temperature;
    private TireData tireData;

    public TireStats(TireData td) {
        tireData = td;
        tireData.addObserver(this);
    }

    @Override
    public void update() {
        pressure = tireData.getPressure();
        humidity = tireData.getHumidity();
        temperature = tireData.getTemperature();
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("Tire Stats");
        System.out.println("Current pressure: " + pressure);
        System.out.println("Current humidity: " + humidity);
        System.out.println("Current temperature: " + temperature);
        System.out.println();
    }
}