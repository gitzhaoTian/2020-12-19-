package com.example.myapplication;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UMConfigure.init(this,"5a12384aa40fa3551f0001d1"
                ,"umeng",UMConfigure.DEVICE_TYPE_PHONE,"");//58edcfeb310c93091c000be2 5965ee00734be40b580001a0

        // QQ设置
        PlatformConfig.setQQZone("101925150", "3026d3e630c13d4e4b90d4ee6f9be147");
        PlatformConfig.setQQFileProvider("com.example.myapplication.fileprovider");

        // 其他平台设置
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad","http://sns.whalecloud.com");
    }
}
