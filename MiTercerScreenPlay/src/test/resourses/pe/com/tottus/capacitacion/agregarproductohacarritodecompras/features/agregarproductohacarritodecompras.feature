#Author: juan.martineza@sophossolutions.com

@tag
Feature: Agregar el producto al carrito de compras
  Juan Camilo como usuario quiere entrar a Tottus Peru y agregar un producto al carrito de compras

@smoketest
  Scenario Outline: Producto agregado exitosamente
    Given Que Juan Camilo este en la pagina de tottus peru
    When Agrega el <producto> al carrito de compras
    Then Deberia ver el producto agregado en el carrito de compras validado con el boton "Pagar"

    Examples: 
      | producto  | 
 			| televisor |
      | playstation |
      | nevera |