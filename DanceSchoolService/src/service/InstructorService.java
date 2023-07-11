package service;

import model.Branch;
import model.Instructor;
import model.Sex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InstructorService {
    /**
     *     private String name;
     *     private List<Branch> branchList;
     *     private int age;
     *     private Sex sex ;
     *     private BigDecimal salary;
     * @return
     */
    public Instructor createInstructor(String name, List<Branch> branchList, int age, Sex sex, BigDecimal salary){
        Instructor instructor = new Instructor();

        instructor.setName(name);
        instructor.setBranchList(branchList);
        instructor.setAge(age);
        instructor.setSex(sex);
        instructor.setSalary(salary);
        return instructor;
    }

    public void addBranch(Instructor instructor, Branch branch){
        if(instructor.getBranchList()!=null){
            instructor.getBranchList().add(branch);
        } else {
            List<Branch> tmpList = new ArrayList<>();
            tmpList.add(branch);
            instructor.setBranchList(tmpList);
        }
    }
}
