import java.util.Objects;
import java.util.Scanner;

public class ShowClass {
    public static void main(String[] args) {
        boolean running = true;
        ClubBranch clubBranch = new ClubBranch(); // an instance of ClubBranch class
        

        CLUB:
        while(running) {
            System.out.println("Welcome to the Club\n");
            Scanner scan = new Scanner(System.in);
            System.out.println("What Would you like to do?");
            System.out.println("1) Add Member\n2) Show Members\n3) Show Member detail by Id \n4) Exit");
            int num = scan.nextInt();
            switch (num) {
                case 1: // If the user wants to add a new member
                    System.out.println("Please Enter an ID");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Please Enter a Name");
                    String name = scan.nextLine();

                    System.out.println("Please Enter a Type");
                    String type = scan.nextLine();

                    Member mem = new Member(id, name, type);
                    System.out.println(mem.toString());
                    clubBranch.addMember(mem);
                    System.out.println("Member Successfully Added");
                    continue CLUB;
                case 2: // if the user wants to print all the members in the given club
                    clubBranch.showMembers();
                    continue CLUB;
                case 3: // if user wants to search the branch for a member with given id
                    System.out.println("Please enter Id you would like to search");
                    scan.nextLine();
                    int ids = scan.nextInt();
                    clubBranch.showID(ids);
                    continue CLUB;
                case 4:
                    System.out.println("Please Confirm If you would like to exit");
                    System.out.println("Please Enter Yes Or No");
                    scan.nextLine();
                    String syst = scan.nextLine();
                    syst = syst.toLowerCase();
                    if (Objects.equals(syst, "yes")) {
                        break CLUB;
                    } else {
                        continue CLUB;
                    }
                default: // if there is no valid input
                    System.out.println("Please enter a valid input");


            }
        }
    }
}
