package com.firststep.beautytips.utils;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.LruCache;

/**
 * Created by Zwe Mun Htun on 7/31/2017.
 */

public class TypefaceManager {
    public static final String PYIDAUNGSU = "zawgyi_one.ttf";

    private final AssetManager manager;

    private final LruCache<String, Typeface> mCache;

    public TypefaceManager(AssetManager manager) {
        this.manager = manager;
        int cacheSize = 4 * 1024 * 1024;
        mCache = new LruCache<>(cacheSize);
    }

    public Typeface getUnicode(){
        return getTypeFace(PYIDAUNGSU);
    }

    private Typeface getTypeFace(String filename) {
        Typeface typeface = mCache.get(filename);
        if (typeface == null){
            typeface = Typeface.createFromAsset(manager, filename);
        }
        return typeface;
    }


}
