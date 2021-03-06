//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.chillax.softwareyard.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.chillax.softwareyard.R.layout;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class LeaderItem_
    extends com.chillax.softwareyard.fragment.LeaderItem
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.leader_item, container, false);
        }
        return contentView_;
    }

    @Override
    public void onDestroyView() {
        contentView_ = null;
        super.onDestroyView();
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static LeaderItem_.FragmentBuilder_ builder() {
        return new LeaderItem_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        comein = ((TextView) hasViews.findViewById(com.chillax.softwareyard.R.id.comein));
        bg = ((ImageView) hasViews.findViewById(com.chillax.softwareyard.R.id.bg));
        if (comein!= null) {
            comein.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    LeaderItem_.this.comein();
                }

            }
            );
        }
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<LeaderItem_.FragmentBuilder_, com.chillax.softwareyard.fragment.LeaderItem>
    {


        @Override
        public com.chillax.softwareyard.fragment.LeaderItem build() {
            LeaderItem_ fragment_ = new LeaderItem_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
