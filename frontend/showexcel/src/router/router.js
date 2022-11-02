import Vue from "vue";
import VueRouter from '@vue/cli-plugin-router'
import UploadPage from "@/components/UploadPage";
import App from "@/App";
import Table from "@/components/Table";
Vue.use(VueRouter)

const routes = [
    {
        path:'/',
        component: App ,

    },
    {
        path:'/table',
        component: Table,
    }

];
const router =new VueRouter({
    mode:'history',
    routes
})
export {router}