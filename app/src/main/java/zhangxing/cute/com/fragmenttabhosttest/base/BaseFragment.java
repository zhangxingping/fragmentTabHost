package zhangxing.cute.com.fragmenttabhosttest.base;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zhangxing.cute.com.fragmenttabhosttest.interf.BaseFragmentInterface;

/**
 * Created by zhangxing on 2016/10/7.
 */

public class BaseFragment extends Fragment implements BaseFragmentInterface {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initData() {

    }
}
