import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public abstract class ContactsMethods implements ContactsCrud {
    Path p = Paths.get("contactList", "contacts.txt");

    private List<String> readLines() {
        List<String> names;
        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    public void addContactCL() {
//        String directory = "ContactList";
//        String filename = "contacts.txt";
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        if (Files.notExists(dataDirectory)) {
//            try {
//                Files.createDirectories(dataDirectory);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
////      you can also create files:
//        if (Files.notExists(dataFile)) {
//            try {
//                Files.createFile(dataFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//   }

//    Path p = Paths.get("src", "test.txt");
//
//    List<String> newNames = Arrays.asList("John", "Fred", "Cathy");
//        try {
//        Files.write(p, newNames, StandardOpenOption.APPEND);
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//
//        List<String> names = new ArrayList<>();
//        names.add("Tim");
//        names.add("Sally");
//        names.add("Mary");
//
//        try {
//            Files.write(p, names, StandardOpenOption.APPEND);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }



}

    void deleteContactCL(String nameToDelete) {
            List<String> updatedNames = new ArrayList<>();
            for (String name : readLines()) {
                if (!name.equalsIgnoreCase(nameToDelete)) {
                    updatedNames.add(name);
                }
            }
            writeLines(updatedNames);
    }

    public void deleteAllContactsCL() {
        //delete file at the end of path p
        try {
            Files.deleteIfExists(p);
        } catch (Throwable t) {
            System.out.println("bruh");
        }
    }

    public void viewContactsCL() {
//                    private static List<String> readLines() {
//                        List<String> names;
//                        try {
//                            names = Files.readAllLines(PATH);
//                        } catch (IOException e) {
//                            throw new RuntimeException(e);
//                        }
//                        return names;
//                    }
//                }

    }

    public void searchContactCL() {

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
