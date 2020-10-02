import java.util.*;
public class AddressBook {
    private ArrayList buddies;

    public AddressBook(){
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    public void printBook(){
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Frank", "613123", "Carleton");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(buddy);
        addressbook.printBook();
        addressbook.removeBuddy(buddy);
    }
}
