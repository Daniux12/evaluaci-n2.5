# evaluaci-n2.5

# Reporte de vulnerabilidades

## Resumen
- Total de vulnerabilidades: 10
- Criticas: 2
- Alta: 2
- Advertencia: 3
- Bajo: 2
- Desconocida: 1

  ## Detalle de descubrimientos

  ### Vulnerabilidad 1: Ubicación aproximada
  - Descripción: La aplicación solicita el permiso para acceder a la ubicación aproximada del dispositivo.
  - Severidad: Critico
  - Impacto:  Permite a aplicaciones maliciosas ver la ubicación aproximada del usuario, comprometiendo la privacidad.
  - Pasos para replicar la vulnerabilidad: Instalar y ejecutar la aplicación en un dispositivo. Permitir que la aplicación acceda a la ubicación. Monitorear las solicitudes de ubicación mediante herramientas de análisis de permisos.
  - Remediación: Considerar eliminar la solicitud de permisos de ubicación si no son necesarios. Implementar mecanismos para informar al usuario sobre el uso de estos permisos.

  ### Vulnerabilidad 2: Buena ubicación (GPS)
  - Descripción: La aplicación solicita el permiso para acceder a la ubicación precisa del dispositivo.
  - Severidad: Crítico
  - Impacto: Permite a aplicaciones maliciosas rastrear la ubicación exacta del usuario.
  - Pasos para replicar la vulnerabilidad: Instalar y ejecutar la aplicación en un dispositivo. Permitir el acceso a la ubicación precisa.
  - Remediación: Evaluar la necesidad de este permiso.

  ### Vulnerabilidad 3: Solicitud firmada con certificado de depuración
  - Descripción: La aplicación está firmada con un certificado de depuración.
  - Severidad: Alta
  - Impacto: La aplicación de producción no debe enviarse con un certificado de depuración, lo que puede permitir la manipulación y el análisis por parte de atacantes.
  - Pasos para replicar la vulnerabilidad: Verificar el tipo de certificado utilizado para firmar la APK.
  - Remediación: Firmar la aplicación con un certificado de producción adecuado antes de su lanzamiento.

  ### Vulnerabilidad 4: Solicitud firmada (versión vulnerable de Android)
  - Descripción: La aplicación se puede instalar en versiones anteriores de Android (Android 8.0, minSdk=26).
  - Severidad: Advertencia
  - Impacto: Esta versión puede tener múltiples vulnerabilidades.
  - Pasos para replicar la vulnerabilidad: Instalar la aplicación en un dispositivo con una versión de Android vulnerable.
  - Remediación: Actualizar el minSdkVersion para forzar la instalación en versiones más seguras.

  ### Vulnerabilidad 5: Depuración habilitada para la aplicación
  - Descripción: La aplicación tiene habilitada la depuración (android:debuggable=true).
  - Severidad: Alto
  - Impacto: Facilita que atacantes conecten un depurador y accedan a datos internos de la aplicación.
  - Pasos para replicar la vulnerabilidad: Instalar la aplicación y verificar el estado de debuggable en el manifiesto.
  - Remediación: Deshabilitar la depuración en la versión de producción.

  ### Vulnerabilidad 6: Se pueden realizar copias de seguridad de los datos de la aplicación
  - Descripción: La aplicación permite copias de seguridad de datos (android:allowBackup=true).
  - Severidad: Advertencia
  - Impacto: Permite que los datos sean copiados a través de ADB, lo que podría llevar a la exposición de datos sensibles.
  - Pasos para replicar la vulnerabilidad: Verificar el estado de la bandera de respaldo en el manifiesto.
  - Remediación: Deshabilitar las copias de seguridad de la aplicación si no es necesario.

  ### Vulnerabilidad 7: Receptor de transmisión con permiso no verificado
  - Descripción: Un receptor de transmisión está protegido por un permiso, pero se debe verificar el nivel de protección.
  - Severidad: Advertencia
  - Impacto: Un receptor accesible puede ser utilizado por aplicaciones maliciosas si el permiso no está correctamente definido.
  - Pasos para replicar la vulnerabilidad: Identificar el receptor de transmisión y verificar su configuración de permiso.
  - Remediación: Asegurarse de que los permisos estén correctamente definidos y de que la aplicación verifique el nivel de protección.

  ### Vulnerabilidad 8: Acceso al estado de red
  - Descripción: La aplicación solicita el permiso para acceder al estado de las redes.
  - Severidad: Baja
  - Impacto: Permite ver información sobre la conectividad, pero no afecta gravemente la seguridad del usuario.
  - Pasos para replicar la vulnerabilidad: Instalar la aplicación. Monitorear el uso del permiso de acceso al estado de la red.
  - Remediación: Considerar la necesidad de este permiso y eliminarlo si no es esencial para la funcionalidad de la aplicación.

  ### Vulnerabilidad 9: Acceso a Internet
  - Descripción: La aplicación solicita permiso para acceso completo a Internet.
  - Severidad: Baja
  - Impacto: Permite conexiones a Internet, pero es común en la mayoría de las aplicaciones.
  - Pasos para replicar la vulnerabilidad: Instalar la aplicación. Monitorear las conexiones realizadas.
  - Remediación: Este permiso es común y generalmente aceptado, pero verificar que no se utilice de manera malintencionada.

  ### Vulnerabilidad 10: Receptor dinámico sin permiso de exportación
  - Descripción: La aplicación tiene un receptor dinámico que no tiene permiso de exportación.
  - Severidad: Desconocida
  - Impacto: Podría representar un riesgo si otros componentes intentan interactuar con este receptor.
  - Pasos para replicar la vulnerabilidad: Analizar el código de la aplicación para identificar el receptor dinámico. Verificar si el receptor está diseñado para ser utilizado externamente.
  - Remediación: Asegurarse de que los receptores que no deben ser accesibles externamente tengan los permisos adecuados.

  

