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




