package com.fleeting.monet.controller;

import com.fleeting.monet.common.response.RestResultGenerator;
import com.fleeting.monet.common.response.ResultResponse;
import com.fleeting.monet.vo.UserVO;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class UserController {

    @GetMapping("/users/{address}")
    public ResultResponse<UserVO> queryUser(
            @PathVariable("address") String address) {
        return RestResultGenerator.genResult(null);
    }

    @PostMapping("/users")
    public ResultResponse createUser(@RequestParam("address") String address) {
        return RestResultGenerator.genResult(null);
    }
}
