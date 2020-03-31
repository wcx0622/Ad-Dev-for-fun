package com.wcx.ad.mysql.listener;

import com.wcx.ad.mysql.dto.BinlogRowData;


public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);
}
