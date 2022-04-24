package site.javadev.studentorder.validator;

import site.javadev.studentorder.domain.AnswerCityRegister;
import site.javadev.studentorder.domain.CityRegisterCheckerResponse;
import site.javadev.studentorder.domain.StudentOrder;

public class CityRegisterValidator {  //класс для возврата результата
    // запроса наличия запрашиваемых людей
    public String hostName;
    protected int port;
    private  String login;
    String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator(){
        personChecker = new FakeCityRegisterChecker();
    }


    public AnswerCityRegister chekCityRegister(StudentOrder so){

        CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusband());
        CityRegisterCheckerResponse wans = personChecker.checkPerson(so.getWife());
        CityRegisterCheckerResponse cans = personChecker.checkPerson(so.getChild());

        AnswerCityRegister ans = new AnswerCityRegister();

        return ans;
    }
}
