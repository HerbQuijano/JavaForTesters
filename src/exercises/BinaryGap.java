package exercises;

public class BinaryGap {
    // Find longest sequence of zeros in binary representation of an integer.
    public static int getMaxBinaryGap(int value){
        String binaryRep = Integer.toBinaryString(value);
        int currentGap = 0;
        int maxGap = 0;

        for (int i = 0; i < binaryRep.length(); i++){
            if (binaryRep.charAt(i) == '0'){
                currentGap++;
            }
                else {
                    if (currentGap > maxGap)
                    {
                        maxGap = currentGap;
                    }
                    currentGap = 0;
                }

            }
        return maxGap;
    }

    public static void main(String[] args) {

        System.out.println(getMaxBinaryGap(1041));
    }
}

