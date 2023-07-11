package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class DansCourseService {

    /**
     *   private String name;
     *     private String address;
     *     private String founder;
     *     private String taxNumber;
     *     private String taxOffice;
     *     private List<BankAccount> bankAccountList;
     *     private List<PaymentMovement> paymentMovementList;
     *     private List<Instructor> instructorList;
     *     private List<Student> studentList;
     * @return
     */
    public DanceCourse createDanceCourse(String name, String address, String founder, String taxNumber, String taxOffice,
                                         List<BankAccount> bankAccountList, List<PaymentMovement> paymentMovementList, List<Instructor> instructorList, List<Student> studentList){

        DanceCourse danceCourse = new DanceCourse();
        danceCourse.setName(name);
        danceCourse.setAddress(address);
        danceCourse.setFounder(founder);
        danceCourse.setAddress(taxNumber);
        danceCourse.setTaxOffice(taxOffice);
        danceCourse.setBankAccountList(bankAccountList);
        danceCourse.setPaymentMovementList(paymentMovementList);
        danceCourse.setInstructorList(instructorList);
        danceCourse.setStudentList(studentList);
        return danceCourse;
    }

    public void addBankAccount(DanceCourse danceCourse, BankAccount bankAccount){
        if(danceCourse.getBankAccountList() != null){
            danceCourse.getBankAccountList().add(bankAccount);
        } else {
            List<BankAccount> tmpList = new ArrayList<>();
            tmpList.add(bankAccount);
            danceCourse.setBankAccountList(tmpList);
        }
    }

    public void addPaymentMovement(DanceCourse danceCourse,PaymentMovement paymentMovement){
        if(danceCourse.getPaymentMovementList() != null){
            danceCourse.getPaymentMovementList().add(paymentMovement);
        } else {
            List<PaymentMovement> tmpList = new ArrayList<>();
            tmpList.add(paymentMovement);
            danceCourse.setPaymentMovementList(tmpList);
        }
    }

    public void addInstructor(DanceCourse danceCourse, Instructor instructor){
        if(danceCourse.getInstructorList() != null){
            danceCourse.getInstructorList().add(instructor);
        } else {
            List<Instructor> tmpList = new ArrayList<>();
            tmpList.add(instructor);
            danceCourse.setInstructorList(tmpList);
        }
    }

    public void addStudent(DanceCourse danceCourse, Student student){
        if(danceCourse.getStudentList()!=null){
            danceCourse.getStudentList().add(student);
        } else {
            List<Student> tmpList = new ArrayList<>();
            tmpList.add(student);
            danceCourse.setStudentList(tmpList);
        }
    }
}
