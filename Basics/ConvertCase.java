class ConvertCase {
    public static void main(String args[]) {
        String s = "hello";
        String s2 = "";

        System.out.println(s);

        for (int i = 0; i <= s.length() - 1; i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                s2 = s2 + Character.toUpperCase(s.charAt(i));
            } else {
                s2 = s2 + Character.toLowerCase(s.charAt(i));
            }
        }

        System.out.println(s2);
    }
}
