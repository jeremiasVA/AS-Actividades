# AS-Actividades
# Sistema de Pedidos - Cafetería (Java)
Este proyecto es una simulacion por consola de un sistema de pedidos de cafeteria usando Java, aplicando **6 patrones de diseño**

## Patrones utilizados:

**Creacionales**
Builder: Para construir pedidos personalizados
Factory Method: Para crear productos según su categoria

**Estructurales**
DAO: Acceso simulado al catalogo de productos
Decorator: Personalizacion dinamica (extra leche, sin azucar, tamaño)

**Comportamiento**
Command: Encapsula la accion de registrar pedidos
Observer: Notifica a cliente y cocinero cuando hay un nuevo pedido

## Funcionamiento
Muestra un catalogo
Dos clientes hacen pedidos personalizados
Se registran y notifican pedidos
Se imprime el historial de pedidos