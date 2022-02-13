package com.example.wanAndroid.logic.net

/**
 * Created by 咸鱼至尊 on 2022/1/8
 *
 * desc: 网络请求API类
 */
object NetApi {
    /** 全局根路径 */
    const val BaseURL = "https://www.wanandroid.com/"

    /** 首页轮播图路径 */
    const val BannerAPI = "banner/json"

    /** 首页置顶文章路径 */
    const val ArticleTopAPI = "article/top/json"

    /** 首页文章列表路径 */
    const val ArticleListAPI = "article/list"

    /** 项目分类路径 */
    const val ProjectClassifyAPI = "project/tree/json"

    /** 最新项目路径 */
    const val ProjectNewAPI = "article/listproject"

    /** 项目列表路径 */
    const val ProjectListAPI = "project/list"

    /** 公众号列表路径 */
    const val PlatformListAPI = "wxarticle/chapters/json"

    /** 公众号历史数据路径 */
    const val PlatformDataAPI = "wxarticle/list"

    /** 广场列表数据路径 */
    const val SquareListAPI = "user_article/list"

    /** 问答数据路径 */
    const val InquiryAnswerAPI = "wenda/list"

    /** 体系数据路径 */
    const val SystemAPI = "tree/json"

    /** 导航数据路径 */
    const val NavigationAPI = "navi/json"
}
