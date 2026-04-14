package others;

public class ExerciseHW0a {
    public static void main(String[] args) {
        String s = "hello";
        s += " world";
        s += 5;
        int sLength = s.length();
        String substr = s.substring(1, 5);
        char c = s.charAt(2);

        if (s.indexOf("hello") != -1) {
            System.out.println("\"hello\" in s");
        }
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            System.out.println(letter);
        }
    }
}