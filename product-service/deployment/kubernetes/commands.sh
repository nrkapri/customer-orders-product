#!/bin/bash
echo "Kubernetes updates ....."

#delete services
echo "Deleting services for product-service"
kubectl delete service product-service

#delete deployments
echo "Deleting deployment for product-service"
kubectl delete deployment product-service

#delete configmap
echo "Deleting configmap for product-service"
kubectl delete configmap product-service

#apply configmap
echo "Creating  configmap for product-service"
kubectl apply -f configmap.yaml
kubectl get configmap product-service

#apply deployment
echo "Creating deployment for product-service"
kubectl apply -f deployment.yaml
kubectl get deployment  product-service

#apply service
echo "Creating services for product-service"
kubectl apply -f service.yaml
kubectl get services product-service
