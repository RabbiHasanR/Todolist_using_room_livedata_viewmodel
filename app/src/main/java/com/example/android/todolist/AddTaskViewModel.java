package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

public class AddTaskViewModel extends ViewModel {
    private LiveData<TaskEntry> task;
    // Note: The constructor should receive the database and the taskId
    public AddTaskViewModel(AppDatabase mDb,int taskId){
        task=mDb.taskDao().loadTaskById(taskId);
    }
    public LiveData<TaskEntry> getTask(){
        return task;
    }
}
