package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager m = new StudentManager();
        int ch;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student\n2. Search Student\n3. Update Course & Grade");
            System.out.println("4. Delete Student\n5. Display All Students\n6. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Roll number: "); 
                    int r = sc.nextInt(); 
                    sc.nextLine();
                    System.out.print("Name: ");
                    m.add(r, sc.nextLine());
                    break;
                case 2:
                    System.out.print("Roll number: ");
                    m.search(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Roll number: "); 
                    int r2 = sc.nextInt(); 
                    sc.nextLine();
                    System.out.print("Course: "); 
                    String c = sc.nextLine();
                    System.out.print("Grade: ");
                    m.update(r2, c, sc.nextLine());
                    break;
                case 4:
                    System.out.print("Roll number: ");
                    m.delete(sc.nextInt());
                    break;
                case 5:
                    m.list();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 6);
    }
}

