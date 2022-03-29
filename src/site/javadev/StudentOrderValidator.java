package site.javadev;

public class StudentOrderValidator {  //проверка заявления студента
    public static void main(String[] args) {
        chekAll();  // проверить всё
    }
    static void chekAll(){

        while (true){
            StudentOrder so = readStudentOrder();
            if(so == null){
                break; //выйти из цикла совсем
            }

            AnswerCityRegister cityAnswer = chekCityRegister(so);
            if (!cityAnswer.succes){
                //
                //continue; //вернуться в начало цикла
                break;
            }
            AnswerWedding wedAnswer = chekWedding(so);
            AnswerChildren childAnswer = chekChildren(so);
            AnswerStudent studentAnswer = chekStudent(so);
            sendMail(so);
        }

    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;

    }
    static AnswerCityRegister chekCityRegister(StudentOrder so){ //проверка регистрации в городе
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = " Host 1";
        crv1.login = "Login 1";
        crv1.password = "Passord 1";
        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = " Host 2";
        crv2.login = "Login 2";
        crv2.password = "Passord 2";

        AnswerCityRegister ans1 = crv1.chekCityRegister(so);
        AnswerCityRegister ans2 = crv2.chekCityRegister(so);
        return ans1;

    }
    static AnswerWedding chekWedding(StudentOrder so){ //проверка брака
        return WeddingValidator.chekWedding(so);
    }
    static AnswerChildren chekChildren(StudentOrder so){ //проверка детей
        return ChildrenValidator.chekChildren(so);
    }
    static AnswerStudent chekStudent(StudentOrder so){ //проверка студентов
        return StudentValidator.chekStudent(so);
    }

    static void sendMail(StudentOrder so){
        System.out.println("Почта отправлена");
    }

}
