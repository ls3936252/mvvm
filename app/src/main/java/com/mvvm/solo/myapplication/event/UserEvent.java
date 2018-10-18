package com.mvvm.solo.myapplication.event;

import android.util.Log;
import android.view.View;

/**
 * 创建日期：2018/10/18 0018 on 15:45
 * 描述:
 * 作者:SoLo
 */
public class UserEvent {

        private static final String TAG = "MyHandler";

        public void testClick(View view){
            Log.e(TAG,"点击测试");
        }
}
