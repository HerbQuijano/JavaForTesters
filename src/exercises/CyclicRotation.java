package exercises;

import java.util.Arrays;

public class CyclicRotation {
    public static int[] rotate(int[] n, int k) {
        int[] rotated = new int[n.length];

        int rotationsNeeded = k % n.length;

       for (int i = 0; i < rotationsNeeded; i++){
           rotated[i] = n[n.length - rotationsNeeded + i];  // 5 - 2 + i
       }

       for (int i = rotationsNeeded; i < n.length; i++){
           rotated[i] = n[i - rotationsNeeded];
       }




        return rotated;

    }

    public static void main(String[] args) {
        //int[] array = {1, 3, 5, 7, 9};
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(rotate(array, 3)));

    }
}
