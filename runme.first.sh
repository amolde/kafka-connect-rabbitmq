export JAVA_HOME=$(/usr/libexec/java_home 1.8)
mvn install -DskipTests
cp target/kafka-connect-rabbitmq-0.0.3-tls.jar ~/ckg/cp-kafka-connect/jars/.
