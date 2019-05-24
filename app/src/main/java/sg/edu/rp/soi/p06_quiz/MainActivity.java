package sg.edu.rp.soi.p06_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText etNum1;
    EditText etNum2;
    TextView tvOperation;
    Button btnReset;
//check in by 18033405

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        tvOperation=findViewById(R.id.tvOperation);
        btnReset=findViewById(R.id.btnReset);

        registerForContextMenu(etNum1);
        registerForContextMenu(etNum2);
        registerForContextMenu(tvOperation);
        registerForContextMenu(btnReset);


        public void onCreateContextMenu(ContextMenu menu,View v,)
        getMenuInflater().inflate(R.menu.menu,menu);
        super.onCreateContextMenu(menu,v,menuInfo);
        if(v.getId()=R.id-1+2=Operation){
            mode=1;
        }else if(v.getId==buttonReset).==1;







    }


}
