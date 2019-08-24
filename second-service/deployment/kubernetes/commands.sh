#!/bin/bash
echo "Kubernetes updates ....."

#delete services
echo "Deleting services for second-service"
kubectl delete service second-service

#delete deployments
echo "Deleting deployment for second-service"
kubectl delete deployment second-service

#delete configmap
echo "Deleting configmap for second-service"
kubectl delete configmap second-service

#apply configmap
echo "Creating  configmap for second-service"
kubectl apply -f configmap.yaml
kubectl get configmap second-service

#apply deployment
echo "Creating deployment for second-service"
kubectl apply -f deployment.yaml
kubectl get deployment  second-service

#apply service
echo "Creating services for second-service"
kubectl apply -f service.yaml
kubectl get services second-service
