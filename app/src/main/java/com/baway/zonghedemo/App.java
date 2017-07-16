package com.baway.zonghedemo;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * Created by hujiqinag on 2017/07/14.
 */
public class App extends Application {
    {
        PlatformConfig.setQQZone("1106274430", "mXL4US3vPhdi4n9K");
    }

    private UMShareAPI mUmShareAPI;

    @Override
    public void onCreate() {
        super.onCreate();
        mUmShareAPI = UMShareAPI.get(this);
    }

    public UMShareAPI getUMShareAPI() {
        return mUmShareAPI;
    }
}
