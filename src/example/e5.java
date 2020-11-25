package example;
//class TestCourse
public class e5 {
    public static void main(String[] args) {
        e6 course1 = new e6("Data Structures");
        e6 course2 = new e6("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        System.out.println("Number of students in coursel: "
                + course1.getNumberOfStudents());
        String[]students = course1.getStudents();
        for(int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i]+ ", ");
        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
    }
}
