#!/bin/bash

kubectl apply -f eureka/Deployment.yaml
kubectl apply -f gateway/Deployment.yaml
#kubectl apply -f course-service/Deployment.yaml
#kubectl apply -f message-service/Deployment.yaml
kubectl apply -f user-edge-service/Deployment.yaml
kubectl apply -f user-service/Deployment.yaml