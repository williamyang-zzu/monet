package com.fleeting.monet.controller;

import com.fleeting.monet.common.response.RestResultGenerator;
import com.fleeting.monet.common.response.ResultResponse;
import com.fleeting.monet.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping("/{address}")
    public ResultResponse<UserVO> queryUser(
            @PathVariable("address") String address) {
        return RestResultGenerator.genResult(null);
    }
}
