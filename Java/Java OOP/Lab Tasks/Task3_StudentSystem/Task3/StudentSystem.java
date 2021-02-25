package Task3;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudents() {
        return this.students;
    }

    public String parseCommand(String[] args) {
        String output = null;
        String command = args[0];

        if (command.equals("Create")) {
            addStudent((createNewStudent(args)));
        } else if (command.equals("Show")) {
            output = getStudentInfo(args[1]);
        }
        return output;
    }



    private String getStudentInfo(String name) {
        if (contains(name)) {
            Student student = students.get(name);
            return student.toString();
        }
        return null;
    }

    private Student createNewStudent(String[] args) {

        String name = args[1];
        int age = Integer.parseInt(args[2]);
        double grade = Double.parseDouble(args[3]);
        return new Student(name, age, grade);
    }


    public void addStudent(Student student) {
        if (!contains(student.getName())) {
            students.put(student.getName(), student);
        }
    }

    private boolean contains(String name) {
        return this.students.containsKey(name);
    }


}
