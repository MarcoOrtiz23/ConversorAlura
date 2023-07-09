import javax.swing.JOptionPane;

public class OpcionesLongitudes {
    private double resultado;
    private String[] opcionesLongitudes = {
                "De Metros a Pulgadas","De Metros a Pies","De Metros a Yardas",
                "De Pulgadas a Metros","De Pulgadas a Pies","De Pulgadas a Yardas",
                "De Pies a Metros","De Pies a Pulgadas","De Pies a Yardas",
                "De Yardas a Metros","De Yardas a Pulgadas","De Yardas a Pies"};

    public void mostrarOpcionesConversiónLongitudes(ConversorLongitud conversorLongitud) {
        String seleccionLongitud = (String) JOptionPane.showInputDialog(null, "Seleccione la longitud que desea convertir:",
                "Longitudes", JOptionPane.PLAIN_MESSAGE, null, opcionesLongitudes, opcionesLongitudes[0]);
        if (seleccionLongitud != null) {
            switch (seleccionLongitud) {
                case "De Metros a Pulgadas":
                    resultado = conversorLongitud.convertir(conversorLongitud.getFactorConversion("Metro a Pulgada"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " pulgadas");
                    break;
                case "De Metros a Pies":
                    resultado = conversorLongitud.convertir(conversorLongitud.getFactorConversion("Metro a Pie"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " pies");
                    break;
                case "De Metros a Yardas":
                    resultado = conversorLongitud.convertir(conversorLongitud.getFactorConversion("Metro a Yarda"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado +  " yardas");
                    break;
                case "De Pulgadas a Metros":
                    resultado = conversorLongitud.convertirDesde(conversorLongitud.getFactorConversion("Pulgada a Metro"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " metros");
                    break;
                case "De Pulgadas a Pies":
                    resultado = conversorLongitud.convertirDesde(conversorLongitud.getFactorConversion("Pulgada a Pie"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " pies");
                    break;
                case "De Pulgadas a Yardas":
                    resultado = conversorLongitud.convertirDesde(conversorLongitud.getFactorConversion("Pulgada a Yarda"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " yardas");
                    break;
                case "De Pies a Metros":
                    resultado = conversorLongitud.convertirDesde(conversorLongitud.getFactorConversion("Pie a Metro"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " metros");
                    break;
                case "De Pies a Pulgadas":
                    resultado = conversorLongitud.convertir(conversorLongitud.getFactorConversion("Pie a Pulgada"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " pulgadas");
                    break;
                case "De Pies a Yardas":
                    resultado = conversorLongitud.convertirDesde(conversorLongitud.getFactorConversion("Pie a Yarda"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " yardas");
                    break;
                case "De Yardas a Metros":
                    resultado = conversorLongitud.convertirDesde(conversorLongitud.getFactorConversion("Yarda a Metro"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " metros");
                    break;
                case "De Yardas a Pulgadas":
                    resultado = conversorLongitud.convertir(conversorLongitud.getFactorConversion("Yarda a Pulgada"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " pulgadas");
                    break;
                case "De Yardas a Pies":
                    resultado = conversorLongitud.convertir(conversorLongitud.getFactorConversion("Yarda a Pie"));
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado + " pies");
                    break;
                default:
                    break;
            }
        }
    }
}