package com.fleeting.monet.common.response.result;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class PageableResult<T> extends Result {

    @Getter
    @Setter
    private long totalCount;

    @Getter
    @Setter
    private int pageNo;

    @Getter
    @Setter
    private int pageSize;

    @Getter
    @Setter
    private List<T> records;

}
