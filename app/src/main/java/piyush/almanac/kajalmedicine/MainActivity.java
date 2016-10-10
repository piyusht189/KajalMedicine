package piyush.almanac.kajalmedicine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlarmReciever1 alarm1 = new AlarmReciever1();
        alarm1.setAlarm(this);
        AlarmReciever2 alarm2 = new AlarmReciever2();
        alarm2.setAlarm(this);
        AlarmReciever3 alarm3 = new AlarmReciever3();
        alarm3.setAlarm(this);
        AlarmReciever4 alarm4 = new AlarmReciever4();
        alarm4.setAlarm(this);
        AlarmReciever5 alarm5 = new AlarmReciever5();
        alarm5.setAlarm(this);
        AlarmReciever6 alarm6 = new AlarmReciever6();
        alarm6.setAlarm(this);
    }


}
