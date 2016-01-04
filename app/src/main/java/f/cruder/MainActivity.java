package f.cruder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info =(TextView)findViewById(R.id.info);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       switch(item.getItemId()){
           case R.id.add:

               info.setText("Se presionó Añadir");
               return true;
           case R.id.search:
               info.setText("Se presionó Buscar");
               return true;
           case R.id.edit:
               info.setText("Se presionó Editar");
               return true;
           case R.id.delete:
               info.setText("Se presionó Borrar");
               return true;
           case R.id.action_settings:
               info.setText("Se presionó Ajustes");
               return true;
           default:
               return super.onOptionsItemSelected(item);
       }
    }



}
