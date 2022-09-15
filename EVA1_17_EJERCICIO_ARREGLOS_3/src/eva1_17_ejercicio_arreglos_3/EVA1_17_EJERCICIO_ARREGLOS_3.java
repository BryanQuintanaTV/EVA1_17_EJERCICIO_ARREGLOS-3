/*
 * "
 * "
 */
package eva1_17_ejercicio_arreglos_3;

/**
 * @author Bryan Alexis Quintana Juarez
 */
public class EVA1_17_EJERCICIO_ARREGLOS_3 {

    public static void main(String[] args) {
        int[][] matriz = new int [5][5];
        llenar(matriz);
        imprimir(matriz);
    }
    
     public static void llenar(int[][] matriz){
         for (int i = 0; i < matriz.length ; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 matriz[i][j] = (int) ((Math.random()*100)+1);
             } 
         }
    }
     public static void imprimir(int[][] matriz){
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 System.out.print("[ " +matriz[i][j]+" ] ");
             }
             System.out.println("");
         }
     }
    
}
