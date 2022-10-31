import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class ContactsMethods {
    // global util
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
    // init (create directory and file if they don't already exist)
    public static void createContactListCL(){
        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (Files.notExists(p)) {
            try {
                Files.createFile(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // add
    public static void addContactCL(String newNameDN) {
        createContactListCL();
        List<String> addedNameList =  new ArrayList<String>();
        addedNameList.add(newNameDN);
        try {
            Files.write(p, addedNameList, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // delete
    public static void deleteContactCL(String nameToDelete) {
        List<String> updatedNames = new ArrayList<>();
        for (String name : readLines()) {
            if (!name.contains(nameToDelete)) {
                updatedNames.add(name);
            }
        }
        try {
            Files.write(p, updatedNames);
        } catch (IOException e) {
            System.out.println("do better");
        }
    }
    public static void deleteAllContactsCL() {
        try {
            Files.deleteIfExists(p);
        } catch (Throwable t) {
            System.out.println("bruh");
        }
    }
    // view all
    public static void viewContactsCL() {
        List<String> names;
        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(names);
    }
    // search
    public static List<String> searchOneContactCL(String singleSearch) {
        List<String> searchNames = new ArrayList<>();
        for (String name : readLines()) {
            if (name.contains(singleSearch)) {
                searchNames.add(name);
                break;
            }
        }
        return searchNames;
    }
    public static List<String> searchAllContactsDN(String singleSearch) {
        List<String> searchNames = new ArrayList<>();
        for (String name : readLines()) {
            if (name.contains(singleSearch)) {
                searchNames.add(name);
            } else {
                continue;
            }
        }
        return searchNames;
    }

    //unfinished bonuses
//    public static void editContactNameCLDN(String phoneNumberLookup, String newName) {
//        return newname + " -- " + phone number
//    } //refactor to edit through the list instead of deleting and adding new
//
//    public static void editContactNumberCLDN(List<String> nameLookup, String newNumber) {
//
//    }

//    void addMultiple(){
    // this might not be a successful method, might have to make a loop in main that calls add every enter that isnt the exit command
//  }

}
