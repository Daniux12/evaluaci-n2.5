# GPSMapsApp 

## Descripción 
Este proyecto es una aplicación Android que implementa medidas de seguridad para proteger contra vulnerabilidades comunes. 

## Vulnerabilidades Identificadas 
- Solicitud firmada con certificado de depuración
- Depuración habilitada para la aplicación
- Copias de seguridad de datos permitidas

## Mejoras Implementadas 
- Deshabilitar el modo de depuración
- Aplicar certificado de fijación
- Deshabilitar copias de seguridad
- Control de acceso a la ubicación bajo demanda
- Uso de HTTPS para asegurar la comunicación de red

## Documentación 
- [Vulnerabilidades](vulnerabilities.md) 
- [Best Practices](best_practices.md) 
- [Security Tips](security_tips.md) 
- [Security Improvement Program](security_improvement_program.md) 

## Cómo Ejecutar la Aplicación de Forma Segura 
1. Clonar el repositorio 
2. Importar el proyecto en Android Studio 
3. Ejecutar la aplicación en un dispositivo o emulador 
4. Asegurarse de que los permisos necesarios están configurados 

## Reporte de Vulnerabilidades 
El reporte detallado de las pruebas de vulnerabilidad realizadas se encuentra en el archivo `vulnerability_report.pdf`.
