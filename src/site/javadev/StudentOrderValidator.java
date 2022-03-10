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
                continue; //вернуться в начало цикла
            }
            AnswerWedding wedAnswer = chekWedding(so);
            AnswerChildren childAnswer = chekCildren(so);
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
        System.out.println("CityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.succes = false;
        return ans;
    }
    static AnswerWedding chekWedding(StudentOrder so){
        System.out.println("Wedding запущен");
        return new AnswerWedding();
    }
    static AnswerChildren chekCildren(StudentOrder so){
        System.out.println("Children Chek is running");
        return new AnswerChildren();
    }
    static AnswerStudent chekStudent(StudentOrder so){
        System.out.println();
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so){
        System.out.println("Почта отправлена");
    }

}
