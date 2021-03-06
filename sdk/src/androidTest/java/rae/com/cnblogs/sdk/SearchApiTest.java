package rae.com.cnblogs.sdk;

import com.github.raee.runit.AndroidRUnit4ClassRunner;
import com.rae.cnblogs.sdk.CnblogsApiFactory;
import com.rae.cnblogs.sdk.api.ISearchApi;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * 搜索接口
 * Created by ChenRui on 2017/2/7 0007 15:34.
 */
@RunWith(AndroidRUnit4ClassRunner.class)
public class SearchApiTest extends BaseTest {

    private ISearchApi mApi;

    @Override
    public void setup() {
        super.setup();
        mApi = CnblogsApiFactory.getInstance(mContext).getSearchApi();
    }


    @Test
    public void testSuggestion() throws Exception {
        runTest("testSuggestion", mApi.getSuggestion("android"));
    }

    @Test
    public void testSearchBlogAuthor() throws Exception {
        runTest("testSearchBlogAuthor", mApi.searchBlogAuthor("android"));
    }

    @Test
    public void testSearchBlogList() throws Exception {
        runTest("testSearchBlogList", mApi.searchBlogList("android", 1));
    }

    @Test
    public void testSearchNewsList() throws Exception {
        runTest("testSearchNewsList", mApi.searchNewsList("android", 1));
    }

    @Test
    public void testSearchKbList() throws Exception {
        runTest("testSearchKbList", mApi.searchKbList("android", 1));
    }

}
