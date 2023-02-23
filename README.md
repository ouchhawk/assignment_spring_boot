# Spring Boot WebSocket Implementation

### Specifications
* API sends messages to the clients who subscribe it and clients start receiving data from websocket once they connect to the API at [http://localhost:8080](http://localhost:8080).
* To create message content, JavaFaker Library generates random data with 1 second of initial delay and 10 seconds of period.
* H2 Database is used to store generated data.
* REST provides stored data at [http://localhost:8080/v1/api/registry](http://localhost:8080/v1/api/registry).

### References

* [Git Repository of Spring Boot Tutorial by RameshMF](https://github.com/RameshMF/spring-boot-tutorial/tree/master/springboot-stomp-websocket)
* [Intro to WebSockets with Spring by Baeldung](https://www.baeldung.com/websockets-spring)
