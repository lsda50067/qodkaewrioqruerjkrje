package com.yu.lin.qodkaewrioqruerjkrje.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.TextView;

import com.yu.lin.testasynctask.R;

/**
 * Created by Lin-Yu on 29/10/2017.
 *
 */

public class ThreeTask extends AsyncTask<Integer, Integer, Void> {

    private TextView info;
    private Activity mActivity;

    public ThreeTask(Activity activity){
        this.mActivity = activity;
        info =  (TextView) mActivity.findViewById(R.id.info);
    }

    @Override
    protected Void doInBackground(Integer... params) {
        for (int i=0; i < params[0]; i++){
            // publish updates on the UI thread while the background 
            publishProgress(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        info.setText(String.valueOf(values[0]));
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        info.setText(" == TaskThree is DONE ==");
    }
}

