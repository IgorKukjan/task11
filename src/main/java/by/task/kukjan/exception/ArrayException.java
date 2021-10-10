package by.task.kukjan.exception;

public class ArrayException extends Exception{
    public ArrayException(){
        super();
    }

    public ArrayException(String message){
        super(message);
    }

    public ArrayException(Exception e) {
        super(e);
    }

    public ArrayException(String message, Exception e) {
        super(message, e);
    }
}
