package com.example.demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class ScheduleService {

    LocalTime now = LocalTime.now();

    public void scheduleTest(){

        // 현재시간 출력
         System.out.println(now);  // 06:20:57.008731300
        // 포맷 정의하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        // 포맷 적용하기
         String formatedNow = now.format(formatter);



        System.out.println("현재시간 : " +now);
    }
}
