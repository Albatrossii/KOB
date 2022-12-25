<template>
    <div ref="parent" class="gamemap">
        <canvas ref="canvas">

        </canvas>
    </div>
</template>

<script>
import { GameMap } from '@/assets/scripts/GameMap'
import { ref , onMounted } from 'vue'

export default{
    setup() {
        //一开始指向为空
        let parent = ref(null);
        let canvas = ref(null);

        //整个组件挂载完需要创建一个游戏对象
        onMounted(() => {
            new GameMap(canvas.value.getContext('2d'), parent.value)
            
        });

        return {
            parent,
            canvas
        }
    }
}
</script>

<style scoped>
div.gamemap{
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
}
</style>