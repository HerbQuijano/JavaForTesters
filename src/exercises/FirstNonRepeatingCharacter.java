package exercises;

import java.util.HashMap;

/* Given a string S consisting of lowercase Latin Letters, the task is to find the first non-repeating character in S.

Examples:

Input: “geeksforgeeks”Output: fExplanation: As ‘f’ is first character in the string which does not repeat. */

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "electo";

        // System.out.println(firstNonRepeatingCharacter(s));
        System.out.println(FirstNonRepeatingCharWithArray(s));
}

    private static char firstNonRepeatingCharacter(String s) {
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

        System.out.println(charCount.toString());

        // Iterar una segunda vez por cada caracter en el array y se comprueba si el conteo de este caracter es igual a 1, si es asi, retorna el caracter.
        for (char c : charArray){
            if (charCount.get(c) == 1){
                return c;
            }
        }

        // Si no se ha encontrado ningun caracter repetido, retorna un '_'.
        return '_';
    }

    private static char FirstNonRepeatingCharWithArray(String s) {

        // Primero creamos dos arrays, uno para contar el conteo de cada caracter y otro para el array de posicion
        int[] count = new int[26];
        int[] position = new int[26];
        for (int i = 0; i < 26; i++) {
            // Aqui se inicializan todos los valores en el array de position a -1, no se inicializan a 0 porque el array empieza en 0 lo cual representaria la 'a'
            position[i] = -1;  // Initialize position array
        }

        // Ahora pasamos por cada caracter en el string y lo convertimos a su indice
        /* Since characters are represented by numbers, you can perform arithmetic operations on them.
            When you subtract the numerical value of 'a' from the numerical value of any lowercase letter,
            you get an integer that represents its position in the alphabet. For example:

            If char is 'a', then char - 'a' is 97 - 97 = 0.
            If char is 'b', then char - 'a' is 98 - 97 = 1.
            If char is 'z', then char - 'a' is 122 - 97 = 25. */

            // Ejemplo, si la letra actual es 'i' su posicion ascii es 105, 105 - 97 = 8
            // Tomamos ese 8 y esa sera nuestra posicion a incrementar
        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            if (position[charIndex] == -1) {
                position[charIndex] = i;  // First occurrence of the character
            }
            count[charIndex]++;
        }

        // Guarda en una variable la longitud del string
        int firstNonRepeatingPos = s.length();

        // Itera por cada caracter
        for (int i = 0; i < 26; i++) {
            // Si el conteo de este caracter es igual a 1 y la posicion actual es menor que la longitud del string, se actualiza la posicion actual
            if (count[i] == 1 && position[i] < firstNonRepeatingPos) {
                // Actualizamos la posicion actual
                firstNonRepeatingPos = position[i];
            }
        }

        // Si no se ha encontrado ningun caracter repetido, retorna un '_'.
        // Usando operador ternario
        /*
        firstNonRepeatingPos == s.length(): This is the condition being checked.
        It's comparing the value of firstNonRepeatingPos to the length of the string s.
        If firstNonRepeatingPos is equal to the length of the string, it means that no non-repeating character was found
        (since firstNonRepeatingPos was initialized to the length of the string and would only be updated if a non-repeating character was found).

        /* ? '-': This part comes after the question mark and is the value that will be returned if the condition is true.
        In this case, if no non-repeating character was found, the method returns '-' as a placeholder.
        

        /* : s.charAt(firstNonRepeatingPos): This part comes after the colon and is the value that will be returned if the condition is false.
        If a non-repeating character was found, this will return the character at the position firstNonRepeatingPos in the string s. */
        
        return firstNonRepeatingPos == s.length() ? '-' : s.charAt(firstNonRepeatingPos);
    }
}



