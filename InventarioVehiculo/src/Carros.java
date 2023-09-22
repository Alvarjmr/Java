public class Carros extends Vehiculos {
    private String TipoCarro;

    public Carros (String marca, String modelo, String cilindraje, String electrico, String combutible,String TipoCarro)
    {
        super(marca, modelo, cilindraje, electrico, combutible);
        this.TipoCarro=TipoCarro;
    }
}
