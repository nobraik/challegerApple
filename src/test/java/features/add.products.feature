@addproducts
Feature: Adicionar produtos na sacola de compras
  Como usuario
  Quero pesquisar produtos
  Para adicionar no carrinho

  @tag1
  Scenario: Adicionar Macbook na sacola de compras
    Given que selecione Mac na home
    And clicar em Macbook pro
    And selecionar macbook13
    And clicar em select
    And clicar em add to bag
    When clicar em review bag
    Then produto adicionado na bag


