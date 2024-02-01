/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enclase.tarea5fdanielnavarro;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author daniel
 */
public class SopaLetras {

    private char[][] sopaLetras;

    public SopaLetras(int tam) {
        this.sopaLetras = new char[tam][tam];
        rellenarMatriz();
    }

    public char[][] getSopaLetras() {
        return sopaLetras;
    }

    public void setSopaLetras(char[][] sopaLetras) {
        this.sopaLetras = sopaLetras;
    }

    public void rellenarMatriz() {
        Random r = new Random();
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                sopaLetras[i][j] = (char) r.nextInt(65, 91);
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Arrays.deepHashCode(this.sopaLetras);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SopaLetras other = (SopaLetras) obj;
        return Arrays.deepEquals(this.sopaLetras, other.sopaLetras);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SopaLetras{");
        sb.append("sopaLetras=").append(sopaLetras);
        sb.append('}');
        return sb.toString();
    }

    public void colocarPalabraHorizontal(String palabra, int fila, int columna) {
        char[] palabraChar = new char[palabra.length()];
        for (int i = 0; i < palabraChar.length; i++) {
            palabraChar[i] = palabra.charAt(i);
        }
        int contadorColumna = columna;
        for (int j = 0; j < palabraChar.length; j++) {            
            if (contadorColumna < sopaLetras[fila].length) {
                sopaLetras[fila][contadorColumna++] = palabraChar[j];
            }
        }

    }
    public void colocarPalabraHorizontalInvertida(String palabra, int fila, int columna) {
        char[] palabraChar = new char[palabra.length()];
        for (int i = 0; i < palabraChar.length; i++) {
            palabraChar[i] = palabra.charAt(i);
        }
        int contadorColumna = columna;
        for (int i = 0; i < palabraChar.length; i++) {            
            if (contadorColumna >=0 ) {
                sopaLetras[fila][contadorColumna--] = palabraChar[i];
            }
        }

    }
    
     public void colocarPalabraVertical(String palabra, int fila, int columna) {
        char[] palabraChar = new char[palabra.length()];
        for (int i = 0; i < palabraChar.length; i++) {
            palabraChar[i] = palabra.charAt(i);
        }
        int contadorFila = fila;
        for (int j = 0; j < palabraChar.length; j++) {            
            if (contadorFila < sopaLetras[fila].length) {
                sopaLetras[contadorFila++][columna] = palabraChar[j];
            }
        }

    }
     public void colocarPalabraVerticalInvertida(String palabra, int fila, int columna) {
        char[] palabraChar = new char[palabra.length()];
        for (int i = 0; i < palabraChar.length; i++) {
            palabraChar[i] = palabra.charAt(i);
        }
        int contadorFila = fila;
        for (int i = 0; i < palabraChar.length; i++) {            
            if (contadorFila >=0 ) {
                sopaLetras[contadorFila--][columna] = palabraChar[i];
            }
        }

    }
     

}
