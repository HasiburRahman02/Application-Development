/* TextView & ScrollView in App Development.

    Date: 28 August,2023
    Author: Hasibur Rahman(13/21|CSE-02)
*/

package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView nameTextView;
    private TextView ageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = (TextView) findViewById(R.id.nameTextViewId);
        ageTextView = (TextView) findViewById(R.id.ageTextViewId);

        nameTextView.setText("Sidratul Muntaha");
        ageTextView.setText("I am not coming in the world");
    }
}