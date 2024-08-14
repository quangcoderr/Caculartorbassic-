package com.example.music;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Stack;


public class MainActivity extends AppCompatActivity {
    EditText editTextkq, editTextso;
    Button button1,buttonxoa, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonp, buttonbang, buttoncong, buttontru, buttonnhan,buttonxoahet,buttoncan,buttonmu, buttonchia;
    private Stack<Double> numbers = new Stack<>();
    private Stack<Character> operations = new Stack<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Đặt layout cho Activity
        setContentView(R.layout.activity_main);

        // Khởi tạo các view sau khi đặt layout
        editTextkq = findViewById(R.id.edtkq);
        editTextso = findViewById(R.id.edtso);
        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttonbang = findViewById(R.id.btnbang);
        buttonp = findViewById(R.id.btnphay);
        buttoncong = findViewById(R.id.btncong);
        buttonnhan = findViewById(R.id.btnnhan);
        buttonchia = findViewById(R.id.btnchia);
        buttontru = findViewById(R.id.btntru);
        buttonxoa =findViewById(R.id.btnxoa);
        buttonxoahet=findViewById(R.id.btnxoahet);
        buttoncan=findViewById(R.id.btncan);
        buttonmu=findViewById(R.id.btnmu);

        int a, b;


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("9");
            }
        });
        buttoncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("+");
            }
        });
        buttontru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("-");
            }
        });
        buttonnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("*");
            }
        });
        buttonchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append("/");
            }
        });
        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Đặt giá trị "0" vào EditText
                editTextso.append(".");
            }
        });
        buttonxoahet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Xóa nội dung của EditText
                if (editTextso.getText().length() > 0) {
                    editTextso.getText().delete(editTextso.getText().length() - editTextso.getText().length(), editTextso.getText().length());
                }
                // Xóa nội dung của kết quả
                editTextkq.setText("");

                // Làm sạch các ngăn xếp để phép tính được reset lại
                numbers.clear();
                operations.clear();
            }
        });
        buttonxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextso.getText().length() > 0) {
                    // Xóa ký tự cuối cùng trong EditText
                    editTextso.getText().delete(editTextso.getText().length() - 1, editTextso.getText().length());
                }
            }
        });
        buttonbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String input = editTextso.getText().toString();
                    double result = evaluateExpression(input);
                    editTextkq.setText(String.valueOf(result));
                } catch (Exception e) {
                    editTextkq.setText("Error");
                }
            }
        });
        buttonmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextso.append("^");
            }
        });
        buttoncan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextso.append("√");
            }
        });

    }

    private double evaluateExpression(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                StringBuilder buffer = new StringBuilder();
                while ((i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.'))) {
                    buffer.append(expression.charAt(i++));
                }
                i--;
                numbers.push(Double.parseDouble(buffer.toString()));
            } else if (c == '(') {
                operations.push(c);
            } else if (c == ')') {
                while (operations.peek() != '(') {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.pop();
            } else if (c == '^') {
                while (!operations.empty() && precedence(c) <= precedence(operations.peek())) {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(c);
            } else if (c == '√') {
                double operand = numbers.pop();
                numbers.push(Math.sqrt(operand));
            } else if (isOperator(c)) {
                while (!operations.empty() && precedence(c) <= precedence(operations.peek())) {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(c);
            }
        }

        while (!operations.empty()) {
            numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
        }
        return numbers.pop();
    }
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/'|| c == '^'|| c == '√';
    }
    private int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    private double applyOperation(char operation, double b, double a) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
            case '^':
                return Math.pow(a, b);
            case '√':
                return Math.sqrt(a);
        }
        return 0;
    }}

