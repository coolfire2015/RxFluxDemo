package com.huyingbao.rxflux2.inject.component;

import com.huyingbao.rxflux2.androidtest.action.TestActionCreatorImpl;
import com.huyingbao.rxflux2.androidtest.base.TestBaseApplication;
import com.huyingbao.rxflux2.androidtest.login.TestLogin;
import com.huyingbao.rxflux2.inject.component.ApplicationComponent;
import com.huyingbao.rxflux2.androidtest.inject.module.TestApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * application注入器 Dagger通过Singleton创建出来的单例并不保持在静态域上， 而是保留在Component实例中接口,自动生成实现
 * Created by liujunfeng on 2017/1/1.
 */
@Singleton
@Component(modules = TestApplicationModule.class) // 指明Component从ApplicationModule中找依赖
public interface TestApplicationComponent extends ApplicationComponent {
    void inject(TestBaseApplication application);

    void inject(TestLogin loginActivityTest);

    void inject(TestActionCreatorImpl testActionCreator);
}
