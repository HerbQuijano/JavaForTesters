    package exercise1;

    public class StringReverter {

        public StringReverter(String s){
            if (s.isEmpty() || s.length() < 1)
            {
                System.out.println("Empty string");
            }
            else {
                String[] reversed = s.split(" ");
            for (int i = reversed.length-1; i>=0; i--){
                System.out.print(reversed[i]+" ");
            }
            }
        }
    }
