import java.util.Scanner;

    public class Task17 {

        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);

            System.out.println("Please enter first binary number");
            String first = scnr.nextLine();

            System.out.println("Please enter second binary number");
            String second = scnr.nextLine();

            String addition = add(first, second);
            System.out.println("addition of two binary number is : " + addition);

            //String sum = sum(first, second);
            //System.out.println("Sum of two binary number is : " + sum);

            scnr.close();

        }

        public static String add(String first, String second) {
            int b1 = Integer.parseInt(first, 2);
            int b2 = Integer.parseInt(second, 2);
            int sum = b1 * b2;
            return Integer.toBinaryString(sum);
        }

        /*public static String sum(String b1, String b2) {
            int len1 = b1.length();
            int len2 = b2.length();
            int carry = 0;
            String res = "";
            int maxLen = Math.max(len1, len2);
            for (int i = 0; i < maxLen; i++) {
                int p = i < len1 ? b1.charAt(len1 - 1 - i) - '0' : 0;
                int q = i < len2 ? b2.charAt(len2 - 1 - i) - '0' : 0;
                int tmp = p + q + carry;
                carry = tmp / 2;
                res = tmp % 2 + res;
            }
            return (carry == 0) ? res : "1" + res;
        */}

    //}