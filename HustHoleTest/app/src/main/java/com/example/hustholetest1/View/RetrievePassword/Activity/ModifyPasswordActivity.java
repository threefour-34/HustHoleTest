package com.example.hustholetest1.View.RetrievePassword.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hustholetest1.Model.EditTextReaction;
import com.example.hustholetest1.R;
import com.example.hustholetest1.View.RegisterAndLogin.Activity.RegisterActivity;
import com.githang.statusbar.StatusBarCompat;

import java.util.UUID;

public class ModifyPasswordActivity extends AppCompatActivity {
    private EditText editText1;
    private TextView textView1;
    private Button button1;
    private ImageView imageView,back;
    private boolean flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.retrievepassword_modify);
        StatusBarCompat.setStatusBarColor(this,getResources().getColor(R.color.GrayScale_100) , true);
        editText1=(EditText)findViewById(R.id.EditText);
        editText1.setTransformationMethod(new PasswordTransformationMethod());
        button1=(Button)findViewById(R.id.button4);
        textView1=(TextView)findViewById(R.id.textView14);
        imageView=(ImageView)findViewById(R.id.imageView);
        back= (ImageView) findViewById(R.id.backView);
        textView1.setVisibility(View.INVISIBLE);
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        SpannableString string1 = new SpannableString(this.getResources().getString(R.string.retrieve_password_modify_2));
        EditTextReaction.EditTextSize(editText1,string1,14);
        EditTextReaction.ButtonReaction(editText1,button1);
    }
    public void onClick(View v){
        Intent intent;
        switch (v.getId()) {
            case R.id.imageView://??????/????????????
                if(flag){
                    imageView.setImageResource(R.drawable.checkbox_false);
                    editText1.setTransformationMethod(new PasswordTransformationMethod());
                }else{
                    imageView.setImageResource(R.drawable.checkbox_true);
                    editText1.setTransformationMethod(null);
                }
                flag = !flag;
                break;
            case R.id.button4://???????????????????????????????????????????????????????????????????????????
                if(true) {
                    intent = new Intent(ModifyPasswordActivity.this, RegisterActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    //????????????????????????
                    startActivity(intent);
                } else{
                   //??????????????????
                }
                break;
            case R.id.backView://?????????
                finish();
                break;
            default:
                break;
        }
    }

}
