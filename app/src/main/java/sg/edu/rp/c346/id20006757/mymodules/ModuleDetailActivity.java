package sg.edu.rp.c346.id20006757.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    TextView tvAnswer2;
    Button Redirect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer = findViewById(R.id.tvDisplay);
        tvAnswer2=findViewById(R.id.tvDisplay2);
        Redirect=findViewById(R.id.redirectbutton);



        Intent i =getIntent();

        String ModuleSelected = i.getStringExtra("Module");




        String msg ="";
        String msg1="";
        if (ModuleSelected.equals("C346")) {

            msg1 =  "\nModule Code:C346" +
                    "\nModule Name:Mobile App Development"+
                    "\nAcademic Year:2022" +
                    "\nSemester: 1" +
                    "\nModule Credit:4"+
                    "\nVenue:E62E";
            msg = "Difficulty: Hard";

        }
        else if(ModuleSelected.equals("C382")) {
            msg1 =  "\nModule Code:C382" +
                    "\nModule Name:IT Service Delivery"+
                    "\nAcademic Year:2022" +
                    "\nSemester: 1" +
                    "\nModule Credit:4"+
                    "\nVenue:E62B";

            msg = "Difficulty: Hard";



        }
        else if (ModuleSelected.equals("C322")){
            msg1 =  "\nModule Code:C322" +
                    "\nModule Name:Data Centre & Cloud Computing"+
                    "\nAcademic Year:2022" +
                    "\nSemester: 1" +
                    "\nModule Credit:4"+
                    "\nVenue:E61C";

            msg = "Difficulty: Hard";

        }
        tvAnswer.setText(msg1);
        tvAnswer2.setText(msg);

        Redirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ModuleDetailActivity.this, MainActivity.class);

                startActivity(intent);

            }
        });

    }



    }
