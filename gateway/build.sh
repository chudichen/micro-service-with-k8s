#!/usr/bin/env bash

mvn clean package -Dmaven.test.skip=true

docker_tag="latest"
docker_name="registry.cn-hangzhou.aliyuncs.com/micro-service-study/gateway:${docker_tag}"

docker build -t ${docker_name} .
docker push ${docker_name}

docker images|grep none|awk '{print $3 }'|xargs docker rmi