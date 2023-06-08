package com.fleeting.monet.controller;

import com.fleeting.monet.common.response.RestResultGenerator;
import com.fleeting.monet.common.response.ResultResponse;
import com.fleeting.monet.vo.EventDetailVO;
import com.fleeting.monet.vo.EventReq;
import com.fleeting.monet.vo.EventVO;
import com.fleeting.monet.vo.JoinEventVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EventController {
    @GetMapping("/events/{eventId}")
    public ResultResponse<EventDetailVO> queryEvent(
            @PathVariable("eventId") String eventId) {
        return RestResultGenerator.genResult(null);
    }

    @PostMapping("/events")
    public ResultResponse createEvent(@RequestBody EventReq eventReq) {
        return RestResultGenerator.genResult(null);
    }

    @GetMapping("/joinEvents/{address}")
    public ResultResponse<List<JoinEventVO>> queryJoinEvents(
            @PathVariable("address") String address) {
        return RestResultGenerator.genResult(null);
    }

    @GetMapping("/events/{address}")
    public ResultResponse<List<EventVO>> queryCreatedEvents(
            @PathVariable("address") String address) {
        return RestResultGenerator.genResult(null);
    }
}
