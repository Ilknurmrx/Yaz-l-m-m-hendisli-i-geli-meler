package javadockeruygulama;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class JavaDockerUygulama {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        HttpServer server = HttpServer.create(new InetSocketAddress("0.0.0.0", port), 0);
        
        // Ana sayfa için handler
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "<h1>Merhaba Dünya!</h1>";
                
                // CORS ayarlarını ekle
                exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
                exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
                exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type,Authorization");
                
                // Content-Type ayarı
                exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
                
                // OPTIONS isteği için özel yanıt
                if (exchange.getRequestMethod().equalsIgnoreCase("OPTIONS")) {
                    exchange.sendResponseHeaders(204, -1);
                    return;
                }
                
                exchange.sendResponseHeaders(200, response.getBytes("UTF-8").length);
                
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes("UTF-8"));
                }
            }
        });

        // Sunucuyu başlat
        server.setExecutor(null);
        server.start();
        System.out.println("Sunucu başlatıldı: http://0.0.0.0:" + port);
    }
}

