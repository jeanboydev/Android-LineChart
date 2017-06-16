# Android-LineChart
## 介绍
一个简单的折线，贝塞尔曲线图表控件，高度可扩展，支持动态显示。

## 效果图

![演示][1] ![演示][2] ![演示][3]

![演示][4] ![演示][5]

## 使用

1. 设置布局
```XML
<HorizontalScrollView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:overScrollMode="never"
    android:scrollbars="none">

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <com.jeanboy.linechart.LineChartView
            android:id="@+id/line_chart_view"
            android:layout_width="wrap_content"
            android:layout_height="300dp"/>
    </LinearLayout>

</HorizontalScrollView>
```

2. 添加数据
```Java
lineChartView.setData(datas);
```

3. 修改Y轴标尺间隔
```Java
lineChartView.setRulerYSpace(value);
```

4. 修改X轴标尺间隔（锚点间距）
```Java
lineChartView.setStepSpace(value);
```

5. 设置是否显示表格
```Java
lineChartView.setShowTable(isShowTable);
```

6. 设置是否为贝塞尔曲线
```Java
lineChartView.setBezierLine(isBezier);
```

7. 设置锚点是否为方形
```Java
lineChartView.setCubePoint(isCube);
```

8. 播放动画
```Java
lineChartView.playAnim();
```

## 关于我

* Mail: jeanboy@foxmail.com

## License

    Copyright 2017 jeanboy

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]:https://github.com/jeanboydev/Android-LineChart/blob/master/resources/anim.gif
[2]:https://github.com/jeanboydev/Android-LineChart/blob/master/resources/change.gif
[3]:https://github.com/jeanboydev/Android-LineChart/blob/master/resources/operate.gif
[4]:https://github.com/jeanboydev/Android-LineChart/blob/master/resources/Screenshot_20170613-183802.jpg
[5]:https://github.com/jeanboydev/Android-LineChart/blob/master/resources/Screenshot_20170613-183803.jpg