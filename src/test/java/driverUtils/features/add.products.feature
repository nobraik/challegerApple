@add-products
Feature: Adicionar produtos na sacola de compras
  Como usuario
  Quero pesquisar produtos
  Para adicionar no carrinho

  @mac
  Scenario: Adicionar Macbook na sacola de compras
    Given que selecione Mac na home
    And clicar em Macbook pro
    And selecionar macbook13
    And clicar em select
    And clicar em add to bag
    When clicar em review bag
    Then produto adicionado na bag



  @iphone
  Scenario: Dictionary iPhone na sacola de compras do site
    Given que selecione iphone na home
    And clicar em iphone  pro
    And selecionar Iphone
    And selecionar a cor do aparelho
    And clicar em select apos a escolha
    And clicar em add to bag de produtos
    When clicar em review bag de produto
    Then produto adicionado na bag com sucesso


