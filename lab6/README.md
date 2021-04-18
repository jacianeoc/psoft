# Laboratório 6

Especificação : Implemente em Java um sistema de vacinação para a COVID-19, usando o padrão State. Não é necessário implementar persistência de dados e interface gráfica (apenas textual). Seu sistema deverá contemplar os requisitos listados abaixo. Responda este form com o link do git da sua implementação e adicione os dois professores da disciplina e todos os monitores como colaboradores do repositório. 

### Requisitos:
***

* Cadastro de pessoas para aguardar a vez da vacinação (nome completo, CPF, endereço, número do cartão do SUS, e-mail,
  teleforne, profissao, comobidades).
* Alteração de dados do cadastro.
* Cada pessoa se encontra em uma das seguintes situações:
    * Não habilitada para vacina
    * Habilitada para vacina
    * Tomou a 1° dose
    * Habilitada para tomar a 2° dose
    * Finalizada vacinação
    
* A situação de cada pessoal pode mudar de acordo com os seguintes eventos:
    * Uma pessoa não habilitada se habilita automaticamente para a 1° dose se sua idade, profissão ou possível comobidade for habilitada pelo governo para tomar a 1° dose.
    * Após tomar a primeira dose, a pessoa estará habilitada para tomar a 2° após 20 dias.
    * Após tomar a segunda dose, a vacinação da pessoa estará finalizada.
***
### Solução:
* Terá uma entidade controladora de pessoas que estarão aguardando para tomar a vacina. 
* Na Classe pessoa, além dos parâmetros solicitados na especificação, também guardará a idade da pessoa, e o seu estado que por padrão será não habilitada. 
