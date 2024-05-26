# Practice with Metrics & Actuator

### Important points - 25/05/2024

- All servers are launched from local.
- I should find a way to launch servers from docker / docker-compose.
- I tried to use MapStruct for conversion between model classes and dto classes, with issues on automatic generation of classes at runtime, for that reason I used ModelMapper instead.
- Using the annotation `@Timed()` for describing the endpoint metrics, I discovered that a Bean TimeAspect is needed. For this I created a configuration class.