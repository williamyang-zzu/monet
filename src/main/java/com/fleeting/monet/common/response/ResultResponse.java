package com.fleeting.monet.common.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fleeting.monet.common.response.enums.IResponseEnum;
import com.fleeting.monet.common.response.enums.ResponseEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = false)
@Data
@Getter
public class ResultResponse<T> extends BaseResponse {

    @ApiModelProperty(value = "返回结果")
    private T result;

    @JsonIgnore
    private ResponseEnum responseEnum;

    public void setResponseEnum(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public static <T> ResultResponse<T> newInstance() {
        return new ResultResponse<T>();
    }

}
