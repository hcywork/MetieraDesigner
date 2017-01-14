package com.example.coodinaterlayout;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CoodinateLayoutActivity extends AppCompatActivity implements SwipeDismissBehavior.OnDismissListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coodinate_layout);
        textView = (TextView) findViewById(R.id.tw_main_textt);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) textView.getLayoutParams();
        SwipeDismissBehavior<TextView> behavior = new SwipeDismissBehavior<>();
        behavior.setListener(this);
        layoutParams.setBehavior(behavior);


    }

    /**
     * 消失的时候
     *
     * @param view
     */
    @Override
    public void onDismiss(View view) {
        view.setVisibility(View.GONE);
        Snackbar.make(view, "back", Snackbar.LENGTH_LONG)
                .setAction("撤销", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.setVisibility(View.VISIBLE);
                        ViewCompat.animate(textView).alpha(1).start();

                    }
                }).show();
        ;
    }

    /**
     * 改变的时候
     *
     * @param state
     */
    @Override
    public void onDragStateChanged(int state) {

    }
}
