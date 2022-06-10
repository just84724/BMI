package com.example.bmi1;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText h2;
	EditText w2;
	Button btn_1;
	TextView ccc,text;
	private float showbmi,getweight,getheight,MyBMI;
	    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         h2= (EditText) findViewById(R.id.h2);
         w2=  (EditText) findViewById(R.id.w2);
         btn_1=(Button) findViewById(R.id.btn_1);
        ccc=(TextView) findViewById(R.id.ccc);
        text=(TextView) findViewById(R.id.text);
        
        btn_1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自動產生的方法 Stub
				String TmpHeight = h2.getText().toString();
				String TmpWeight = w2.getText().toString();
				getheight = Float.parseFloat(TmpHeight);
		        getweight = Float.parseFloat(TmpWeight);
		        getheight = getheight/100;
				//String a=h2.getText().toString();
				//String b=w2.getText().toString();
				//double ai=Double.parseDouble(a);
				//double bi=Double.parseDouble(b);
				//double c=bi/((ai/100*ai/100));
				MyBMI = getweight / (getheight * getheight);
				ccc.setText("你的     BMI : "+MyBMI);
				//ccc.setText("身高  "+a+"體重  "+b+"  "+c);
				
				
				h2.setText("");
				w2.setText("");
				
			}
		});

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
