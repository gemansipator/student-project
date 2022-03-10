package site.javadev;

public class StudentOrderValidator {
    public static void main(String[] args) {
        chekAll();
    }
    static void chekAll(){

        while (true){
            StudentOrder so = readStudentOrder();
            if(so == null){
                break;
            }
            AnswerCityRegister cityAnswer = chekCityRegister(so);
            AnswerWedding wedAnswer = chekWedding(so);
            AnswerChildren childAnswer = chekCildren(so);
            AnswerStudent studentAnswer = chekStudent(so);
            sendMail(so);
        }
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;

    }
    static AnswerCityRegister chekCityRegister(StudentOrder so){
        System.out.println("CityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
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

    }

}
