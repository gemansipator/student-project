package site.javadev.studentorder.exception;

public class CityRegisterException extends Exception{

    public CityRegisterException() { //просто исключение
    }

    public CityRegisterException(String message) { //исключение с сообщением
        super(message);
    }

    public CityRegisterException(String message, Throwable cause) { //Исключение с сообщением и объектом причиной
        super(message, cause);
    }
}
