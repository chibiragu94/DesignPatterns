package com.chibi.designpatterns.facade;

//Facade pattern mostly hides complex functionality of the system
//it make the client side result as easy access, with any idea about the inner working of the system
//In this example, client will get the billing confirmation detail, so it will process for options,
//otp, notification, check confirmation status, so the user only calls the one method
// it will take care of all th major functionality
public class BillingFacade {

    public static String getBillingConfirmationDetails(String input)
    {
        String result = "";
        switch (input)
        {
            case "one":
                result = "one";
                break;
            case "two":
                result = "two";
                break;
            case "three":
                result = "threee";
                break;
            default:
        }

        //send OTP after making the billing
        sendOTP();
        checkUserHasMadePayment();
        sendConfirmationPushNotification();

        return result;
    }

    private static void sendConfirmationPushNotification() {

    }

    private static void checkUserHasMadePayment() {

    }

    private static void sendOTP() {

    }
}
