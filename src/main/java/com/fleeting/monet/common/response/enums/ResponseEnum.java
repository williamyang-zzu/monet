package com.fleeting.monet.common.response.enums;

import lombok.Getter;

@Getter
public enum ResponseEnum {

    SUCCESS("success", "success"),
    SERVER_ERROR("server_error", "server error"),
    PARAM_INVALID("param_invalid", "request param invalid"),
    VALID_ERROR("valid_error", "valid error");


    private String code;

    ResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
