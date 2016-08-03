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
	 * ����������д��linear�еĴ������������Ĺ��캯��,�ڲ�����Ҳ����TitileLayout�ؼ��ͻ����
	 * ������캯��.Ȼ���ڹ��캯������Ҫ�Ա������ֲ����ж�̬����,���Ҫ����LayoutInflater��ʵ
	 * ����.ͨ��LayoutInflater��from()�������Թ�����һ��LayoutInflater����,Ȼ�����inflate()
	 * �����Ϳ��Զ�̬����һ�������ļ�,inflate()����������������,��һ��������Ҫ���صĲ���id,�������Ǵ���
	 * R.layout.title,�ڶ��������Ǹ����غõĲ��������һ��������,����������Ҫָ��ΪTitleLayout,����
	 * ֱ�Ӵ���this.
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
				Toast.makeText(getContext(), "��������!!!", Toast.LENGTH_SHORT).show();
			}
		});
	}
	
}
