import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface ContactsCrud {

        static Path p = Paths.get("contactList", "contacts.txt");
        static Path dataDirectory = Paths.get("contactList");

        private static List<String> readLines() {
            List<String> names;
            try {
                names = Files.readAllLines(p);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return names;
        }
// above is global

        public static void createContactListCL(){
            if (Files.notExists(dataDirectory)) {
                try {
                    Files.createDirectories(dataDirectory);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static void addContactCL(List<String> newNameDN) {
            createContactListCL();

//      you can also create files:
            if (Files.notExists(p)) {
                try {
                    Files.createFile(p);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            try {
                Files.write(p, newNameDN, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public static void deleteContactCL(String nameToDelete) {
            List<String> updatedNames = new ArrayList<>();
            for (String name : readLines()) {
                if (!name.equalsIgnoreCase(nameToDelete)) {
                    updatedNames.add(name);
                }//this section is searching
                //can do this and add name to list and return the list
                // line 58 initated a for loop that adds multiple to the list. If we want only one added do not include loop.
            }
            try {
                Files.write(p, updatedNames);
            } catch (IOException e) {
                System.out.println("do better");
            }
        }

//    private void writeLines(List<String> updatedNames) {
//    }

        public static void deleteAllContactsCL() { // figure this out
            //delete file at the end of path p
            try {
                Files.deleteIfExists(p);
            } catch (Throwable t) {
                System.out.println("bruh");
            }
        }


        public static void viewContactsCL() { // figure this out
            List<String> names;
            try {
                names = Files.readAllLines(p);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(names);
        }

        public static void viewContactsCL(List<String> contanctsList) { // figure this out too
            try {
                contanctsList = Files.readAllLines(p);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(contanctsList);
        }


        // what is the disctinction between view and search?
        // VIEW IS VIEW ALL

        // SEARCH WILL RETURN A PARSED CONTACT LIST (LIST<String>)
        // VIEW WILL SOUT SEARCH (VOID)








        public static List<String> searchOneContactCL(String singleSearch) {
            List<String> searchNames = new ArrayList<>();
            for (String name : readLines()) {
                if (!name.equalsIgnoreCase(singleSearch)) {
                    searchNames.add(name);
                    break;
                }
            }
            return searchNames;
        }

        public static List<String> searchAllContactsDN(String singleSearch) {
            List<String> searchNames = new ArrayList<>();
            for (String name : readLines()) {
                if (!name.equalsIgnoreCase(singleSearch)) {
                    searchNames.add(name);
                }
            }
            return searchNames;
        }

//        public static void editContactCL() {
//
//        }

//    void createContactListCL() {
//
//    }

//    void addMultiple(){
//  }

//    void exitMethodCL(){
//  }
    }

