import java.util.*;
class LibraryManagementSystem {
     static ArrayList<String> books = new ArrayList<>();
    static ArrayList<String> members = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n---Library Management System---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Member");
            System.out.println("4. View Members");
            System.out.println("5.Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            try {
                System.out.println("Enter choice: ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter book name: ");
                        books.add(sc.nextLine());
                        System.out.println("Book added.");
                        break;
                    case 2:
                        System.out.println("Books: " + books);
                        break;
                    case 3:
                        System.out.print("Enter member name: ");
                        members.add(sc.nextLine());
                        System.out.println("Members added.");
                        break;
                    case 4:
                        System.out.println("Members: " + members);
                    case 5:
                        System.out.print("Enter book name to issue: ");
                        String issue = sc.nextLine();
                        if (books.contains(issue)) {
                            System.out.println("Book issued."); 
                        }else {
                            System.out.println("Book not found.");
                        }
                        break;
                    case 6:
                        System.out.println("Enter book name to return: ");
                        String returned = sc.nextLine();
                        if (books.contains(returned)) {
                            System.out.println("Book returned."); 
                        }else {
                            System.out.println("Book not found.");
                        }
                        break;
                    case 7:
                        System.out.println("Thank You!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number.");
                sc.nextLine();
            }
        }
    }
}
