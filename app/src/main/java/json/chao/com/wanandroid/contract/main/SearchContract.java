package json.chao.com.wanandroid.contract.main;

import java.util.List;

import json.chao.com.wanandroid.base.presenter.AbstractPresenter;
import json.chao.com.wanandroid.core.bean.main.collect.FeedArticleData;
import json.chao.com.wanandroid.core.bean.main.collect.FeedArticleListResponse;
import json.chao.com.wanandroid.core.bean.main.search.TopSearchDataResponse;
import json.chao.com.wanandroid.core.bean.main.search.UsefulSitesResponse;
import json.chao.com.wanandroid.base.view.BaseView;
import json.chao.com.wanandroid.core.dao.HistoryData;

/**
 * @author quchao
 * @date 2018/2/12
 */

public interface SearchContract {

    interface View extends BaseView {

        /**
         * Show history data
         *
         * @param historyDataList List<HistoryData>
         */
        void showHistoryData(List<HistoryData> historyDataList);

        /**
         * Show search list
         *
         * @param feedArticleListResponse FeedArticleListResponse
         */
        void showSearchList(FeedArticleListResponse feedArticleListResponse);

        /**
         * Show top search data
         *
         * @param topSearchDataResponse TopSearchDataResponse
         */
        void showTopSearchData(TopSearchDataResponse topSearchDataResponse);

        /**
         * Show useful sites
         *
         * @param usefulSitesResponse UsefulSitesResponse
         */
        void showUsefulSites(UsefulSitesResponse usefulSitesResponse);

        /**
         * Show collect article data
         *
         * @param position Position
         * @param feedArticleData FeedArticleData
         * @param feedArticleListResponse FeedArticleListResponse
         */
        void showCollectArticleData(int position, FeedArticleData feedArticleData, FeedArticleListResponse feedArticleListResponse);

        /**
         * Show cancel collect article data
         *
         * @param position Position
         * @param feedArticleData FeedArticleData
         * @param feedArticleListResponse FeedArticleListResponse
         */
        void showCancelCollectArticleData(int position, FeedArticleData feedArticleData, FeedArticleListResponse feedArticleListResponse);

        /**
         * Show search list fail
         */
        void showSearchListFail();

        /**
         * Show top search data fail
         */
        void showTopSearchDataFail();

        /**
         * Show useful sites data fail
         */
        void showUsefulSitesDataFail();

    }

    interface Presenter extends AbstractPresenter<View> {

        /**
         * Add history data
         *
         * @param data history data
         */
        void addHistoryData(String data);

        /**
         * 搜索
         * @param page page
         * @param k POST search key
         */
        void getSearchList(int page, String k);

        /**
         * 热搜
         */
        void getTopSearchData();

        /**
         * 常用网站
         */
        void getUsefulSites();

        /**
         * Add collect article
         *
         * @param position Position
         * @param feedArticleData FeedArticleData
         */
        void addCollectArticle(int position, FeedArticleData feedArticleData);

        /**
         * Cancel collect article
         *
         * @param position Position
         * @param feedArticleData FeedArticleData
         */
        void cancelCollectArticle(int position, FeedArticleData feedArticleData);

    }

}
