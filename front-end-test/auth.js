document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const registerUsername = document.getElementById('registerUsername').value;
    const registerName = document.getElementById('registerName').value;
    const registerPassword = document.getElementById('registerPassword').value;
    const registerCPF = document.getElementById('registerCPF').value;
    const registerEmployee = document.getElementById('registerEmployee').value;
    const registerRole = document.getElementById('registerRole').value;

    const registerData = {
        login: registerUsername,
        name: registerName,
        password: registerPassword,
        cpf: registerCPF,
        employee: registerEmployee,
        role: registerRole
    };

    // Enviar solicitação de registro para o servidor
    fetch('/auth/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(registerData)
    })
    .then(response => {
        if (response.ok) {
            document.getElementById('message').innerText = 'Registro bem-sucedido.';
        } else {
            document.getElementById('message').innerText = 'Erro no registro.';
        }
    })
    .catch(error => {
        console.error('Erro no registro:', error);
        document.getElementById('message').innerText = 'Erro no registro';
    });
});
