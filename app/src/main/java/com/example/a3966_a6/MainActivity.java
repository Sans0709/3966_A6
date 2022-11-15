package com.example.a3966_a6;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bg=Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);

        ImageView i=(ImageView) findViewById(R.id.imageView3);
        i.setBackgroundDrawable(new BitmapDrawable(bg));

        Canvas canvas=new Canvas(bg);

        Paint paint=new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(50);

        canvas.drawText("Rectangle",420,150,paint);
        canvas.drawRect(400,200,650,700,paint);

        canvas.drawText("Circle",120,150,paint);
        canvas.drawCircle(200,350,150,paint);

        canvas.drawText("Square",120,800,paint);
        canvas.drawRect(50,850,350,1150,paint);


    }
}