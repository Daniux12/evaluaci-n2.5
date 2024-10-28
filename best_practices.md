# Best Practices

## 1: Pruebas de Seguridad Regulares
- Herramientas Automática: Se ha implementado MobSF (Mobile Security Framework) para realizar análisis de seguridad de forma automatizada en la aplicación. MobSF permite identificar vulnerabilidades en el código, así como problemas de configuración y dependencias inseguras. Esto asegura una revisión regular y sistemática del estado de seguridad de la aplicación.
  
## 2: Gestión Segura de APIs y Claves
- Almacenamiento Seguro de Claves API: Todas las credenciales, como la API key utilizada para los servicios de mapas, se almacenan de manera segura . Este sistema protege las claves contra accesos no autorizados, garantizando que no queden expuestas en el código fuente.
- Evitar Exposición en el Código: Se ha implementado un proceso riguroso de revisión del código para asegurar que ninguna clave API o credencial sensible se incluya accidentalmente en el repositorio. Se utilizan archivos de configuración que no se versionan para manejar estas credenciales, minimizando el riesgo de exposición.

## 3. Asegurar la Comunicación de Red
- Uso de HTTPS: Todas las solicitudes de red se realizan a través de URLs que comienzan con `https://`, asegurando que la comunicación sea segura y cifrada.

## 4. Control de Acceso a la Ubicación
- Acceso a la Ubicación Bajo Demanda: Se ha modificado el acceso a la ubicación para solicitar permisos solo cuando es realmente necesario, minimizando la exposición de datos de ubicación del usuario.

## 5. Deshabilitar Modo de Depuración
- Modo de Producción: Se ha deshabilitado el modo de depuración configurando `android:debuggable` en `false` en el archivo `AndroidManifest.xml`. Esto evita que la aplicación pueda ser depurada, protegiendo así el código y los datos sensibles en un entorno de producción.
