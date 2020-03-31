package com.wcx.ad.search;

import com.wcx.ad.search.vo.SearchRequest;
import com.wcx.ad.search.vo.SearchResponse;


public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
