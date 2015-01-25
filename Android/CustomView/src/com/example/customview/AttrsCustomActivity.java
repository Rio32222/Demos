package com.example.customview;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class AttrsCustomActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attrscustom);
		
	}
}

class AttrsCustomView extends View{

	Paint p = new Paint();
	private float currentX = 40;
	private float currentY = 50;
	
	private int mMode;
	private boolean mMovingEnable = false;
	
	public AttrsCustomView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public AttrsCustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.AttrsCustomView);
		
		if(a.hasValue(R.styleable.AttrsCustomView_mode)){
			mMode = a.getInt(R.styleable.AttrsCustomView_mode, 1);
		}
		
		if(a.hasValue(R.styleable.AttrsCustomView_movingenable)){
			mMovingEnable = a.getBoolean(R.styleable.AttrsCustomView_mode, true);
		}
		
		a.recycle();
	}

	
	@Override
	public void onDraw(Canvas canvas){
		super.onDraw(canvas);

		switch(mMode){
		case 1:
			p.setColor(Color.BLUE);
			canvas.drawCircle(currentX, currentY, 15, p);
			break;
		case 2:
			p.setColor(Color.RED);
			Rect r = new Rect(10, 10, 10, 10);
			canvas.drawRect(r, p);
			break;
		default:
			return;	
		}
		
		
		
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event){
		
		if(!mMovingEnable){
			return true;
		}
		
		currentX = event.getX();
		currentY = event.getY();
		invalidate();
		return true;
	}
}
