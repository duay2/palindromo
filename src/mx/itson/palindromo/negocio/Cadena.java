
package mx.itson.palindromo.negocio;

/**
 * examina la frase para determinar un palíndromo
 * @param a es la cadena
 */
public class Cadena {
    public static boolean  examinar (String frase){
        frase = frase.replace(" ", "").toLowerCase();
        
        int longitudFrase = frase.length();
        
        for (int i = 0; i < longitudFrase / 2; i++) {
            char izquierda = frase.charAt(i);
            char derecha = frase.charAt(longitudFrase - 1 - i);

            if (izquierda != derecha) {
                return false; // no es un palíndromo
            }
        }
        return true; // es un palíndromo
    }
   

}
