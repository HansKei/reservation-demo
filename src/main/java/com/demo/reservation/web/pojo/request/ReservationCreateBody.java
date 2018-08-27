package com.demo.reservation.web.pojo.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
public class ReservationCreateBody {

    @NotNull
    private Long roomId;

    @NotNull
    private Long userId;

    @NotNull
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTime;

    @NotNull
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime endTime;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate day;

    @NotNull
    private Integer repeatCount;

}
