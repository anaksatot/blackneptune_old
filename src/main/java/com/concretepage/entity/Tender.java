package com.concretepage.entity;

import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Admin on 5/2/2017.
 */
public class Tender {

    private int tenderID;
    private User userCustomer;
    private TenderStatus tenderStatus;
    private GoodCategory goodCategory;
    private LocalDate publishingDate;
    private LocalDate closingDate;
    private String tenderDescription;
    private double expectantValue;
    private Set<TenderDetail> tenderDetails;

}
