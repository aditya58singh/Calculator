package androidhire.com.calculator;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int choice = 0;
    private double a = 0;
    private double b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt1);
        TextView textView2 = findViewById(R.id.formula);

        //Copying the value on long press
        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                copyToClipboard();
                return true;
            }
        });

    }

    //Method for Copy To Clipboard
    private void copyToClipboard() {
        String value = null;
        if (true) {
            value = textView.getText().toString();
        }
        if (TextUtils.isEmpty(value)) {
            Toast.makeText(getApplicationContext(), "No Value", Toast.LENGTH_SHORT).show();

        } else {

            final ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
            final ClipData clip = ClipData.newPlainText(getResources().getString(R.string.app_name), value);
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), "Value Copied", Toast.LENGTH_LONG).show();
        }
    }

    public void show1(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText("1");
        } else {
            textView.setText(textView.getText().toString() + "1");
        }
    }

    public void show2(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText("2");
        } else {
            textView.setText(textView.getText().toString() + "2");
        }
    }

    public void show3(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText("3");
        } else {
            textView.setText(textView.getText().toString() + "3");
        }
    }

    public void show4(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText("4");
        } else {
            textView.setText(textView.getText().toString() + "4");
        }
    }

    public void show5(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText("5");
        } else {
            textView.setText(textView.getText().toString() + "5");
        }
    }

    public void show6(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText("6");
        } else {
            textView.setText(textView.getText().toString() + "6");
        }
    }

    public void show7(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText("7");
        } else {
            textView.setText(textView.getText().toString() + "7");
        }
    }

    public void show8(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText("8");
        } else {
            textView.setText(textView.getText().toString() + "8");
        }
    }

    public void show9(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText("9");
        } else {
            textView.setText(textView.getText().toString() + "9");
        }
    }

    public void show0(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText("0");
        } else {
            textView.setText(textView.getText().toString() + "0");
        }
    }

    public void reset(View view) {
        a = 0;
        b = 0;
        choice = 0;
        textView.setText("");
    }

    public void showdot(View view) {
        if (textView.getText().toString().equals("")) {
            textView.setText(".");
        } else {
            textView.setText(textView.getText().toString() + ".");
        }
    }

    public void choice1(View view) {
        if (!textView.getText().toString().equals("")) {
            a = Double.parseDouble(textView.getText().toString());
            choice = 1;
            textView.setText("");
        }
    }

    public void choice2(View view) {
        if (!textView.getText().toString().equals("")) {
            a = Double.parseDouble(textView.getText().toString());
            choice = 2;
            textView.setText("");
        }
    }

    public void choice3(View view) {
        if (!textView.getText().toString().equals("")) {
            a = Double.parseDouble(textView.getText().toString());
            choice = 3;
            textView.setText("");
        }
    }

    public void choice4(View view) {
        if (!textView.getText().toString().equals("")) {
            a = Double.parseDouble(textView.getText().toString());
            choice = 4;
            textView.setText("");
        }
    }

    public void choice5(View view) {
        if (!textView.getText().toString().equals("")) {
            a = Double.parseDouble(textView.getText().toString());
            choice = 5;
            textView.setText("");
        }
    }

    public void choice6(View view) {
        if (!textView.getText().toString().equals("")) {
            a = Double.parseDouble(textView.getText().toString());
            choice = 6;
            textView.setText("");
        }
    }

    public void choice7(View view) {
        textView.setText("");
        choice = 7;
    }


    public void result(View view) {
        if (!textView.getText().toString().equals("")) {
            b = Double.parseDouble(textView.getText().toString());

            if (choice == 1) {
                double c = a + b;
                textView.setText(c + "");
            } else if (choice == 2) {
                double c = a - b;
                textView.setText(c + "");
            } else if (choice == 3) {
                double c = a * b;
                textView.setText(c + "");
            } else if (choice == 4) {
                double c = a / b;
                textView.setText(c + "");
            } else if (choice == 5) {
                double c = a % b;
                textView.setText(c + "");
            } else if (choice == 6) {
                double c = Math.pow(a, b);
                textView.setText(c + "");
            } else if (choice == 7) {
                double c = Math.sqrt(b);
                textView.setText(c + "");
            }
        }
    }
}

