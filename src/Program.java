import java.util.Scanner;

public class Program {
    public void main() throws MyException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter student's name: \n");
        String name = input.next();
        System.out.println("Please enter student's name: \n");
        String id = input.next();
        Student student = new Student(id, name);
    }
}
