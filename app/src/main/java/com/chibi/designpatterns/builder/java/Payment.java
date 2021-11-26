package com.chibi.designpatterns.builder.java;

import java.util.Date;

public class Payment {

    //Removes the setter
    //Removes avoidance of using the multiple constructor with different parameter
    //Client side user readability is clear
    private String name;
    private Integer id;
    private Date time;
    private String type;
    private String taxAmt;
    private boolean isTaxable;

    public Payment(PaymentBuilder paymentBuilder) {
        this.name = paymentBuilder.name;
        this.id = paymentBuilder.id;
        this.time = paymentBuilder.time;
        this.type = paymentBuilder.type;
        this.taxAmt = paymentBuilder.taxAmt;
        this.isTaxable = paymentBuilder.isTaxable;
    }

    public static class PaymentBuilder
    {
        private String name;
        private Integer id;
        private Date time;
        private String type;
        private String taxAmt;
        private boolean isTaxable;

        public PaymentBuilder (String name, Integer id)
        {
            this.name = name;
            this.id = id;
        }

        public PaymentBuilder time(Date time)
        {
            this.time = time;
            return this;
        }

        public PaymentBuilder type(String type)
        {
            this.type = type;
            return this;
        }

        public PaymentBuilder taxAmt(String taxAmt)
        {
            this.taxAmt = taxAmt;
            return this;
        }

        public PaymentBuilder isTaxable(boolean isTaxable)
        {
            this.isTaxable = isTaxable;
            return this;
        }

        public Payment build()
        {
            Payment payment = new Payment(this);
            return payment;
        }
    }

}
