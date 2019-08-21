package com.theblackdiamonds.ihavetofly.models;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import com.theblackdiamonds.ihavetofly.R;

import static com.theblackdiamonds.ihavetofly.views.GameView.screenRatioX;
import static com.theblackdiamonds.ihavetofly.views.GameView.screenRatioY;

public class Bullet {

    public int x, y;
    public Bitmap bullet;
    private int width, height;

    public Bullet(Resources res) {

        bullet = BitmapFactory.decodeResource(res, R.drawable.bullet);

        width = bullet.getWidth();
        height = bullet.getHeight();

        width /= 4;
        height /= 4;

        width *= (int) screenRatioX;
        height *= (int) screenRatioY;

        bullet = Bitmap.createScaledBitmap(bullet, width, height, false);
    }

    public Rect getCollisionShape() {
        return new Rect(x, y, x + width, y + height);
    }
}