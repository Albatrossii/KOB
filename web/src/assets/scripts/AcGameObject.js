const AC_GAME_OBJECTS = [];

export class AcGameObject {
    constructor() {
        AC_GAME_OBJECTS.push(this);
        //确认函数是否执行过
        this.has_called_start = false;
        //记录距离上一帧执行的间隔
        this.timedelta = 0;

    }

    //只执行一次
    start() {
        
    }

    //每一帧执行一次
    update() {

    }

    //销毁前做的操作
    on_destroy() {

    }

    destroy() {
        this.on_destroy();

        for(let i in AC_GAME_OBJECTS){
            const obj = AC_GAME_OBJECTS[i];
            if(obj === this){
                //删除
                AC_GAME_OBJECTS.splice(i);
                break;
            }
        }
    }
}

//上一次执行的时刻
let last_timestimp;

const step = timestamp =>{
    for(let obj of AC_GAME_OBJECTS){
        if(!obj.has_called_start){
            obj.has_called_start = true;
            obj.start();
        }else{
            obj.timedelta = timestamp - last_timestimp;
            obj.update();
        }
    }
    //更新
    last_timestimp = timestamp;
    //递归调用
    requestAnimationFrame(step)
}

//在下一帧执行step函数
requestAnimationFrame(step)