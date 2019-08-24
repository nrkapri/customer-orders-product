#delete services
kubectl delete service second-service
#delete deployments
kubectl delete deployment second-service
#delete configmap
kubectl delete configmap second-service

#apply configmap
kubectl apply -f configmap.yaml
kubectl get configmap second-service
#apply deployment
kubectl apply -f deployment.yml
kubectl get deployment  second-service
#apply service
kubectl apply -f service.yml
kubectl get services
