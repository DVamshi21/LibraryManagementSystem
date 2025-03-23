package models.people;

public class Member extends Person {
    private int totalBooksCheckedout;

    public Member(String name, String address, String phone) {
        super(name, address, phone);
        totalBooksCheckedout = 0;
    }
    public void checkoutBook() {
        totalBooksCheckedout++;
    }
    public void returnBook() {
        totalBooksCheckedout--;
    }
    public int getTotalBooksCheckedout() {
        return totalBooksCheckedout;
    }
    
}
