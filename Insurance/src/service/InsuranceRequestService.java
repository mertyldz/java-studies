package service;

import model.InsuranceRequest;
import model.Policy;
import model.Proposal;
import model.Vehicle;

import java.util.ArrayList;

/**
 * private ArrayList<Proposal> proposalList;
 * private Vehicle vehicle;
 * private Policy policy;
 */
public class InsuranceRequestService {
    public InsuranceRequest createInsuranceRequest(Vehicle vehicle, Policy policy) {
        return new InsuranceRequest(vehicle, policy);
    }

    public void addProposalToInsuranceRequest(InsuranceRequest insuranceRequest, Proposal proposal) {
        if (insuranceRequest.getProposalList() != null) {
            insuranceRequest.getProposalList().add(proposal);
        } else {
            ArrayList<Proposal> proposalList = new ArrayList<>();
            proposalList.add(proposal);
            insuranceRequest.setProposalList(proposalList);
        }
    }
}
