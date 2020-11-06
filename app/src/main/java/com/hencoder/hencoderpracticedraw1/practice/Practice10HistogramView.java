package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class Practice10HistogramView extends View {

    private Paint paint = new Paint();

    private Path path = new Path();

    private Rect rect = new Rect();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        //初始化数据
        ArrayList<DataBean> list = new ArrayList<>();
        list.add(new DataBean(20, "c++"));
        list.add(new DataBean(34, "php"));
        list.add(new DataBean(78, "java"));
        list.add(new DataBean(12, ".net"));
        list.add(new DataBean(65, "css"));

        //标题
        paint.setTextSize(50);
        paint.setColor(Color.WHITE);
        canvas.drawText("7月编程语言排行榜",350,100,paint);

        //画线 X轴Y轴
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setColor(Color.WHITE);
        path.moveTo(200, 200);
        path.lineTo(200, 600);
        path.rLineTo(700, 0);
        canvas.drawPath(path, paint);

        int gap = 30;
        int width = 100;

        int left = 200 + gap;
        int top = 0;
        int right = left + width;
        int bottom = 600;

        int xHeight = 600 - 200;// 坐标系 高度

        for (int i = 0; i < list.size(); i++) {

            //高度 = Y轴高度 - （百分制数值 * 百分制倍数 ）
            top = bottom - (list.get(i).number * (xHeight / 100));

            if (i > 0) {
                left += width + gap;
                right += width + gap;
            }

            if (list.get(i).number>50){
                paint.setColor(Color.RED);
            }else {
                paint.setColor(Color.YELLOW);
            }
            paint.setStyle(Paint.Style.FILL);

            //直方图
            rect.set(left, top, right, bottom);
            canvas.drawRect(rect, paint);

            //底部文字
            paint.setColor(Color.WHITE);
            paint.setTextSize(30);
            canvas.drawText(list.get(i).text, left + (right - left) / 4, bottom + 40, paint);

            //上面显示百分比
            canvas.drawText(list.get(i).number+"%", left + (right - left) / 4, top - 20, paint);
        }
    }

    static class DataBean {

        int number;
        String text;

        DataBean(int number, String text) {
            this.number = number;
            this.text = text;
        }

    }
}
