#!/bin/bash
echo "Kubernetes updates ....."

#delete services
echo "Deleting services for order-service"
kubectl delete service order-service

#delete deployments
echo "Deleting deployment for order-service"
kubectl delete deployment order-service

#delete configmap
echo "Deleting configmap for order-service"
kubectl delete configmap order-service

#apply configmap
echo "Creating  configmap for order-service"
kubectl apply -f configmap.yaml
kubectl get configmap order-service

#apply deployment
echo "Creating deployment for order-service"
kubectl apply -f deployment.yaml
kubectl get deployment  order-service

#apply service
echo "Creating services for order-service"
kubectl apply -f service.yaml
kubectl get services order-service
