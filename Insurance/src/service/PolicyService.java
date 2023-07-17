package service;

import model.InsuranceCompany;
import model.Policy;
import model.Vehicle;

import java.math.BigDecimal;
import java.util.Date;

public class PolicyService {

    /**
     * private InsuranceCompany insuranceCompany;
     * private Vehicle vehicle;
     * private BigDecimal price;
     * private Date startDate;
     * private Date endDate;
     */
    public Policy createPolicy(InsuranceCompany insuranceCompany, Vehicle vehicle,
                               BigDecimal price, Date startDate, Date endDate) {
        return new Policy(insuranceCompany, vehicle, price, startDate, endDate);
    }
}
