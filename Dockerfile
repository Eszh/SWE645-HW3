FROM openjdk:17
COPY surveyjar.jar surveyjar.jar
ENTRYPOINT ["java", "-jar", "/surveyjar.jar"]
EXPOSE 8080