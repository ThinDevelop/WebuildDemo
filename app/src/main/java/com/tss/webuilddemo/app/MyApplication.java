package com.tss.webuilddemo.app;

import android.app.Application;
import android.content.Context;

import com.sunmi.peripheral.printer.InnerPrinterCallback;
import com.sunmi.peripheral.printer.InnerPrinterException;
import com.sunmi.peripheral.printer.InnerPrinterManager;
import com.sunmi.peripheral.printer.SunmiPrinterService;

public class MyApplication extends Application {

    public static Context context;
    public static SunmiPrinterService sunmiPrinterService;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        bindPrintService();

    }

    private void bindPrintService() {
        try {
            InnerPrinterManager.getInstance().bindService(this, new InnerPrinterCallback() {
                @Override
                protected void onConnected(SunmiPrinterService service) {
                    MyApplication.sunmiPrinterService = service;
                }

                @Override
                protected void onDisconnected() {
                    MyApplication.sunmiPrinterService = null;
                }
            });
        } catch (InnerPrinterException e) {
            e.printStackTrace();
        }
    }
}
