package zhangxing.cute.com.fragmenttabhosttest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import zhangxing.cute.com.fragmenttabhosttest.R;
import zhangxing.cute.com.fragmenttabhosttest.base.BaseFragment;

/**
 * Created by zhangxing on 2016/10/7.
 */

public class ThirdFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,null);
        return  view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
          initView(view);
    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void initView(View view) {
        TextView mTextView = (TextView) view.findViewById(R.id.textview);
        mTextView.setText("第三个界面");
    }

}
