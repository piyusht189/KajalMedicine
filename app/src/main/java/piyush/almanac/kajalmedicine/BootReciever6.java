package piyush.almanac.kajalmedicine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Super-Nova on 23-02-2016.
 */
public class BootReciever6 extends BroadcastReceiver{
    AlarmReciever6 alarm = new AlarmReciever6();
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED"))
        {
            alarm.setAlarm(context);
        }
    }
}
