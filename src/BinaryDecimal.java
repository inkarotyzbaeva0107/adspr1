import java.util.Scanner;

public class BinaryDecimal {

    static int bin2dec(String s) {
        if (s.length() == 1) return Integer.parseInt(s);
        return bin2dec(s.substring(0, s.length() - 1)) * 2 + (s.charAt(s.length() - 1) - '0');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary: ");
        String s = sc.nextLine();
        System.out.println( bin2dec(s));
    }
}