package com.wcx.ad.service;

import com.wcx.ad.vo.CreativeRequest;
import com.wcx.ad.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
