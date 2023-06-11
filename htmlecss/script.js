function calcularFrete() {
    var zona = document.getElementById("zona-input").value.toLowerCase();
    var frete;
  
    switch (zona) {
      case "zona norte":
        frete = 5;
        break;
      case "centro":
        frete = 7;
        break;
      case "zona oeste":
        frete = 10;
        break;
      default:
        frete = 15;
        break;
    }
  
    document.getElementById("resultado-frete").textContent = "O valor do frete é: R$ " + frete;
  }
  