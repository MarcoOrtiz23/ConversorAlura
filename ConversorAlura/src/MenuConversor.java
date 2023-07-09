import javax.swing.JOptionPane;

public class MenuConversor {

    public void mostrarMenu() {
        String[] opciones = {"Conversión de Divisas", "Conversión de Temperaturas", "Conversión de Longitudes"};
        boolean continuar = true;

        while (continuar) {
            String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona una opción de conversión:", "Menú",
                    JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            if (seleccion != null) {
                try {
                    double cantidad = obtenerCantidad();

                    if (cantidad == -1) {
                        continue;  // Regresar al menú si el usuario selecciona "Cancelar"
                    }

                    switch (seleccion) {
                        case "Conversión de Divisas":
                            ConversorDivisas conversorDivisas = new ConversorDivisas(cantidad);
                            OpcionesDivisas opcionesDivisas = new OpcionesDivisas();
                            opcionesDivisas.mostrarOpcionesConversiónDivisas(conversorDivisas);
                            break;

                        case "Conversión de Temperaturas":
                            ConversorTemperatura conversorTemperatura = new ConversorTemperatura(cantidad);
                            OpcionesTemperaturas opcionesTemperaturas = new OpcionesTemperaturas();
                            opcionesTemperaturas.mostrarOpcionesConversiónTemperaturas(conversorTemperatura);
                            break;

                        case "Conversión de Longitudes":
                            ConversorLongitud conversorLongitud = new ConversorLongitud(cantidad);
                            OpcionesLongitudes opcionesLongitudes = new OpcionesLongitudes();
                            opcionesLongitudes.mostrarOpcionesConversiónLongitudes(conversorLongitud);
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Has cerrado el Menú o seleccionado Cancelar");
                            continuar = false;
                            break;
                    }

                    if (continuar) {
                        int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?", "Continuar",
                                JOptionPane.YES_NO_OPTION);
                        if (opcion == JOptionPane.NO_OPTION) {
                            continuar = false;
                        }
                    }
                } catch (CancelarOperacionException ex) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada. Volviendo al menú principal.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Has cerrado el Menú o seleccionado Cancelar");
                continuar = false;
            }
        }

        JOptionPane.showMessageDialog(null, "El programa ha terminado");
    }

    private double obtenerCantidad() throws CancelarOperacionException {
        String inputCantidad;
        double cantidad = 0;

        inputCantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad:");
        if (inputCantidad == null) {
            // El usuario ha seleccionado "Cancelar"
            throw new CancelarOperacionException();
        }

        try {
            cantidad = Double.parseDouble(inputCantidad);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: La cantidad ingresada no es válida. Por favor, ingrese un número válido.");
        }

        return cantidad;
    }

}

