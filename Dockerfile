FROM eclipse-temurin:17
COPY target/devtask.jar devtask.jar
CMD [ "java","-jar","devtask.jar" ]