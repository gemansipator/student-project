package site.javadev.studentorder;

import site.javadev.studentorder.domain.*;
import site.javadev.studentorder.mail.MailSender;
import site.javadev.studentorder.validator.ChildrenValidator;
import site.javadev.studentorder.validator.CityRegisterValidator;
import site.javadev.studentorder.validator.StudentValidator;
import site.javadev.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {  //проверка заявления студента


    /* для того чтобы из класса StudentOrderValidator я мог обращаться
    к другим классам, то для этого создаю в этом классе поле того
    объекта  с которым хочу общаться :*/
    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();

    }


    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.chekAll();
    }
    public void chekAll(){
        StudentOrder [] soArray = readStudentOrders();

        for (int c = 0; c < soArray.length; c++) {
            System.out.println();
            checkOneOrder(soArray[c]); //передаем в метод checkOneOrder
            // заявку. Для этого обращаемся к элементу массива [c]

        }

    }
    public StudentOrder [] readStudentOrders(){
        StudentOrder [] soArray = new StudentOrder[3];

        for (int c = 0 ; c < soArray.length; c++ ){
            soArray[c] = SaveStudentOrder.buildStudentOrder(c);
        }

        return soArray;

    }

    public void checkOneOrder(StudentOrder so){
        AnswerCityRegister cityAnswer = chekCityRegister(so);
        AnswerWedding wedAnswer = chekWedding(so);
        AnswerChildren childAnswer = chekChildren(so);
        AnswerStudent studentAnswer = chekStudent(so);
        sendMail(so);

    }



    public AnswerCityRegister chekCityRegister(StudentOrder so){ //проверка  регистрации в
        // городе (ответ типа Answer)  через функцию проверки chekCityRegister принимающую входной
        // параметр в перепенную so типа   StudentOrder
        return cityRegisterVal.chekCityRegister(so);

    }
    public AnswerWedding chekWedding(StudentOrder so){ //проверка брака

        return weddingVal.chekWedding(so);
    }
    public AnswerChildren chekChildren(StudentOrder so){ //проверка детей

        return childrenVal.chekChildren(so);  //более короткий код
    }
    public AnswerStudent chekStudent(StudentOrder so){ //проверка студентов
        return studentVal.chekStudent(so);
    }

    public void sendMail(StudentOrder so){
        mailSender.sendMail(so);
    }

}
