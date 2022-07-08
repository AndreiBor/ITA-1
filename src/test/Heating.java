package test;

class Heating {

    int startHeating(int temperature, int hours) {
        return temperature + hours;
    }

    int stopHeating(int temperature, int hours) {
        return temperature - hours;
    }

}
