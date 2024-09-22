package com.amany.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        /*WebSocketHandler() will handle WebSocket messages, connections, and disconnections
         associated with "/websocket" endpoint that can be accessed by anyone
         */
        registry.addHandler(new WebSocketHandler(), "/websocket").setAllowedOrigins("*");
    }
}
