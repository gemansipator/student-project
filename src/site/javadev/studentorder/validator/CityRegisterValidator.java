package site.javadev.studentorder.validator;

import site.javadev.studentorder.domain.AnswerCityRegister;
import site.javadev.studentorder.domain.StudentOrder;

public class CityRegisterValidator {  //класс для возврата результата
    // запроса наличия запрашиваемых людей
    public String hostName;
    protected int port;
    private  String login;
    String password;


    public AnswerCityRegister chekCityRegister(StudentOrder so){


        AnswerCityRegister ans = new AnswerCityRegister();

        return ans;
    }
}
