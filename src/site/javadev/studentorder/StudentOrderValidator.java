package site.javadev.studentorder;

import site.javadev.studentorder.domain.*;
import site.javadev.studentorder.mail.MailSender;
import site.javadev.studentorder.validator.ChildrenValidator;
import site.javadev.studentorder.validator.CityRegisterValidator;
import site.javadev.studentorder.validator.StudentValidator;
import site.javadev.studentorder.validator.WeddingValidator;

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
    static AnswerCityRegister chekCityRegister(StudentOrder so){ //проверка  регистрации в
        // городе (ответ типа Answer)  через функцию проверки chekCityRegister принимающую входной
        // параметр в перепенную so типа   StudentOrder
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = " Host 1";
        AnswerCityRegister ans1 = crv1.chekCityRegister(so);
        return ans1;

    }
    static AnswerWedding chekWedding(StudentOrder so){ //проверка брака
        WeddingValidator wd = new WeddingValidator();
        return wd.chekWedding(so);
    }
    static AnswerChildren chekChildren(StudentOrder so){ //проверка детей
        ChildrenValidator cv = new ChildrenValidator();
        return cv.chekChildren(so);  //более короткий код
    }
    static AnswerStudent chekStudent(StudentOrder so){ //проверка студентов
        return new StudentValidator().chekStudent(so);
    }

    static void sendMail(StudentOrder so){
        new MailSender().sendMail(so);
    }

}
