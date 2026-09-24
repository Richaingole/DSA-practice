class ConvertCase {
    public static void main(String args[]) {
        String s1 = "hello";
        String s2 = "";

        System.out.println(s1);

        for (int i = 0; i <= s1.length() - 1; i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                s2 = s2 + Character.toUpperCase(s1.charAt(i));
            } else {
                s2 = s2 + Character.toLowerCase(s1.charAt(i));
            }
        }

        System.out.println(s2);
    }
}
