import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Bashaer Alhuthali
// Java Bootcamp

public class Main {
    public static void main(String[] args) {

        //Q1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2

        /*Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int count = 0;
        String answer=null;
        do {

            //to add the elements of the array from the user
            System.out.println("Please enter a number");
            int number= input.nextInt();
            input.nextLine();
            numbers.add(number);
            count++;

            System.out.println("To exit enter Yes");
            answer = input.nextLine().toLowerCase();


        }while(!(count>=2 && answer.equals("yes")));

        if(numbers.get(0) == numbers.get(numbers.size()-1))
        System.out.println(true);
        else{
            System.out.println(false);
        }*/

        //Q2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

        /*int[] numbers = {1, 4, 17, 7, 25, 3, 100};
        System.out.println("Please enter the counts of the largest elements ");
        Scanner input = new Scanner(System.in);
        int lCount=input.nextInt();
        int temp = 0;

        for (int i = 0; i < lCount; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i]<numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j]=temp;
                }
            }
        }

        System.out.print(lCount+" largest elements of the array are ");
        for (int i = 0; i < lCount; i++) {
            System.out.print(numbers[i]+" ");
        }*/

        //Q3.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        /*int[] numbers = {1, 4, 17, 7, 25, 3, 100};
        int sum =0;
        for (int i = 0; i <numbers.length ; i++)
            sum += numbers[i];

        double average = sum/numbers.length;
        System.out.print("The average of the array is " +average+" The numbers in the array that are greater than the average are ");
        for (int number:numbers) {
            if(number>average)
                System.out.print(number+" ");
        }*/

        //Q4.Write a Java program to get the larger value between first and last element of an array of integers.

        /*int[] numbers = {20, 30, 40};

        int l = Math.max(numbers[0],numbers[numbers.length-1]);
        System.out.println("Larger value between first and last element "+ l);*/

        //Q5.Write a Java program to swap the first and last elements of an array and create a new array.

        /*int[] numbers = {20, 30, 40};
        int[] newArr=new int[numbers.length];

        int temp=numbers[0];
        numbers[0]=numbers[numbers.length-1];
        numbers[numbers.length-1]=temp;

        newArr = numbers;
        System.out.println("New array after swapping the first and last elements "+Arrays.toString(newArr));*/


        //Q6.Write a Java program to find all of the longest word in a given dictionary.
        /*Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String answer=null;
        do {

            //to add the elements of the array from the user
            System.out.println("Please enter a word");
            String word= input.nextLine();
            words.add(word);

            System.out.println("to exit enter Yes");
            answer = input.nextLine().toLowerCase();


        }while(!answer.equals("yes"));


        int lLength=0;

        for (int i = 0; i <words.size() ; i++)
            //to keep the longest length of the words in 'mLength' var
            lLength=Math.max(words.get(i).length(),lLength);

        System.out.print("Result ");
        for (String word:words) {
            if (word.length()==lLength)
                System.out.print("\""+word +"\",");
        }*/

        //Q7.Write a menu driven Java program with following option:

        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array ");
        int size=input.nextInt();
        input.nextLine();
        int[] numbers = new int[size];
        System.out.println(numbers.length);
        int answer=0;
        int count=0;
        do {

            System.out.println("\nPlease choose one of the options \n1.Accept elements of an array \n2.Display elements of an array \n3.Search the element within array \n4.Sort the array\n5.To Stop");
            answer=input.nextInt();
            input.nextLine();
            switch (answer){
                case 1:
                    if(count != numbers.length){
                    System.out.println("\nPlease enter a number ");
                    numbers[count]=input.nextInt();
                    input.nextLine();
                    count++;}
                    else {
                        System.out.println("\nCan't add an element, the size of the array is full ");
                    }
                    break;
                case 2:
                    if(count!=0){
                    System.out.print("\nThe elements of the array are ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(numbers[i]+", ");
                    }}else{
                        System.out.print("\nThere are not elements in the array  ");
                    }
                    break;

                case 3:
                    boolean isFound=false;
                    ArrayList<Integer> indexes = new ArrayList<Integer>();
                    if(count!=0){
                    System.out.print("\nPlease enter a number ");
                    int number = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i <count ; i++) {
                        if (numbers[i] == number) {
                            isFound = true;
                            indexes.add(i);
                        }
                    }
                        if(isFound) {
                            System.out.print(number + " is found at index ");
                            for (int i:indexes) {
                                System.out.print(i+", ");
                            }
                        }
                        else
                            System.out.println(number + " is not found in the array");

                    }
                    else {
                        System.out.print("\nThere are not elements in the array  ");
                    }
                    break;

                case 4:

                    if(count!=0) {
                        int temp = 0;
                        for (int i = 0; i < count; i++) {
                            for (int j = i + 1; j < numbers.length; j++) {
                                if(numbers[i]>numbers[j]){
                                    temp = numbers[i];
                                    numbers[i] = numbers[j];
                                    numbers[j]=temp;
                                }
                            }
                        }

                        System.out.print("The elements of the array are ");
                        for (int i = 0; i < count; i++) {
                            System.out.print(numbers[i]+" ");
                        }

                    }
                    else {
                        System.out.print("\nThere are not elements in the array  ");
                    }
                    break;

                case 5:
                    System.out.println("Good bye!!");
                    break;
                default:
                    System.out.println("Invalid input");

            }

        }while(answer != 5);*/

        //Q8. Write a program thats displays the number of occurrences of an element in the array.

        /*Scanner input = new Scanner(System.in);
        int[] numbers={1,1,1,3,3,5};
        String answer=null;

        do {


            System.out.println("Please enter a number");
            int number = input.nextInt();
            input.nextLine();
            int count =0;

            for (int i = 0; i < numbers.length; i++) {
                if (number==numbers[i])
                    count++;
            }
            System.out.println(number +" occurs "+ count +" times");
            System.out.println("To exit enter Yes");
            answer = input.nextLine().toLowerCase();
        }while(!answer.equals("yes"));*/

        //Q9. Write a program that places the odd elements of an array before the even elements.

        /*int[] numbers={2,3,40,1,5,9,4,10,7};
        int temp=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i]%2==0){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));*/

        //Q10. Write a program that test the equality of two arrays.

        /*int[] numbers={2,3,6,6,4};
        int[] numbers1={2,3,6,6,4};
        boolean isSame=true;
        if(numbers.length == numbers1.length) {

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]!=numbers1[i]){
                    isSame =false;
                    break;
                }
            }
        } else{
           isSame=false;
        }

        if (isSame) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }*/

    }
}
