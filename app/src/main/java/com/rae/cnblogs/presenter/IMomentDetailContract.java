package com.rae.cnblogs.presenter;

import com.rae.cnblogs.sdk.bean.FriendsInfoBean;
import com.rae.cnblogs.sdk.bean.MomentBean;
import com.rae.cnblogs.sdk.bean.MomentCommentBean;

import java.util.List;

/**
 * 闪存详情
 * Created by ChenRui on 2017/11/2 0002 16:59.
 */
public interface IMomentDetailContract {

    interface Presenter extends IAppPresenter {


        /**
         * 下拉刷新，重新发起请求
         */
        void refresh();

        void loadMore();

        /**
         * @param ingId     闪存ID
         * @param userId    回复的用户ID
         * @param commentId 回复的评论ID
         * @param content   回复内容
         */
        void postComment(String ingId, String userId, String commentId, String content);

        void follow();

        /**
         * 是否已经关注
         */
        boolean isFollowed();

        /**
         * 删除闪存评论
         *
         * @param commentId 评论ID
         */
        void deleteComment(String commentId);

        void deleteMoment();
    }

    interface View {

        MomentBean getMomentInfo();

        /**
         * 没有评论信息
         */
        void onEmptyComment(String message);

        /**
         * 加载评论
         */
        void onLoadComments(List<MomentCommentBean> data, boolean hasMore);

        /**
         * 评论失败
         */
        void onPostCommentFailed(String message);

        /**
         * 评论成功
         */
        void onPostCommentSuccess();

        String getBlogApp();

        void onLoadBloggerInfoFailed(String msg);

        void onLoadBloggerInfo(FriendsInfoBean info);

        void onFollowFailed(String msg);

        void onFollowSuccess();

        /**
         * 删除评论失败
         *
         * @param message
         */
        void onDeleteCommentFailed(String message);

        void onDeleteMomentFailed(String string);

        void onDeleteMomentSuccess();

        /**
         * 加载更多的时候没有登录
         */
        void onLoadMoreNotLogin();
    }
}
