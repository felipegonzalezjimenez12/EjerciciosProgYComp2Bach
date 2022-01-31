package Ordenacion;

public class ORDENACION {

	public static void main(String[] args) {
		int i , j, menor, pos, tmp;
		int array[] = new int[150];
        System.out.println("Imprimiendo arreglo antes de ordenar...");
        for (int a : array) {
            System.out.printf("%d, ", a);
        }
        // Ordenamos. Recuerda: en Java los arreglos se pasan por referencia así que no necesitamos obtener
        // el resultado, ya que dentro de la función se modifica al arreglo
        // Más información: https://parzibyte.me/blog/2020/04/04/java-parametros-referencia-valor/
       

        System.out.println("\nImprimiendo arreglo después de ordenar...");
        for (int a : array) {
            System.out.printf("%d, ", a);
        }
    }

    public static void ordenarPorSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
    }}

