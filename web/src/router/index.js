import { createRouter, createWebHistory } from 'vue-router'
import PkIndexView from '../views/pk/PkIndexView'
import NotFound from '../views/error/NotFound'
import RankListView from '../views/ranklist/RanklistIndexView'
import RecordIndexView from '../views/record/RecordIndexView'
import UserBotIndexView from '../views/user/bot/UserBotIndexView'
import UserAccountLoginView from '../views/user/account/UserAccountLoginView'
import UserAccountRegisterView from '../views/user/account/UserAccountRegisterView'


const routes = [
    {
      path:"/",
      name:"home",
      redirect:"/pk/"
    },
    {
      path:"/pk/",
      component:PkIndexView,
      name:"pk_index"
    },
    {
      path:"/record/",
      component:RecordIndexView,
      name:"record_index"
    },
    {
      path:"/ranklist/",
      component:RankListView,
      name:"ranklist_index"
    },
    {
      path:"/user/bot/",
      component:UserBotIndexView,
      name:"user_bot_index"
    },
    {
      path:"/404/",
      component:NotFound,
      name:"404"
    },
    {
      path:"/user/account/register",
      component:UserAccountRegisterView,
      name:"user_account_register"
    },
    {
      path:"/user/account/login",
      component:UserAccountLoginView,
      name:"user_account_login"
    },
    {
      path:"/:catchAll(.*)/",
      redirect:"/404/"
    },
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
