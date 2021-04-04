# Laboratorio 5
***
Especificação :
 Implemente um “aplicativo” de navegação com a ajuda do padrão de projeto Strategy. O aplicativo deve calcular a rota baseando-se em alguns meios de transporte, como por exemplo, Pedestre, Carro, Ônibus e Metrô. O usuário pode escolher o meio de transporte desejado e pode modificá-lo a qualquer momento. Após cada modificação do meio de transporte, o aplicativo deve recalcular a rota. Implemente o “aplicativo” em Java. Não é necessário interface gráfica nem ser um aplicativo de verdade. Implemente apenas o módulo dos requisitos citados acima com uma interface textual. O cálculo da rota pode ser abstraído por um System.out.println(“Calculando a rota de Pedestre…”); 

***

Como solução, a utilização do padrão strategy feito pela classe controladora de transporte, dá ao usuário diferentes a possibilidade da mudança meios de transporte, e em relação ao código o uso  desse padrão possibilitou o não uso de condicionais, que poderia ser um problema caso a aplicação se desenvolvesse.
