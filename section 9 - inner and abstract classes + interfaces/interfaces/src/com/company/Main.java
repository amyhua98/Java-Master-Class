package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone amyPhone;
	    amyPhone = new DeskPhone(123456789);
	    amyPhone.powerOn();
	    amyPhone.callPhone(123456789);
	    amyPhone.answer();

	    amyPhone = new MobilePhone(987654321);
		amyPhone.powerOn();
	    amyPhone.callPhone(987654321);
	    amyPhone.answer();
    }
}
