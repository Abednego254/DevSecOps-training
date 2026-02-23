import java.util.*;
class Student {
    int age;
    Student(int age) { this.age = age; }
}
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}
class Test {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(20), new Student(18));
        Collections.sort(list, new AgeComparator());
        System.out.println(list.get(0).age);
    }
}
