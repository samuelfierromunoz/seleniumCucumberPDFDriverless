Feature: Feature prueba


  @test01
  Scenario: ingreso formulario qa test
    Given Ingreso a la pagina Qa
    When  presiona formulario Form
    And   Se visualiza boton sub Form
    Then  ingresa en input nombre el texto "hola mundo"