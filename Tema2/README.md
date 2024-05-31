## Repositorio de Problemas y Programas de Métodos Numéricos

¡Bienvenido al repositorio de Métodos Numéricos Tema 2 - Métodos de solución de ecuaciones !

Este repositorio está dedicado a brindarte acceso a una variedad de algoritmos, programas y pruebas de ejecución que abordan los siguientes métodos de solución de ecuaciones lineales:

**Método de Bisección:**
   El método de bisección es un algoritmo simple pero efectivo para encontrar las raíces de una función continua en un intervalo. Este método se basa en el teorema del valor intermedio y divide repetidamente el intervalo en dos partes, seleccionando el subintervalo que contiene la raíz. Aunque puede ser más lento que otros métodos, es robusto y garantiza la convergencia a la solución.

 **Método de Regla Falsa:**
   El método de regla falsa es una variante del método de bisección que utiliza una interpolación lineal entre dos puntos extremos del intervalo en lugar de dividirlo por la mitad. Al igual que el método de bisección, busca la raíz de una función continua en un intervalo dado. La principal diferencia radica en la forma en que se aproxima el siguiente punto de iteración, lo que puede acelerar la convergencia en comparación con el método de bisección.

 **Método Newton-Raphson:**
   El método de Newton-Raphson es un método iterativo que utiliza la derivada de la función para encontrar raíces de una función real diferenciable. Este método parte de una estimación inicial y utiliza la tangente a la curva en ese punto para encontrar iterativamente una mejor aproximación de la raíz. Es conocido por su rápida convergencia si se elige una buena estimación inicial y si la función es suave en el entorno de la raíz.

 **Método de la Secante:**
   El método de la secante es otro método iterativo para encontrar raíces de funciones reales. A diferencia del método de Newton-Raphson, no requiere el cálculo de la derivada de la función. En su lugar, aproxima la derivada con una secante formada por dos puntos consecutivos en la curva. Aunque puede ser menos eficiente en términos de convergencia que el método de Newton-Raphson, tiene la ventaja de no requerir el cálculo de la derivada, lo que lo hace más generalizable a una variedad más amplia de funciones.


En este repositorio, encontrarás no solo la descripción teórica de cada método, sino también implementaciones prácticas en forma de programas en java y algoritmos. Además, se proporcionan pruebas de ejecución detalladas que te guiarán a través del proceso de aplicación de cada método, brindándote una comprensión profunda y práctica de su funcionamiento.

## Contenido del Repositorio

## Método de Biseccion

- [Descripción](#descripción-bisección)
- [Algoritmo](#algoritmo-bisección)
- [Ejemplos](#ejemplo-bisección)
- [Programa](./metodo_Biseccion/)


## Método Regla falsa

- [Descripción](#descripción-regla-falsa)
- [Algoritmo](#algoritmo-regla-falsa)
- [Ejemplos](#ejemplo-regla-falsa)
- [Programa](./metodo_ReglaFalsa/)

## Método Newton Raphson

- [Descripción](#descripción-newton-raphson)
- [Algoritmo](#algoritmo-newton-raphson)
- [Ejemplos](#ejemplo-newton-raphson)
-  [Programa](./Newton/)

## Método Secante

- [Descripción](#descripción-secante)
- [Algoritmo](#algoritmo-secante)
- [Ejemplos](#ejemplo-secante)
- [Programa](./Metodo%20de%20la%20secante/)
---

## Método de Bisección

### Descripción Bisección

El método de bisección es una técnica para encontrar las raíces de una función continua en un intervalo. Se basa en el teorema del valor intermedio y divide repetidamente el intervalo en dos partes, seleccionando el subintervalo que contiene la raíz.

![image](https://github.com/xlmdn/problemario-T2/assets/147437527/a9744baa-3877-450f-84e0-53f86a3071f3)


### Algoritmo Bisección

1. Inicializar el intervalo [a, b] donde se sospecha que se encuentra la raíz.
2. Calcular el punto medio c del intervalo: c = (a + b) / 2.
3. Evaluar la función en c.
4. Determinar el nuevo intervalo [a, b] basándose en el signo de la función en c.
5. Repetir los pasos 2-4 hasta alcanzar la precisión deseada.

## Ejemplo Bisección

![image](https://github.com/xlmdn/problemario-T2/assets/147437527/82275286-c036-41db-b973-2f43a56e9a4e)


## Método Regla Falsa

### Descripción Regla Falsa

Sea F(u) continua en un intervalo [a, b]. Suponiendo que F(a) sea de signo contrario a F(b) existe una linea recta que para por la raíz (r) que pertenece al conjunto de números que están en [a, b] tal que F(r)=0.

 
![image](https://github.com/xlmdn/problemario-T2/assets/147437527/d024ebf9-d07d-4fc2-9d76-487ecde3c28d)


### Algoritmo Regla Falsa

El método consiste en lo siguiente:

Debe existir seguridad sobre la continuidad de la función f(x) en el intervalo [a,b].

A continuación se verifica que  cumpla con el teorema de Bolzano.

Se evaluan los intervalos  [a,b] en la funcion.

Se calcula el punto medio [m] del intervalo [a,b]  los resultados se evaluan en la ecuacion para hallar [m] y se evalúa f(m) si ese valor es igual a cero, ya hemos encontrado la raíz buscada.

En caso de que no lo sea, verificamos si f(m) tiene signo opuesto con f(a) o con f(b).

Se redefine el intervalo [a, b] como [a, r] ó [r, b] según se haya determinado en cuál de estos intervalos ocurre un cambio de signo.

Con este nuevo intervalo se continúa sucesivamente encerrando la solución en un intervalo cada vez más pequeño, hasta alcanzar la precisión deseada.

 

### Ejemplo Regla Falsa

![image](https://github.com/xlmdn/problemario-T2/assets/147437527/7d9388ab-462a-4dce-9c28-d346e92a7004)


## Método Newton Raphson

### Descripción Newton Raphson

El método de Newton-Raphson, permite hallar una raíz de una ecuación no-lineal siempre y cuando se parta de una buena estimación inicial de la misma.
El esquema iterativo de Newton puede derivarse del desarrollo de Taylor de la función alrededor de la estimación inicial.

![image](https://github.com/xlmdn/problemario-T2/assets/147437527/d1e64189-d694-4140-b597-69b4c2880311)


### Algoritmo Newton Raphson

![image](https://github.com/xlmdn/problemario-T2/assets/147437527/b0fded6c-7f48-497d-81a4-e4e2b878a954)


### Ejemplo Newton Raphson

![image](https://github.com/xlmdn/problemario-T2/assets/147437527/e24efba0-36bc-4afe-8853-821d1e179964)


## Método Secante

### Descripción Secante

Es una variación del método de Newton-Raphson donde en vez de calcular la derivada de la función en el punto de estudio, teniendo en mente la definición de derivada, se aproxima la pendiente a la recta que une la función evaluada en el punto de estudio y en el punto de la iteración anterior.

![image](https://github.com/xlmdn/problemario-T2/assets/147437527/c6de2977-bfe4-4e1b-a575-ec4466726717)


### Algoritmo Secante

![image](https://github.com/xlmdn/problemario-T2/assets/147437527/1d0616a9-2c82-44dc-9223-3ff05f4f3fd1)

### Ejemplo Secante

![image](https://github.com/xlmdn/problemario-T2/assets/147437527/0b054ed8-2dc7-41a9-8dda-c65530904a48)


## Contribuciones y Retroalimentación:

Este repositorio es un recurso en constante evolución, y tu contribución es fundamental para mejorarlo. Si tienes sugerencias, correcciones o nuevos recursos que te gustaría compartir, no dudes en hacer una contribución al repositorio. Además, apreciamos cualquier retroalimentación que tengas sobre tu experiencia utilizando este material.

¡Esperamos que este repositorio sea una herramienta valiosa para tu estudio y práctica de Métodos Numéricos! Si tienes alguna pregunta o necesitas ayuda adicional, no dudes en ponerte en contacto.

¡Que disfrutes explorando el mundo de los Métodos Numéricos!

Atentamente, 

Axel Madin
