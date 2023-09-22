import javax.swing.*;

public class Inventario {
    public static void main(String[] args) {

        ListVehiculo objeto = new ListVehiculo();
        byte opcion;
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "Menu Principal\n"
                            + "1. Agregar Crateristica"
                            + "2. Liata de carateristicas\n"
                            + "3. Limpiar caracteristicas\n"
                            + "4. Exit"));
            switch (opcion) {
                case 1:
                    objeto.addcaracteristicas();
                    break;
                case 2:
                    objeto.mostarcarteristicas();
                    break;
                case 3:
                    objeto.clearlistcaracteristicas();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "N/A");
                    break;

            }
        }

     while(opcion!=4);

    }
}