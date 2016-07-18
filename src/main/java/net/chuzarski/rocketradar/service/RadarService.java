package net.chuzarski.rocketradar.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.google.android.gms.common.api.GoogleApiClient;

import timber.log.Timber;

public class RadarService extends Service {

    private Runnable worker;

    public RadarService() {
        worker = new RadarWorker();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        new Thread(worker).start();

        return super.onStartCommand(intent, flags, startId);
    }

    public class RadarWorker implements Runnable {

        public RadarWorker() {
            Timber.tag("RadarWorker");
        }
        @Override
        public void run() {

            // location awareness
            DeviceLocation loc = new DeviceLocation(getApplicationContext());

            while(true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
