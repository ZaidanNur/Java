package com.tugasku.numbertocurrency;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class number_to_currency {
    public static void main(String[] args){
        int mount = 15000;
        System.out.println("Mount :" +mount);
        Locale indo = new Locale("in","ID");
        Currency rupiah = Currency.getInstance(indo);
        NumberFormat format_rupiah = NumberFormat.getCurrencyInstance(indo);
        System.out.println(rupiah.getDisplayName() +": " + format_rupiah.format(mount));

    }
}
