package com.happydeerlet.colorchoose;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RadioButton;

import com.happydeerlet.colorchoose.util.DensityUtil;


public class ColorChooseRadioButton extends RadioButton {
	
	private Context mContext;
	private int colorChooseCenterColor = -1;

	public ColorChooseRadioButton(Context context) {
		super(context);
		mContext = context;
	}

	public ColorChooseRadioButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		setAttributes(attrs);
	}

	public ColorChooseRadioButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		mContext = context;
		setAttributes(attrs);
	}
	
	private void setAttributes(AttributeSet attrs) {
		TypedArray a = mContext.obtainStyledAttributes(attrs,
				R.styleable.color_choose);
		colorChooseCenterColor = a.getColor(
				R.styleable.color_choose_center_color, -1);
	}

	@Override
	protected void drawableStateChanged() {
		super.drawableStateChanged();
		this.invalidate();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		int strokeWidth = DensityUtil.dip2px(getContext(), 2);
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.STROKE);
		paint.setAntiAlias(true);
		paint.setStrokeWidth(strokeWidth);
		if (isChecked()) {
			paint.setColor(getContext().getResources().getColor(R.color.checked_border));
		} else {
			paint.setColor(getContext().getResources().getColor(R.color.transparent));
		}
		
		canvas.drawRect(0, 0, getWidth(), getHeight(), paint);
		
		paint.setStyle(Paint.Style.FILL);
		paint.setAntiAlias(true);
		paint.setColor(colorChooseCenterColor);
		canvas.drawRect(strokeWidth * 2, strokeWidth * 2, getWidth() - strokeWidth * 2, getWidth() - strokeWidth * 2, paint);
		
		
	}

	public int getColorChooseCenterColor() {
		return colorChooseCenterColor;
	}

	public void setColorChooseCenterColor(int colorChooseCenterColor) {
		this.colorChooseCenterColor = colorChooseCenterColor;
	}


}
