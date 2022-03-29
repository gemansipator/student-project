package site.javadev;

public class CityRegisterValidator {
    String hostName;
    String login;
    String password;


    AnswerCityRegister chekCityRegister(StudentOrder so){
        System.out.println("CityRegister is running" + hostName
                +", "+ login +", "+ password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.succes = false;
        return ans;
    }
}
