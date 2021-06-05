public class IDException extends Exception{
    public IDException (String str){
        super(str + ", is illegal, must start with english letter\n");
    }
}
