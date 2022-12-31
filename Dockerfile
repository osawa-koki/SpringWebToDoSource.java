FROM openjdk:17
RUN microdnf install findutils
COPY . /work
WORKDIR /work
RUN chmod +x ./gradlew
RUN ./gradlew build
RUN mv /work/build/libs/WebToDoStarter.jar /work/app.jar
ENTRYPOINT ["java", "-jar", "/work/app.jar"]