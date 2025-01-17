import java.util.Scanner;

     class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the String1
        System.out.println("Enter the First String");
        String str1 = sc.nextLine();

        //Taking the String2
        System.out.println("Enter the Second String");
        String str2 = sc.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        boolean isEqual = true;

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println('"' + str1 + " comes before " + '"' + str2 + '"' + " in lexicographical order");
                isEqual = false;
                break;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println('"' + str1 + " comes after " + '"' + str2 + '"' + " in lexicographical order");
                isEqual = false;
                break;
            }
        }

        // If equal so far, compare lengths
        if (isEqual) {
            if (str1.length() < str2.length()) {
                System.out.println('"' + str1 + " comes before " + '"' + str2 + '"' + " in lexicographical order");
            } else if (str1.length() > str2.length()) {
                System.out.println('"' + str1 + " comes after " + '"' + str2 + '"' + " in lexicographical order");
            } else {
                System.out.println('"' + str1 + " is equal to " + '"' + str2 + '"');
            }
        }

    }
}
