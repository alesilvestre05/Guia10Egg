package paisservice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisService {

    TreeSet<String> paises = new TreeSet();
    Scanner leer = new Scanner(System.in);

    public void agregarPaises() {
        String opcion;
        do {
            System.out.println("Ingrese un país");
            String pais = leer.next();
            paises.add(pais);
            System.out.println("Desea ingresar otro país (si/no)");
            opcion = leer.next();
        } while (!opcion.toLowerCase().equals("no"));

    }

    public void mostrarPaises() {
        for (String paise : paises) {
            System.out.println(paise.toString());
        }

    }

    public void eliminarPaises() {
        Iterator<String> it = paises.iterator();

        System.out.println("Ingrese un país a eliminar");
        String pais2 = leer.next();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(pais2)) { //IgnoreCase para no diferenciar si es mays o mins
                it.remove();
            }
        }
    }
}
