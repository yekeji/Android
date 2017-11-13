package com.yekeji.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ye.keji on 2017-11-13.
 */

public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<>();
    public static void addAcitvity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
