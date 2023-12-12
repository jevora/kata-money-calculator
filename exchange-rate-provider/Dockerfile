# Utiliza una imagen base que incluya Java (por ejemplo, OpenJDK)
FROM openjdk:20
# Copia el script Bash al contenedor
COPY target/exchange-rate-provider-1.0.0.jar /home
# EXPOSE PORT
EXPOSE 8080
ENV ERP_PORT 8080
# Comando de inicio para ejecutar la aplicación Java
CMD ["java", "-jar", "/home/exchange-rate-provider-1.0.0.jar"]
