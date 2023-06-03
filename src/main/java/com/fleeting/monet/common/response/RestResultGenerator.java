package com.fleeting.monet.common.response;

import com.fleeting.monet.common.response.enums.ResponseEnum;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RestResultGenerator {


    public static <T> ResultResponse<T> genResult(T result) {
        ResultResponse<T> response = ResultResponse.newInstance();
        response.setCode(ResponseEnum.SUCCESS.getCode());
        response.setMessage(ResponseEnum.SUCCESS.getMessage());
        response.setResponseEnum(ResponseEnum.SUCCESS);
        response.setResult(result);
//        if (log.isDebugEnabled()) {
//            log.debug("--------> response:{}", JacksonMapper.toJsonString(response));
//        }
        return response;
    }

    public static <T> ResultResponse<T> genErrorResult(ResponseEnum responseEnum) {
        ResultResponse<T> response = ResultResponse.newInstance();
        response.setCode(responseEnum.getCode());
        response.setMessage(responseEnum.getMessage());
        response.setResponseEnum(responseEnum);

//        if (log.isDebugEnabled()) {
//            log.debug("--------> response:{}", JacksonMapper.toJsonString(response));
//        }

        return response;
    }

    public static <T> ResultResponse<T> genErrorResult(ResponseEnum responseEnum, String message) {
        ResultResponse<T> response = ResultResponse.newInstance();
        response.setCode(responseEnum.getCode());
        response.setMessage(message);
        response.setResponseEnum(responseEnum);

//        if (log.isDebugEnabled()) {
//            log.debug("--------> response:{}", JacksonMapper.toJsonString(response));
//        }

        return response;
    }
}

