package com.yogi.reactlibrary.components;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.Button;

import com.yogi.reactlibrary.helpers.ResourceHelper;

public class EButton extends Button {
    public EButton(Context context) {
        super(context);
        initDefault();
    }

    private void initDefault() {
        setAllCaps(false);
        setBackgroundColor(Color.WHITE);
        setTextColor(Color.BLACK);
    }

    public void setText(final String label) {
        super.setText(label);
    }

    public void setTextColor(final String color) {
        final int colorId = ResourceHelper.getColor(getContext(), color);
        super.setTextColor(colorId);
    }

    public void setBackgroundColor(final String color) {
        final int colorId = ResourceHelper.getColor(getContext(), color);
        super.setBackgroundColor(colorId);
    }

    public void setTextSize(final int size) {
        super.setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
    }

    public void setCornorSize(final float size) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}