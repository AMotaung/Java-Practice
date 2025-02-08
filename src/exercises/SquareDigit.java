package exercises;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SquareDigit {
    public static void main(String[] args) {

        squareDigits(12356);
    }

    public static int squareDigits(int n) {
        String num = String.valueOf(n);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < num.length(); i++){
            int j = num.charAt(i) - '0';
            arr.add(j);
        }

        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int r : arr){
            arr1.add(r*r);
        }
        String str = arr1.stream().map(i->i.toString()).collect(Collectors.joining(""));
         int check = Integer.parseInt(str);


        return check; // TODO Implement me
    }
}
