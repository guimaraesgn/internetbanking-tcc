formulario.addEventListener("submit", function (event){
    event.preventDefault();
    cadastrar();
    })

    // Dados do novo cadastro
const novoCadastro = {
    login: "marcio",
    name: "Marcio Guimarães",
    password: "123456789",
    cpf: "02561820785",
    employee: "Cliente",
    role: "ADMIN"
  };
  
  // URL do seu servidor
  const url = "http://localhost:8080/aut/register"; // Substitua pelo endereço do seu servidor
  
  // Opções da solicitação
  const requestOptions = {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(novoCadastro),
  };
  
  // Realize a solicitação usando o fetch
  fetch(url, requestOptions)
    .then((response) => {
      if (!response.ok) {
        throw new Error(`Erro na solicitação: ${response.status}`);
      }
      return response.json();
    })
    .then((data) => {
      console.log("Cadastro inserido com sucesso:", data);
    })
    .catch((error) => {
      console.error("Erro ao inserir o cadastro:", error);
    });

    