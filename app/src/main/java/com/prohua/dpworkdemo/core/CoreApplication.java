package com.prohua.dpworkdemo.core;

import com.intelligence.dpwork.DpWorkApplication;
import com.intelligence.dpwork.annotation.DpBugly;

/**
 * Class - DpWork，简单，便捷，集合
 * DpWork, simple, convenient, set
 *
 * 架构 - 单Activity+ 多Fragment框架设计
 * architecture - single Activity+ multi-fragment framework design
 *
 * 支持自适应布局，高自定义弹窗支持，网络层Dove，图片框架glide,
 * openGL音频媒体播放，实用工具类集合，内置国际化语言选择，支持高级防闪退机制等
 * Support adaptive layout, high custom popover support, network layer Dove, image frame glide,
 * openGL audio media playback, utility class set, built-in internationalization language selection, support advanced anti - flashback mechanism
 *
 * <p>
 * Created by Deepblue on 2019/1/27 0027.
 */

@DpBugly("123456")
public class CoreApplication extends DpWorkApplication {

    /**
     * 入口初始化 可不重写
     * Entry initialization is not overridden
     */
    @Override
    protected void initApplication() {

    }

}
