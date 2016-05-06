package th.co.itgenius.mvcandroidapp;

import android.app.Application;

import com.itgenius.mvclibrary.manager.Contextor;

/**
 * Created by samit on 6/5/2559.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Call Contextor
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
