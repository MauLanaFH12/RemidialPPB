   package xir4n20.remidiuts.telkomschid.remidial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

   public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.Navbar1);

        Button btn2 = (Button)findViewById(R.id.Navbar2);

        Button btn3 = (Button)findViewById(R.id.Navbar3);

        Button btn4 = (Button)findViewById(R.id.Navbar4);

    btn1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View arg0) {
            Intent pindah = new Intent(MainActivity.this,Navbar1.class);
            startActivity(pindah);

        }
    });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent pindah = new Intent(MainActivity.this,Navbar2.class);
                startActivity(pindah);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent pindah = new Intent(MainActivity.this,Navbar3.class);
                startActivity(pindah);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent pindah = new Intent(MainActivity.this,Navbar4.class);
                startActivity(pindah);

            }
        });
    }

}
