package essay.freewriters.edubay;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        Button buttonEmail = (Button)findViewById(R.id.buttonEmail);

        String urlString="https://edgrmtracking.com/?rid=b7b33ed3d3e28eed";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setPackage("com.android.chrome");
        try { startActivity(intent); }
        catch (ActivityNotFoundException ex) { // Chrome browser presumably not installed so allow user to choose instead
            intent.setPackage(null);
            startActivity(intent); }



        buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlString="https://edgrmtracking.com/?rid=b7b33ed3d3e28eed";
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(urlString));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.android.chrome");
                try { startActivity(intent); }
                catch (ActivityNotFoundException ex) { // Chrome browser presumably not installed so allow user to choose instead
                    intent.setPackage(null);
                    startActivity(intent); }
            }
        });

    }
}