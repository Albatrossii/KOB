<template>
    <ContentField>
        我的Bot
    </ContentField>
</template>

<script>
import ContentField from "../../../components/ContentField.vue";
import { useStore } from "vuex";
import $ from 'jquery'

export default{
    components:{
        ContentField,
    },
    setup() {
        // const store = useStore();
        // $.ajax({
        //     url: "http://127.0.0.1:3000/user/bot/add/",
        //     type: "post",
        //     data: {
        //         title: "Bot标题",
        //         description: "Bot描述",
        //         content: "Bot代码",
        //     },
        //     headers: {
        //         Authorization: "Bearer "+ store.state.user.token ,
        //     },
        //     success(resp){
        //         console.log(resp);
        //     },
        //     error(resp){
        //         console.log(resp);
        //     }
        // })

        // $.ajax({
        //     url: "http://127.0.0.1:3000/user/bot/remove/",
        //     type: "post",
        //     data: {
        //         bot_id: 1,
        //     },
        //     headers: {
        //         Authorization: "Bearer "+store.state.user.token,
        //     },
        //     success(resp){
        //         console.log(resp);
        //     },
        //     error(resp){
        //         console.log(resp);
        //     }
        // })

        // const store = useStore();
        // $.ajax({
        //     url: "http://127.0.0.1:3000/user/bot/update/",
        //     type: "post",
        //     data: {
        //         bot_id: 5,
        //         title: "Bot新标题",
        //         description: "Bot新描述",
        //         content: "Bot新代码",
        //     },
        //     headers: {
        //         Authorization: "Bearer "+ store.state.user.token ,
        //     },
        //     success(resp){
        //         console.log(resp);
        //     },
        //     error(resp){
        //         console.log(resp);
        //     }
        // })

        const store = useStore();
        $.ajax({
            url: "http://127.0.0.1:3000/user/bot/getlist/",
            type: "get",
            headers: {
                Authorization: "Bearer "+ store.state.user.token ,
            },
            success(resp){
                console.log(resp);
            },
            error(resp){
                console.log(resp);
            }
        })
    }

}
</script>

<style scoped>

</style>