package com.firststep.beautytips.utils;

import android.graphics.Typeface;
import android.widget.TextView;

import com.firststep.beautytips.BeautyTips;


/**
 * Created by Zwe Mun Htun on 7/31/2017.
 */

public class TypefaceSetter {
    public static Typeface typefaceUni;
    public static boolean isUniForced;

    public TypefaceSetter() {
        isUniForced = BeautyTips.isUniForced();
        typefaceUni = BeautyTips.typefaceManager.getUnicode();

    }

    public void Setter(TextView textView, String textUni){
        if (isUniForced){
            textView.setText(textUni);
            textView.setTypeface(typefaceUni);
        }

    }
}
