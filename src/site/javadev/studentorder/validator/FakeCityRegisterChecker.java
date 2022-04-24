package site.javadev.studentorder.validator;

import site.javadev.studentorder.domain.CityRegisterCheckerResponse;
import site.javadev.studentorder.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterChecker { // "класс заглушка" типа ответ от сервиса

    public CityRegisterCheckerResponse checkPerson(Person person){

        return null;
    }
}
