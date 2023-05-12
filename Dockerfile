FROM openjdk:17-alpine

LABEL maintainer="newgr8player <newgr8player@outlook.com>"

ARG VERSION

ENV JAVA_OPTS=""
ENV WORK_PATH=/src
ENV SERVER_PORT=8080
ENV TEST_FILE_NAME=app-test

RUN mkdir ${WORK_PATH}

COPY target/batch-${VERSION}.jar ${WORK_PATH}/${TEST_FILE_NAME}.jar

WORKDIR ${WORK_PATH}

EXPOSE ${SERVER_PORT}

ENTRYPOINT ["/bin/sh", "-c", "java ${JAVA_OPTS} -jar ${WORK_PATH}/${TEST_FILE_NAME}.jar --server.port=${SERVER_PORT}"]