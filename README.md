# IBM Cloud Pak for Data - Connector SDK

This project allows developers to implement their own connectors to data sources that are not supported out-of-the-box by IBM® Cloud Pak for Data. SDK connectors are based on Apache Arrow Flight. The SDK is primarily designed for developing connectors in Java, but a connector could be developed in any language supported by Apache Arrow Flight provided that the connector adheres to the specification described by the SDK Guide.

## Documentation

* [SDK Guide](guide.md)
* [Apache Arrow Flight](https://arrow.apache.org/docs/format/Flight.html)

## License

This SDK is distributed under the Apache 2.0 license.

## How to build a connector

`cd <SDK-directory>/sdk-gen`
  
`./gradlew build -x test -x pmdMain`
  
Once the Docker service is running, you can build a Docker image:
  
`./gradlew dockerBuild`

`./gradlew dockerStart`

## What has been done

* SDK connector has been generated
* Docker image has been built
* Local connector to CockroachDB has been established

## What was the problem

The problem has ocurred while getting list of actions.

File ~\anaconda3\envs\base1\lib\site-packages\pyarrow\_flight.pyx:1408, in pyarrow._flight.FlightClient.list_actions()

File ~\anaconda3\envs\base1\lib\site-packages\pyarrow\_flight.pyx:1412, in pyarrow._flight.FlightClient.list_actions()

File ~\anaconda3\envs\base1\lib\site-packages\pyarrow\_flight.pyx:67, in pyarrow._flight.check_flight_status()

FlightUnauthenticatedError: Flight returned unauthenticated error, with message: Unauthenticated (invalid or missing auth token)
