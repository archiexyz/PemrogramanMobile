package com.example.navdrawer.ui.form;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.navdrawer.MainActivity;
import com.example.navdrawer.R;

public class FormViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FormViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is form fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}