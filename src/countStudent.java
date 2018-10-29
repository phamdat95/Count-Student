import java.util.Scanner;

public class countStudent {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30!");
        } while (size > 30);
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) Math.floor(Math.random()*10);
        }
        System.out.println("List mark: ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < size; i++){
            if (array[i] >= 5){
                count = count + 1;
            }
        }
        System.out.println("\n The number of students passing the exam is " + count);
    }
}
