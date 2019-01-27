package com.prohua.dpworkdemo.view;

import com.intelligence.dpwork.annotation.DpIPresenter;
import com.intelligence.dpwork.annotation.DpLayout;
import com.intelligence.dpwork.base.BaseScreen;
import com.prohua.dpworkdemo.R;

/**
 * Class - Demo界面 - View 层实现
 * Demo interface - View layer implementation
 * <p>
 * Created by Deepblue on 2019/1/27 0027.
 */

/**
 * 注入界面布局
 * Injection interface layout
 *
 * @ DpLayout(R.layout.activity_main)
 * <p>
 * 是否选择使用Mvp模式还是Mvc模式开发，只需不创建属性和实现Mvp接口即可
 * Whether you choose to develop using the Mvp pattern or Mvc pattern,
 * simply do not create the attributes and implement the Mvp interface
 */
@DpLayout(R.layout.activity_main)
public class MainScreenView extends BaseScreen implements MainInterface.IMainScreenView {

    /**
     * 注入Presenter层
     * Injection Presenter layer
     */
    @DpIPresenter(MainScreenPresenter.class)
    public MainInterface.IMainScreenPresenter iMainScreenPresenter;

    @Override
    protected void initView() {

    }

    /**
     * 沉浸状态栏 黑色字体
     * Immersion status bar in black font
     * @return
     */
    @Override
    public boolean statusBarBlackFont() {
        return true;
    }

}
