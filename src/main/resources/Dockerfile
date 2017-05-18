FROM java:8
VOLUME /app-logs
RUN mkdir /usr/local/app
ENV JAVA_OPTS="-Xmx512M -Xss256K -Xmx512m"
COPY springboot-docker-demo-1.0.0.jar /usr/local/app/springboot-docker-demo.jar
WORKDIR /usr/local/app
CMD java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /usr/local/app/springboot-docker-demo.jar
