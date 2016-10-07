package zhangxing.cute.com.fragmenttabhosttest.ui;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

import zhangxing.cute.com.fragmenttabhosttest.R;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initView();
    }

    FragmentTabHost tabHost;
    private void initView(){
        tabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this,getSupportFragmentManager(),R.id.content);

        initTabs();
    }

    private void initTabs(){
        MainTab[] tabs = MainTab.values();
        final int size = tabs.length;
        for (int i=0;i<size ;i++){
            MainTab mainTab=tabs[i];
            TabHost.TabSpec tab=tabHost.newTabSpec(getString(mainTab.getResName()));
            View indication= LayoutInflater.from(this).inflate(R.layout.tab_indication,null);
            TextView textView= (TextView) indication.findViewById(R.id.tab_title);
            textView.setText(mainTab.getResName());
            Drawable drawable= ContextCompat.getDrawable(this,mainTab.getResIcon());
            textView.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
            tab.setIndicator(indication);
            tabHost.addTab(tab,mainTab.getClz(),null);

            tabHost.getTabWidget().setDividerDrawable(R.drawable.example1);
            if(Build.VERSION.SDK_INT >= 11){
                tabHost.getTabWidget().setShowDividers(TabWidget.SHOW_DIVIDER_MIDDLE);}
            tabHost.getTabWidget().setDividerDrawable(null);//去掉分割线
        }
    }
}
