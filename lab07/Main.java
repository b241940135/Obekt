package lab07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice = 0;

        System.out.println("");
        System.out.println("oyutnii medeellin udirlagiinsystem");
        System.out.println("");

        do {
            System.out.println("\nvndsen heseg");
            System.out.println("1.oyutan nemeh");
            System.out.println("2.oyutan ustgah");
            System.out.println("3.oyutan haih");
            System.out.println("4.nereer erembleh");
            System.out.println("5.bvh oyutnii medeelel harah");
            System.out.println("6.garah");
            System.out.print("1-6 songolt oruul: ");

            if (!scanner.hasNextInt()) {
                System.out.println("zuvhun too oruul");
                scanner.next(); 
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\nshineer bvrtgeh");
                    System.out.print("ner: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("nas: ");
                    int age = 0;
                    if (scanner.hasNextInt()) {
                        age = scanner.nextInt();
                        scanner.nextLine();
                    }
                    
                    System.out.print("oyutnii id: ");
                    String id = scanner.nextLine();

                    Student newStudent = new Student(name, age, id);
                    manager.addStudent(newStudent);
                    break;

                case 2:
                    System.out.print("\nustgah oyutnii ner: ");
                    String removeId = scanner.nextLine();
                    manager.removeStudent(removeId);
                    break;

                case 3:
                    System.out.print("\noyutnii id g oruulnu: ");
                    String findId = scanner.nextLine();
                    Student found = manager.findStudent(findId);
                    if (found != null) {
                        System.out.println("olson: " + found);
                    } else {
                        System.out.println("iim idtai oyutan oldsongv.");
                    }
                    break;

                case 4:
                    manager.sortByName();
                    System.out.println("erembelj duussan.");
                    break;

                case 5:
                    manager.printAllStudents();
                    break;

                case 6:
                    System.out.println("dussan!");
                    break;

                default:
                    System.out.println("1-6buruu songolt.");
            }
        } while (choice != 6);

        scanner.close();
    } 
}