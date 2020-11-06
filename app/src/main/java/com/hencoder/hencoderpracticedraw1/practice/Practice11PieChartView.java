package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint();
        Path path = new Path();

        //顺时针 为正

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawArc(300, 200, 700, 600, 0, -60, true, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(300, 200, 700, 600, 3, 5, true, paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(300, 200, 700, 600, 11, 5, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(300, 200, 700, 600, 20, 50, true, paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(300, 200, 700, 600, 70, 110, true, paint);

        paint.setColor(Color.CYAN);
        canvas.drawArc(280, 180, 680, 580, 180, 120, true, paint);

        int radius = (700 - 300) / 2; //半径 200

        //画线和文字
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        path.moveTo(700 - radius, 600 - radius);
        path.rMoveTo(radius - 20, -100);
        path.rLineTo(100, -80);
        path.rLineTo(100, 0);
        paint.setColor(Color.YELLOW);
        canvas.drawPath(path, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(30);
        canvas.drawText("qqq", 900 - 20 + 20, 220, paint);


        //画线和文字
        path.moveTo(700 - radius, 600 - radius);
        path.rMoveTo(-100, radius - 20);
        path.rLineTo(-100, 80);
        path.rLineTo(-100, 0);
        paint.setColor(Color.YELLOW);
        canvas.drawPath(path, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(30);
        canvas.drawText("yyy", 500 - 300 - 60, 400 + 180 + 80, paint);

    }
}
