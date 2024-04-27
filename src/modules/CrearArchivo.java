package modules;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import registro.Log;
import registro.Registro;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CrearArchivo {

    public void guardarJson(Log milog){
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        try {
            FileWriter logFile = new FileWriter("log.json");
            logFile.write(gson.toJson(milog.getRegistros()));
            logFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
