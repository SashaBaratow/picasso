package com.picasso.crm.api.configurations;

import com.picasso.crm.api.configurations.conditions.H2FileModeCondition;
import lombok.extern.slf4j.Slf4j;
import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

@Slf4j
@Configuration
public class H2Configuration {
    @Bean(initMethod = "start", destroyMethod = "stop")
    @Conditional(H2FileModeCondition.class)
    public Server inMemoryH2DatabaseServer() throws SQLException {
        Server tcpServer = Server.createTcpServer(
                "-tcp", "-tcpAllowOthers", "-tcpPort", "9090");

        log.info("TCP server for H2 file mode DBMS started on port 9090");

        return tcpServer;
    }
}
