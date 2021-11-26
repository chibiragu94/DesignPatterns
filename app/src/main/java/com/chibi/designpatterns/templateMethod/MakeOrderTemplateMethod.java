package com.chibi.designpatterns.templateMethod;

//Template Method pattern comes under the Behavioural pattern
//It creates the skeleton and the basic algorithm, so the class will be of the abstract method act as the
//skeleton and create the main algorithm method as the final so it cannot be accessed in the child classes
public abstract class MakeOrderTemplateMethod {

    public final void ProceedForPayment(boolean isProceed)
    {
        if (isProceed)
        {
            confirmItemCarts();
            showMyOrderScreen();
            showPaymentScreen();
            sendSuccessMessage();
        }else {
            sendErrorMessage();
            showProductScreen();
        }
    }

    abstract void confirmItemCarts();

    abstract void sendSuccessMessage();

    abstract void showPaymentScreen();

    abstract void showMyOrderScreen();

    abstract void sendErrorMessage();

    abstract void showProductScreen();
}
