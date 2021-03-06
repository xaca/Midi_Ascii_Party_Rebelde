# 馃幍馃拑 Midi, Ascii Party Rebelde 馃暫馃幍

## Tener en cuenta:

- Proyecto en parejas
- Se debe crear un repositorio por equipo
- Se debe subir varios commits y push dependiendo de la estrateg铆a de soluci贸n del proyecto
- Se debe interactuar con un archivo, el cual ser谩 constru铆do entre todos los estudiantes
- El proyecto se realizar谩 avanzando cada semana, por tanto debe estar pendiente de este repositorio
- Cada equipo plantea un proyecto que use la lista de canciones y los audios de las mismas

## Criterios de evaluaci贸n:

- (10%) Trabajo en el repositorio, m铆nimo 15 commits* por cada estudiantes para terminar el proyecto
- (10%) Realizar un video de la aplicaci贸n funcionando y publicar en youtube
- (10%) Subir el dise帽o de la letra correspondiente en este repositorio como pull request
- (10%) Configuraci贸n y programaci贸n men煤
- (25%) Programaci贸n de la aplicaci贸n y personalizaci贸n de la interfaz gr谩fica
- (20%) Exposici贸n entrega final ejercicio (Diapositivas y presentaci贸n)
- (5%) Buenas pr谩cticas en el c贸digo
- (10%) Aplicaci贸n del concepto de funciones en el proyecto

:new: * No son validos los commits de seguimiento

## Instrucciones de cada canci贸n

1. Cada grupo debe buscar una canci贸n de rock en espa帽ol en formato midi y subirlo como pull request a la carpeta (/canciones) de este repositorio

2. Luego se debe buscar la letra de la canci贸n, y guardarla en el archivo /recursos/letras.csv, es es un archivo separado por punto y coma, cada frase debe ocupar una l铆nea del achivo y cada palabra debe ocupar una celda.

3. Al principio de los datos de cada canci贸n se debe poner, el nombre de la canci贸n, el autor, el alb煤m, el a帽o y por 煤ltimo el enlace de youtube.

4. Puede ver un ejemplo en la siguiente imagen.

![Archivo letras de las canciones](recursos/ejemplo_archivo.png) 

5. En cada programa se debe leer la letra de la canci贸n y los nombres de los archivos de audio.

6. Se debe poder buscar en la lista de canciones, por medio del autor, palabras claves de la canci贸n, el a帽o, etc. Esto puede ser una funcionalida explicita del programa o puede ser parte de la programaci贸n de uno de los m茅todos de la l贸gica de la aplicaci贸n.

7. Se debe poder imprimir la lista de todas las canciones usadas, o por lo menos cargarlas en memoria.

## Helpers

Son programas de java, con funciones listas, que el estudiante podr谩 usar como ayuda para realizar operaciones en el proyecto.

- Audio: reproduce archivos de audio en formato midi
- ConsoleColors: Contiene la informaci贸n de los colores
- ConsoleFile: Realiza operaciones con archivos
- ConsoleInput: Permite leer datos que el usuario ingrese
- ConsoleData: Procesa un conjunto de datos
- :new: ConsoleAnimator: Base para realizar animacion en consola, sin terminar
- :new: RandomHelper: Calcula numeros aleatorios entre numeros enteres menor, mayor, incluyendo ambos valores.
- :new: AsciiEjemplo: Ejemplo para imprimir men煤 personalizado

## Referentes

- [Guia de markdown](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)
- [Unicode table](https://unicode-table.com/en/)
- [Bitmidi](https://bitmidi.com/)
- [M煤sica midi gratis](http://www.musicamidigratis.com/)
- [Midi world](https://www.midiworld.com/)
- [Video game music archive](http://www.vgmusic.com/)
- [Me gustas tu - Manu Chao](https://genius.com/Manu-chao-me-gustas-tu-lyrics)
- [Ejemplo datos en matriz](https://onlinegdb.com/r14vUiWvu)
- [StringBuilder](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html#replace(int,%20int,%20java.lang.String))
- [Tabla de caracteres Unicode](https://unicode-table.com/es/)
- [Tabla de caracteres latinos](https://ingmmurillo.blogspot.com/2012/05/tabla-de-caracteres-latinos-en-unicode.html)
- [Lectura de archivos grandes usando Stream](https://mkyong.com/java8/java-8-stream-read-a-file-line-by-line/)
- [Interfaz Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
- [Ejemplos Stream](https://stackabuse.com/guide-to-java-streams-foreach-with-examples/)
- [N煤meros aleatrios](https://memorynotfound.com/random-number-inclusive-exclusive-java/)

## Inspiraci贸n

- [Spotify - View lyrics](https://support.spotify.com/us/article/view-lyrics/)
