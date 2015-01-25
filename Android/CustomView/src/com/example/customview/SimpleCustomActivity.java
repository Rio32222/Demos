package com.example.customview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class SimpleCustomActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplecustom);
        
        RelativeLayout rLayout = (RelativeLayout)findViewById(R.id.rLayout);
        
        SimpleCustomView simpleCustomView = new SimpleCustomView(this);
        
        rLayout.addView(simpleCustomView);
    }
}

class SimpleCustomView extends View{

	Paint p = new Paint();
	private float currentX = 40;
	private float currentY = 50;
	
	public SimpleCustomView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onDraw(Canvas canvas){
		super.onDraw(canvas);
		p.setColor(Color.RED);
		
		canvas.drawCircle(currentX, currentY, 15, p);
		
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event){
		currentX = event.getX();
		currentY = event.getY();
		invalidate();
		return true;
	}
}
