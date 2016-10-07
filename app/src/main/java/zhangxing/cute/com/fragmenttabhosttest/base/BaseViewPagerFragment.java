package zhangxing.cute.com.fragmenttabhosttest.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zhangxing.cute.com.fragmenttabhosttest.R;
import zhangxing.cute.com.fragmenttabhosttest.adapter.ViewPagerFragmentAdapter;

/**
 * Created by zhangxing on 2016/10/7.
 */

public abstract class BaseViewPagerFragment extends BaseFragment{
    protected TabLayout mTabLayout;
    protected ViewPager mViewPager;
    protected ViewPagerFragmentAdapter mTabsAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.base_viewpage_fragment,null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        mTabLayout= (TabLayout) view.findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mTabsAdapter=new ViewPagerFragmentAdapter(getChildFragmentManager(),mTabLayout,mViewPager);

        // setTabLayoutFillAndFixed();
        //setTabLayoutScrollableAndFill();
        setTabLayout(mTabLayout);
        setScreenPageLimit();
        onSetupTabAdater(mTabsAdapter);
    }

    /**
     *  设置这两个属性使tabLayout不能滑动，并且宽度为屏幕最宽，每个tabview宽度一样
     */
    /*public void setTabLayoutFillAndFixed(){
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
    }*/



    /**
     *  设置这两个属性使tabLayout能滑动，当tabLayout宽度没有屏幕宽时，在最左边显示
     */
   /* public void setTabLayoutScrollableAndFill(){
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }*/

    public void setTabLayout(TabLayout tabLayout){

    }

    public void setScreenPageLimit(){
    }

    public abstract void onSetupTabAdater(ViewPagerFragmentAdapter adapter);
}


