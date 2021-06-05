public class Course {
    private int studentFinalScore;
    private String courseName;


    public Course(String courseName, int studentFinalScore) {
        this.courseName = courseName;
        this.studentFinalScore = studentFinalScore;
    }

    public Course (Course otherCourse){
        this(otherCourse.courseName, otherCourse.studentFinalScore);
    }

    public void describeCourse(){
        Student student = new Student();
        System.out.println(student.getName() + " final score is" + this.studentFinalScore + "in" + this.courseName +"course");
    }
}
