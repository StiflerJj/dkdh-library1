package com.cetcnav.library.util;

import android.app.ProgressDialog;
import android.content.Context;

import com.cetcnav.gateway.R;


/**
 * Created by Kevin on 2015/8/13.
 */
public class ProgressUtil {

    private static ProgressDialog pd;

    public static void show(Context context, int stringId) {
        show(context, context.getResources().getString(stringId));
    }

    public static void show(Context context, String msg) {
        show(context, msg, false);
    }

    public static void show(Context context, String msg, boolean cancelable) {
        if (pd == null || !pd.isShowing()) {
            pd = new ProgressDialog(context, R.style.theme_dialog);
            pd.setTitle(R.string.app_name);
            pd.setMessage(msg);
            pd.setCancelable(cancelable);
            pd.show();
        }
    }
//    public static void showWithLine(Context context, String msg, int progress,boolean cancelable) {
//        if (pd == null || !pd.isShowing()) {
//            pd = new ProgressDialog(context, R.style.theme_dialog);
//            pd.setTitle(R.string.app_name);
//            // 设置进度条风格，风格为长形
//            pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//            pd.setProgress(progress);
//            pd.setMessage(msg);
//            pd.setCancelable(cancelable);
//            pd.setProgressNumberFormat("%1d kb/%2d kb");
//            pd.show();
//        }
//    }

    public static ProgressDialog getProgress(Context context,String msg,boolean cancelable){
        if (pd == null || !pd.isShowing()) {
            pd = new ProgressDialog(context, R.style.theme_dialog);
            pd.setTitle(R.string.app_name);
            // 设置进度条风格，风格为长形
            pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            pd.setMessage(msg);
            pd.setCancelable(cancelable);
//            pd.setProgressNumberFormat("%1d kb/%2d kb");
            pd.show();
        }
        return pd;
    }


    public static void show(Context context, int stringId, boolean cancelable) {
        show(context, context.getResources().getString(stringId), cancelable);
    }

    public static void hide() {
        if (pd != null) {
            pd.dismiss();
            pd = null;
        }
    }
}
