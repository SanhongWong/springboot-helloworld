FROM java:8-jdk-alpine
ENV TZ 'Asia/Shanghai'
RUN apk upgrade --no-cache \
&& apk add --no-cache tzdata \
&& echo "${TZ}" > /etc/timezone \
&& ln -sf /usr/share/zoneinfo/${TIME_ZONE} /etc/localtime \
&& rm -rf /var/cache/apk/*
WORKDIR /home/springboot
CMD ["java", "-jar", "springboot-helloworld-0.0.1-SNAPSHOT.jar"]
