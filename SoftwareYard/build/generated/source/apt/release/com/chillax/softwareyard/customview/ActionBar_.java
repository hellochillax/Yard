//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.chillax.softwareyard.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public final class ActionBar_
    extends ActionBar
    implements HasViews, OnViewChangedListener
{

    private boolean alreadyInflated_ = false;
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    public ActionBar_(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init_();
    }

    public ActionBar_(Context context, AttributeSet attrs) {
        super(context, attrs);
        init_();
    }

    public ActionBar_(Context context) {
        super(context);
        init_();
    }

    public static ActionBar build(Context context, AttributeSet attrs, int defStyle) {
        ActionBar_ instance = new ActionBar_(context, attrs, defStyle);
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
            inflate(getContext(), layout.actionbar, this);
            onViewChangedNotifier_.notifyViewChanged(this);
        }
        super.onFinishInflate();
    }

    private void init_() {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    public static ActionBar build(Context context, AttributeSet attrs) {
        ActionBar_ instance = new ActionBar_(context, attrs);
        instance.onFinishInflate();
        return instance;
    }

    public static ActionBar build(Context context) {
        ActionBar_ instance = new ActionBar_(context);
        instance.onFinishInflate();
        return instance;
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        title = ((TextView) hasViews.findViewById(id.topBar_title));
        spinner = ((TextView) hasViews.findViewById(id.topBar_spinner));
        forTableVG = ((ViewGroup) hasViews.findViewById(id.topBar_table));
        more = ((ImageView) hasViews.findViewById(id.topBar_more));
        logo = ((ImageView) hasViews.findViewById(id.topBar_logo));
        arrow = ((ImageView) hasViews.findViewById(id.topBar_arrow));
        if (title!= null) {
            title.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    ActionBar_.this.topBar_title();
                }

            }
            );
        }
        if (logo!= null) {
            logo.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    ActionBar_.this.topBar_logo();
                }

            }
            );
        }
        if (more!= null) {
            more.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    ActionBar_.this.topBar_more(view);
                }

            }
            );
        }
        if (forTableVG!= null) {
            forTableVG.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    ActionBar_.this.forTableVG(view);
                }

            }
            );
        }
        initView();
    }

}
