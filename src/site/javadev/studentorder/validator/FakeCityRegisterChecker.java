package site.javadev.studentorder.validator;

import site.javadev.studentorder.domain.CityRegisterCheckerResponse;
import site.javadev.studentorder.domain.Person;
import site.javadev.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker { // "класс заглушка" типа ответ от сервиса

    public CityRegisterCheckerResponse checkPerson(Person person)
            throws CityRegisterException{


        return null;
    }
}
