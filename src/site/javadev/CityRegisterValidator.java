package site.javadev;

public class CityRegisterValidator {
    String hostName;

    static AnswerCityRegister chekCityRegister(StudentOrder so){
        System.out.println("CityRegister is running" );
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.succes = false;
        return ans;
    }
}
