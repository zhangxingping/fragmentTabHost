package zhangxing.cute.com.fragmenttabhosttest.adapter;

import android.os.Bundle;

/**
 *viewpager的相关信息
 */
public final class ViewPagerInfo {
    public final String tag;
    public final Class<?> clss;
    public final Bundle args;
    public final String title;
    public ViewPagerInfo(String _title, String _tag, Class<?> _class, Bundle _args){
        title=_title;
        tag=_tag;
        clss=_class;
        args=_args;
    }
}
