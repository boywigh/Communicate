package boywigh.communicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnmail, btnmsg, btncall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnmail =(Button) findViewById(R.id.btnmail);

        btnmail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        ActMail.class);
                startActivity(myIntent);
            }
        });

        btnmsg =(Button) findViewById(R.id.btnmsg);

        btnmsg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        ActMessage.class);
                startActivity(myIntent);
            }
        });

        btncall =(Button) findViewById(R.id.btncall);

        btncall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        ActCall.class);
                startActivity(myIntent);
            }
        });
    }
}
