package registro;

import java.util.Date;

public class Registro {
    String consultaDate;
    Double valor;
    String moneda_base;
    String moneda_objetivo;
    Double ratio;
    Double valorConvertido;
    String lastUpdate;

    public Registro(String consultaDate, Double valor, String moneda_base, String moneda_objetivo, Double ratio, Double valorConvertido,String lastUpdate) {
        this.consultaDate = consultaDate;
        this.valor = valor;
        this.moneda_base = moneda_base;
        this.moneda_objetivo = moneda_objetivo;
        this.ratio = ratio;
        this.valorConvertido = valorConvertido;
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Fecha consulta = " + consultaDate + "\n" +
                "Valor = " + valor + " " + moneda_base +"\n" +
                "Ratio conversión = " + ratio + "\n" +
                "Última act. API = " + lastUpdate + "\n" +
                "Valor convertido = " + String.format("%.2f", valorConvertido) + " " + moneda_objetivo + "\n";

    }
}
