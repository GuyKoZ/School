import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws NameException, IDException {

        //Student student2 = null;
        //Course EconomicsCourse = new Course("Economics", 97);

        Scanner scanner = new Scanner(System.in);
        Student student1 = null;
        Course DEVOPS = new Course("DEVOPS",77);
            while(student1 == null)
            {
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Please enter student's name: \n");
                    String name = input.next();
                    System.out.println("Please enter student's id: \n");
                    String id = input.next();
                    student1 = new Student(id, name, null);

                    student1.calculateAvarage();

                    Course Sport= new Course ("Sport",99);
                    Course Python= new Course ("Python",97);
                    Course Java= new Course ("Java",100);
                    //Course WEB= new Course ("WEB",94);

                    student1.addCourse(Sport);
                    student1.addCourse(Python);
                    student1.addCourse(Java);
                    //student1.addCourse(WEB);
                    student1.findCourseAndPrint(DEVOPS);

                    student1.findCourseAndPrint(DEVOPS);

                } catch ( IDException | ArrayIndexOutOfBoundsException | ArithmeticException e)
                {
                    System.out.println(e);
                }
                catch (NullPointerException e)
                {
                    System.out.println("Error:Course " + DEVOPS.getCourseName() + " doesn’t exist for student " + student1.getName());
                } catch (IllegalDividing illegalDividing) {
                    illegalDividing.printStackTrace();
                } finally
                {
                   System.out.println(DEVOPS.describeCourse());
                }
            }
    }
}
