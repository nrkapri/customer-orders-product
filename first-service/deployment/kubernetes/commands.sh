#!/bin/bash
echo "Kubernetes updates ....."

#delete services
echo "Deleting services for first-service"
kubectl delete service first-service

#delete deployments
echo "Deleting deployment for first-service"
kubectl delete deployment first-service

#delete configmap
echo "Deleting configmap for first-service"
kubectl delete configmap first-service

#apply configmap
echo "Creating  configmap for first-service"
kubectl apply -f configmap.yaml
kubectl get configmap first-service

#apply deployment
echo "Creating deployment for first-service"
kubectl apply -f deployment.yaml
kubectl get deployment  first-service

#apply service
echo "Creating services for first-service"
kubectl apply -f service.yaml
kubectl get services first-service
