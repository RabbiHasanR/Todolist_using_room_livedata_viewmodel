package com.example.android.todolist;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.todolist.database.AppDatabase;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private AppDatabase mDb;
    private int taskId;

    public AddTaskViewModelFactory(AppDatabase mDb,int taskId){
        this.mDb=mDb;
        this.taskId=taskId;
    }

    // Note: This can be reused with minor modifications
    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new AddTaskViewModel(mDb, taskId);
    }
}
