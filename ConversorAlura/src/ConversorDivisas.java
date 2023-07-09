import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class ConversorDivisas extends Conversor {
    private DecimalFormat decimalFormat;
    private Map<String, Double> tasasDeCambio;

    public ConversorDivisas(double valor) {
        super(valor);
        decimalFormat = new DecimalFormat("#.###");
        tasasDeCambio = new HashMap<>();
        tasasDeCambio.put("Peso Mexicano a Dólar", 0.0583);
        tasasDeCambio.put("Peso Mexicano a Euro", 0.0531);
        tasasDeCambio.put("Peso Mexicano a Libra Esterlina", 0.0454);
        tasasDeCambio.put("Peso Mexicano a Yen Japonés", 8.2880);
        tasasDeCambio.put("Peso Mexicano a Won Surcoreano", 75.7356);
    }

    @Override
    public double convertir(double indiceConversion) {
        return Double.parseDouble(decimalFormat.format(valor * indiceConversion));
    }


    public double convertirA(double tasa) {
        return Double.parseDouble(decimalFormat.format(valor / tasa));
    }

    public double getTasasDeCambio(String tasaDeCambio) {
        return tasasDeCambio.get(tasaDeCambio);
    }
}


