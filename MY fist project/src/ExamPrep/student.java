package ExamPrep;

public class student {
    public static class Student{
        String student_name;
        int roll_number;
        double marks;

        public Student(String name, int rNo, double obtainedMarks){
            student_name = name;
            roll_number = rNo;
            marks = obtainedMarks;
        }
    }

    public static Student highestMarks(Student[] students){

        double highestMarks = students[0].marks;
        Student highestScoringStudent = students[0];

        for(Student student: students){
            if(student.marks > highestMarks){
                highestScoringStudent = student;
            }
        }

        return highestScoringStudent;

    }

    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student("Mohit", 1, 98);
        students[1] = new Student("Madhur", 2, 98.5);
        students[2] = new Student("Mehak", 3, 97.5);
        students[3] = new Student("Mitanshi", 4, 96);

        Student highestScoringStudent = highestMarks(students);

        System.out.println("Student with highest Marks");
        System.out.println("Name : " + highestScoringStudent.student_name);
        System.out.println("Roll NO. : " + highestScoringStudent.roll_number);
        System.out.println("Marks : " + highestScoringStudent.marks);


    }
}
