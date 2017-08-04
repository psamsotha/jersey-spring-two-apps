
# Jersey Spring Example with Two Jersey Applications

See Stack Overflow question [Jersey 2.23 with multiple servlets and @Context issues](https://stackoverflow.com/q/45497396/2587435).


**To run the project:**

1. `mvn clean install`
2. `mvn jetty:run`

**Endpoints**

    curl -i http://localhost:8080/api/v1/greeting -H "Authorization: Cool Guy"
    curl -i http://localhost:8080/api/v2/greeting -H "Authorization: Cool Guy"

There shouldn't be any problems like that mentioned in the linked Stack Overflow question. The `AuthenticationFilter`
injects the `HttpServletRequest` just like the OP does.

