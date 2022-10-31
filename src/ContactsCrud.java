import java.util.List;

public interface ContactsCrud {

    void addContactCL(List<String> newNameDN);

    void deleteContactCL(String nameToDelete);

    void deleteAllContactsCL();

    void viewContactsCL();

    List<String> searchOneContactCL(String singleSearch);

    List<String> searchAllContactsDN(String singleSearch);

    void editContactCL();

    void createContactListCL();

//    void addMultiple();

//    void exitMethodCL();

}
