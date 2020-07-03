#!/usr/bin/env bash

mvn package -Dmaven.test.skip=true

docker_name="registry.cn-hangzhou.aliyuncs.com/micro-service-study/course-spring-cloud-service"

docker build -t ${docker_name} .
docker push ${docker_name}

docker images|grep none|awk '{print $3 }'|xargs docker rmi