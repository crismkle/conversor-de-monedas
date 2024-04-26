package registro;

import java.util.ArrayList;

public class Log {
    ArrayList<Registro> misRegistros = new ArrayList<Registro>();

    public void agregarRegistro(Registro reg){
        this.misRegistros.add(reg);
    }

    @Override
    public String toString() {
        return "Log{" +
                "misRegistros=" + misRegistros +
                '}';
    }
}
