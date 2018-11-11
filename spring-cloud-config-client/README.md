#Config客户端
###1. 添加向eureka注册功能，并开启高可用
###1号坑. 不能使用application.yml而必须使用bootstrap.yml进行配置。否则不生效。
###2号坑. git版本库中，对应的文件文件名为此项目配置的`spring.application.name`属性。
###3号坑. git分支使用`label`属性进行切换。文件状态名使用使用`profile`进行切换。
###3号坑. 不使用web依赖，会导致启动完成后直接关闭（可能是因为别的项目中的依赖包已经间接以来的web包）
