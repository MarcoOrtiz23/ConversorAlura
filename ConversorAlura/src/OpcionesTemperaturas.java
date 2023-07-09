import javax.swing.JOptionPane;

public class OpcionesTemperaturas {
    private double resultado;

    private String[] opcionesTemperaturas = {"De Celsius a Fahrenheit","De Celsius a Kelvin","De Farenheit a Celsuius","De Farenheit a Kelvin",
                                            "De Kelvin a Celsius", "De Kelvin a Farenheit"};

    public void mostrarOpcionesConversiónTemperaturas(ConversorTemperatura conversortTemperatura) {
        String seleccionTemperatura = (String) JOptionPane.showInputDialog(null, "Seleccione la divisa que desea convertir:",
            "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, opcionesTemperaturas,opcionesTemperaturas[0]);
        switch (seleccionTemperatura) {
            case"De Celsius a Fahrenheit" :
                resultado = conversortTemperatura.convertirDesdeClesiusAFarenheit();
                JOptionPane.showMessageDialog(null, "Tienes " + resultado + " grados Farenheit");
                break;
            case "De Celsius a Kelvin":
                resultado = conversortTemperatura.convertirDesdeCelsiusAKelvin();
                JOptionPane.showMessageDialog(null, "Tienes " + resultado + " grados Kelvin");
                break;
            case"De Farenheit a Celsuius" :
                resultado = conversortTemperatura.convertirDesdeFahrenheitACelsius();
                JOptionPane.showMessageDialog(null, "Tienes °" + resultado + " grados Celsius");
                break;
            case "De Farenheit a Kelvin":
                resultado = conversortTemperatura.convertirDesdeFahrenheitAKelvin();
                JOptionPane.showMessageDialog(null, "Tienes " + resultado + " grados Kelvin");
                break;
            case "De Kelvin a Celsius":
                resultado = conversortTemperatura.convertirDesdeKelvinACelsius();
                JOptionPane.showMessageDialog(null, "Tienes " + resultado + " grados Celsius");
                break;
            case  "De Kelvin a Farenheit":
                resultado = conversortTemperatura.convertirDesdeKelvinAFahrenheit();
                JOptionPane.showMessageDialog(null, "Tienes " + resultado + " grados Farenheit");
                break;
            default:
                break;
        }
    }
}