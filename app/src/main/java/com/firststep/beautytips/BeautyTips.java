package com.firststep.beautytips;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.firststep.beautytips.utils.Constant;
import com.firststep.beautytips.utils.TypefaceManager;
import com.firststep.beautytips.utils.TypefaceSetter;

/**
 * Created by Zwe Mun Htun on 8/3/2017.
 */

public class BeautyTips extends Application{

    public static TypefaceManager typefaceManager;
    public static TypefaceSetter typefaceSetter;
    protected static BeautyTips instance;

    @Override
    public void onCreate() {
        super.onCreate();

        typefaceManager = new TypefaceManager(getAssets());
        loadTypefaceSetter();
    }

    public BeautyTips(){
        instance = this;
    }

    public static BeautyTips get(){
        return instance;
    }

    public SharedPreferences getDefaultSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(this);
    }

    private void loadTypefaceSetter() {
        typefaceSetter = new TypefaceSetter();
    }

    public static boolean isUniForced(){
        return PreferenceManager.getDefaultSharedPreferences(BeautyTips.get()).getBoolean(Constant.IS_UNI_FORCE, false);
    }

}
