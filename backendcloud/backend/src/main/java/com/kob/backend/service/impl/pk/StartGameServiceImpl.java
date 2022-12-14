package com.kob.backend.service.impl.pk;

import com.kob.backend.consumer.WebSocketServer;
import com.kob.backend.service.pk.StartGameService;
import org.springframework.stereotype.Service;

@Service
public class StartGameServiceImpl implements StartGameService {
    @Override
    public String startGame(Integer aid, Integer bid) {
        System.out.println("startgame: "+aid+"  "+bid);
        WebSocketServer.startGame(aid,bid);
        return "start game success";
    }
}
