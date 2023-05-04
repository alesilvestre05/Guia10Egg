/*
 * Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un 
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se 
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer
 * los servicios en la clase correspondiente).
 * Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
 * cómo se ordena un conjunto.
 * Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
 * buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
 * usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
 * al usuario.
 */
package guia10ej5;

import paisservice.PaisService;

public class Guia10Ej5 {

    public static void main(String[] args) {
        PaisService ps1 = new PaisService();
        ps1.agregarPaises();
        System.out.println("Los paises ingresados fueron");
        ps1.mostrarPaises();
        ps1.eliminarPaises();
        System.out.println("La nueva lista de países es");
        ps1.mostrarPaises();
    }

}
