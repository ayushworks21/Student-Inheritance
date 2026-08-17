public class Main {

    public static void main(String[] args) {

        UndergraduateStudent student1 =
                new UndergraduateStudent(
                        101,
                        "Ravi",
                        "CSE",
                        5,
                        8.75
                );

        student1.displayDetails();

        System.out.println();

        PostgraduateStudent student2 =
                new PostgraduateStudent(
                        201,
                        "Anita",
                        "ECE",
                        "AI",
                        "Computer Vision"
                );

        student2.displayDetails();

        System.out.println();

        UndergraduateStudent student3 =
                new UndergraduateStudent(
                        102,
                        "Kiran",
                        "ISE",
                        7,
                        9.10
                );

        student3.displayDetails();
    }
}