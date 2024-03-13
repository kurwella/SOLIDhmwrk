package isp1.pay.impl;

import isp1.pay.Payable;

public class InternetPaymentService implements Payable, PhoneNumberPay {
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet pay by credit card %d\n", amount);
    }
    @Override
    public void PayPhoneNumber(int amount) {

    }
}
