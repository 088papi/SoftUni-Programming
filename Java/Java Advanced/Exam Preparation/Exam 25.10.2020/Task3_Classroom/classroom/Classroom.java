package classroom;

import javax.naming.NamingEnumeration;
import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private int capacity;
    private List<Student> data;


    public Classroom(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getData() {
        return data;
    }

    public int getStudentCount() {
        return this.data.size();
    }

    public String registerStudent(Student student) {
        String output = "";

        if (this.data.contains(student)) {
            output = "Student is already in the classroom";
        } else if (capacity > this.data.size()) {
            this.data.add(student);
            output = String.format("Added student %s %s", student.getFirstName(), student.getLastName());
        } else {
            output = "No seats in the classroom";
        }

        return output;
    }

    public String dismissStudent(Student student) {
        if (!this.data.contains(student)) {
            return "Student not found";
        }
        this.data.remove(student);
        return String.format("Removed student %s %s", student.getFirstName(), student.getLastName());
    }


    public String getSubjectInfo(String subject) {
        StringBuilder sb = new StringBuilder();

        boolean isFound = false;
        sb.append("Subject: ").append(subject).append(System.lineSeparator());
        sb.append("Students:").append(System.lineSeparator());
        for (Student datum : this.data) {
            if (datum.getBestSubject().equals(subject)) {
                sb.append(datum.getFirstName()).append(" ")
                        .append(datum.getLastName())
                        .append(System.lineSeparator());
                isFound = true;
            }
        }
        if (isFound) {
            return sb.toString().trim();
        }
        return "No students enrolled for the subject";
    }

    public Student getStudent(String firstName, String lastName){
        Student student = null;
        for (Student datum : this.data) {
            if (datum.getFirstName().equals(firstName) && datum.getLastName().equals(lastName)){
                student = datum;
                break;
            }
        }
        return student;
    }


    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("Classroom size: ").append(getStudentCount()).append(System.lineSeparator());
        for (Student datum : this.data) {
            sb.append("==").append(datum.toString());
        }



        return sb.toString().trim();
    }
}
