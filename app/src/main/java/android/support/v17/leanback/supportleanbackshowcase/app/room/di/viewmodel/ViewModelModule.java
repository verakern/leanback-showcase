/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.v17.leanback.supportleanbackshowcase.app.room.di.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.v17.leanback.supportleanbackshowcase.app.room.viewmodel.VideosInSameCategoryViewModel;
import android.support.v17.leanback.supportleanbackshowcase.app.room.viewmodel.VideosViewModel;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;


@Module
public abstract class ViewModelModule {
    @Binds
    @Singleton
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

    @Binds
    @IntoMap
    @Singleton
    @ViewModelKey(VideosInSameCategoryViewModel.class)
    abstract ViewModel bindVideosInSameCategoryViewModel(VideosInSameCategoryViewModel model);

    @Binds
    @IntoMap
    @Singleton
    @ViewModelKey(VideosViewModel.class)
    abstract ViewModel bindVideosViewModel(VideosViewModel model);
}
