import java.util.Scanner;

public class Contact extends ContactsMethods {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                do {
                    System.out.println("""
                            1. View contacts.
                            2. Add a new contact.
                            3. Search a contact by name.
                            4. Delete an existing contact.
                            5. Exit.
                            Enter an option (1, 2, 3, 4 or 5):""");
                    // USER INPUT
                    if (view){
                        System.out.println("""
                                all, search one, or search many
                                """);
                        // USER INPUT
                        if (search one){
                            System.out.println("who you want?");
                            // USER INPUT

/*end of search one*/   } else if (search many){
                            System.out.println("who all you want?");
                            // USER INPUT

/*end of search many*/  } else {

/*end of view all*/     }
/*end of view*/     } else if (add) {
                        System.out.println("name and phone number");
                        // USER INPUT

/*end of add*/      //} else if (update) {

/*end of update*/   } else if (delete) {
                        System.out.println("""
                                delete one or all""");
                        // USER INPUT

                        if (one){
                            System.out.println("who need to gone?");
                            // USER INPUT

/*end of delete one*/   } else {

/*end of delete all*/   }
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
    - extra c) display all that contain the search criteria  extra -
 2) add
    a) create new contact from nothing
        -add contact to its own line in txt file
        -check if phone numbers are the correct length with a recursive method
   -extra  b) add multiple (extra, but very doable, justin showed us how)  extra -
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
        I) before exiting rewrite contact file
        II) this is the only endpoint to UI (loop where this is the only break)
 2) call for user input (scanner)


 */