import java.util.Scanner;
public class assgn8 {
    public static void main(String[] args) {

        // get input to determine length of sequence
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of fibinacci sequence:");
        int length = input.nextInt();
        System.out.println("Selected Length: "+ length);
        System.out.println("Sequence:");

        //loop to print the sequence
        //initialize needed variables
        int i = 1;
        int last1 = 1;
        int last2 = 1;
        int current = 1;
        //loop begins
        while (i <= length){
            if (i == 1 || i == 2){//starts the sequence with 1,1
                System.out.print(1+", ");
                i++;
            }
            else{//generates rest of sequence
                current = last1 + last2;
                System.out.print(current+", ");
                last2 = last1;
                last1 = current;
                i++;
            }
        }
    }
}
