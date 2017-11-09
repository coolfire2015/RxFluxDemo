package com.huyingbao.rxflux2.inject.component;

import com.huyingbao.rxflux2.inject.module.FragmentModule;
import com.huyingbao.rxflux2.inject.scope.PerFragment;
import com.huyingbao.simple.main.GitRepoListFragment;
import com.huyingbao.simple.main.GitUserFragment;
import com.huyingbao.simple.main.MainFragment;

import dagger.Subcomponent;

/**
 * fragment注入器
 * 子Component:
 * 注意子Component的Scope范围小于父Component
 * Created by liujunfeng on 2017/1/1.
 */
@PerFragment
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {

    void inject(MainFragment mainFragment);

    void inject(GitRepoListFragment gitRepoListFragment);

    void inject(GitUserFragment gitUserFragment);
}
