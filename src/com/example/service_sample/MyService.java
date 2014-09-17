package com.example.service_sample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		Log.d("My Service", "Service created");
		Toast.makeText(this, "My Service created.", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("My Service", "Service stoped");
		Toast.makeText(this, "My Service stoped.", Toast.LENGTH_SHORT).show();
	}
}
