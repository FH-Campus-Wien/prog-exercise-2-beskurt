package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        double largestNumber = 0d;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1;; i++) {
            System.out.print("Number " + i + ": ");
            double myNumber = scanner.nextDouble();
            if (myNumber<=0){
                if (i==1) {
                    System.out.println("No number entered.");
                    return;
                }
            }
            if (myNumber>largestNumber) {
                largestNumber = myNumber;
            }
            if(myNumber<=0){
                System.out.printf("The largest number is %.2f%n",largestNumber);
                return;
            }
        }



    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        System.out.print("n: ");
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int k = 1;
        if (rows <= 0) {
            System.out.println("Invalid number!");
        }
        else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(k + " ");
                    k++;
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int hoehe = 6;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= hoehe-1-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner s = new Scanner(System.in);
        System.out.print("h: ");
        int hoehe = s.nextInt();
        System.out.print("c: ");
        char character = s.next().charAt(0);
        if (hoehe % 2 == 0) {
            System.out.println("Invalid number!");
            return;
        }
        for (int i = 0; i < hoehe/2; i++) {
            for (int j = 1; j < hoehe - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = character-i; k <= character; k++) {
                System.out.print((char) k);
            }
            for (int j = character-1; j > character - i - 1 ; j--) {
                System.out.print((char) j);
            }
            System.out.println();
        }
        for (int i = hoehe/2; i >= 0; i--) {
            for (int j = 1; j < hoehe - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = character-i; k <= character; k++) {
                System.out.print((char) k);
            }
            for (int j = character - 1; j > character - i - 1; j--) {
                System.out.print((char) j);
            }
            System.out.println();
        }

    }

    //todo Task 5
    public void marks(){
        // input your solution here
        double average;
        double sumMarks=0;
        int counterMarks=0;
        int negativeMarks = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1;; i++) {
            System.out.print("Mark " + i + ": ");
            int myMarks = scanner.nextInt();
            if (myMarks > 5 || myMarks < 0) {
                System.out.println("Invalid mark!");
                i--;
                continue;
            }
            if(myMarks==5){
                negativeMarks++;
            }
            sumMarks = sumMarks + myMarks;
            counterMarks += 1;
            if (myMarks == 0) {
                counterMarks--;
                if(counterMarks==0)counterMarks+=1;
                average = sumMarks / counterMarks;
                System.out.println("Average: "+String.format("%.2f",average));
                System.out.println("Negative marks: "+negativeMarks);
                return;
            }
        }

    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int number = input.nextInt();
        int sum=0;
        int rem=0;
        int temp=number;

        while (sum!=1&&sum!=4){
            sum = 0;

            while (temp>0){
                rem = temp % 10;
                sum = sum + (rem*rem);
                temp = temp/10;
            }
            temp=sum;
        }
        if(sum==1) System.out.println("Happy number!");
        else{
            System.out.println("Sad number!");
        }


    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}