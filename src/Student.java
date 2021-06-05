public class Student {
    private int id;
    private String name;
    private Course[] coursesArray;

    public Student(int id, String name, Course[] courses) {
        this.id = id;
        this.name = name;
        this.coursesArray = courses;
        coursesArray = new Course[3];
    }
    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Student (String id, String name) throws MyException {
        char startingWith = name.charAt(0);

        if (!(startingWith >= 'a' && startingWith <'z' || startingWith >= 'A' && startingWith <'Z' )){
            throw new MyException(name + "is illegal, must start with english letter\n");
        }
        else {

        }
        if (!id.matches("[0-9]") || id.length() < 9 ){
            throw new MyException(id + "must be longer then 8 number and must contain only numbers.\n");
        }
    }
    public void addCourse(Course course){

    }
    public int calculateAvarage(){

    }
    private int findCourse(Course course){

    }
    public void findCourseAndPrint(){

    }

}
