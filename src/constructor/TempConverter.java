package constructor;

public class TempConverter {

    private static TempConverter instance;

    private TempConverter(){

    }

    public double convertKelvins(double cels) {
        double result = cels + 273.15;
        return result;
    }

    public double convertFarenheit(double cels) {
        double result = cels * 1.8 + 32;
        return result;
    }

    public static TempConverter getInstance(){
        if (instance == null) {
            instance = new TempConverter();
        }

        return instance;
    }

}