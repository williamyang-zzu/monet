package com.fleeting.monet.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventVO {
    /**
     *
     */
    private String eventId;
    /**
     *
     */
    private String eventName;
    /**
     *
     */
    private String eventImage;
    /**
     *
     */
    private String organizer;
    /**
     *
     */
    private String profile;
    /**
     *
     */
    private String promotionLink;
    /**
     *
     */
    private String jackpot;
    /**
     *
     */
    private long startTime;
    /**
     *
     */
    private long endTime;
}
