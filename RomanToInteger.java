import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();
        
        int result = romanToInteger(roman);
        
        System.out.println("The integer equivalent of " + roman + " is: " + result);
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = map.get(s.charAt(i));

            if (curValue >= prevValue) {
                total += curValue;
            } else {
                total -= curValue;
            }
            prevValue = curValue;
        }

        return total;
    }
}