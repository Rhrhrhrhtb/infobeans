package assignment_6;

public class Practice_12 {

    public static void main(String[] args) {
        int a = 97;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (a + j));

            }
            System.out.println();
        }

    }
}
