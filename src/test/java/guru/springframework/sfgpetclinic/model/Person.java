package guru.springframework.sfgpetclinic.model;

public class Person {
    private String firsName;
    private String lastName;

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;

    }
}
