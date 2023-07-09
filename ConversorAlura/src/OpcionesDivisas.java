import javax.swing.JOptionPane;

public class OpcionesDivisas {
    public boolean booleanValue;
    private double resultado;
        private String[] opcionesMonedas ={
                "De Peso Mexicano a Dólar",
                "De Peso Mexicano a Euro",
                "De Peso Mexicano a Libra Esterlina",
                "De Peso Mexicano a Yen Japonés",
                "De Peso Mexicano a Won Surcoreano",
                "De Dólar a Peso Mexicano",
                "De Euro a Peso Mexicano",
                "De Libra Esterlina a Peso Mexicano",
                "De Yen Japonés a Peso Mexicano",
                "De Won Surcoreano a Peso Mexicano"};

    public void mostrarOpcionesConversiónDivisas(ConversorDivisas conversorDivisas) {
        String seleccionMoneda = (String) JOptionPane.showInputDialog(null, "Seleccione la divisa que desea convertir:",
                "Divisas", JOptionPane.PLAIN_MESSAGE, null, opcionesMonedas, opcionesMonedas[0]);
                
        if (seleccionMoneda != null) {  
                  
            switch (seleccionMoneda) {
                case "De Peso Mexicano a Dólar":
                    resultado = conversorDivisas.convertir(conversorDivisas.getTasasDeCambio("Peso Mexicano a Dólar"));
                    JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Dólares");
                    break;
                case "De Peso Mexicano a Euro":
                    resultado = conversorDivisas.convertir(conversorDivisas.getTasasDeCambio("Peso Mexicano a Euro"));
                    JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Euros");
                    break;
                case "De Peso Mexicano a Libra Esterlina":
                    resultado = conversorDivisas.convertir(conversorDivisas.getTasasDeCambio("Peso Mexicano a Libra Esterlina"));
                    JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Libras Esterlinas");
                    break;
                case "De Peso Mexicano a Yen Japonés":
                    resultado = conversorDivisas.convertir(conversorDivisas.getTasasDeCambio("Peso Mexicano a Yen Japonés"));
                    JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Yenes Japoneses");
                    break;
                case "De Peso Mexicano a Won Surcoreano":
                    resultado = conversorDivisas.convertir(conversorDivisas.getTasasDeCambio("Peso Mexicano a Won Surcoreano"));
                    JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Wones Surcoreanos");
                    break;
                case "De Dólar a Peso Mexicano":
                    resultado = conversorDivisas.convertirA(conversorDivisas.getTasasDeCambio("Peso Mexicano a Dólar"));
                    JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Mexicanos");
                    break;
                case "De Euro a Peso Mexicano":
                    resultado = conversorDivisas.convertirA(conversorDivisas.getTasasDeCambio("Peso Mexicano a Euro"));
                    JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Mexicanos");
                    break;
                case "De Libra Esterlina a Peso Mexicano":
                    resultado = conversorDivisas.convertirA(conversorDivisas.getTasasDeCambio("Peso Mexicano a Libra Esterlina"));
                    JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Mexicanos");
                    break;
                case "De Yen Japonés a Peso Mexicano":
                    resultado = conversorDivisas.convertirA(conversorDivisas.getTasasDeCambio("Peso Mexicano a Yen Japonés"));
                    JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Mexicanos");
                    break;
                case "De Won Surcoreano a Peso Mexicano":
                    resultado = conversorDivisas.convertirA(conversorDivisas.getTasasDeCambio("Peso Mexicano a Won Surcoreano"));
                    JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Mexicanos");
                    break;
                default:
                    break;
            }
        }
    }
}