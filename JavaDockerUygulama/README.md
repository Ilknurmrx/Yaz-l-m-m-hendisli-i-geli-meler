# Java Docker Uygulaması

Bu proje, basit bir Java uygulamasının Docker konteynerinde çalıştırılmasını göstermektedir.

## Docker ile Çalıştırma

### Docker Image Oluşturma
```bash
docker build -t java-docker-app .
```

### Docker Container Çalıştırma
```bash
docker run -p 8080:8080 -it java-docker-app
```

### Docker Compose ile Çalıştırma
```bash
docker-compose up --build
```

## Uygulamanın Çalıştığını Kontrol Etme
- Uygulama başarıyla çalıştığında konsol çıktısını görebilirsiniz
- 8080 portunda çalışan uygulamaya http://localhost:8080 adresinden erişebilirsiniz