import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConversorTemperatura extends Conversor {

    private NumberFormat decimalFormat;

    public ConversorTemperatura(double valor) {
        super(valor);
        decimalFormat = new DecimalFormat("#.###");
    }

    public double convertirDesdeClesiusAFarenheit() {
        return Double.parseDouble(decimalFormat.format(valor * 9 / 5 + 32)); // Conversión de Celsius a Fahrenheit
    }

    public double convertirDesdeCelsiusAKelvin() {
        return Double.parseDouble(decimalFormat.format(valor + 273.15)); // Conversión de Celsius a Kelvin
    }
    
    // Métodos para convertir desde Fahrenheit a otras unidades de temperatura
    public double convertirDesdeFahrenheitACelsius() {
        return Double.parseDouble(decimalFormat.format((valor - 32) * 5 / 9)); // Conversión de Fahrenheit a Celsius
    }

    public double convertirDesdeFahrenheitAKelvin() {
        return Double.parseDouble(decimalFormat.format((valor + 459.67) * 5 / 9)); // Conversión de Fahrenheit a Kelvin
    }

    // Métodos para convertir desde Kelvin a otras unidades de temperatura
    public double convertirDesdeKelvinACelsius() {
        return Double.parseDouble(decimalFormat.format(valor - 273.15)); // Conversión de Kelvin a Celsius
    }

    public double convertirDesdeKelvinAFahrenheit() {
        return Double.parseDouble(decimalFormat.format(valor * 9 / 5 - 459.67)); // Conversión de Kelvin a Fahrenheit
    }

    @Override
    public double convertir(double indiceConversion) {
        throw new UnsupportedOperationException("Unimplemented method 'convertir'");
    }

}
