import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Contact extends ContactsMethods {
            public static void main(String[] args) throws IOException {
                Scanner scanner = new Scanner(System.in);
                do {
                    createContactListCL();
                    System.out.println("""
                            1. View contacts.
                            2. Add a new contact.
                            3. Update a contact.
                            4. Delete an existing contact.
                            5. Exit.
                            Enter an option (1, 2, 3, 4 or 5):""");
                    char menuChoiceDN = scanner.nextLine().toLowerCase().charAt(0);
                    if (menuChoiceDN == '1' || menuChoiceDN == 'v'){
                        System.out.println("""
                                1. View All.
                                2. Search a specific contact.
                                3. Search for many.
                                4. Return to main menu.
                                """);
                    char viewChoiceDN = scanner.nextLine().toLowerCase().charAt(0);
                        if (viewChoiceDN == '2'){
                            System.out.println("Enter contact name.");
                            String searchDN = scanner.nextLine();

                            System.out.println((searchOneContactCL(searchDN)));

                            /*end of search one*/   } else if (viewChoiceDN == '3' || viewChoiceDN == 's'){
                            System.out.println("who all you want?");
                            String searchGroupDN = scanner.nextLine();

                            System.out.println((searchAllContactsDN((searchGroupDN))));

                            /*end of search many*/  } else if (viewChoiceDN == '4' || viewChoiceDN == 'r'){
                            continue;
                        } else {
                            viewContactsCL();
/*end of view all*/     }
/*end of view*/     } else if (menuChoiceDN == '2' || menuChoiceDN == 'a') {
                        System.out.println("name and phone number");
                        String newContactDN = scanner.nextLine();
                        addContactCL(newContactDN);
                        // call add method with newContactDN as argument
/*end of add*/      //} else if (menuChoiceDN == '3' || menuChoiceDN == 'u') {
                            /* we can use write and search methods*/

/*end of update*/   } else if (menuChoiceDN == '4' || menuChoiceDN == 'd') {
                        System.out.println("""
                                1. Delete one contact.
                                2. Clear all contacts.
                                3. Return to main menu.
                                """);
                    char deleteChoiceDN = scanner.nextLine().toLowerCase().charAt(0);

                        if (deleteChoiceDN == '1' || deleteChoiceDN == 'd'){
                            System.out.println("Choose contact to delete.");
                            String deleteOneChoiceDN = scanner.nextLine();

                            deleteContactCL(deleteOneChoiceDN);

/*end of delete one*/   } else if (deleteChoiceDN == '2' || deleteChoiceDN == 'c'){
                            System.out.println("Clearing all contacts.");
                            deleteAllContactsCL();

/*end of delete all*/   } else {
                            continue;
                        }
/*end of delete*/   } else {
                        break;
/*end of exit*/     }
                } while (true);

            }
}

/*
interface define functions:
 1)Read
    a) search and display an individual contact
    b) display all
    c) display all that contain the search criteria
 2) add
    a) create new contact from nothing
        -add contact to its own line in txt file  ????????????? maybe ??????????????
        -check if phone numbers are the correct length with a recursive method   xxxxxxxxxx not yet xxxxxxxxxxx
   -extra  b) add multiple (extra, but very doable, justin showed us how)  extra -
   // use scanner to dump directly into a list




   !important  c) create txt file
   -extra d) find regex to normalize phone numbers extra-
 3) delete
    a) delete one
    b) delete all
 - extra 4) update extra-
 in main:
 1) have a main menu that presents options to the user
    a) crud
    b) exit
        I) before exiting rewrite contact file xxxxxxxxxx not yet, ask for help xxxxxxxxxxxx
        II) this is the only endpoint to UI (loop where this is the only break)
 2) call for user input (scanner)




when we are done, refactor contact list into a hash map where name is key and phone number is a value
 */