package com.yu.lin.qodkaewrioqruerjkrje.async;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

import com.yu.lin.testasynctask.R;

/**
 * Created by Lin-Yu on 29/10/2017.
 *
 */

public class OneTask extends AsyncTask<Void, Void, Void>{

    private Activity mActivity;

    public OneTask(Activity activity){
        this.mActivity = activity;
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        TextView info = (TextView) mActivity.findViewById(R.id.info);
        info.setText(" == TaskOne is DONE == ");
    }
}
