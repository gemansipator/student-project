package site.javadev;

public class StudentOrderValidator {
    public static void main(String[] args) {
        chekAll();
    }
    static void chekAll(){

        while (true){
            StudentOrder so = readStudentOrder();
            System.out.println("Start");
            if(so == null){
                break; //выйти из цикла совсем
            }
            System.out.println("Finish");

            AnswerCityRegister cityAnswer = chekCityRegister(so);
            if (!cityAnswer.succes){
                //
                continue; //вернуться в начало цикла
            }
            AnswerWedding wedAnswer = chekWedding(so);
            AnswerChildren childAnswer = chekChildren(so);
            AnswerStudent studentAnswer = chekStudent(so);
            sendMail(so);
        }
        System.out.println("Finish 2 СРАБОТАЛ break");
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return null;

    }
    static AnswerCityRegister chekCityRegister(StudentOrder so){
        return CityRegisterValidator.chekCityRegister(so);
    }
    static AnswerWedding chekWedding(StudentOrder so){
        return WeddingValidator.chekWedding(so);
    }
    static AnswerChildren chekChildren(StudentOrder so){
        return ChildrenValidator.chekChildren(so);
    }
    static AnswerStudent chekStudent(StudentOrder so){
        return StudentValidator.chekStudent(so);
    }

    static void sendMail(StudentOrder so){
        System.out.println("Почта отправлена");
    }

}
