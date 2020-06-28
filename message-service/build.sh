#!/usr/bin/env bash

mvn package -f ./message-provider/pom.xml -Dmaven.test.skip=true

docker_name="registry.cn-hangzhou.aliyuncs.com/micro-service-study/message-spring-cloud-service"

docker build -t ${docker_name} .
docker push ${docker_name}
