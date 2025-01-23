# Java 17 JDK imajını temel alın
FROM openjdk:17

# Çalışma dizinini ayarla
WORKDIR /usr/src/app

# Kaynak kodlarını kopyala
COPY ./src /usr/src/app/src

# 8080 portunu dışarıya aç
EXPOSE 8080

# Kaynak kodlarını derle
RUN mkdir -p /usr/src/app/classes && \
    javac -d /usr/src/app/classes /usr/src/app/src/javadockeruygulama/JavaDockerUygulama.java

# Uygulamayı çalıştır (0.0.0.0 adresi ile dışarıdan erişime izin ver)
CMD ["java", "-Djava.net.preferIPv4Stack=true", "-cp", "/usr/src/app/classes", "javadockeruygulama.JavaDockerUygulama"]
