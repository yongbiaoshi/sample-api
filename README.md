# sample-api
Api工程示例代码
## 主要内容

  1. Spring Boot 基本配置
  2. Properties封装以及动态刷新功能
  3. Swagger
  4. 统一返回格式封装，统一异常信息格式 
  5. 请求日志、请求计时过滤器
  6. Sleuth 链路追踪，以及logback日志配置
  7. Validator 数据绑定及绑定验证(分组验证)
  8. 配置动态刷新
  9. 单元测试

## 常用URL

  1. GET /actuator 查看监控，各监控对应的查看连接,mapings、env、health等
  2. POST /acuator/refresh 刷新配置
  3. /swagger-ui.hmtl swagger-ui页面
  4. /v2/api-docs  swagger生成的JSON格式的接口描述
