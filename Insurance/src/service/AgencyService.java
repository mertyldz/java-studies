package service;

import model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AgencyService {
    /**
     * private String name;
     * private ArrayList<BankAccount> bankAccountList;
     * private ArrayList<PaymentMovement> paymentMovementList;
     * private ArrayList<InsuranceCompany> insuranceCompanyList;
     * private ArrayList<Customer> customerList;
     */

    public Agency createAgency(String name) {
        Agency agency = new Agency(name);
        return agency;
    }

    public void addBankAccountToAgency(Agency agency, BankAccount bankAccount) {
        if (agency.getBankAccountList() != null) {
            agency.getBankAccountList().add(bankAccount);
        } else {
            ArrayList<BankAccount> tempBankAccount = new ArrayList<>();
            tempBankAccount.add(bankAccount);
            agency.setBankAccountList(tempBankAccount);
        }
    }

    public void addPaymentMovementToAgency(Agency agency, PaymentMovement paymentMovement) {
        if (agency.getPaymentMovementList() != null) {
            agency.getPaymentMovementList().add(paymentMovement);
        } else {
            ArrayList<PaymentMovement> paymentMovementList = new ArrayList<>();
            paymentMovementList.add(paymentMovement);
            agency.setPaymentMovementList(paymentMovementList);
        }
    }

    public void addInsuranceCompanyToAgency(Agency agency, InsuranceCompany insuranceCompany) {
        if (agency.getInsuranceCompanyList() != null) {
            agency.getInsuranceCompanyList().add(insuranceCompany);
        } else {
            ArrayList<InsuranceCompany> insuranceCompanyList = new ArrayList<>();
            insuranceCompanyList.add(insuranceCompany);
            agency.setInsuranceCompanyList(insuranceCompanyList);
        }
    }

    public void addCustomerToAgency(Agency agency, Customer customer) {
        if (agency.getCustomerList() != null) {
            agency.getCustomerList().add(customer);
        } else {
            ArrayList<Customer> customerList = new ArrayList<>();
            customerList.add(customer);
            agency.setCustomerList(customerList);
        }
    }


}
