package com.fleeting.monet.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    /**
     *
     */
    private long id;
    /**
     *
     */
    private String address;
}
