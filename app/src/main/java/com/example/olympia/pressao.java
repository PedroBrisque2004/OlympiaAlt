package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class pressao extends AppCompatActivity implements SensorEventListener {
    private TextView textview;
    private SensorManager sensorManager;
    private Sensor pressureSensor;
    private Boolean pressValida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressao);

        textview = findViewById(R.id.textview3);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        if(sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE) !=null)
        {
            pressureSensor = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
            pressValida = true;
        }else {
            textview.setText("Sensor não esta disponivel");
            pressValida = false;
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorevent) {
        textview.setText(sensorevent.values [0] + " hPa");
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        if(pressValida)
        {
            sensorManager.registerListener(this, pressureSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(pressValida)
        {
            sensorManager.unregisterListener(this);
        }
    }
}