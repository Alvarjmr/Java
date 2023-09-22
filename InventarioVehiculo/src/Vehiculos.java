public class Vehiculos {
    private String marca;
    private String modelo;
    private String cilindraje;
    private String electrico;
    private String combutible;

    //Constructor
    public Vehiculos() {
        marca = "";
        modelo = "";
        cilindraje = "";
        electrico = "";
        combutible = "";
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getElectrico() {
        return electrico;
    }

    public void setElectrico(String electrico) {
        this.electrico = electrico;
    }

    public String getCombutible() {
        return combutible;
    }

    public void setCombutible(String combutible) {
        this.combutible = combutible;
    }
}
