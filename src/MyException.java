public class MyException extends Exception{
    public MyException (String str){
        super(str + ", name must start with english letter");
    }
}
