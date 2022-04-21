package es.alejandro.programacion.Arrays;


public class MatrizBid {
    protected static int numMatrices = 0;
    
    
    public MatrizBid() {
        
    }
    
    public static int[][] suma(int a[][],int b[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] += b[i][j];
            }
        }
        return a;
    }
    
    public static int[][] resta(int a[][], int b[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] -= b[i][j];
            }
        }
        return a;
    }
    public static int[][] producto(int a[][], int b[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] *= b[i][j];
            }
        }
        return a;
    }
    public static int getNumMatrices() {
        return MatrizBid.numMatrices;
    }
    
    
    
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6}};
        int b[][] = {{1,2,3},{4,5,6}};
        System.out.println(MatrizBid.producto(a, b));
    }
}
