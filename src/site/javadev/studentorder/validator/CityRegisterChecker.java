package site.javadev.studentorder.validator;

import site.javadev.studentorder.domain.CityRegisterCheckerResponse;
import site.javadev.studentorder.domain.Person;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person);
}
