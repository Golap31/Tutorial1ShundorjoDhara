
package cse213projects.spring2024.tutorial1shundorjodhara;

public class Student {
    private int ID;
    private String Name;
    private int age;

    public Student(int ID, String name, int age) {
        this.ID = ID;
        Name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
