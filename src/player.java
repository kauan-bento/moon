const listaMusicas = ["musica1.mp3", "musica2.mp3", "musica3.mp3"];
let indexAtual = 0; 
const player = document.getElementById("player");
const audioSource = document.getElementById("audio-source");

function pularMusica() {
    indexAtual++; 
    if (indexAtual >= listaMusicas.length) {
        indexAtual = 0;
    }

    audioSource.src = listaMusicas[indexAtual]; 
    player.load(); 
    player.play(); 
}
