#!/bin/bash

kubectl delete -f eureka/Deployment.yaml
kubectl delete -f gateway/Deployment.yaml
#kubectl delete -f course-service/Deployment.yaml
#kubectl delete -f message-service/Deployment.yaml
kubectl delete -f user-edge-service/Deployment.yaml
kubectl delete -f user-service/Deployment.yaml