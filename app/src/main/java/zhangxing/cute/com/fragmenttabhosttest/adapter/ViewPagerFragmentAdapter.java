package zhangxing.cute.com.fragmenttabhosttest.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

/**
 * Created by zhangxing on 2016/10/7.
 */

public class ViewPagerFragmentAdapter extends FragmentStatePagerAdapter {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Context context;
    private ArrayList<ViewPagerInfo> mTabs=new ArrayList<ViewPagerInfo>();

    public ViewPagerFragmentAdapter(FragmentManager fm, TabLayout tabLayout, final ViewPager viewPager) {
        super(fm);
        this.tabLayout=tabLayout;
        this.viewPager=viewPager;
        context=viewPager.getContext();

        viewPager.setAdapter(this);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager) {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //设置点击tab时不用使用动画效果
                viewPager.setCurrentItem(tab.getPosition(),true);
            }
        });


    }

    public void addTab(String title, String tag, Class<?> clss, Bundle args){
        ViewPagerInfo info=new ViewPagerInfo(title,tag,clss,args);
        addFragment(info);
    }

    private void addFragment(ViewPagerInfo info){
        if (info==null){
            return;
        }
        //View v= LayoutInflater.from(context).inflate(R.layout.base_viewpage_fragment_tab_item,null);
        //TextView title= (TextView) v.findViewById(R.id.tab_title);
        //title.setText(info.title);
        mTabs.add(info);
        tabLayout.addTab(tabLayout.newTab().setText(info.title));
        notifyDataSetChanged();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(mTabs.size()==0)
            return super.getPageTitle(position);

        return mTabs.get(position).title;
    }

    @Override
    public Fragment getItem(int position) {
        ViewPagerInfo info=mTabs.get(position);
        return Fragment.instantiate(context,info.clss.getName(),info.args);
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }
}
