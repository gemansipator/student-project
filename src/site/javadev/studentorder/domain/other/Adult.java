package site.javadev.studentorder.domain.other;

import site.javadev.studentorder.domain.Person;

import java.time.LocalDate;

public class Adult extends Person {   //Взрослый

    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDate;   //Дата выдачи, выпуска
    private String issueDepartment; // Департамент выдачи
    private String university;
    private String studentId;

    public Adult(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }
//    public Adult(String surName, String givenName, String patronymic) {
//        super(surName, givenName, patronymic, null);
//    }


    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
