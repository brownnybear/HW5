
package com.rattanaporn.calculator;

        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.util.Log;
        import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.Button;
        import android.widget.TextView;
        import java.util.regex.Pattern;

public class Calculator extends AppCompatActivity {
    private TextView _screen;
    private String display="";
    private String currentOperator="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        _screen=(TextView)findViewById(R.id.textView);
        _screen.setText(display);

    }

    private void updateScreen(){      //For Rendering Output Screen
        _screen.setText(display);

    }

    public void onClickNumber(View v){     //To Take Input no. from view
        Button b=(Button) v;
        display+=b.getText();
        updateScreen();
    }

    public void  onClickOperator(View v){
        Button b=(Button) v;
        display+=b.getText();
        currentOperator=b.getText().toString();
        updateScreen();
    }

    private double operateArithmetic(String a, String b, String op){
        switch (op){
            case "+": return (Double.valueOf(a) + Double.valueOf(b));
            case "-": return (Double.valueOf(a) + Double.valueOf(b));
            case "*": return (Double.valueOf(a) + Double.valueOf(b));
            case "/": try{
                return (Double.valueOf(a) + Double.valueOf(b));
            }catch (Exception e){
                Log.d("Calc",e.getMessage());
            }
            default: return -1;

        }
    }

    private double operateTrigonometric(String a,String op){
        switch (op){
            case "sqt": return (Math.sqrt(Double.valueOf(a)));
            case "sin": return (Math.sin(Double.valueOf(a)));
            case "cos": return (Math.cos(Double.valueOf(a)));
            case "tan": try{
                return (Math.tan(Double.valueOf(a)));
            }catch (Exception e){
                Log.d("Calc",e.getMessage());
            }
            default: return -1;

        }
    }

    public void onClickEaqul(View v){
        String[] operation=display.split(Pattern.quote(currentOperator));
        Double result;
        if(operation.length==1){
            result = operateTrigonometric(operation[0], currentOperator);
            _screen.setText(display+"\n"+String.valueOf(result));
        }
        else if (operation.length<2){
            return;
        }
        else {
            result=operateArithmetic(operation[0],operation[1],currentOperator);
            _screen.setText(display+"\n"+String.valueOf(result));
        }
    }

    public void clear(){
        display="";
        currentOperator="";
    }

    public void onClickClear(View v){
        clear();
        updateScreen();
    }
}
