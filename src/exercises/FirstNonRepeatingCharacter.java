package exercises;

import java.util.HashMap;

/* Given a string S consisting of lowercase Latin Letters, the task is to find the first non-repeating character in S.

Examples:

Input: “geeksforgeeks”Output: fExplanation: As ‘f’ is first character in the string which does not repeat. */

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "exercise";

        // Crea un mapa vacio para guardar el conteo de cada caracter
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // Convierte el string en un array de caracteres
        char[] charArray = s.toCharArray();

         // Itera por cada caracter en el array
        for (char c : charArray) {
            // Pasa por cada caracter en el array, como el mapa esta vacio, se usa getOrDefault() para obtener el valor, null o usar el default 0,
            // de esta forma regresa 0 como valor para cada uno, ejemplo: exercise, e = null or 0, x = null or 0, e = null or 0...
            // Al encontrar un caracter repetido, necesitamos aumentar +1, asi que al default 0, le ponemos + 1, si no se ha encontrado sera 1, si se ha encontrado sera 2, etc.
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

        }
      

        System.out.println(charCount);
        }
}

