package service;

import model.Branch;

public class BranchService {
    /**
     *
     * @param name
     * @return branch
     */
    public Branch createBranch(String name){
        Branch branch = new Branch();
        branch.setName(name);
        return branch;
    }
}
