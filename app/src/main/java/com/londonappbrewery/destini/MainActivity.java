package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mStory;
    Button mAnswer1;
    Button mAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStory = findViewById(R.id.storyTextView);
        mAnswer1 = findViewById(R.id.buttonTop);
        mAnswer2 = findViewById(R.id.buttonBottom);


        mAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStory.setText(R.string.T3_Story);
                mAnswer1.setText(R.string.T3_Ans1);
                    mAnswer1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mStory.setText(R.string.T6_End);
                            mAnswer1.setVisibility(View.GONE);
                            mAnswer2.setVisibility(View.GONE);
                        }
                    });

                mAnswer2.setText(R.string.T3_Ans2);
                    mAnswer2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mStory.setText(R.string.T5_End);
                            mAnswer1.setVisibility(View.GONE);
                            mAnswer2.setVisibility(View.GONE);
                        }
                    });
            }
        });

        mAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStory.setText(R.string.T2_Story);
                mAnswer1.setText(R.string.T2_Ans1);
                    mAnswer1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mStory.setText(R.string.T3_Story);
                            mAnswer1.setText(R.string.T3_Ans1);
                                mAnswer1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        mStory.setText(R.string.T6_End);
                                        mAnswer1.setVisibility(View.GONE);
                                        mAnswer2.setVisibility(View.GONE);
                                    }
                                });
                            mAnswer2.setText(R.string.T3_Ans2);
                                mAnswer2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        mStory.setText(R.string.T5_End);
                                        mAnswer1.setVisibility(View.GONE);
                                        mAnswer2.setVisibility(View.GONE);
                                    }
                                });

                        }
                    });

                mAnswer2.setText(R.string.T2_Ans2);
                    mAnswer2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mStory.setText(R.string.T4_End);
                            mAnswer1.setVisibility(View.GONE);
                            mAnswer2.setVisibility(View.GONE);
                        }
                    });

            }
        });

    }
}
