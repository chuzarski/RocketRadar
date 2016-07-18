package net.chuzarski.rocketradar;

import android.app.Application;
import android.content.Intent;

import net.chuzarski.rocketradar.service.RadarService;

import timber.log.Timber;

public class RadarApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // get a logger
        if(BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        //TODO start the radar service
        startService(new Intent(this, RadarService.class));
    }

}
