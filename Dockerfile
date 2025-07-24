FROM gradle AS build

WORKDIR /work

COPY . .

RUN ./gradlew build -x test

FROM eclipse-temurin:17

COPY --from=build /work/build/libs/simple-api-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-Dspring.profiles.active=production", "-jar", "./app.jar"]
