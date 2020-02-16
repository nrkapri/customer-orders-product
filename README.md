# kubernetes
This is a sample microservice application for classic "customer orders product" use case.

Each microservice is developed using spring boot. <br/>
Spring boot application is dockerized. <br/>
Application is deployed in kubernetes.<br/>

<pre><font color="#268BD2"><b>.</b></font>
|-- <font color="#268BD2"><b>customer-service</b></font>
|-- <font color="#268BD2"><b>order-service</b></font>
|-- <font color="#268BD2"><b>product-service</b></font>
|-- <font color="#268BD2"><b>first-service</b></font>
`-- <font color="#268BD2"><b>second-service</b></font>
</pre>




To demonstrate calling one service from another within kubertentes second-service calls first-service:

<pre><font color="#268BD2"><b>.</b></font>

|-- <font color="#268BD2"><b>first-service</b></font>
`-- <font color="#268BD2"><b>second-service</b></font>
</pre>


<h2>customer-service design: </h2>
<pre><font color="#268BD2"><b>.</b></font>
|-- Dockerfile
|-- README.md
|-- build.gradle
|-- <font color="#268BD2"><b>deployment</b></font>
|   `-- <font color="#268BD2"><b>kubernetes</b></font>
|       |-- commands.sh
|       |-- configmap.yaml
|       |-- deployment.yaml
|       |-- ingress.yaml
|       `-- service.yaml
|-- <font color="#268BD2"><b>gradle</b></font>
|   `-- <font color="#268BD2"><b>wrapper</b></font>
|       |-- <font color="#DC322F"><b>gradle-wrapper.jar</b></font>
|       `-- gradle-wrapper.properties
|-- gradlew
|-- gradlew.bat
|-- manifest.yml
|-- mvnw
|-- mvnw.cmd
|-- pom.xml
|-- <font color="#268BD2"><b>resource</b></font>
|   |-- application.properties
|   |-- bootstrap.properties
|   `-- customer-service.yaml
`-- <font color="#268BD2"><b>src</b></font>
    |-- <font color="#268BD2"><b>main</b></font>
    |   `-- <font color="#268BD2"><b>java</b></font>
    |       `-- <font color="#268BD2"><b>com</b></font>
    |           `-- <font color="#268BD2"><b>nayank</b></font>
    |               |-- <font color="#268BD2"><b>a</b></font>
    |               |   `-- <font color="#268BD2"><b>launcher</b></font>
    |               |       `-- Application.java
    |               |-- <font color="#268BD2"><b>b</b></font>
    |               |   `-- <font color="#268BD2"><b>controller</b></font>
    |               |       |-- CustomerApiController.java
    |               |       `-- GreetingController.java
    |               |-- <font color="#268BD2"><b>c</b></font>
    |               |   `-- <font color="#268BD2"><b>restresource</b></font>
    |               |       `-- Greeting.java
    |               |-- <font color="#268BD2"><b>d</b></font>
    |               |   `-- <font color="#268BD2"><b>service</b></font>
    |               |       |-- AddCutomerRequestProcessor.java
    |               |       |-- CustomerApiService.java
    |               |       |-- CustomerApiServiceImpl.java
    |               |       |-- DeleteCutomerRequestProcessor.java
    |               |       `-- GenericServiceTemplate.java
    |               |-- <font color="#268BD2"><b>f</b></font>
    |               |   `-- <font color="#268BD2"><b>persistance</b></font>
    |               |       |-- Address.java
    |               |       |-- Customer.java
    |               |       `-- CustomerRepository.java
    |               `-- <font color="#268BD2"><b>g</b></font>
    |                   `-- <font color="#268BD2"><b>logging</b></font>
    |                       `-- LoggingAspect.java
    `-- <font color="#268BD2"><b>test</b></font>
        `-- <font color="#268BD2"><b>java</b></font>
            `-- <font color="#268BD2"><b>com</b></font>
                `-- <font color="#268BD2"><b>nayank</b></font>
                    `-- <font color="#268BD2"><b>b</b></font>
                        `-- <font color="#268BD2"><b>controller</b></font>
                            |-- CustomerApiControllerTest.java
                            `-- GreetingControllerTest.java
</pre>


<h2>order-service design: </h2>
<pre><font color="#268BD2"><b>.</b></font>
|-- Dockerfile
|-- README.md
|-- build.gradle
|-- <font color="#268BD2"><b>deployment</b></font>
|   `-- <font color="#268BD2"><b>kubernetes</b></font>
|       |-- commands.sh
|       |-- configmap.yaml
|       |-- deployment.yaml
|       |-- ingress.yaml
|       `-- service.yaml
|-- <font color="#268BD2"><b>gradle</b></font>
|   `-- <font color="#268BD2"><b>wrapper</b></font>
|       |-- <font color="#DC322F"><b>gradle-wrapper.jar</b></font>
|       `-- gradle-wrapper.properties
|-- gradlew
|-- gradlew.bat
|-- manifest.yml
|-- mvnw
|-- mvnw.cmd
|-- pom.xml
|-- <font color="#268BD2"><b>resource</b></font>
|   |-- application.properties
|   |-- bootstrap.properties
|   `-- order-service.yaml
`-- <font color="#268BD2"><b>src</b></font>
    |-- <font color="#268BD2"><b>main</b></font>
    |   `-- <font color="#268BD2"><b>java</b></font>
    |       `-- <font color="#268BD2"><b>com</b></font>
    |           `-- <font color="#268BD2"><b>nayank</b></font>
    |               |-- <font color="#268BD2"><b>a</b></font>
    |               |   `-- <font color="#268BD2"><b>launcher</b></font>
    |               |       `-- Application.java
    |               |-- <font color="#268BD2"><b>b</b></font>
    |               |   `-- <font color="#268BD2"><b>controller</b></font>
    |               |       |-- GreetingController.java
    |               |       `-- OrderApiController.java
    |               |-- <font color="#268BD2"><b>c</b></font>
    |               |   `-- <font color="#268BD2"><b>restresource</b></font>
    |               |       `-- Greeting.java
    |               |-- <font color="#268BD2"><b>d</b></font>
    |               |   `-- <font color="#268BD2"><b>service</b></font>
    |               |       `-- GenericServiceTemplate.java
    |               `-- <font color="#268BD2"><b>g</b></font>
    |                   `-- <font color="#268BD2"><b>logging</b></font>
    |                       `-- LoggingAspect.java
    `-- <font color="#268BD2"><b>test</b></font>
        `-- <font color="#268BD2"><b>java</b></font>
            `-- <font color="#268BD2"><b>com</b></font>
                `-- <font color="#268BD2"><b>nayank</b></font>
                    `-- <font color="#268BD2"><b>b</b></font>
                        `-- <font color="#268BD2"><b>controller</b></font>
                            `-- GreetingControllerTests.java
</pre>

<h2>product-service design: </h2>
<pre><font color="#268BD2"><b>.</b></font>
|-- Dockerfile
|-- README.md
|-- build.gradle
|-- <font color="#268BD2"><b>deployment</b></font>
|   `-- <font color="#268BD2"><b>kubernetes</b></font>
|       |-- commands.sh
|       |-- configmap.yaml
|       |-- deployment.yaml
|       |-- ingress.yaml
|       `-- service.yaml
|-- <font color="#268BD2"><b>gradle</b></font>
|   `-- <font color="#268BD2"><b>wrapper</b></font>
|       |-- <font color="#DC322F"><b>gradle-wrapper.jar</b></font>
|       `-- gradle-wrapper.properties
|-- gradlew
|-- gradlew.bat
|-- manifest.yml
|-- mvnw
|-- mvnw.cmd
|-- pom.xml
|-- <font color="#268BD2"><b>resource</b></font>
|   |-- application.properties
|   |-- bootstrap.properties
|   `-- product-service.yaml
`-- <font color="#268BD2"><b>src</b></font>
    |-- <font color="#268BD2"><b>main</b></font>
    |   `-- <font color="#268BD2"><b>java</b></font>
    |       `-- <font color="#268BD2"><b>com</b></font>
    |           `-- <font color="#268BD2"><b>nayank</b></font>
    |               |-- <font color="#268BD2"><b>a</b></font>
    |               |   `-- <font color="#268BD2"><b>launcher</b></font>
    |               |       `-- Application.java
    |               |-- <font color="#268BD2"><b>b</b></font>
    |               |   `-- <font color="#268BD2"><b>controller</b></font>
    |               |       |-- GreetingController.java
    |               |       `-- ProductApiController.java
    |               |-- <font color="#268BD2"><b>c</b></font>
    |               |   `-- <font color="#268BD2"><b>restresource</b></font>
    |               |       `-- Greeting.java
    |               |-- <font color="#268BD2"><b>d</b></font>
    |               |   `-- <font color="#268BD2"><b>service</b></font>
    |               |       `-- GenericServiceTemplate.java
    |               |-- <font color="#268BD2"><b>f</b></font>
    |               |   `-- <font color="#268BD2"><b>persistance</b></font>
    |               |       |-- Address.java
    |               |       |-- Customer.java
    |               |       `-- CustomerRepository.java
    |               `-- <font color="#268BD2"><b>g</b></font>
    |                   `-- <font color="#268BD2"><b>logging</b></font>
    |                       `-- LoggingAspect.java
    `-- <font color="#268BD2"><b>test</b></font>
        `-- <font color="#268BD2"><b>java</b></font>
            `-- <font color="#268BD2"><b>com</b></font>
                `-- <font color="#268BD2"><b>nayank</b></font>
                    `-- <font color="#268BD2"><b>b</b></font>
                        `-- <font color="#268BD2"><b>controller</b></font>
                            `-- GreetingControllerTests.java
</pre>
