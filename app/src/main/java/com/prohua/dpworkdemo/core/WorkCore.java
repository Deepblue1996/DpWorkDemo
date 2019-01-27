package com.prohua.dpworkdemo.core;

import com.intelligence.dpwork.DpWorkCore;
import com.intelligence.dpwork.annotation.DpInit;
import com.prohua.dpworkdemo.view.MainScreenView;

/**
 * 初始化框架入口
 * Initializes the frame entry
 */
@DpInit(MainScreenView.class)
public class WorkCore extends DpWorkCore {

    /**
     * 框架初始化 可不重写
     * Framework initialization is not overridden
     */
    @Override
    protected void initCore() {

    }

}
