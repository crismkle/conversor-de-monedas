<h1 align="center"> CONVERSOR DE MONEDAS </h1>

Proyecto Challenge del curso de Java de Alura/Oracle.
Convierte un valor de una moneda a otra consumiendo una API con las cotizaciones actualizadas.
Para hacer las conversiones utiliza la api *exchangerate-api*.

## :hammer:Funcionalidades del proyecto
- Muestra un menú al usuario con las opciones para convertir monedas
- Pide una opción y un importe a convertir
- Imprime el importe convertido
- Si el usuario elige salir del programa, se muestra un resumen de las consultas hechas
- Se guardan las consultas en un Json


## 📦 Despliegue

Usar un IDE para Java, preferentemente IntelliJ.
Instalar la libreía Gson si es necesario.
Ejecutar por consola.

## 💻 Ejemplos

Seleccionando una de las opciones con las monedas predefinidas. Convierte 50 USD (dólares estadounidenses) a pesos colombianos.

![1](https://github.com/crismkle/conversor-de-monedas/assets/122938039/85d45963-2616-44df-b939-7ffcceb14cc9)


Selecciona la opción manual de ingresar los códigos de monedas. En este caso, el importe de 150 USD (dólares estadounidenses) a convertir en CNY (yuanes).

![4](https://github.com/crismkle/conversor-de-monedas/assets/122938039/f3971ed7-058a-422b-9a88-bd48c2de79d8)



Al elegir salir, se muestran todas las consultas realizadas con sus respectivos horarios, importes, ratios de conversión y cuándo se actualizó la API. Al mismo tiempo se crea un archivo *log_consultas.json* para guardar las mismas.

![3](https://github.com/crismkle/conversor-de-monedas/assets/122938039/62bc74cf-6f59-4e0f-9847-f2a125cf5edb)



## ✒️ Autor
* **Cristian Muñoz** - [crismkle](https://github.com/crismkle)
