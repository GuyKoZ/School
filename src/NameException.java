public class NameException extends Exception{
    public NameException(String str){
        super(str + ", name must start with english letter");
    }
}
