# Print-Estoy-Cansado-Jefe--Segundo-Semestre

# Comienzo del Readme
Hemos comenzado con el repositorio, les voy a dejar los comandos que utilice:<br>

* Vimos como he creado el repositorio en la nube GitHub
* Es importante saber que antes de todo esto se debe tener todos los pasos de ingreso y seguridad
* Copiamos el enlace ssh
* Abrimos la terminal de Git Bash como administrador
* Ingresamos el area de trabajo donde queremos agregar el repo
* Yo ingrese a la carpeta Documents


```sh
    cd Documents
    mkdir Proyectos
    cd Proyectos
    git clone git@github.com:Lautaro-404/Prueba-inicio-Repo.git
    cd Prueba-Inicio-Repo
    git pull origin main
    git fetch
    git banch # Veran que esta la rama main por defecto
    touch README.md # Creamos el readme
    git status
    git add .
    git commit -m"Creamos el readme.md"
    git status
    git push origin main
```

## Agregamos este trabajo en el readme online

> Como hacemos esto?

Ingresamos al repositorio y luego solo presionamos punto<br>

```sh
    .
```

Ingresamos toda esta informacion y terminamos.

# Vamos a cargar la llave SSH publica en GitHub

* Para copiar la llave publica debes ir al archivo .ssh y allí encontrarás el archivo .pub lo podes abrir con el txt, luego copiar el contenido que esta dentro.

* Copiar la llave publica #Ir a GitHub, vamos a setting, vamos a SSH and GPG keys

* Crear una nueva #New SSH key poner nombre y pegar la ssh publica, con esto esta listo.

* Aconsejo que la ssh tenga el nombre del ordenador en el que estas trabajando. Esto se debe hacer con cada pc nueva o dispositivo nuevo que tengamos para acceder a nuestra cuenta de GitHub.
```sh
git branch #Vemos en que rama estamos

git checkout master #Ponernos en la rama master

git branch -M main #Cambiamos el nombre a la rama master

git remote add origin git@github.com:nombreUsuario/class-git.git #Agregamos el repositorio remoto, este es un ejemplo

git remote -v #Vemos si ya esta conectado

git merge segunda #Mergeamos lo que tenemos en la rama segunda en main

git commit -am "Uso de GitHub parte 20" #Hacemos el commit de hoy

git push origin main #Pasamos todo lo hecho a GitHub, revisar en el repositorio en GitHub.
```
Frente al cambio de nombre de rama master a main, suele suceder que en el repo de GitHub se hayan creado dos ramas, la rama master y la rama main, se debe ir al repo, settings y ahí se puede cambiar la rama principal, en vez de que siga siendo master, que sea la rama main, luego de eso ya podemos borrar la rama master.


# Cambios en GitHub: de master a main

El escritor Argentino Julio Cortázar afirma que las palabras tienen color y peso. Por otro lado, los sinónimos existen por definición, pero no expresan lo mismo. Feo no es lo mismo que desagradable, ni aromático es lo mismo que oloroso.


* Por lo anterior, podemos afirmar que los sinónimos no expresan lo mismo, no tienen el mismo “color” ni el mismo “peso”.

* Sí, esta lectura es parte de la enseñanza profesional de Git & GitHub.

* Desde el 1 de octubre de 2020 GitHub cambió el nombre de la rama principal: ya no es “master” -como aprenderás aquí- sino main.

* Este derivado de una profunda reflexión ocasionada por el movimiento #BlackLivesMatter.

* La industria de la tecnología lleva muchos años usando términos como master, slave, blacklist o whitelist y esperamos pronto puedan ir desapareciendo.

Y sí, las palabras importan.

Por lo que de aquí en adelante cada vez que me escuches mencionar “master” debes saber que hago referencia a “main”.

## ¿Cuando es que sigue siendo master y cuando sigue siendo main?
Cuando se crea un repositorio desde git bash en nuestro ordenador a través de git init, sigue siendo el estandar como master. ¿Qué hacer con esto? Debes cambiar el nombre de la rama master a main con el comando:
```sh
 git branch -M main
```
O cambiando la asignación por default con este otro comando:
```sh
git config --global init.defaultBranch main
```
A partir de este comando siempre que ingreses git init será la rama main.

Ahora cuando creamos un repositorio desde la nube, osea desde GitHub, ya verás que la rama principal tiene por default el nombre de main y al clonar a nuestro ordenador seguira teniendo este nombre y no será necesario ningun cambio.

Otro comando que deben saber es:
```sh
gitk
```
Si no te funciona el comando gitk es posible no lo tengas instalado por defecto.

Para instalar gitk debemos ejecutar los siguientes comandos:
```sh
sudo apt-get update

sudo apt-get install gitk
```
Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.

# Tu primer push
La creación de las SSH es necesario solo una vez por cada computadora. Aquí conocerás cómo conectar a GitHub usando SSH.


* Luego de crear nuestras llaves SSH podemos entregarle la llave pública a GitHub para comunicarnos de forma segura y sin necesidad de escribir nuestro usuario y contraseña todo el tiempo.

* Para esto debes entrar a la Configuración de Llaves SSH en GitHub, crear una nueva llave con el nombre que le quieras dar y el contenido de la llave pública de tu computadora.

* Ahora podemos actualizar la URL que guardamos en nuestro repositorio remoto, solo que, en vez de guardar la URL con HTTPS, vamos a usar la URL con SSH:

```ssh
git remote set-url origin url-ssh-del-repositorio-en-github
```
## Comandos para copiar la llave SSH:

ESTAS SON LAS RUTAS DEL SSH PUBLICO
-Mac:
```ssh
pbcopy < ~/.ssh/id_rsa.pub
```
Windows (Git Bash):
```ssh
clip < ~/.ssh/id_rsa.pub
```
Linux (Ubuntu):
```ssh
cat ~/.ssh/id_rsa.pub
```


## Importante


Las buenas costumbres nos enseñan que antes de hacer un push, siempre debemos hacer un pull, un fetch, esto para que si alguien ya hizo algún cambio, no se genere un conflicto.

Invitar a un colaborador

Para invitar a un colaborador debemos ir a GitHub y seleccionar:
setting -> colaborators -> ingresar contraseña o un F2A de verificación y enviar la invitación escribiendo el nombre de usuario.


Del otro lado el usuario invitado solo debe aceptar y listo, ya puede participar del proyecto haciendo commit.

# Git tag y versiones en GitHub

En Git, las etiquetas o Git tags tienen un papel importante al asignar versiones a los commits más significativos de un proyecto. Aprender a utilizar el comando git tag, entender los diferentes tipos de etiquetas, cómo crearlas, eliminarlas y compartirlas, es esencial para un flujo de trabajo eficiente.


## Creación de etiquetas en Git

```sh
git tag

```


Sustituye con un identificador semántico que refleje el estado del repositorio en el momento de la creación. Git admite etiquetas anotadas y ligeras.


## Listado de etiquetas
Para obtener una lista de etiquetas en el repositorio, ejecuta el siguiente comando:



Para crear una etiqueta, ejecuta el siguiente comando:
```sh
git tag -a v1.0 -m "Product release"

git tag -a ronburgundy -m "Brick killed a guy with a trident."
```
Las etiquetas anotadas almacenan información adicional como la fecha, etiquetador y correo electrónico, y son ideales para publicaciones públicas. Las etiquetas ligeras son más simples y se emplean como “marcadores” de una confirmación específica.

```sh
git tag
```
Esto mostrará una lista de las etiquetas existentes, como:

* v1.0

* v1.1

* v1.2

 Para perfeccionar la lista, puedes utilizar opciones adicionales, como -l con una expresión comodín.


## Uso compartido de etiquetas

Compartir etiquetas requiere un enfoque explícito al usar el comando git push. Por defecto, las etiquetas no se envían automáticamente. Para enviar etiquetas específicas, utiliza:
```sh
git push origin
```
Para enviar varias etiquetas a la vez, usa:
```sh
git push origin --tags
```

## Eliminación de etiquetas

Para eliminar una etiqueta, usa el siguiente comando:
```sh
git tag -d
```
Esto eliminará la etiqueta identificada por en el repositorio local.

En resumen, las etiquetas en Git son esenciales para asignar versiones y capturar instantáneas importantes en el historial de un proyecto. Aprender a crear, listar, compartir y eliminar etiquetas mejorará tu flujo de trabajo con Git.

# Manejo de ramas en GitHub

Es bueno recordar sobre gitk. Si no te funciona el comando gitk es posible no lo tengas instalado por defecto. Esta es una herramienta muy util a la hora de ver graficamente nuestro trabajo y así entender mejor todo el funcionamiento de ramas, merge y todo el flujo en un formato ordenado.


Para instalar gitk debemos ejecutar los siguientes comandos:



```sh

  sudo apt-get update


  sudo apt-get install gitk

```

## Repasa: ¿Qué es Git?

Las ramas nos permiten hacer cambios a nuestros archivos sin modificar la versión principal (main). Puedes trabajar con ramas que nunca envías a GitHub, así como pueden haber ramas importantes en GitHub que nunca usas en el repositorio local. Lo crucial es que aprendas a manejarlas para trabajar profesionalmente.

Si, estando en otra rama, modificamos los archivos y hacemos commit, tanto el historial(git log) como los archivos serán afectados. La ventaja que tiene usar ramas es que las modificaciones solo afectarán a esa rama en particular. Si luego de “guardar” los archivos(usando commit) nos movemos a otra rama (git checkout otraRama) veremos como las modificaciones de la rama pasada no aparecen en la otraRama.

## Comandos para manejo de ramas en GitHub
Crear una rama:


```sh
git branch branchName #Crear una rama
git checkout -b branchName #También crea una rama
git checkout branchName #Movernos a otra rama 
git push origin branchName #Publicar una rama local al repositorio remoto
```

Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.

# Configurar múltiples colaboradores en un repositorio de GitHub

Por defecto, cualquier persona puede clonar o descargar tu proyecto desde GitHub, pero no pueden crear commits, ni ramas. Esto quiere decir que pueden copiar tu proyecto pero no colaborar con él, si este es publico, de otra manera, osea, si es privado es necesario que realmente estes haciendo una invitación, sino no lo van a poder ver. Existen varias formas de solucionar esto para poder aceptar contribuciones. Una de ellas es añadir a cada persona de nuestro equipo como colaborador de nuestro repositorio.


## Cómo agregar colaboradores en Github

Solo debemos entrar a la configuración de colaboradores de nuestro proyecto. Se encuentra en:

* Repositorio > Settings > Collaborators

Ahí, debemos añadir el email o username de los nuevos colaboradores.

Si, como colaborador, agregaste erróneamente el mensaje del commit, lo puedes cambiar de la siguiente manera:

Hacer un commit con el nuevo mensaje que queremos, esto nos abre el editor de texto de la terminal:
```sh
git commit —amend #Corregimos el mensaje
git pull origin main #Traer el repositorio remoto
git push --set-upstream origin main #Ejecutar el cambio, el error arreglado
```
## Comienzo del colaborador
```sh
cd Documentos #Abre git bash
mkdir class-git #Crea la carpeta o directorio de trabajo
ls -al #Revisa lo que va haciendo, los archivos o directorios que tiene
```
# 1. No debe hacer un git init, debe buscar el repositorio en el cual esta invitado a participar, por supuesto en GitHub.
# 2. Pasa a clonar desde HTTPS, copiar la url, esto es porque no se arranca el proyecto desde cero, se esta uniendo otro colaborador.
# 3. En git bash ponemos el siguiente comando.
```sh
git clone url-copiada-github #Esto hace que clonemos el repositorio
```
# 4. No pide ni usuario ni contraseña si el repositorio es publico.
```sh
code . #Abre VSC y comienza con cambios, o abre el siguiente comando para hacer modificaciones
vim historia.txt #Vamos a escribir: Aquí esta un nuevo colaborador
vim escribimos el mensaje del commit #Esto en Ubuntu
ctrl + x
s #Para un si 
enter #Terminado el mensaje del commit
vim escribimos el mensaje del commit #Esto en git bash window
esc #Presionamos escaner luego de terminar de escribir
:wq! #Para salir del editor vim en window
git status
git commit -am "Mi primer commit, estoy muy emocionado!!!"
git pull origin main
git fetch
gti branch #Para ver las ramas que se trajo, no se trae sino solo main, si hay mas debes crearlas local
git log #Para ver toda las historia
git log --graph #Vemos el grafico de las diferentes ramas y del commit que acabamos de hacer que esta en el main, Git es una base de datos de toda las historia de todo lo que se ha hecho
git push origin main #Va a pedir un email que será el del colaborador, su contraseña.
```
# 5. Nos trae un denegado, ¿Por qué? Porque en el proceso de abordaje el jefe no le dio acceso: el dueño del repositorio no le agregó dandole acceso.
# 6. Ir a settings del repositorio, veremos la opsión Collaborators, agregamos el correo o nombre de usuario: el colaborador debe tener un email publico y visible o de otra manera debera ser con el nombre de usuario publico: ingresar el username y debe ir como colaborador.
# 7. Se puede enviar un email con la url, pero ya GitHub envia una notificación al usuario de invitado, es una cosa que debemos empezar a consultar y revisar.
# 8. El colaborador debe aceptar la invitación, una vez hecho eso ya tendrá total acceso para hacer push al repositorio.
```sh
git pull origin main
git push origin main #Colocar nombre de usuario y contraseña, listo
```
# 9. El dueño del repositorio no ve los cambios, ¿Qué hacer?
```sh
git pull origin main
git fetch
git log --stat #Se verá claro que el colaborador ingreso su primer commit
```
# 10. A partir de ahora el dueño del repositorio y el colaborador deberán repartir el trabajo, esto se hace con distintas ramas de trabajo: el dueño trabajará desde la rama header y el colaborador desde la rama footer, al final cuando se termine, se hara un merge para terminar el proyecto.







