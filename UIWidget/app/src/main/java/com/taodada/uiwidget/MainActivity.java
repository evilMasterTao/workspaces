package com.taodada.uiwidget;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.edit_text);
        button.setOnClickListener(this);
        imageView = (ImageView)findViewById(R.id.image_view);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){//获取视图id
            case R.id.button :
                /*String inputText = editText.getText().toString();
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show();*/
                /*if(imageView.getDrawable().getCurrent().getConstantState().equals(getResources().getDrawable(R.drawable.img_1).getConstantState())){
                    imageView.setImageResource(R.drawable.img_2);
                }else{
                    imageView.setImageResource(R.drawable.img_1);
                }*/
                /*if(progressBar.getVisibility() == View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }else{
                    progressBar.setVisibility(View.GONE);
                }*/
                /*int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);*/
                AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();

                break;
            default:
                break;
        }
    }
}
