package com.seewo.note.types;

import android.graphics.Canvas;

import com.seewo.note.been.Point;
import com.seewo.note.util.Constants;


public class RectShape extends Shape {
    @Override
    public void addPoint(float x, float y) {
        if (mPointList.size()<=1) {
            mPointList.add(new Point(x, y));
        }else{
            mPointList.remove(1);
            mPointList.add(new Point(x,y));
        }
    }

    @Override
    public void draw(Canvas mCanvas) {
        if(mPointList.size()>=2){
            mCanvas.drawRect(mPointList.get(0).getX(),mPointList.get(0).getY(),mPointList.get(1).getX(),mPointList.get(1).getY(),mPaint);
        }
    }

    @Override
    public void downAction(float x, float y) {
addPoint(x,y);
    }

    @Override
    public void moveAction(float mx, float my, float x, float y) {
        addPoint(x,y);
    }

    @Override
    public void upAction(float x, float y) {
        addPoint(x,y);
    }

    @Override
    public int getKind() {
        return Constants.RECTSHAPE;
    }

    @Override
    public void pointsToPointPath() {

    }
}
