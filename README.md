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

Para copiar la llave publica debes ir al archivo .ssh y allí encontrarás el archivo .pub lo podes abrir con el txt, luego copiar el contenido que esta dentro.

copiar la llave publica #Ir a GitHub, vamos a setting, vamos a SSH and GPG keys

crear una nueva #New SSH key poner nombre y pegar la ssh publica, con esto esta listo.

Aconsejo que la ssh tenga el nombre del ordenador en el que estas trabajando. Esto se debe hacer con cada pc nueva o dispositivo nuevo que tengamos para acceder a nuestra cuenta de GitHub.
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