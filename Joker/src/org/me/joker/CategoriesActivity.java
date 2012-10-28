package org.me.joker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class CategoriesActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.category);
        
        
        //Buttony prowadzace do kawalow
        
        //blondynki
        ImageView blondes = (ImageView)findViewById(R.id.oBlondynkach);
        blondes.setOnClickListener(new OnClickListener(){
        	public void onClick(View view){
        		runSecondIntent(3, "O Blondynkach");
        	}
        });
        
        //chuck norris
        ImageView chuckNorris = (ImageView)findViewById(R.id.chuckNorris);
        chuckNorris.setOnClickListener(new OnClickListener(){
        	public void onClick(View view){
        		runSecondIntent(8, "Chuck Norris");
        	}
        });
        
	}
	

    //Funkcja, kt�ra tworzy nowy intent wraz z przekazywaniem informacji o kategorii. 
    
    private void runSecondIntent(int catId, String catName){
    	Intent intent = new Intent(getApplicationContext(), SecondIntent.class);
		intent.putExtra("ID", (int)catId);
		intent.putExtra("CATEGORY", catName);
    	startActivity(intent);
    }
}