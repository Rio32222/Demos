package com.example.customview;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
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

	public final static boolean DEBUG = true;
	public final static String TAG = "CustomView";
			
	Paint p = new Paint();
	private float currentX = 40;
	private float currentY = 50;
	
	private int mMode;
	private boolean mMovingEnable = false;
	private int mColor;
	
	public AttrsCustomView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		if(DEBUG){
			Log.d(TAG, "AttrsCustomView(Context)");
		}
	}
	
	public AttrsCustomView(Context context, AttributeSet attrs) {  //�����.xml�ļ��ж�����view�����ԣ���ô�ù��췽������Ҫʵ��
		super(context, attrs);
		// TODO Auto-generated constructor stub
		if(DEBUG){
			Log.d(TAG, "AttrsCustomView(Cnntext, arrts)");
		}
		
		/*
		 * �õ���TypedArray��һЩ���Ե���Ϣ
		 * */
		TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.AttrsCustomView);
		
		/*
		 * ͨ�������TypedArray ʵ���ж����ǵ�һЩ����
		 * ע��:
		 * 		AttrsCustomView_mode�����Ǹ������ǵ�attrs�ļ��Ķ������ɵ��ǡ�
		 * 		���ɵĹ���{declare-styleable_name}_{attr_name}
		 * */
		if(a.hasValue(R.styleable.AttrsCustomView_mode)){
			mMode = a.getInt(R.styleable.AttrsCustomView_mode, 1);
		}
		
		if(a.hasValue(R.styleable.AttrsCustomView_movingenable)){
			mMovingEnable = a.getBoolean(R.styleable.AttrsCustomView_mode, true);
		}
		
		if(a.hasValue(R.styleable.AttrsCustomView_color)){
			mColor = a.getColor(R.styleable.AttrsCustomView_color, Color.GREEN);
			p.setColor(mColor);
		}
		a.recycle();
	}
	
	public AttrsCustomView(Context context, AttributeSet attrs, int defStyle){
		super(context, attrs, defStyle);
		if(DEBUG){
			Log.d(TAG, "AttrsCustomView(Cnntext, arrts, defStyle)");
		}
	}
	
	@Override
	public void onDraw(Canvas canvas){
		super.onDraw(canvas);

		switch(mMode){
		case 1:
			canvas.drawCircle(currentX, currentY, 15, p);
			break;
		case 2:
			canvas.drawCircle(currentX, currentY, 25, p);
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
