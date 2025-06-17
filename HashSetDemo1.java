import java.util.HashSet;
import java.util.Objects;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "RollNo:" + rollNo + ", Name:" + name;
    }

    // Important: Override equals and hashCode to prevent duplicates in HashSet
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return rollNo == other.rollNo && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
}

public class HashSetWithObjects1 {
    public static void main(String[] args) {
        HashSet<Student> StudentSet = new HashSet<>();
        StudentSet.add(new Student(101, "Alice"));
        StudentSet.add(new Student(102, "Bob"));
        StudentSet.add(new Student(101, "Alice")); // Duplicate, will not be added

        System.out.println("Students in Set:");
        for (Student s : StudentSet) {
            System.out.println(s); // ✅ Complete print statement
        }
    }
}
