package site.javadev.studentorder.validator;

import site.javadev.studentorder.domain.AnswerCityRegister;
import site.javadev.studentorder.domain.StudentOrder;

public class CityRegisterValidator {
    public String hostName;
    protected int port;
    private  String login;
    String password;


    public AnswerCityRegister chekCityRegister(StudentOrder so){
        System.out.println("CityRegister is running" + hostName
                +", "+ login +", "+ password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.succes = false;
        return ans;
    }
}
