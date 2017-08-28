FROM openjdk:9-jre-slim

WORKDIR /app

ADD build/libs/snowflake.jar /app

CMD [ "java", "-cp", "./snowflake.jar", "snowflake.Snowflake" ]

