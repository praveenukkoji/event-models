# Event Models

`event-models` is a library that provides Kafka-style event formats for common events such as `OrderEvent` and `PaymentEvent`. It is designed for use in microservice architectures, where events are sent through Kafka. This library can be integrated into your project as a dependency from Maven Central.

## Kafka Event Formats

This library includes the following event formats:

### OrderEvent
`OrderEvent` represents an event related to a customer's order in an e-commerce platform.

#### Example of `OrderEvent`:

```java
public class OrderEvent {
    private String orderId;
    private String status;
    private String message;
}
```

### PaymentEvent
`PaymentEvent` represents an event related to a customer's payment in an e-commerce platform.

#### Example of `PaymentEvent`:

```java
public class PaymentEvent {
    private String paymentId;
    private String status;
    private String orderId;
    private String message;
}
```

## Adding Dependency to Your Project
You can include the event-models library as a dependency in your Maven.

Also, you can visit maven central repo [link](https://search.maven.org/artifact/io.github.praveenukkoji/event-models)

```xml
<dependency>
    <groupId>io.github.praveenukkoji</groupId>
    <artifactId>event-models</artifactId>
    <version>0.0.5</version>
</dependency>
```

## Steps to deploy new version on maven central repo

```text 
   mvn clean deploy
```

also you can refer this [video_link](https://www.youtube.com/watch?v=xEMOF443WI8&pp=ygUjZGVwbG95IGRlcGVuZGVuY3kgdG8gbWF2ZW4gY2VudHJhbCA%3D)

## License
This project is licensed under the PraveenUkkoji's Org.