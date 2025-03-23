package models.people;

public class Author extends Person {
    private String biographyString;

    public Author(String name, String biographyString, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        this.biographyString = biographyString;
    }

    public String getBioString() {
        return biographyString;
    }

    public void setPenName(String bioString) {
        this.biographyString = bioString;
    }

    @Override
    public String toString() {
        return "Author{" +
                "penName='" + biographyString + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    
}
