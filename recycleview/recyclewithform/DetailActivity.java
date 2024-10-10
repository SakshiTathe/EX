package com.example.recyclewithform;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {
    private TextView titleText, descriptionText;
    private EditText userInputField;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get the data from the Intent
        String itemTitle = getIntent().getStringExtra("itemTitle");
        String itemDescription = getIntent().getStringExtra("itemDescription");

        // Initialize views
        titleText = findViewById(R.id.detail_title);
        descriptionText = findViewById(R.id.detail_description);
        userInputField = findViewById(R.id.user_input);
        submitButton = findViewById(R.id.submit_button);

        // Set the received data
        titleText.setText(itemTitle);
        descriptionText.setText(itemDescription);

        // Set the submit button's click listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = userInputField.getText().toString();
                if (!userInput.isEmpty()) {
                    // Process the user input (e.g., save it or send it to a server)
                    Toast.makeText(DetailActivity.this, "Form submitted: " + userInput, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(DetailActivity.this, "Please fill in the form", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
