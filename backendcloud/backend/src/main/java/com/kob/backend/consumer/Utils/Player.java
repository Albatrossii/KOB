package com.kob.backend.consumer.Utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.parameters.P;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private Integer id;
    private Integer sx;
    private Integer sy;
    //每一步的方向
    private List<Integer> steps;

    //检验当前回合蛇的长度是否增加
    private boolean check_tail_increasing(int steps){
        if(steps <= 10) return true;

        return steps % 3 == 1;
    }

    public List<Cell> getCells(){
        List<Cell> res = new ArrayList<>();

        int []dx = { -1, 0, 1, 0},dy = {0, 1, 0, -1};
        int x = sx, y=sy;
        int step = 0;
        res.add((new Cell(x,y)));
        for (int d : steps){
            x += dx[d];
            y += dy[d];
            res.add(new Cell(x,y));
            //若蛇尾增加 这去掉蛇尾
            if(!check_tail_increasing(++step)){
                res.remove(0);
            }
        }
        return res;
    }

    public String getStepsString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int d:steps){
            stringBuilder.append(d);
        }
        return stringBuilder.toString();
    }
}
