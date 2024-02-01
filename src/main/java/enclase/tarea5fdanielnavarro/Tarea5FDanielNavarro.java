/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package enclase.tarea5fdanielnavarro;

/**
 *
 * @author daniel
 */
public class Tarea5FDanielNavarro {

    public static void main(String[] args) {
        SopaLetras primera = new SopaLetras(5);
        for(char[] letras:primera.getSopaLetras()){
            System.out.println(letras);
        }
        System.out.println("probar");
        primera.colocarPalabraHorizontal("hola", 3, 2);
         for(char[] letras:primera.getSopaLetras()){
            System.out.println(letras);
        }
         System.out.println("probar invertida- 4,2");
         primera.colocarPalabraHorizontalInvertida("cosa", 4, 2);
         for(char[] letras:primera.getSopaLetras()){
            System.out.println(letras);
    }
         
         
         System.out.println("probar vertical- 1,1");
         primera.colocarPalabraVertical("tata", 1, 1);
         for(char[] letras:primera.getSopaLetras()){
            System.out.println(letras);
    }
         
         System.out.println("probar vertical invertida 0,4");
         primera.colocarPalabraVerticalInvertida("luis", 4, 4);
         for(char[] letras:primera.getSopaLetras()){
            System.out.println(letras);
    }
         
         
}
}
