document.querySelectorAll('.nube').forEach(nube => {
  nube.addEventListener('click', function () {

    setTimeout(() => {
      if (this.id === 'jugar') {
        window.location.href = 'jugar.html';
      } else if (this.id === 'rankings') {
        window.location.href = 'rankings.html';
      }
    }, 300);
  });
});

document.getElementById('tuBoton').addEventListener('click', () => {
  document.body.innerHTML = '<h1>Cargando...</h1>';
});



