package com.hovanly.dut.canvas.models;

import android.graphics.Matrix;
import android.support.annotation.NonNull;

import lombok.Data;

/**
 * Copyright@ AsianTech.Inc
 * Created by Ly Ho V. on 02/08/2017
 */
@Data
public class Pointer {
    private float x;
    private float y;

    public Pointer(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Pointer(float x, float y, @NonNull Matrix matrix) {
        float[] absolute = new float[2];
        absolute[0] = x;
        absolute[1] = y;
        matrix.mapPoints(absolute);
        this.x = absolute[0];
        this.y = absolute[1];
    }
}
