package modules;

public class Moneda {
    String nombreAcronimo;
    Double ratio;
    String pais;


    public Moneda(String nombreAcronimo, String pais) {
        this.nombreAcronimo = nombreAcronimo;
        this.pais = pais;
    }

    public void setRatio(MonedaExchange miMonedaEx) {
        this.ratio = miMonedaEx.conversion_rate();
    }

    public String getNombreAcronimo() {
        return nombreAcronimo;
    }

    public String getPais() {
        return pais;
    }

    public Double calcularConversion(Double valor) {

        return valor * this.ratio;
    }
}
