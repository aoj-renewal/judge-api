# JudgeAPI

## Build & Push Docker Image

```
$ docker login
$ ./gradlew build buildDocker
```

## Launch App in Docker

```
$ cd [Your WorkSpace]
$ git clone https://gist.github.com/ababup1192/c4ca7614e5c4345c4deec5447a75c29b judge-docker
$ cd judge-docker
$ docker-compose -d up web
// Launch Application on ${docker ip}:8090
```

## Launch App in Production's Environment
```
// tmux
$ cd [YOUR WORKSPACE]
// First time
$ git clone http://ground.u-aizu.ac.jp:8080/git/AOJRenewal/judge-api.git
$ cd  judge-api
$ ./gradlew bootRun
```

## Modify and Launch
```
$ cd [judge-api project root]
$ git pull
// Stop Spring Server
$ C-c
$ ./gradlew bootRun
$ systemctl restart nginx
```