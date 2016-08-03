package com.example.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TitleLayout extends LinearLayout {

	/**
	 * 首先我们重写了linear中的带有两个参数的构造函数,在布局中也引入TitileLayout控件就会调用
	 * 这个构造函数.然后在构造函数中需要对标题栏局部进行动态加载,这就要借助LayoutInflater来实
	 * 现了.通过LayoutInflater的from()方法可以构建出一个LayoutInflater对象,然后调用inflate()
	 * 方法就可以动态加载一个布局文件,inflate()方法接收两个参数,第一个参数是要加载的布局id,这里我们传入
	 * R.layout.title,第二个参数是给加载好的布局再添加一个父布局,这里我们想要指定为TitleLayout,于是
	 * 直接传入this.
	 * @param context
	 * @param attrs
	 */
	public TitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater.from(context).inflate(R.layout.title,this);
		Button titleBack = (Button) findViewById(R.id.title_back);
		Button titleEdit = (Button) findViewById(R.id.title_edit);
		titleBack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				((Activity)getContext()).finish();
			}
		});
		titleEdit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getContext(), "你点击了我!!!", Toast.LENGTH_SHORT).show();
			}
		});
	}
	
}
