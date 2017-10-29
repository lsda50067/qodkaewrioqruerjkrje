package com.yu.lin.testasynctask.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.TextView;

import com.yu.lin.testasynctask.R;

/**
 * Created by Lin-Yu on 29/10/2017.
 *
 */

public class TwoTask extends AsyncTask<Integer, Void, Void>{

    private Activity mActivity;

    public TwoTask(Activity activity){
        this.mActivity = activity;
    }

    @Override
    protected Void doInBackground(Integer... params) {
        try {
            Thread.sleep(params[0]*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        TextView info = (TextView) mActivity.findViewById(R.id.info);
        info.setText(" == TaskTwo is DONE ==");
    }
}
