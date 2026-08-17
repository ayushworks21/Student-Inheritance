public class PostgraduateStudent extends Student {

    String specialization;
    String researchTopic;

    PostgraduateStudent(int id, String name, String department,
                        String specialization, String researchTopic) {

        super(id, name, department);

        this.specialization = specialization;
        this.researchTopic = researchTopic;
    }

    void displayDetails() {

        super.displayDetails();

        System.out.println("Specialization = " + specialization);
        System.out.println("Research Topic = " + researchTopic);
    }
}