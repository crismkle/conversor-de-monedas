package principal;

import modules.ConsultaMoneda;
import modules.CrearArchivo;
import modules.Moneda;
import modules.MonedaExchange;
import registro.Log;
import registro.Registro;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Scanner teclado = new Scanner(System.in);
        Log misRegistros = new Log();

        while (true) {
            System.out.println("""
                    \n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
                    █     ¡BIENVENIDO/A AL CONVERSOR DE MONEDAS!     █
                    ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n""");
            System.out.println("""
                    1) Dolar            => Peso argentino
                    2) Peso argentino   => Dolar
                    3) Dolar            => Real brasileño
                    4) Real brasileño   => Dolar
                    5) Dolar            => Peso colombiano
                    6) Peso colombiano  => Dolar
                    7) Salir\n""");


            System.out.println("Elija una de las opciones: ");
            var opcion = teclado.nextLine();

            String base = "", objetivo = "", pais = "";
            try {
                if (Integer.valueOf(opcion) == 7) {
                    System.out.println(misRegistros);
                    CrearArchivo arch = new CrearArchivo();
                    arch.guardarJson(misRegistros);
                    break;
                }
                System.out.println("Ingrese el valor a convertir: ");
                Double valor = Double.valueOf(teclado.nextLine());

                switch (Integer.valueOf(opcion)) {
                    case 1:
                        base = "USD";
                        objetivo = "ARS";
                        pais = "Argentina";
                        break;
                    case 2:
                        base = "ARS";
                        objetivo = "USD";
                        pais = "Argentina";
                        break;
                    case 3:
                        base = "USD";
                        objetivo = "BRL";
                        pais = "Brasil";
                        break;
                    case 4:
                        base = "BRL";
                        objetivo = "USD";
                        pais = "Brasil";
                        break;
                    case 5:
                        base = "USD";
                        objetivo = "COP";
                        pais = "Colombia";
                        break;
                    case 6:
                        base = "COP";
                        objetivo = "USD";
                        pais = "Colombia";
                        break;
                    default:
                }

                MonedaExchange monedaExch = consulta.buscaConversion(base, objetivo);
                Moneda miMoneda;
                if (base.equals("USD"))
                    miMoneda = new Moneda(objetivo, pais);
                else
                    miMoneda = new Moneda(base, pais);
                miMoneda.setRatio(monedaExch);
                miMoneda.setLastUpdate(monedaExch);

                Double valConvertidoDouble = miMoneda.calcularConversion(valor);
                System.out.println("\nEl valor de " + valor + " " + base +  " equivale a =>>> " + String.format("%.2f", valConvertidoDouble) + " " + objetivo + "\n");

                Date ahoraDate = new Date();
                Registro reg = new Registro(ahoraDate.toString(), valor, base, objetivo, miMoneda.getRatio(), valConvertidoDouble, miMoneda.getLastUpdate());
                misRegistros.agregarRegistro(reg);

            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. " + e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
