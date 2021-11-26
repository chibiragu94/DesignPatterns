package com.chibi.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.chibi.designpatterns.adapter.BillingAdapter;
import com.chibi.designpatterns.builder.java.Payment;
import com.chibi.designpatterns.builder.kotlin.PaymentKotlin;
import com.chibi.designpatterns.builder.kotlin.PaymentKotlinApply;
import com.chibi.designpatterns.decorator.MessageDecorator;
import com.chibi.designpatterns.decorator.WhatsAppMessage;
import com.chibi.designpatterns.factory.EmployeeFactory;
import com.chibi.designpatterns.factory.EmployeeType;
import com.chibi.designpatterns.iteratorPattern.SampleIterator;
import com.chibi.designpatterns.observer.Observable;
import com.chibi.designpatterns.observer.OneObserver;
import com.chibi.designpatterns.observer.TwoObserver;
import com.chibi.designpatterns.statePattern.SateContext;
import com.chibi.designpatterns.strategyPattern.StrategyContext;
import com.chibi.designpatterns.strategyPattern.similarclasses.TripsBooking;
import com.chibi.designpatterns.templateMethod.FoodOrder;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Payment test = new Payment.PaymentBuilder("",0)
                .time(new Date())
                .isTaxable(false)
                .type("")
                .taxAmt("")
                .build();

        new PaymentKotlin.Builder(1,"chibi",true)
                .setTaxAmt(0)
                .setTime(new Date())
                .build();


        //Factory Pattern
        EmployeeFactory.getEmployeeTypeInstance(EmployeeType.LABOUR);

        //Adapter Design Pattern
        BillingAdapter indiaBillingAdapter = new BillingAdapter("US");
        indiaBillingAdapter.getBillCurrency();

        //Decorator design pattern
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage();
        MessageDecorator decorator = new MessageDecorator(whatsAppMessage);
        decorator.sendMessage();
        decorator.replyMessage();

        //Template Method pattern
        FoodOrder order = new FoodOrder();
        order.ProceedForPayment(true);

        //observable pattern
        OneObserver one = new OneObserver();
        TwoObserver two = new TwoObserver();

        Observable observable = new Observable();
        observable.attach(one);
        observable.attach(two);

        observable.notifyObserver("Hello chibi");

        observable.detach(two);

        observable.notifyObserver("Hello Raghu");

        //State design pattern
        SateContext stateContext = new SateContext(null,"12234");
        stateContext.updateState();
        stateContext.updateState();
        stateContext.updateState();

        //Iterator design pattern
        ArrayList<String> sampleList = new ArrayList<>();
        SampleIterator iterator = new SampleIterator(sampleList);
        while (iterator.isHasNext()){
            Log.v("MainActivity",""+iterator.next());
        }

        //Strategy pattern
        StrategyContext strategyContext = new StrategyContext(new TripsBooking());
        strategyContext.executeOperation("Hello");

    }
}