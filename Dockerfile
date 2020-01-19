FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
EXPOSE 8080
COPY build/libs/*.jar /app/service.jar
CMD ["java", "-jar", "/app/service.jar"]
