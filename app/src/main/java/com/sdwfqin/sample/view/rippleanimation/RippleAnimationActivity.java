package com.sdwfqin.sample.view.rippleanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sdwfqin.sample.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 描述：波纹动画
 *
 * @author sdwfqin
 * @date 2017/7/27
 */
public class RippleAnimationActivity extends AppCompatActivity {

    @BindView(R.id.ImageView)
    android.widget.ImageView mImageView;
    @BindView(R.id.layout_RippleAnimation)
    RippleAnimationView mLayoutRippleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_animation);
        ButterKnife.bind(this);

        mImageView = findViewById(R.id.ImageView);
        mLayoutRippleAnimation = findViewById(R.id.layout_RippleAnimation);

        mImageView.setOnClickListener(view -> {
            if (mLayoutRippleAnimation.isRippleRunning()) {
                mLayoutRippleAnimation.stopRippleAnimation();
            } else {
                mLayoutRippleAnimation.startRippleAnimation();
            }
        });
    }
}
