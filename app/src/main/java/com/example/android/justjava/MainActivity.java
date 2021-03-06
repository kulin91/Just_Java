package com.example.android.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int quantity=2;
    String name="Alexandr Kulinkovich";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button.
     */

    public void increment(View view) {
        quantity=quantity+1;
        display(quantity);
    }

    /**
     * This method is called when the minus button.
     */

    public void decrement(View view) {
        quantity=quantity-1;
        display(quantity);
    }

    public void submitOrder(View view) {
        String message =
                "Name:" + name + "\n" + "Total: $"+ (quantity * 5)
                +"\n" +"Quantity:" + quantity + "\n" + "Thank you!";
        displayMessage(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}