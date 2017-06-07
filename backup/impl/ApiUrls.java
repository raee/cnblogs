package com.rae.cnblogs.sdk.impl;

/**
 * 接口地址
 * Created by ChenRui on 2016/11/30 0030 16:46.
 */
final class ApiUrls {

    // 博客-列表
    static final String API_BLOG_LIST = "http://www.cnblogs.com/mvc/AggSite/PostList.aspx";

    // 博客-内容
    static final String API_BLOG_CONTENT = "http://wcf.open.cnblogs.com/blog/post/body/";

    // 博客-点赞
    static final String API_BLOG_LIKE = "http://www.cnblogs.com/mvc/vote/VoteBlogPost.aspx";

    // 博客-评论-列表
    static final String API_BLOG_COMMENT_LIST = "http://www.cnblogs.com/mvc/blog/GetComments.aspx";

    // 博客-评论-发表
    static final String API_BLOG_COMMENT_ADD = "http://www.cnblogs.com/mvc/PostComment/Add.aspx";

    // 博客-评论-发表
    static final String API_BLOG_COMMENT_DELETE = "http://www.cnblogs.com/mvc/comment/DeleteComment.aspx";

    // 用户-当前用户信息
    static final String API_USER_INFO = "https://home.cnblogs.com/ajax/user/CurrentIngUserInfo";

    // 用户-信息
    static final String API_USER_CENTER = "https://home.cnblogs.com/u/@blogApp";

    // 用户-动态
    static final String API_USER_FEED = "https://home.cnblogs.com/u/@blogApp/feed/@page.html";

    // 用户-登录
    static final String API_SIGN_IN = "https://passport.cnblogs.com/user/signin?AspxAutoDetectCookieSupport=1";

    // 新闻-列表
    static final String API_NEWS_LIST = "http://wcf.open.cnblogs.com/news/recent/paged/@page/20";

    // 新闻-内容
    static final String API_NEWS_CONTENT = "http://wcf.open.cnblogs.com/news/item/@id";

    // 新闻-评论-列表
    static final String API_NEWS_COMMENT = "https://news.cnblogs.com/CommentAjax/GetComments";

    // 知识库-列表
    static final String API_KB_LIST = "https://home.cnblogs.com/kb/page/@page/";

    // 知识库-点赞
    static final String API_KB_LIKE = "https://kb.cnblogs.com/mvcajax/vote/VoteArticle";

    // 收藏-添加
    static final String API_BOOK_MARKS_ADD = "http://wz.cnblogs.com/ajax/wz/AddWzlink";

    // 收藏-删除
    static final String API_BOOK_MARKS_DELETE = "http://wz.cnblogs.com/ajax/wz/DeleteWzlink";

    // 收藏-列表
    static final String API_BOOK_MARKS_LIST = "http://wz.cnblogs.com/my/@page.html";

    // 知识库-内容
    static final String API_KB_CONTENT = "https://kb.cnblogs.com/page/@id/";

    // 新闻-评论-列表
    static final String API_NEWS_COMMENT_ADD = "https://news.cnblogs.com/Comment/InsertComment";

    // 新闻-评论-删除
    static final String API_NEWS_COMMENT_DELETE = "https://news.cnblogs.com/Comment/DelComment";

    // 新闻-点赞
    static final String API_NEWS_LIKE = "https://news.cnblogs.com/News/VoteNews";

    // 朋友-关注-列表
    static final String API_FRIENDS_FOLLOW_LIST = "https://home.cnblogs.com/relation_users";

    // 朋友-关注-发起
    static final String API_FRIENDS_FOLLOW = "https://home.cnblogs.com/ajax/follow/FollowUser";

    // 朋友-关注-取消
    static final String API_FRIENDS_UN_FOLLOW = "https://home.cnblogs.com/ajax/follow/RemoveFollow";

    // 朋友-博客列表
    static final String API_FRIENDS_BLOG_LIST = "http://wcf.open.cnblogs.com/blog/u/@blogApp/posts/@page/20";

    // 朋友-粉丝-列表
    public static final String API_FRIENDS_FANS_LIST = "https://home.cnblogs.com/relation_users";

    // 搜索-百度建议
    static final String API_BAIDU_SUGGESTION = "http://suggestion.baidu.com/su";

    // 搜索-博客-作者
    static final String API_SEARCH_BLOGGER = "http://wcf.open.cnblogs.com/blog/bloggers/search";

    // 搜索-博客-内容
    static final String API_SEARCH_BLOG_LIST = "http://zzk.cnblogs.com/s/blogpost";

    // 搜索-知识库-列表
    static final String API_SEARCH_KB_LIST = "http://zzk.cnblogs.com/s/kb";

    // 搜索-新闻-列表
    static final String API_SEARCH_NEWS_LIST = "http://zzk.cnblogs.com/s/news";
}