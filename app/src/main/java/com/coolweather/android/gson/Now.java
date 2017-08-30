package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小怪兽的窝 on 2017/8/29.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
