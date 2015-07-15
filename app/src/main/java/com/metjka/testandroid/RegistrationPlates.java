package com.metjka.testandroid;

import android.content.Context;

import java.util.HashMap;



public class RegistrationPlates {

    private HashMap<String, String> regPlateUkrMap = new HashMap<>();
    public RegistrationPlates(Context context) {

        regPlateUkrMap.put("aa", context.getResources().getString(R.string.сKiev));
        regPlateUkrMap.put("ab", context.getString(R.string.Vinnytsia));
        regPlateUkrMap.put("ac", context.getString(R.string.Volyn));
        regPlateUkrMap.put("ae", context.getString(R.string.Dnipropetrovsk));
        regPlateUkrMap.put("ah", context.getString(R.string.Donetsk));
        regPlateUkrMap.put("ak", context.getString(R.string.Crimea));
        regPlateUkrMap.put("am", context.getString(R.string.Zhytomyr));
        regPlateUkrMap.put("ao", context.getString(R.string.Zakarpattia));
        regPlateUkrMap.put("ap", context.getString(R.string.Zaporizhia));
        regPlateUkrMap.put("at", context.getString(R.string.IvanoFrankivsk));
        regPlateUkrMap.put("ai", context.getString(R.string.Kyiv));
        regPlateUkrMap.put("ba", context.getString(R.string.Kirovohrad));
        regPlateUkrMap.put("bb", context.getString(R.string.Luhansk));
        regPlateUkrMap.put("bc", context.getString(R.string.Lviv));
        regPlateUkrMap.put("be", context.getString(R.string.Mykolaiv));
        regPlateUkrMap.put("bh", context.getString(R.string.Odessa));
        regPlateUkrMap.put("bi", context.getString(R.string.Poltava));
        regPlateUkrMap.put("bk", context.getString(R.string.Rivne));
        regPlateUkrMap.put("bm", context.getString(R.string.Sumy));
        regPlateUkrMap.put("bo", context.getString(R.string.Ternopil));
        regPlateUkrMap.put("ax", context.getString(R.string.Kharkiv));
        regPlateUkrMap.put("bt", context.getString(R.string.Kherson));
        regPlateUkrMap.put("bx", context.getString(R.string.Khmelnytskyi));
        regPlateUkrMap.put("ca", context.getString(R.string.Cherkasy));
        regPlateUkrMap.put("cb", context.getString(R.string.Chernihiv));
        regPlateUkrMap.put("ce", context.getString(R.string.Chernivtsi));
        regPlateUkrMap.put("ch", context.getString(R.string.cSevastopol));
    }
    public String getName(String kod) {
        return regPlateUkrMap.get(kod);
    }
}
