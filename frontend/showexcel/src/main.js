import Vue from 'vue'
import App from './App.vue'
import VueAxios from "vue-axios"
import axios from "axios";
// import {router} from '@/router/router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
Vue.config.productionTip = false
Vue.use(VueAxios,axios)
Vue.use(ElementUI)
new Vue({
  // router,
  render: h => h(App),
}).$mount('#app')
