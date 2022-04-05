package site.javadev.studentorder.validator;

import site.javadev.studentorder.domain.AnswerWedding;
import site.javadev.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding chekWedding(StudentOrder so){
        System.out.println("Wedding запущен");
        return new AnswerWedding();
    }
}
