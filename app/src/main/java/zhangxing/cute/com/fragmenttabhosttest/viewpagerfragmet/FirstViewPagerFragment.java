package zhangxing.cute.com.fragmenttabhosttest.viewpagerfragmet;

import android.support.design.widget.TabLayout;

import zhangxing.cute.com.fragmenttabhosttest.R;
import zhangxing.cute.com.fragmenttabhosttest.adapter.ViewPagerFragmentAdapter;
import zhangxing.cute.com.fragmenttabhosttest.base.BaseViewPagerFragment;
import zhangxing.cute.com.fragmenttabhosttest.fragment.FirstFragment;
import zhangxing.cute.com.fragmenttabhosttest.fragment.FourthFragment;
import zhangxing.cute.com.fragmenttabhosttest.fragment.SecondFragment;
import zhangxing.cute.com.fragmenttabhosttest.fragment.ThirdFragment;

/**
 * Created by zhangxing on 2016/10/7.
 */

public class FirstViewPagerFragment extends BaseViewPagerFragment {
    @Override
    public void onSetupTabAdater(ViewPagerFragmentAdapter adapter) {
        String[] titles = getResources().getStringArray(R.array.first_viewpage_arrays);
        adapter.addTab(titles[0],titles[0],FirstFragment.class,null);
        adapter.addTab(titles[1],titles[1],SecondFragment.class,null);
        adapter.addTab(titles[2],titles[2],ThirdFragment.class,null);
        adapter.addTab(titles[3],titles[3],FourthFragment.class,null);
    }

    @Override
    public void setTabLayout(TabLayout tabLayout) {
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

    @Override
    public void setScreenPageLimit() {
        mViewPager.setOffscreenPageLimit(3);
    }
}
