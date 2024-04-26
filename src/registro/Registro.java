package registro;

import java.util.Date;

public class Registro {
    Date consultaDate;
    Double valor;
    String moneda_base;
    String moneda_objetivo;
    Double ratio;
    String lastUpdate;

    public Registro(Date consultaDate, Double valor, String moneda_base, String moneda_objetivo, Double ratio, String lastUpdate) {
        this.consultaDate = consultaDate;
        this.valor = valor;
        this.moneda_base = moneda_base;
        this.moneda_objetivo = moneda_objetivo;
        this.ratio = ratio;
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "consultaDate=" + consultaDate +
                ", valor=" + valor +
                ", moneda_base='" + moneda_base + '\'' +
                ", moneda_objetivo='" + moneda_objetivo + '\'' +
                ", ratio=" + ratio +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }
}
