import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public abstract class ContactsMethods implements ContactsCrud {
    Path p = Paths.get("contactList", "contacts.txt");
    Path dataDirectory = Paths.get("contactList");

    private List<String> readLines() {
        List<String> names;
        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }
// above is global


    public void addContactCL(String newNameDN) {
        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//      you can also create files:
        if (Files.notExists(p)) {
            try {
                Files.createFile(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<String> newNames = Collections.singletonList(newNameDN);

        try {
            Files.write(p, newNames, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    void deleteContactCL(String nameToDelete) throws IOException {
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

    public void deleteAllContactsCL() {
        //delete file at the end of path p
        try {
            Files.deleteIfExists(p);
        } catch (Throwable t) {
            System.out.println("bruh");
        }
    }


    public void viewContactsCL() {
        List<String> names;
        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(names);
    }


       // what is the disctinction between view and search?
    // VIEW IS VIEW ALL

    // SEARCH WILL RETURN A PARSED CONTACT LIST (LIST<String>)
    // VIEW WILL SOUT SEARCH (VOID)








    public List<String> searchContactCL(String singleSearch) {
        List<String> searchNames = new ArrayList<>();
        for (String name : readLines()) {
            if (!name.equalsIgnoreCase(singleSearch)) {
                searchNames.add(name);
                break;
            }//this section is searching
            //can do this and add name to list and return the list
            // line 58 initated a for loop that adds multiple to the list. If we want only one added do not include loop.
        }
        return searchNames;
    }

    public void editContactCL() {

    }

//    void createContactListCL() {
//
//    }

//    void addMultiple(){
//  }

//    void exitMethodCL(){
//  }
}
