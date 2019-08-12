#Author: juan.martineza@sophossolutions.com

@tag
Feature: Agregar el producto al carrito de compras
  Juan Camilo como usuario quiere entrar a Tottus Peru y agregar un producto al carrito de compras

@smoketest
  Scenario: Producto agregado exitosamente
    Given Que Juan Camilo este en la pagina de tottus peru
    When Agrega el pruducto "playstation" al carrito de compras
    Then Deberia ver el producto "Consola PS4 PRO 1TB - PS4 PRO 1TB" agregado en el carrito de compras


#hacerlo por la segunda forma outline