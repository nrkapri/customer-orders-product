#!/bin/bash
echo "Kubernetes updates ....."

#delete services
echo "Deleting services for customer-service"
kubectl delete service customer-service

#delete deployments
echo "Deleting deployment for customer-service"
kubectl delete deployment customer-service

#delete configmap
echo "Deleting configmap for customer-service"
kubectl delete configmap customer-service

#apply configmap
echo "Creating  configmap for customer-service"
kubectl apply -f configmap.yaml
kubectl get configmap customer-service

#apply deployment
echo "Creating deployment for customer-service"
kubectl apply -f deployment.yaml
kubectl get deployment  customer-service

#apply service
echo "Creating services for customer-service"
kubectl apply -f service.yaml
kubectl get services customer-service
