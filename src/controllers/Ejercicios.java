package controllers;

import java.util.HashMap;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        // Si el length no es igual, no pueden ser anagramas
        if (str1.length() != str2.length()) {
            return false;
        }

        // Mapas para contar los chars
        HashMap<Character, Integer> count1 = new HashMap<>();
        HashMap<Character, Integer> count2 = new HashMap<>();

        // Iterar sobre los chars
        for (char c : str1.toCharArray()){
            count1.put(c, count1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            count2.put(c, count2.getOrDefault(c, 0) + 1);
        }

        // Comparar los dos mapas
        return count1.equals(count2);

    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {

        // Mapa para los números e índices
        HashMap<Integer, Integer> numMap = new HashMap<>();

        // Iterar sobre el array de números
        for (int i = 0; i < nums.length; i++) {

            // Operacion que calcula el complemento 
            int complement = objetivo - nums[i];

            // Verificar si el complemento ya está en el mapa
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i}; // Si está, retornar el número actual y su complemento
            }
            numMap.put(nums[i], i); // Si no, agregar el número actual y su índice
        }
        return null; // Si no hay,  null
    }
}
