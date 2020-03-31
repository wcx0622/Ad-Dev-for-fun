package com.wcx.ad.sender;

import com.wcx.ad.mysql.dto.MySqlRowData;


public interface ISender {

    void sender(MySqlRowData rowData);
}
