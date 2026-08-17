public class UndergraduateStudent extends Student {

    int semester;
    double cgpa;

    UndergraduateStudent(int id, String name, String department,
                         int semester, double cgpa) {

        super(id, name, department);

        this.semester = semester;
        this.cgpa = cgpa;
    }

    void displayDetails() {

        super.displayDetails();

        System.out.println("Semester = " + semester);
        System.out.println("CGPA = " + cgpa);
    }
}