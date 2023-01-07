const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  // devServer:{
  //   host: '0.0.0.0',
  //   port:8080,
  //   client: {
  //     webSocketURL: 'ws://127.0.0.1:3000/ws',
  //   },
  //   headers: {
  //     'Access-Control-Allow-Origin': '*',
  //   }
  // }
})
