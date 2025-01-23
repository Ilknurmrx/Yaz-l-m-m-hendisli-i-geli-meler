# Java 17 JDK imajını temel alın
FROM openjdk:17

# Çalışma dizinini ayarla
WORKDIR /usr/src/app

# 8080 portunu dışarıya aç
EXPOSE 8080

# Volume ile bağlanacak, COPY komutu kaldırıldı

# Uygulamayı çalıştır (0.0.0.0 adresi ile dışarıdan erişime izin ver)
CMD ["sh", "-c", "javac -d classes src/javadockeruygulama/JavaDockerUygulama.java && java -Djava.net.preferIPv4Stack=true -cp classes javadockeruygulama.JavaDockerUygulama"]
