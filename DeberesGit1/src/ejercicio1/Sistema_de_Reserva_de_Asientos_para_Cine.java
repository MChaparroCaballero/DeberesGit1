package ejercicio1;
import java.util.Scanner;

public class Sistema_de_Reserva_de_Asientos_para_Cine {

	
	   public static boolean seleccion(int a) {
        return a == 0;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[][] asiento = new int[10][10];
        System.out.println("Introduce la fila y la columna del asiento que quieres");

        int fila;
        int columna;
        int asientoseleccionado;
        boolean fin = false;

        while (!fin) {
            for (int i = 0; i < asiento.length; i++) {
                System.out.println(" ");
                for (int j = 0; j < asiento.length; j++) {
                    if (seleccion(asiento[i][j])) {
                        System.out.print("L ");
                    } else {
                        System.out.print("O ");
                    }
                }
            }

            System.out.println("");
            fila = lector.nextInt();
            columna = lector.nextInt();

            if (fila == 0 || columna == 0) {
                fin = true;
                break;
            }

            if (seleccion(asiento[fila][columna])) {
                System.out.println("Asiento " + fila + "-" + columna + " seleccionado");
            } else {
                System.out.print("Este asiento ya está seleccionado. ");
            }

            asiento[fila][columna] = 1;
            System.out.println("Si desea finalizar su compra, pulse 0");
        }

        System.out.println("Compra finalizada");
    }
}
	
	
