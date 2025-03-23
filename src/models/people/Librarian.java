package models.people;

public class Librarian extends Person {
    public Librarian(String name, String address, String phone) {
        super(name, address, phone);
    }
    public void manageBooks() {
        System.out.println("Managing books");
    }
    public void manageMembers() {
        System.out.println("Managing members");
    }
}
