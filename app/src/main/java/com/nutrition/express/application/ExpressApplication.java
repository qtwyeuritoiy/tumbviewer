package com.nutrition.express.application;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.nutrition.express.model.rest.RestClient;

/**
 * Created by huang on 4/25/16.
 */
public class ExpressApplication extends Application {
    public static int width;
    public static int height;
    private static ExpressApplication application;
    private ImagePipelineConfig imagePipelineConfig;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        DiskCacheConfig cacheConfig = DiskCacheConfig.newBuilder(this)
                .setMaxCacheSize(300 * 1024 * 1024)
                .build();
        imagePipelineConfig = ImagePipelineConfig.newBuilder(this)
                .setMainDiskCacheConfig(cacheConfig)
                .setDownsampleEnabled(true)
                .build();
        Fresco.initialize(this, imagePipelineConfig);

        //init width and height
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(dm);
        width = dm.widthPixels;
        height = dm.heightPixels;

        //init retrofit
        RestClient.getInstance().init(this);
    }

    public static ExpressApplication getApplication() {
        return application;
    }

    public ImagePipelineConfig getImagePipelineConfig() {
        return imagePipelineConfig;
    }
}
