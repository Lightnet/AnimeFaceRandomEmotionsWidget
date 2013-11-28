package org.anime.emotion.random.app;


/**
 * Created by Lightnet on 26/11/13.
 */
import java.util.Random;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

import com.example.app.R;

public class MyWidgetProvider extends AppWidgetProvider {

    private static final String ACTION_CLICK = "ACTION_CLICK";

    public void onEnabled(Context context) {
        super.onEnabled(context);
        ComponentName thisAppWidget = new ComponentName(context.getPackageName(), MyWidgetProvider.class.getName());
        //int[] appWidgetIds = appWidgetManager.getAppWidgetIds(thisAppWidget);
        Log.w("test", "init start up");

        // Get all ids
        //ComponentName thisWidget = new ComponentName(context,
                //MyWidgetProvider.class);
        //int[] allWidgetIds = appWidgetManager.getAppWidgetIds(thisWidget);

    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        // Create some random data
        int num_head = (new Random().nextInt(2));
        int num_eye = (new Random().nextInt(10));
        int num_lip = (new Random().nextInt(11));

        Log.w("head id:", String.valueOf(num_head));
        Log.w("eye id:", String.valueOf(num_eye));
        Log.w("lip id:", String.valueOf(num_lip));

        // Get all ids
        ComponentName thisWidget = new ComponentName(context,
                MyWidgetProvider.class);

        int[] allWidgetIds = appWidgetManager.getAppWidgetIds(thisWidget);

        RemoteViews remoteView = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
        if(num_head == 0){
            remoteView.setInt(R.id.layout, "setBackgroundResource", R.drawable.pi_gasara_head);
        }else{
            remoteView.setInt(R.id.layout, "setBackgroundResource", R.drawable.pi_gasara_head_ear);
        }

        if(num_eye == 0){
            remoteView.setInt(R.id.image_eye, "setBackgroundResource", R.drawable.pi_gasara_eye_01);
        }else if(num_eye == 1){
            remoteView.setInt(R.id.image_eye, "setBackgroundResource", R.drawable.pi_gasara_eye_02);
        }else if(num_eye == 2){
            remoteView.setInt(R.id.image_eye, "setBackgroundResource", R.drawable.pi_gasara_eye_03);
        }else if(num_eye == 3){
            remoteView.setInt(R.id.image_eye, "setBackgroundResource", R.drawable.pi_gasara_eye_04);
        }else if(num_eye == 4){
            remoteView.setInt(R.id.image_eye, "setBackgroundResource", R.drawable.pi_gasara_eye_05);
        }else if(num_eye == 5){
            remoteView.setInt(R.id.image_eye, "setBackgroundResource", R.drawable.pi_gasara_eye_06);
        }else if(num_eye == 6){
            remoteView.setInt(R.id.image_eye, "setBackgroundResource", R.drawable.pi_gasara_eye_07);
        }else if(num_eye == 7){
            remoteView.setInt(R.id.image_eye, "setBackgroundResource", R.drawable.pi_gasara_eye_08);
        }else if(num_eye == 8){
            remoteView.setInt(R.id.image_eye, "setBackgroundResource", R.drawable.pi_gasara_eye_09);
        }else if(num_eye == 9){
            remoteView.setInt(R.id.image_eye, "setBackgroundResource", R.drawable.pi_gasara_eye_10);
        }

        if(num_eye == 0){
            remoteView.setInt(R.id.image_lip, "setBackgroundResource", R.drawable.pi_gasara_lip_01);
        }else if(num_eye == 1){
            remoteView.setInt(R.id.image_lip, "setBackgroundResource", R.drawable.pi_gasara_lip_02);
        }else if(num_eye == 2){
            remoteView.setInt(R.id.image_lip, "setBackgroundResource", R.drawable.pi_gasara_lip_03);
        }else if(num_eye == 3){
            remoteView.setInt(R.id.image_lip, "setBackgroundResource", R.drawable.pi_gasara_lip_04);
        }else if(num_eye == 4){
            remoteView.setInt(R.id.image_lip, "setBackgroundResource", R.drawable.pi_gasara_lip_05);
        }else if(num_eye == 5){
            remoteView.setInt(R.id.image_lip, "setBackgroundResource", R.drawable.pi_gasara_lip_06);
        }else if(num_eye == 6){
            remoteView.setInt(R.id.image_lip, "setBackgroundResource", R.drawable.pi_gasara_lip_07);
        }else if(num_eye == 7){
            remoteView.setInt(R.id.image_lip, "setBackgroundResource", R.drawable.pi_gasara_lip_08);
        }else if(num_eye == 8){
            remoteView.setInt(R.id.image_lip, "setBackgroundResource", R.drawable.pi_gasara_lip_09);
        }else if(num_eye == 9){
            remoteView.setInt(R.id.image_lip, "setBackgroundResource", R.drawable.pi_gasara_lip_10);
        }

        /*
        if(count == 0){
            //remoteView.setTextViewText(R.id.imageViewbg, "test0");
            //remoteView.setInt(R.id.imageViewbg, "setBackgroundResource", R.drawable.piggy_icon_gasara_happy); //work with => appWidgetManager.updateAppWidget(widgetId, remoteView);
            remoteView.setInt(R.id.layout, "setBackgroundResource", R.drawable.piggy_icon_gasara_happy02); //work with => appWidgetManager.updateAppWidget(widgetId, remoteView);
            Log.w("R.id.layout:", "piggy_icon_gasara_happy00...");
        }else{
            //remoteView.setTextViewText(R.id.imageViewbg, "test1");
            //remoteView.setInt(R.id.imageViewbg, "setBackgroundResource", R.drawable.piggy_icon_gasara_happy02); //work with => appWidgetManager.updateAppWidget(widgetId, remoteView);
            remoteView.setInt(R.id.layout, "setBackgroundResource", R.drawable.piggy_icon_gasara_happy); //work with => appWidgetManager.updateAppWidget(widgetId, remoteView);
            Log.w("R.id.layout:", "piggy_icon_gasara_happy01...");
        }
        */

        for (int widgetId : allWidgetIds) {
            Log.w("widgetId:", String.valueOf(widgetId));
            appWidgetManager.updateAppWidget(widgetId, remoteView);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
                    R.layout.widget_layout);
            // Register an onClickListener
            Intent intent = new Intent(context, MyWidgetProvider.class);
            intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetIds);

            PendingIntent pendingIntent = PendingIntent.getBroadcast(context,
                    0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            remoteViews.setOnClickPendingIntent(R.id.update, pendingIntent);
            appWidgetManager.updateAppWidget(widgetId, remoteViews);
        }
    }
}