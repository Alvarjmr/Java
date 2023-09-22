import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class ListVehiculo {
    ArrayList<Vehiculos> listcaracteristicas = new ArrayList();
    public String Input (String text){
        return JOptionPane.showInputDialog(text);
    }
    public void addcaracteristicas () {
       String marca = Input("Ingrese la marca");
       String modelo = Input("Ingrese el modelo");
       String cilindraje = Input("Ingrese cilindraje");
       String electrico = Input("Es electrico");
       String combutible = Input("Es de combustible");
       //Creamos el objecto        //Intancismos la clase
       Vehiculos caracteristicas = new Vehiculos();

       caracteristicas.setMarca(marca);
       caracteristicas.setModelo(modelo);
       caracteristicas.setCilindraje(cilindraje);
       caracteristicas.setElectrico(electrico);
       caracteristicas.setCombutible(combutible);
       listcaracteristicas.add(caracteristicas);
    }
    //metodo para mostrar la informacion que se vaya guardadon en la lista
    public void mostarcarteristicas () {
        String cadena = "";
        for (int i = 0; i < listcaracteristicas.size(); i++){
            cadena+="Marca: " + listcaracteristicas.get(i).getMarca() + "\n";
            cadena+="Modelo: " + listcaracteristicas.get(i).getModelo() + "\n";
            cadena+="Cilindraje: " + listcaracteristicas.get(i).getCilindraje()+ "\n";
            cadena+="Cilindraje: " + listcaracteristicas.get(i).getCilindraje()+ "\n";
            cadena+="Electrico: " + listcaracteristicas.get(i).getElectrico()+ "\n";
            cadena+="Combustible: " + listcaracteristicas.get(i).getCombutible()+ "\n";
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
    public void clearlistcaracteristicas(){
        listcaracteristicas.clear();
    }
}
