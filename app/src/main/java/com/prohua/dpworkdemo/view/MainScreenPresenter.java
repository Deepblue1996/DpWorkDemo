package com.prohua.dpworkdemo.view;

import com.intelligence.dpwork.annotation.DpIPresenter;
import com.intelligence.dpwork.mvp.MvpSuperPresenter;

/**
 * Class - Presenter 层实现
 * Presenter layer implementation
 * <p>
 * Created by Deepblue on 2019/1/27 0027.
 */

public class MainScreenPresenter extends MvpSuperPresenter implements MainInterface.IMainScreenPresenter {

    /**
     * 注入View层
     * Injection View layer
     */
    @DpIPresenter(MainScreenView.class)
    public MainInterface.IMainScreenView iMainScreenView;

    /**
     * 注入Model层
     * Injection Model layer
     */
    @DpIPresenter(MainScreenModel.class)
    public MainInterface.IMainScreenModel iMainScreenModel;

}
