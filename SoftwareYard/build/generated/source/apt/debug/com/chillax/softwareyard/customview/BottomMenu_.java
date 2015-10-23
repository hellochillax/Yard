//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.chillax.softwareyard.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chillax.softwareyard.R.id;
import com.chillax.softwareyard.R.layout;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;


/**
 * We use @SuppressWarning here because our java code
 * generator doesn't know that there is no need
 * to import OnXXXListeners from View as we already
 * are in a View.
 * 
 */
@SuppressWarnings("unused")
public final class BottomMenu_
    extends BottomMenu
    implements HasViews, OnViewChangedListener
{

    private boolean alreadyInflated_ = false;
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    public BottomMenu_(Context context, AttributeSet attrs) {
        super(context, attrs);
        init_();
    }

    public static BottomMenu build(Context context, AttributeSet attrs) {
        BottomMenu_ instance = new BottomMenu_(context, attrs);
        instance.onFinishInflate();
        return instance;
    }

    /**
     * The mAlreadyInflated_ hack is needed because of an Android bug
     * which leads to infinite calls of onFinishInflate()
     * when inflating a layout with a parent and using
     * the <merge /> tag.
     * 
     */
    @Override
    public void onFinishInflate() {
        if (!alreadyInflated_) {
            alreadyInflated_ = true;
            inflate(getContext(), layout.bottommenu, this);
            onViewChangedNotifier_.notifyViewChanged(this);
        }
        super.onFinishInflate();
    }

    private void init_() {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tv_self = ((TextView) hasViews.findViewById(id.tv_self));
        layout3 = ((LinearLayout) hasViews.findViewById(id.layout3));
        tv_zhouzhi = ((TextView) hasViews.findViewById(id.tv_zhouzhi));
        iv_self = ((ImageView) hasViews.findViewById(id.self));
        iv_table = ((ImageView) hasViews.findViewById(id.table));
        layout2 = ((LinearLayout) hasViews.findViewById(id.layout2));
        iv_zhouzhi = ((ImageView) hasViews.findViewById(id.zhouzhi));
        tv_table = ((TextView) hasViews.findViewById(id.tv_table));
        layout1 = ((LinearLayout) hasViews.findViewById(id.layout1));
        if (layout1 != null) {
            layout1 .setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    BottomMenu_.this.layout1(view);
                }

            }
            );
        }
        if (layout3 != null) {
            layout3 .setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    BottomMenu_.this.layout3(view);
                }

            }
            );
        }
        if (layout2 != null) {
            layout2 .setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    BottomMenu_.this.layout2(view);
                }

            }
            );
        }
    }

}
