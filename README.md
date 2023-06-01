# Loja de Cookies (Biscoiteira-cookie-projeto)
> Status de desenvolvimento: em andamento 
<p>Este é um projeto desenvolvido em Java para a disciplina de Programação Orientada a Objetos (P3) na faculdade em parceria com Eduarda Gomes. Trata-se de uma loja virtual de cookies, onde o usuário pode visualizar e comprar cookies e outros produtos da loja. </p>
<h1>Funcionalidades</h1>
<ol>
<li>Cadastro de usuário.</li>
<li>Cálculo de frete.</li>
<li>Listagem de produtos: exibe os produtos disponíveis na loja, incluindo preço e estoque.</li>
<li>Carrinho de compras: permite ao usuário adicionar ou remover produtos do carrinho, bem como visualizar o valor total da compra.</li>
<li>Finalização da compra: após adicionar os cookies desejados ao carrinho, o usuário pode realizar a compra com seu cadastro. </li>
</ol>
<h2>Tecnologias utilizadas </h2>
<ol>
<li> Java: para a criação da aplicação. </li>
<li> Html e Css: para a da página da aplicação. </li>
</ol>
<h2>Contribuidores</h2>
<ol>
<li>Alana Lins </li>
<li>Eduarda Gomes</li>
</ol>
<h2>SOLID</h2>
<ol>
<li>Responsabilidade Única:</li>
<p>- A única responsabilidade da classe 'brinde' é realizar um sorteio aleatório e retornar se o resultado é verdadeiro ou falso.</p>
<p>- A única responsabilidade da classe 'Cadastro' é representar e gerenciar as informações de um cliente, incluindo nome, telefone, Instagram, endereço e zona.</p>
<p>- A única responsabilidade da classe 'Clientes' é gerenciar o cadastro de clientes, incluindo as operações de cadastrar, atualizar, buscar e deletar um cadastro.</p>
<p>- A única responsabilidade da classe 'Entrega' é calcular o valor do frete com base no endereço de entrega, seja utilizando o endereço cadastrado do cliente ou um novo endereço fornecido.</p>
<p>- A única responsabilidade da classe 'RealizarCompra' é gerenciar o processo de realização de uma compra.</p>
<p>- A única responsabilidade da classe abstrata 'Menu' é fornecer um método abstrato para exibir um menu e um método para ler a opção escolhida pelo usuário.</p>
<p>- A única responsabilidade da classe 'MenuClientes' é exibir um menu específico para operações relacionadas a clientes e retornar a opção escolhida pelo usuário.</p>
<p>- A única responsabilidade da classe 'MenuFuncionario' é exibir um menu específico para operações relacionadas a funcionários e retornar a opção escolhida pelo usuário.</p>
<p>- A única responsabilidade da classe 'Estoque' é gerenciar a lista de produtos disponíveis, permitindo a adição, remoção, busca e exibição do estoque de produtos, bem como a limpeza do estoque.</p>
<p>- A única responsabilidade da classe 'Produto' é representar e gerenciar as informações de um produto, incincluindo nome, preço e quantidade.</p>
<p>- A única responsabilidade da classe 'Main' é ser a classe principal do programa.</p>
<li>Aberto/Fechado:</li>
<p>- As classes estão abertas para extensão, permitindo adicionar novas funcionalidades, mas fechadas para modificação, evitando alterações no código existente. Isso promove a flexibilidade, reutilização de código e evita efeitos colaterais indesejados, facilitando a manutenção e evolução do sistema ao longo do tempo.</p>
<li>Substituição de Liskov:</li>
<p>- As classes derivadas são substituíveis pela sua classe base sem afetar o programa. Isso significa que as classes derivadas devem aderir ao contrato estabelecido pela classe base, respeitando seus comportamentos e garantindo a consistência do sistema. O princípio ajuda a evitar problemas de quebra de contrato e comportamentos inesperados, tornando o código mais robusto e facilitando a manutenção e evolução do sistema.</p>
<li>Inversão de Dependência:</li>
<p>- É importante porque impede que uma classe dependa de métodos ou funcionalidades que não utiliza, reduzindo a complexidade e o acoplamento desnecessário. Ao aderir a esse princípio, uma classe se torna mais coesa e focada, o que facilita a compreensão, manutenção e reutilização do código. Além disso, a separação de interfaces permite substituir dependências de forma mais granular, promovendo a flexibilidade e a capacidade de expansão do sistema. Em resumo, esse princípio contribui para a criação de um design mais modular, flexível e adaptável, o que melhora a qualidade e a capacidade de escalonamento do software.</p>
<li>Lei de Demeter:</li>
<p>- Estabelece que um objeto deve ter um conhecimento limitado sobre outros objetos, interagindo apenas com seus vizinhos imediatos. Isso reduz o acoplamento entre objetos, aumenta a modularidade do código e facilita a manutenção e compreensão do sistema. Ao seguir esse princípio, o design orientado a objetos se torna mais robusto e adaptável, com objetos que se comunicam de forma restrita e não têm acesso direto à estrutura interna de outros objetos.</p>
</ol>
