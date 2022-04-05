package site.javadev.studentorder.validator;

import site.javadev.studentorder.domain.AnswerChildren;
import site.javadev.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren chekChildren(StudentOrder so){
        System.out.println("Children Chek is running");
        return new AnswerChildren();
    }
}
