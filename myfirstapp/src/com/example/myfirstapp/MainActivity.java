package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, dec, eq ;
	float ans = 0, bans = 0; 
	int op=0;
	TextView dis;  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        dec = (Button) findViewById(R.id.bDec);
        
       Button bAdd = (Button) findViewById(R.id.bAdd);
       Button bSub = (Button) findViewById(R.id.bSub);
       Button bMul = (Button) findViewById(R.id.bMul);
       Button bDiv = (Button) findViewById(R.id.bDiv);
        
        eq = (Button) findViewById(R.id.bEq);
        dis = (TextView) findViewById(R.id.tvResult);
        
        dis.setBackgroundColor(Color.WHITE);
        

        b1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (op == 0) {
					ans = ans * 10 + 1;
					dis.setText("="+ ans);
				}
				else {
					bans = bans * 10 + 1;
					dis.setText("="+ bans);
				}
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (op == 0) {
					ans = ans * 10 + 2;
					dis.setText("="+ ans);
				}
				else {
					bans = bans * 10 + 2;
					dis.setText("="+ bans);
				}			}
		});
        b3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (op == 0) {
					ans = ans * 10 + 3;
					dis.setText("="+ ans);
				}
				else {
					bans = bans * 10 + 3;
					dis.setText("="+ bans);
				}			}
		});
        
        b4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (op == 0) {
					ans = ans * 10 + 4;
					dis.setText("="+ ans);
				}
				else {
					bans = bans * 10 + 4;
					dis.setText("="+ bans);
				}
				
			}
		});

        b5.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (op == 0) {
			ans = ans * 10 + 5;
			dis.setText("="+ ans);
		}
		else {
			bans = bans * 10 + 5;
			dis.setText("="+ bans);
		}		
	}
});

        b6.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (op == 0) {
			ans = ans * 10 + 6;
			dis.setText("="+ ans);
		}
		else {
			bans = bans * 10 + 6;
			dis.setText("="+ bans);
		}
		
	}
});

        b7.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (op == 0) {
			ans = ans * 10 + 7;
			dis.setText("="+ ans);
		}
		else {
			bans = bans * 10 + 7;
			dis.setText("="+ bans);
		}
		
	}
});
        b8.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (op == 0) {
			ans = ans * 10 + 8;
			dis.setText("="+ ans);
		}
		else {
			bans = bans * 10 + 8;
			dis.setText("="+ bans);
		}
		
	}
});
        b9.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (op == 0) {
			ans = ans * 10 + 9;
			dis.setText("="+ ans);
		}
		else {
			bans = bans * 10 + 9;
			dis.setText("="+ bans);
		}
		
	}
});
        b0.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (op == 0) {
			ans = ans * 10 + 0;
			dis.setText("="+ ans);
		}
		else {
			bans = bans * 10 + 0;
			dis.setText("="+ bans);
		}		
	}
});
        eq.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if (op == 0) ans = ans;
		else if (op == 1) ans = ans + bans;
		else if (op == 2) ans = ans - bans;
		else if (op == 3) ans = ans * bans;
		else if (op == 4) ans = ans / bans;
		dis.setText("=" + ans);
		op =0;
		bans = 0;
		
	}
});
        
        dec.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
					//ans =(float) (ans + 0.0);
					//bans = (float)(bans + 0.0);
					//dis.setText("=" + ans);
				ans = 0;
				bans = 0;
				op = 0;
				dis.setText("=0.0");
			}
		});
        
        bAdd.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (op == 0) op = 1;
				else {
					if (op == 1) ans = ans + bans;
					else if (op == 2) ans = ans - bans;
					else if (op == 3) ans = ans * bans;
					else if (op == 4) ans = ans / bans;
					dis.setText("=" + ans);
				}
				op = 1;
				bans = 0;
			}
		});
        
        bSub.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (op == 0) op = 2;
				else {
					if (op == 1) ans = ans + bans;
					else if (op == 2) ans = ans - bans;
					else if (op == 3) ans = ans * bans;
					else if (op == 4) ans = ans / bans;
					dis.setText("=" + ans);
				}
				op = 2;
				bans = 0;
			}
		});
        
        bMul.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (op == 0) op = 3;
				else {
					if (op == 1) ans = ans + bans;
					else if (op == 2) ans = ans - bans;
					else if (op == 3) ans = ans * bans;
					else if (op == 4) ans = ans / bans;
					dis.setText("=" + ans);
				}
				op = 3;
				bans = 0;
			}
		});
        
        bDiv.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (op == 0) op = 4;
				else {
					if (op == 1) ans = ans + bans;
					else if (op == 2) ans = ans - bans;
					else if (op == 3) ans = ans * bans;
					else if (op == 4) ans = ans / bans;
					dis.setText("=" + ans);
				}
				op = 4;
				bans = 0;
			}
		});
    }
 
    
   
}
