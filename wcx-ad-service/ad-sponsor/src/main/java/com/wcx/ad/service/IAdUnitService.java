package com.wcx.ad.service;

import com.wcx.ad.exception.AdException;
import com.wcx.ad.vo.AdUnitDistrictRequest;
import com.wcx.ad.vo.AdUnitDistrictResponse;
import com.wcx.ad.vo.AdUnitItRequest;
import com.wcx.ad.vo.AdUnitItResponse;
import com.wcx.ad.vo.AdUnitKeywordRequest;
import com.wcx.ad.vo.AdUnitKeywordResponse;
import com.wcx.ad.vo.AdUnitRequest;
import com.wcx.ad.vo.AdUnitResponse;
import com.wcx.ad.vo.CreativeUnitRequest;
import com.wcx.ad.vo.CreativeUnitResponse;

/**
 * Created by Qinyi.
 */
public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
        throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
        throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
        throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
        throws AdException;
}
