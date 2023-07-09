import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class ConversorLongitud extends Conversor {
    private NumberFormat decimalFormat;
    private Map<String, Double> factorConversion;

    public ConversorLongitud(double valor) {
        super(valor);
        decimalFormat = new DecimalFormat("#.###");
        factorConversion = new HashMap<>();
        factorConversion.put("Metro a Pulgada", 39.37);
        factorConversion.put("Metro a Pie", 3.281);
        factorConversion.put("Metro a Yarda", 1.094);
        factorConversion.put("Pulgada a Metro", 39.37);
        factorConversion.put("Pulgada a Pie", 12.0);
        factorConversion.put("Pulgada a Yarda", 36.0);
        factorConversion.put("Pie a Metro", 3.281);
        factorConversion.put("Pie a Pulgada", 12.0);
        factorConversion.put("Pie a Yarda", 3.0);
        factorConversion.put("Yarda a Metro", 1.094);
        factorConversion.put("Yarda a Pulgada", 36.0);
        factorConversion.put("Yarda a Pie", 3.0);
    }

    public double getFactorConversion(String factorConversion) {
        return this.factorConversion.get(factorConversion);
    }

    @Override
    public double convertir(double factorConversion) {
        return Double.parseDouble(decimalFormat.format(valor * factorConversion));
    }


    public double convertirDesde(double factorConversion) {
        return Double.parseDouble(decimalFormat.format(valor / factorConversion));
    }
}

