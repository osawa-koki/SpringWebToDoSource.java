# WebToDoStarter.java

Springフレームワーク(Java)でtodoアプリを作る学習用プロジェクト。  

## 実行方法

普通にEclipseやIntelliJ IDEAで実行すればOK  
<http://localhost:80>へアクセス。  

Dockerで実行するなら以下の通り。  

```shell
docker build -t java-spring-todo .
docker run -p 80:80 -it --rm --name my-java-spring-todo java-spring-todo

# 一行で書くなら
docker build -t java-spring-todo . && docker run -p 80:80 -it --rm --name my-java-spring-todo java-spring-todo
```

## デプロイ設定(Render.com)

| キー | バリュー |
| ---- | ---- |
| Name | java-spring-todo |
| Region | Oregon(US West) |
| Branch | main |
| Root Directory |  |
| Environment | Docker |
| Dockerfile Path | ./Dockerfile |
| Docker Build Context Directory |  |
| Docker Command |  |

## 自分用メモ

### Optional

null許容型的な、、、  
nullの場合の処理を強制する。  

- isPresent
- ifPresent

## 参考文献

- <https://www.udemy.com/share/101w4u3@9mcf2Gbl_hYNQop2w8_6B5L4fzDhgXeC0rmsOpWTN-TSnJXFqZ2YWhllyGoI0LBbKw==/>
