# Utiliza una imagen base que incluya Java (por ejemplo, OpenJDK)
FROM openjdk:20
# Copia el script Bash al contenedor
COPY target/money-calculator-1.0.0.jar /home
# EXPOSE PORT
ENV ERP_URL http://localhost:8080
# Comando de inicio para ejecutar la aplicación Java
CMD ["java", "-jar", "/home/money-calculator-1.0.0.jar"]
