package com.rae.cnblogs.sdk;

import android.content.Context;
import android.webkit.CookieManager;

import com.rae.cnblogs.sdk.bean.UserInfoBean;
import com.rae.cnblogs.sdk.config.CnblogSdkConfig;

/**
 * 用户提供者，保存用户信息，对已登录的用户进行操作。
 * <pre>
 * 使用前请先调用{@link #init(Context)}方法进行初始化
 * </pre>
 * Created by ChenRui on 2017/2/3 0003 15:58.
 */
public final class UserProvider {

    private static UserProvider sUserProvider;
    private UserInfoBean mUserInfo;
    private CnblogSdkConfig mConfig;

    public static UserProvider getInstance() {
        if (sUserProvider == null) {
            throw new NullPointerException("用户提供程序没有初始化！");
        }
        return sUserProvider;
    }

    public static void init(Context applicationContext) {
        if (sUserProvider == null) {
            sUserProvider = new UserProvider(applicationContext);
        }
    }

    public UserProvider(Context context) {
        mConfig = CnblogSdkConfig.getsInstance(context);
    }


    /**
     * 保存当前用户信息，一般在登录的时候调用该方法
     *
     * @param userInfo 用户信息
     */
    public void setLoginUserInfo(UserInfoBean userInfo) {
        this.mUserInfo = userInfo;
        // 保存到偏好中去
        if (userInfo != null) {
            mConfig.saveUserInfo(userInfo);
        }
    }

    /**
     * 获取当前登录用户信息
     *
     * @return 用户信息视图
     */
    public UserInfoBean getLoginUserInfo() {
        // 如果用户为空，从偏好中获取
        if (mUserInfo == null) {
            mUserInfo = mConfig.getUserInfo();
        }
        return mUserInfo;
    }

    /**
     * 是否登录
     */
    public boolean isLogin() {
        return getLoginUserInfo() != null;
    }

    /**
     * 退出登录，释放资源
     */
    public void logout() {
        mUserInfo = null;

        // 移除所有的cookie
        CookieManager.getInstance().removeAllCookie();

        // 清除保存的登录信息
        mConfig.clearUserInfo();

    }

}
