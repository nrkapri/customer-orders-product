#delete services
kubectl delete service first-service
#delete deployments
kubectl delete deployment first-service
#delete configmap
kubectl delete configmap first-service

#apply configmap
kubectl apply -f configmap.yaml
kubectl get configmap first-service
#apply deployment
kubectl apply -f deployment.yml
kubectl get deployment  first-service
#apply service
kubectl apply -f service.yml
kubectl get services
