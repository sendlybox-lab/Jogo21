const totalN1 = document.querySelector("h2");
const section = document.querySelector("section");
const mensagem = document.getElementById("mensagem");
const btnPedir = document.getElementById("pedir");
const btnParar = document.getElementById("parar");

fetch("/api/iniciar", {
 method: "POST"
 });