import java.util.Scanner;

public class AddElementToArray {
  public static void main(String[] args) {
    int[]array;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size");
    int size = input.nextInt();
    array = new int[size];
    boolean []status = new boolean[size];
    int index;
    int count=0;
    int choice;
    do {
      System.out.println("Enter position you want to add element:");
      index = input.nextInt();
      if (index<1||index>array.length){
        System.out.println("Index is invalid");
      }
      if (index>=1&&index<=array.length){
        if (status[index-1]){
          System.out.println("The position is already taken, do you want to replace?");
          System.out.println("1. Yes");
          System.out.println("0. No");
          System.out.println("Enter your choice: ");
          choice = input.nextInt();
          switch (choice){
            case 1:
              System.out.println("Enter value you want to add");
              array[index-1] = input.nextInt();
            break;
            case 0:
            break;
          }
        } else {
          System.out.println("Enter value you want to add");
          array[index - 1] = input.nextInt();
          status[index-1] = true;
          count++;
        }
      }
    } while (count<array.length);
    for (int element:array
         ) {
      System.out.printf("%d\t",element);
    }
  }
}
