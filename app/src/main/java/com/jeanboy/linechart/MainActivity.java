package com.jeanboy.linechart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv_ruler_y;
    SeekBar sb_ruler_space;

    TextView tv_step_space;
    SeekBar sb_step_space;


    LineChartView lineChartView;

    private int[] dataArr = new int[]{200, 100, 300, -20, 50, -80, 200, 100, 300, 50, 200, 150, 160, 100, 300, 50, 200, 150,
            300, 50, 200, 100, 150, 150};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lineChartView = (LineChartView) findViewById(R.id.line_chart_view);
        sb_ruler_space = (SeekBar) findViewById(R.id.sb_ruler_space);
        tv_ruler_y = (TextView) findViewById(R.id.tv_ruler_y);
        sb_step_space = (SeekBar) findViewById(R.id.sb_step_space);
        tv_step_space = (TextView) findViewById(R.id.tv_step_space);

        List<LineChartView.Data> datas = new ArrayList<>();
        for (int value : dataArr) {
            LineChartView.Data data = new LineChartView.Data(value);
            datas.add(data);
        }
        lineChartView.setData(datas);

        sb_ruler_space.setMax(70);
        sb_ruler_space.setProgress(20);
        if (lineChartView != null) {
            lineChartView.setRulerYSpace(20);
            tv_ruler_y.setText(String.valueOf(20));
        }
        sb_ruler_space.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (lineChartView != null) {
                    lineChartView.setRulerYSpace(progress);
                    tv_ruler_y.setText(String.valueOf(progress));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb_step_space.setMax(70);
        sb_step_space.setProgress(15);
        if (lineChartView != null) {
            lineChartView.setStepSpace(15);
            tv_step_space.setText(String.valueOf(15));
        }
        sb_step_space.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (lineChartView != null) {
                    lineChartView.setStepSpace(progress);
                    tv_step_space.setText(String.valueOf(progress));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private boolean isShowTable = false;

    public void tableToggle(View view) {
        if (lineChartView != null) {
            isShowTable = !isShowTable;
            lineChartView.setShowTable(isShowTable);
        }
    }

    private boolean isBezier = false;

    public void bezierModelToggle(View view) {
        if (lineChartView != null) {
            isBezier = !isBezier;
            lineChartView.setBezierLine(isBezier);
        }
    }

    private boolean isCube = false;

    public void pointModelToggle(View view) {
        if (lineChartView != null) {
            isCube = !isCube;
            lineChartView.setCubePoint(isCube);
        }
    }

    public void doAnimation(View view) {
        if (lineChartView != null) {
            lineChartView.playAnim();
        }
    }
}
