package com.example.android.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int flag=0;
    int cnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1  = findViewById(R.id.button1);
        Button btn2  = findViewById(R.id.button2);
        Button btn3  = findViewById(R.id.button3);
        Button btn4  = findViewById(R.id.button4);
        Button btn5  = findViewById(R.id.button5);
        Button btn6  = findViewById(R.id.button6);
        Button btn7  = findViewById(R.id.button7);
        Button btn8  = findViewById(R.id.button8);
        Button btn9  = findViewById(R.id.button9);
        Button restart = findViewById(R.id.restart);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        restart.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        TextView result = (TextView) findViewById(R.id.result);
        Button btn1=findViewById(R.id.button1);
        Button btn2=findViewById(R.id.button2);
        Button btn3=findViewById(R.id.button3);
        Button btn4=findViewById(R.id.button4);
        Button btn5=findViewById(R.id.button5);
        Button btn6=findViewById(R.id.button6);
        Button btn7=findViewById(R.id.button7);
        Button btn8=findViewById(R.id.button8);
        Button btn9=findViewById(R.id.button9);
       if(view.getId()==R.id.restart){
            cnt=0;
            flag=0;
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            result.setText("");
            return ;
        }
        else if (flag == 3) {
            cnt=0;
            Toast.makeText(this," Game is Over " ,Toast.LENGTH_SHORT).show();
            return ;
        }
        else if(view.getId()==R.id.button1){
            if(btn1.getText()=="X"||btn1.getText()=="O"){
                Toast.makeText(this," You can't Select Selected Buttton ",Toast.LENGTH_SHORT).show();
                return ;
            }
            else if(flag==1){
                btn1.setText("O");
                flag=0;
            }
            else {
                btn1.setText("X");
                flag=1;
            }
        }
        else if(view.getId()==R.id.button2){
            if(btn2.getText()=="X"||btn2.getText()=="O"){
                Toast.makeText(this," You can't Select Selected Buttton ",Toast.LENGTH_SHORT).show();
                return ;
            }
            else if(flag==1){
                btn2.setText("O");
                flag=0;
            }
            else {
                btn2.setText("X");
                flag=1;
            }
        }
        else if(view.getId()==R.id.button3){
            if(btn3.getText()=="X"||btn3.getText()=="O"){
                Toast.makeText(this," You can't Select Selected Buttton ",Toast.LENGTH_SHORT).show();
                return ;
            }
            else if(flag==1){
                btn3.setText("O");
                flag=0;
            }
            else {
                btn3.setText("X");
                flag=1;
            }
        }
        else if(view.getId()==R.id.button4){
            if(btn4.getText()=="X"||btn4.getText()=="O"){
                Toast.makeText(this," You can't Select Selected Buttton ",Toast.LENGTH_SHORT).show();
                return ;
            }
            else if(flag==1){
                btn4.setText("O");
                flag=0;
            }
            else {
                btn4.setText("X");
                flag=1;
            }
        }
        else if(view.getId()==R.id.button5){
            if(btn5.getText()=="X"||btn5.getText()=="O"){
                Toast.makeText(this," You can't Select Selected Buttton ",Toast.LENGTH_SHORT).show();
                return ;
            }
            else if(flag==1){
                btn5.setText("O");
                flag=0;
            }
            else {
                btn5.setText("X");
                flag=1;
            }
        }
        else if(view.getId()==R.id.button6){
            if(btn6.getText()=="X"||btn6.getText()=="O"){
                Toast.makeText(this," You can't Select Selected Buttton ",Toast.LENGTH_SHORT).show();
                return ;
            }
            else if(flag==1){
                btn6.setText("O");
                flag=0;
            }
            else {
                btn6.setText("X");
                flag=1;
            }
        }
        else if(view.getId()==R.id.button7) {
            if(btn7.getText()=="X"||btn7.getText()=="O"){
                Toast.makeText(this," You can't Select Selected Buttton ",Toast.LENGTH_SHORT).show();
                return ;
            }
            else if(flag==1){
                btn7.setText("O");
                flag=0;
            }
            else {
                btn7.setText("X");
                flag=1;
            }
        }
        else if(view.getId()==R.id.button8){
            if(btn8.getText()=="X"||btn8.getText()=="O"){
                Toast.makeText(this," You can't Select Selected Buttton ",Toast.LENGTH_SHORT).show();
                return ;
            }
            else if(flag==1){
                btn8.setText("O");
                flag=0;
            }
            else {
                btn8.setText("X");
                flag=1;
            }
        }
        else if(view.getId()==R.id.button9){
            if(btn9.getText()=="X"||btn9.getText()=="O"){
                Toast.makeText(this," You can't Select Selected Buttton ",Toast.LENGTH_SHORT).show();
                return ;
            }
            else if(flag==1){
                btn9.setText("O");
                flag=0;
            }
            else {
                btn9.setText("X");
                flag=1;
            }
        }
        cnt++;
        if((btn1.getText()=="X"&&btn2.getText()=="X"&&btn3.getText()=="X")||(btn4.getText()=="X"&&btn5.getText()=="X"&&btn6.getText()=="X")||
                (btn7.getText()=="X"&&btn8.getText()=="X"&&btn9.getText()=="X")
            ||(btn1.getText()=="X"&&btn4.getText()=="X"&&btn7.getText()=="X")||(btn2.getText()=="X"&&btn5.getText()=="X"&&btn8.getText()=="X")||
                (btn3.getText()=="X"&&btn6.getText()=="X"&&btn9.getText()=="X")||(btn1.getText()=="X"&&btn5.getText()=="X"&&btn9.getText()=="X")
            ||(btn3.getText()=="X"&&btn5.getText()=="X"&&btn7.getText()=="X")){
            result.setText("PLAYER 1 WON ");
            flag=3;
        }

        else if((btn1.getText()=="O"&&btn2.getText()=="O"&&btn3.getText()=="O")||(btn4.getText()=="O"&&btn5.getText()=="O"&&btn6.getText()=="O")||
                (btn7.getText()=="O"&&btn8.getText()=="O"&&btn9.getText()=="O")
                ||(btn1.getText()=="O"&&btn4.getText()=="O"&&btn7.getText()=="O")||(btn2.getText()=="O"&&btn5.getText()=="O"&&btn8.getText()=="O")||
                (btn3.getText()=="O"&&btn6.getText()=="O"&&btn9.getText()=="O")||(btn1.getText()=="O"&&btn5.getText()=="O"&&btn9.getText()=="O")
                ||(btn3.getText()=="O"&&btn5.getText()=="O"&&btn7.getText()=="O")){
            result.setText("PLAYER 2 WON ");
            flag=3;
        }
        else if(cnt==9){
            result.setText("DRAW");
        }

    }
}
