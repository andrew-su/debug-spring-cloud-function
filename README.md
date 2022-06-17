# debug-spring-cloud-function

Issue: Unable to change the packages to scan for function

1. Build application
    ```
    make application
    ```

1. Run application
    ```
    java -jar application/target/*.jar
    ```

1. Make a request
    ```
    curl -H "Content-Type: text/plain" -d Andrew -i -w'\n' localhost:8080/tired
    ```

Here we see that it works.

Now we can try to do this again but change the packages to scan for function

1. Run application specifying new packages to scan
    ```
    java -jar application/target/*.jar --spring.cloud.function.scan.packages=com.example.newfunc
    ```

1. Make a request
    ```
    curl -H "Content-Type: text/plain" -d Andrew -i -w'\n' localhost:8080/happy
    ```

Here we see it still invokes the `tired` function.
