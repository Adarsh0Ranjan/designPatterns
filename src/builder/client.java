package builder;

public class client {
    public static void main (String [] args) {
        Student student = Student.getBuilder()
                .setName("Adarsh")
                .setAge(25)
                .setBatch("marc 24")
                .build();

        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
