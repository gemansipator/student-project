package site.javadev;

public class StudentOrderValidator {
    public static void main(String[] args) {
        chekAll();
    }
    static void chekAll(){
        StudentOrder so = readStudentOrder();
        AnswerCityRegister cityAnswer = chekCityRegister(so);
        AnswerWedding wedAnswer = chekWedding(so);
        chekCildren(so);
        chekStudent(so);
        sendMail(so);
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
    static void chekCildren(StudentOrder so){
        System.out.println("Children Chek is running");
    }
    static void chekStudent(StudentOrder so){
        System.out.println();
    }

    static void sendMail(StudentOrder so){

    }

}
