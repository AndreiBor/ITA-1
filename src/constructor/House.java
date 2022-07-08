package constructor;

import test.ClimateControl;

public class House {

    // поля
    public int temperature;
    private ClimateControl climateControl;


    public House(int temperature) {
        this.temperature = temperature;
        climateControl = new ClimateControl();
    }

    public House(int temperature, ClimateControl climateControl) {
        this.temperature = temperature;
        this.climateControl = climateControl;
    }

    // методы
    public void createDesiredTemp(int desiredTemp) {
        

        System.out.println("Первоначальная температура = " + temperature);

        if (desiredTemp < temperature) {
            temperature = climateControl.startCooling(temperature,
                    temperature - desiredTemp);
        } else if (desiredTemp > temperature) {
            temperature = climateControl.startHeating(temperature, desiredTemp - temperature);
        } else System.out.println("Температура в норме");

    }

    public int getTemperature () {
        return temperature;
    }

    public void setTemperature (int temp) {
        temperature = temp;
    }


}
