package com.chibi.designpatterns.adapter;

//Adapter Design pattern is under structural design pattern
//When our application is not compatible with the interface that our client is expecting
//When we want to reuse legacy code in our application without making any modification in the original code
public class BillingAdapter implements Billing{

    //private Billing billing;
    private String currency;

    public BillingAdapter(String currency) {
        this.currency = currency;
    }

    @Override
    public void getCashierName() {

    }

    @Override
    public void getBillAmount() {

    }

    @Override
    public void getBillCurrency() {

    }

    @Override
    public void getBillTiming() {

    }

    @Override
    public void getCompanyName() {

    }
}
