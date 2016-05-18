package com.kobashin.sample.databindingsample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by skobayashi1 on 2016/05/19.
 */
public class SampleModel extends BaseObservable {

    String textInput;

    public SampleModel() {
    }

    @Bindable
    public String getTextInput() {
        return textInput;
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
        notifyPropertyChanged(com.kobashin.sample.databindingsample.BR.textInput);
    }
}
