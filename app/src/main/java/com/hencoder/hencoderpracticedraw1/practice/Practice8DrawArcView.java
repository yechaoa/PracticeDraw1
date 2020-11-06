package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        Paint paint = new Paint();

        //顺时针 为正


        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawArc(300,300,600,600,-20,-100,true, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        canvas.drawArc(300,300,600,600,10,160,false, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLUE);
        canvas.drawArc(300,300,600,600,180,50,false, paint);



    }
}
