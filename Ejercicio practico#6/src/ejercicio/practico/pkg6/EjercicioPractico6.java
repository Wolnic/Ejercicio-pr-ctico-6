/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.practico.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class EjercicioPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la matriz (N x N): "));
        int[][] matriz = new int[n][n];
        solicitaDatosMatrix(matriz, n, n);
        imprimeDatosMatrix(matriz, n, n);
        
        int sumaEsquinas = calcularSumaEsquinas(matriz, n);
        int sumaDiagonal = calcularSumaDiagonal(matriz, n);
        int sumaDiagonalInversa = calcularSumaDiagonalInversa(matriz, n);
        int mayorNumero = obtenerMayorNumero(matriz, n);
        
        JOptionPane.showMessageDialog(null, "La suma de las 4 esquinas es: " + sumaEsquinas);
        JOptionPane.showMessageDialog(null, "La suma de la diagonal principal es: " + sumaDiagonal);
        JOptionPane.showMessageDialog(null, "La suma de la diagonal inversa es: " + sumaDiagonalInversa);
        JOptionPane.showMessageDialog(null, "El número mayor de toda la matriz es: " + mayorNumero);
    }
    
    public static void solicitaDatosMatrix(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor para la fila " + (i + 1) + " columna " + (j + 1) + ":"));
            }
        }
    }
    
    public static void imprimeDatosMatrix(int[][] matriz, int filas, int columnas) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.append(matriz[i][j]).append(" ");
            }
            resultado.append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
    public static int calcularSumaEsquinas(int[][] matriz, int n) {
        return matriz[0][0] + matriz[0][n-1] + matriz[n-1][0] + matriz[n-1][n-1];
    }
    
    public static int calcularSumaDiagonal(int[][] matriz, int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
    
    public static int calcularSumaDiagonalInversa(int[][] matriz, int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n-i-1];
        }
        return suma;
    }
    
    public static int obtenerMayorNumero(int[][] matriz, int n) {
        int mayor = matriz[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }
}
    
  
        


    
    

