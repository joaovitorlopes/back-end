package Exercises;

public class PeopleAge {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void verifyAge() {
        if (getAge() >= 18) {
            System.out.println("of legal age");
        } else {
            System.out.println("minor");
        }
    }
}
