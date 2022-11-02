const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: true,
  configureWebpack:{
    devServer:{
      proxy:{
        '/api':{
          target:'http://localhost:8081',
          pathRewrite:{
            '^/api':''
          }
        }
      }
    }
  }
})
