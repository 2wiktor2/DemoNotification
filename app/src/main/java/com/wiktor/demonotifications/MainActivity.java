package com.wiktor.demonotifications;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;
    private Button button2;
    private Button button3;

    // Идентификатор уведомления
    private static final int NOTIFY_ID = 101;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_1:
                Intent notificationsIntent = new Intent(this, MainActivity.class);

                PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationsIntent, PendingIntent.FLAG_CANCEL_CURRENT);

                //Resources res = this.getResources();

                NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
                builder.setContentIntent(contentIntent)
                        //Обязательные настройки
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        //.setContentTitle(res.getString(R.string.notifytitle)) // Заголовок уведомления
                        .setContentTitle("Напоминание")
                        //.setContentText(res.getString(R.string.notifytext))
                        .setContentText("Текст уведомления") // Текст уведомления
                        // необязательные настройки
                        //.setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.hungrycat)) // большая картинка
                        //.setTicker(res.getString(R.string.warning)) // текст в строке состояния
                        .setTicker("Последнее китайское предупреждение!") // текст появляется ненадолго когда приходит уведомление
                        .setWhen(System.currentTimeMillis())
                        .setAutoCancel(true) // автоматически закрыть уведомление после нажатия
                        .setProgress(100,50, false);

              //  Notification notification = builder.build();

                // NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                // Альтернативный вариант
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
                notificationManager.notify(NOTIFY_ID, builder.build());


                break;
            case R.id.button_2:

                Intent notificationsIntent2 = new Intent(this, MainActivity.class);

                PendingIntent contentIntent2 = PendingIntent.getActivity(this, 0, notificationsIntent2, PendingIntent.FLAG_CANCEL_CURRENT);

                //Resources res = this.getResources();

                NotificationCompat.Builder builder2 = new NotificationCompat.Builder(this);
                builder2.setContentIntent(contentIntent2)
                        //Обязательные настройки
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        //.setContentTitle(res.getString(R.string.notifytitle)) // Заголовок уведомления
                        .setContentTitle("Вторая напоминалка")
                        //.setContentText(res.getString(R.string.notifytext))
                        .setContentText("должно что-то поменяться") // Текст уведомления
                        // необязательные настройки
                        //.setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.hungrycat)) // большая картинка
                        //.setTicker(res.getString(R.string.warning)) // текст в строке состояния
                        .setTicker("))))))))))))))))!") // текст появляется ненадолго когда приходит уведомление
                        .setWhen(System.currentTimeMillis())
                        .setAutoCancel(true) // автоматически закрыть уведомление после нажатия
                        .setProgress(100,50, false);

                //Notification notification = builder2.build();

                // NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                // Альтернативный вариант
                NotificationManagerCompat notificationManager2 = NotificationManagerCompat.from(this);
                notificationManager2.notify(NOTIFY_ID, builder2.build());


                break;
            case R.id.button_3:

                Intent notificationsIntent3 = new Intent(this, MainActivity.class);

                PendingIntent contentIntent3 = PendingIntent.getActivity(this, 0, notificationsIntent3, PendingIntent.FLAG_NO_CREATE);

                //Resources res = this.getResources();

                NotificationCompat.Builder builder3 = new NotificationCompat.Builder(this);
                builder3.setContentIntent(contentIntent3)
                        //Обязательные настройки
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        //.setContentTitle(res.getString(R.string.notifytitle)) // Заголовок уведомления
                        .setContentTitle("Третья напоминалка")
                        //.setContentText(res.getString(R.string.notifytext))
                        .setContentText("д77777777") // Текст уведомления
                        // необязательные настройки
                        //.setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.hungrycat)) // большая картинка
                        //.setTicker(res.getString(R.string.warning)) // текст в строке состояния
                        .setTicker("3!") // текст появляется ненадолго когда приходит уведомление
                        .setWhen(System.currentTimeMillis())
                        .setAutoCancel(true) // автоматически закрыть уведомление после нажатия
                        .setProgress(100,50, false);

                //Notification notification = builder2.build();

                // NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                // Альтернативный вариант
                NotificationManagerCompat notificationManager3 = NotificationManagerCompat.from(this);
                notificationManager3.notify(NOTIFY_ID, builder3.build());
                break;
        }






    }


}
