package com.app.ray.testingpopmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

import static android.widget.PopupMenu.OnMenuItemClickListener;


public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) super.findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PopupMenu popupmenu = new PopupMenu(MainActivity.this, text);
//                popupmenu.inflate(R.menu.menu_demo1); // API 14以上才支援此方法.
                popupmenu.getMenuInflater().inflate(R.menu.menu_demo1, popupmenu.getMenu());
                popupmenu.setOnMenuItemClickListener(new OnMenuItemClickListener() { // 設定popupmenu項目點擊傾聽者.

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {  // 項目被點擊後變更文字顏色.
                        switch (item.getItemId()) { // 取得被點擊的項目id.
                            case R.id.red: // 紅色項目被點擊,文字設定為紅色.
                                text.setTextColor(Color.RED);
                                break;
                            case R.id.green: // 綠色項目被點擊,文字設定為綠色.
                                text.setTextColor(Color.GREEN);
                                break;
                            case R.id.blue: // 藍色項目被點擊,文字設定為藍色.
                                text.setTextColor(Color.BLUE);
                                break;
                            default:
                                break;
                        }
                        return true;
                    }

                });
                popupmenu.show();
            }
        });
//        text.setOnLongClickListener(new OnLongClickListener() { // 設定text長按傾聽者.
//
//            @Override
//            public boolean onLongClick(View v) { // 長按時建立彈出選單並顯示.
//                final PopupMenu popupmenu = new PopupMenu(MainActivity.this, text);
////                popupmenu.inflate(R.menu.menu_demo1); // API 14以上才支援此方法.
//                popupmenu.getMenuInflater().inflate(R.menu.menu_demo1, popupmenu.getMenu());
//                popupmenu.setOnMenuItemClickListener(new OnMenuItemClickListener() { // 設定popupmenu項目點擊傾聽者.
//
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item) {  // 項目被點擊後變更文字顏色.
//                        switch (item.getItemId()) { // 取得被點擊的項目id.
//                            case R.id.red: // 紅色項目被點擊,文字設定為紅色.
//                                text.setTextColor(Color.RED);
//                                break;
//                            case R.id.green: // 綠色項目被點擊,文字設定為綠色.
//                                text.setTextColor(Color.GREEN);
//                                break;
//                            case R.id.blue: // 藍色項目被點擊,文字設定為藍色.
//                                text.setTextColor(Color.BLUE);
//                                break;
//                            default:
//                                break;
//                        }
//                        return true;
//                    }
//
//                });
//                popupmenu.show();
//                return true;
//            }
//        });
    }

}