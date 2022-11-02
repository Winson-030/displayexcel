<template>
  <div>
    <el-container>

      <el-card :body-style="{padding:'10px'}">
        <el-upload
            ref="upload"

            drag
            multiple
            :limit="1"
            :before-upload="beforeUpload"
            :on-success="handleSuccess"
            :auto-upload="false"
            :on-error="handleError"
            :action="'http://localhost:8081/api/upload'+'?=name'+'filename'">
          <div><i class="el-icon-upload"/> 添加文件</div>
          <div slot="tip" class="el-upload__tip"><h3>上传excel文件，不超过100M</h3></div>
        </el-upload>
        <el-button :loading="loading" type="primary" @click="upload">确认上传</el-button>
        <el-button :loading="loading" type="primary" @click="deleteALL">删除数据</el-button>
      </el-card>
    </el-container>
  </div>

</template>

<script>



export default {
  name: 'UploadPage',
  components:{

  },
  data() {
    return {
      loading: false,
    }
  },
  methods: {
    // 上传文件
    upload() {
      this.$refs.upload.submit()
    },
    //上传校验
    beforeUpload(file) {
      let isLt2M = true
      isLt2M = file.size / 1024 / 1024 < 100
      if (!isLt2M) {
        this.loading = false
        this.$message.error('上传文件大小不能超过 100MB!')
      }
      this.filename = file.name
      return isLt2M
    },
    handleSuccess(response, file, fileList) {
      this.$refs.upload.clearFiles()
      this.$notify({
        title: '上传成功',
        type: 'success',
        duration: 2500
      })
      setTimeout(() => {
        location.reload()
      },500)

    },
    // 监听上传失败
    handleError(e, file, fileList) {
      const msg = JSON.parse(e.message)
      this.$notify({
        title: msg.message,
        type: 'error',
        duration: 2500
      })
      this.loading = false
    },
    //删除全部数据，重置数据库表
    deleteALL(){
      this.axios({
        method:'delete',
        url:'http://localhost:8081/api/deleteall'
      }).then(()=>{
        location.reload()
        this.$notify({
          title: 'delete success',
          type: 'info',
          duration: 2500
        })
      })
    }
  }
}
</script>
