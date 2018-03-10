package com.chingtech.jdaddressselector;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.v7.widget.AppCompatImageView;

/**
 * <p>
 * *    ***********    ***********    **
 * *    ***********    ***********    **
 * *    **             **             **
 * *    **             **             **
 * *    **             **             **
 * *    ***********    **             **
 * *    ***********    **             **
 * *             **    **             **
 * *             **    **             **
 * *             **    **             **
 * *    ***********    ***********    ***********
 * *    ***********    ***********    ***********
 * </p>
 * JDAddressSelector
 * Package com.chingtech.jdaddressselector
 * Description:
 * Created by 师春雷
 * Created at 18/3/10 上午9:15
 */
public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
