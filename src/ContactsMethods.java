import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public abstract class ContactsMethods implements ContactsCrud {

    void addContactCL() {
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

//    private static List<String> readLines() {
//        List<String> names;
//        try {
//            names = Files.readAllLines(PATH);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return names;
//    }

}

    void deleteContactCL() {
//        private static void deleteName(String nameToDelete) {
//            List<String> updatedNames = new ArrayList<>();
//            for (String name : readLines()) {
//                if (!name.equalsIgnoreCase(nameToDelete)) {
//                    updatedNames.add(name);
//                }
//            }
//            writeLines(updatedNames);
//        }
    }

    void deleteAllContactsCL() {
//        private static void deleteName(String nameToDelete) {
//            List<String> updatedNames = new ArrayList<>();
//            for (String name : readLines()) {
//                if (!name.equalsIgnoreCase(nameToDelete)) {
//                    updatedNames.add(name);
//                }
//            }
//            writeLines(updatedNames);
//        }
//    }

    }

    void viewContactsCL() {
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

    void searchContactCL() {

    }

    void editContactCL() {

    }

//    void createContactListCL() {
//
//    }

//    void addMultiple(){
//  }

//    void exitMethodCL(){
//  }
}
