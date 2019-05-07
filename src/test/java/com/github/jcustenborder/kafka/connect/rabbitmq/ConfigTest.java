package com.github.jcustenborder.kafka.connect.rabbitmq;


import com.rabbitmq.client.ConnectionFactory;
import org.apache.kafka.common.config.ConfigDef;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

public class ConfigTest {
  @Test
  public void simpleConfigTest() {
    ConfigDef configDef = RabbitMQConnectorConfig.config();
    RabbitMQConnectorConfig config = new RabbitMQConnectorConfig(configDef, new HashMap<>());

    assertNotNull(config.connectionFactory);
    assertEquals(config.username, ConnectionFactory.DEFAULT_USER);
    assertEquals(config.password, ConnectionFactory.DEFAULT_PASS);
  }
}
