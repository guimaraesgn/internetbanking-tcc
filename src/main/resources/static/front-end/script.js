// Função para fazer a solicitação de cadastro e obter um token JWT
function registerUser() {
    const name = document.getElementById("name").value;
    const login = document.getElementById("login").value;
    const password = document.getElementById("password").value;
    const cpf = document.getElementById("cpf").value;
    const employee = document.getElementById("employee").value;
    const role = document.getElementById("role").value;

    const userData = {
        name: name,
        login: login,
        password: password,
        cpf: cpf,
        employee: employee,
        role: role
    };

    fetch('localhost:8080/auth/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(userData)
    })
    .then(response => {
        if (response.ok) {
            return response.json();
        }
        throw new Error('Falha no cadastro.');
    })
    .then(data => {
        // O token JWT estará em data.token
        const accessToken = data.token;
        console.log('Token JWT:', accessToken);

        // Você pode armazenar o token em um local seguro para uso posterior.
        // Lembre-se de implementar a lógica adequada de armazenamento.
    })
    .catch(error => {
        console.error('Erro no cadastro: ' + error);
    });
}

document.getElementById("registration-form").addEventListener("submit", function (event) {
    event.preventDefault();
    registerUser();
});
