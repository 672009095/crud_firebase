package com.ramakusumadigara.crud_firebase;


import android.util.Log;

import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;

/**
 * Created by papahnakal on 04/10/17.
 */

public class MyJobService extends JobService {

    private static final String TAG = "MyJobService";


    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override
    public boolean onStartJob(JobParameters job) {
        Log.d(TAG, "Performing long running task in scheduled job");
        return false;
    }
}
