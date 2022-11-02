<template >
<div id="app">
  <el-container>
    <el-header><h1>Excel Upload and Display Demo</h1></el-header>
    <el-main>
      <el-row type="flex" justify="center">
        <el-col :span="5">
          <upload-page></upload-page>
        </el-col>
      </el-row>



    </el-main>
    <Table></Table>
  </el-container>


</div>

</template>

<script>

import UploadPage from "@/components/UploadPage";
import Table from "@/components/Table";
export default {
  name: 'App',
  components: {
    UploadPage,
    Table


  },
  data(){
    return {
      fade:'',
      show: true,
    }
  },
  // watch:{
  //   '$route'(to,from){
  //     if (from.path === '/' || from.path === 'table'){
  //
  //       if (to.path ==='/table'|| to.path === '/'){
  //         this.show = false;
  //         this.transition = 'slide-right';
  //       }
  //     }
  //   }
  // }
}
</script>

<style>

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;

  /*color: #2c3e50;*/

}
.child-view {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  transition: all .5s cubic-bezier(.55, 0, .1, 1);
}
.el-header, .el-footer {

  color: #333;
  text-align: center;

  line-height: 60px;
  font: 400 1.5rem 'Montserrat';
  background: linear-gradient(to right, #06599b 10%, #01ef96 50%, #06599b 90%);
  background-size: 200% auto;
  background-clip: inherit;
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  animation: animate 2s linear infinite;
}
.el-header > h1{
  margin: 0;
}


.el-main {
  background-color: #E9EEF3;
  color: #333;
  text-align: center;
  /*line-height: 160px;*/
}

body > .el-container {
  margin-bottom: 40px;
}


</style>
