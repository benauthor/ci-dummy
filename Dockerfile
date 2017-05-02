FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/ci-dummy.jar /ci-dummy/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/ci-dummy/app.jar"]
