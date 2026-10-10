package gr.aueb.dt.ch3;

/**
 * It prints 10 stars horizontally
 * i.e. it prints 1 star 10 times
 */
public class Stars10 {

    public static void main(String[] args) {

        int i = 1;
        int j = 10;

        while (i <= 10) {
            System.out.println("*");
            i++;
        }

        while (j >= 1) {
            System.out.println("*");
            j--;
        }
    }
    
}
