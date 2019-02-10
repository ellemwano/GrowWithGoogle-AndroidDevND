package com.example.android.mygarden;

import android.content.Intent;
import android.widget.RemoteViewsService;

// COMPLETED (2): Create a RemoteViewsService class

public class GridWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new GridRemoteViewsFactory(this.getApplicationContext());
    }
}
