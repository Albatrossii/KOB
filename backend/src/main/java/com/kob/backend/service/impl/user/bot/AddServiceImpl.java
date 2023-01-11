package com.kob.backend.service.impl.user.bot;

import com.kob.backend.Utils.UserUtil;
import com.kob.backend.mapper.BotMapper;
import com.kob.backend.pojo.Bot;
import com.kob.backend.pojo.User;
import com.kob.backend.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class AddServiceImpl implements AddService {

    private UserUtil util;

    @Autowired
    private BotMapper botMapper;

    @Override
    public Map<String, String> add(Map<String, String> data) {
        User user = util.getUser();

        String title = data.get("title");
        String description = data.get("description");
        String content = data.get("content");

        Map<String,String> map = new HashMap<>();

        if(title == null || title.length() == 0){
            map.put("error_message","标题不能为空");
            return map;
        }

        if(title.length() > 100){
            map.put("error_message","标题长度不能大于100");
            return map;
        }

        if (description == null || description.length() == 0){
            description = "这个用户很懒，什么也没留下。。。";
        }

        if(description.length() > 300){
            map.put("error_message","Bot的描述长度不能大于300");
            return map;
        }

        if(content == null || content.length() == 0){
            map.put("error_message","代码不能为空");
            return map;
        }

        if(content.length() > 10000){
            map.put("error_message","代码长度不能超过10000");
            return map;
        }

        Date now = new Date();
        Bot bot = new Bot(null , user.getId(), title , description , content,now,now);
        botMapper.insert(bot);
        map.put("error_message","success");

        return map;
    }
}
