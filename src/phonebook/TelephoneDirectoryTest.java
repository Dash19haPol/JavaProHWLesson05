package phonebook;

public class TelephoneDirectoryTest {
    public static void main(String[] args) {

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add(new Record("Dasha", "+3809278363"));
        telephoneDirectory.add(new Record("Dima", "+3805467807"));
        telephoneDirectory.add(new Record("Dima", "+3806723893"));
        telephoneDirectory.add(new Record("Petya", "+3806723742"));
        telephoneDirectory.add(new Record("Vasia", "+3806723753"));

        String name = "Dima";
        System.out.println("Find for " + name + ": " + telephoneDirectory.find(name));
        System.out.println("Find all for " + name + ": " + telephoneDirectory.findAll(name));

        String notExistingName = "Danya";
        System.out.println("Find for " + notExistingName + ": " + telephoneDirectory.find(notExistingName));
        System.out.println("Find all for " + notExistingName + ": " + telephoneDirectory.findAll(notExistingName));
    }
}
