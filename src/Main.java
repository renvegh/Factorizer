import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initializing scanner then scanning and converting
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Give me a number to factor: ");
        int number = Integer.parseInt(myScanner.nextLine());

        // collecting the factors of the number into an ArrayList then printing
        ArrayList<Integer> factors = factorizing(number);
        System.out.println("The factors are: \n" + factors);
        System.out.println(number + " has " + factors.size() + " factors");

        // calling the perfect number and prime number check methods
        perfectNumber(factors, number);
        primeNumber(factors, number);

    }

    public static ArrayList<Integer> factorizing(int number) {
        // initializing arraylist for collection
        ArrayList<Integer> factors = new ArrayList<>();

        // collecting factors
        for (int i = 1; i < number + 1; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        return factors;
    }

    public static void perfectNumber(ArrayList<Integer> list, int number) {
        int sum = 0;

        //calculating perfect number
        for (int actual : list) {
            sum += actual;
        }
        // removing the original number from the list
        sum -= number;

        // checking if perfect number
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    public static void primeNumber(ArrayList<Integer> list, int number) {

        // checking if prime number
        if(list.size() == 2){
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
