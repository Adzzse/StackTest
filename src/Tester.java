/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author DoHoangAnh
 */
public class Tester {

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("Select Stack type:");
            System.out.println("1.Array Stack");
            System.out.println("2.Linked list Stack");
            System.out.println("3.10 -> 2");

            System.out.println("0.Back");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    // Using ArrayStack
                    ArrayStack stack1 = new ArrayStack();

                    // Pushing elements into ArrayStack
                    stack1.push(10);
                    stack1.push(20);
                    stack1.push(30);

                    // Pop elements from ArrayStack
                    System.out.println("Popping elements from ArrayStack:");
                    while (!stack1.isEmpty()) {
                        System.out.println(stack1.pop());
                    }

                    // Using MyArrayStack
                    MyArrayStack stack2 = new MyArrayStack();

                    // Pushing elements into MyArrayStack
                    stack2.push("A");
                    stack2.push("B");
                    stack2.push("C");

                    // Pop elements from MyArrayStack
                    System.out.println("Popping elements from MyArrayStack:");
                    while (!stack2.isEmpty()) {
                        System.out.println(stack2.pop());
                    }
                    break;
                }
                case 2: {
                    LinkedStack stack1 = new LinkedStack();

                    stack1.push(10);
                    stack1.push(20);
                    stack1.push(30);

                    System.out.println("Pop elements:");
                    while (!stack1.isEmpty()) {
                        System.out.println(stack1.pop());
                    }

                    // Using MyLinkedStack
                    MyLinkedStack stack2 = new MyLinkedStack();

                    // Pushing elements into MyLinkedStack
                    stack2.push("A");
                    stack2.push("B");
                    stack2.push("C");

                    // Pop elements from MyLinkedStack
                    System.out.println("Popping elements from MyLinkedStack:");
                    while (!stack2.isEmpty()) {
                        System.out.println(stack2.pop());
                    }
                    break;
                }
                case 3: {
                    System.out.println("Input 10:");
                    Converter cv = new Converter();
                    int x = sc.nextInt();
                    cv.converter(x);
                    System.out.println("");
                }
                default:
                    break;
            }

        } while (choice != 0);
    }

}
