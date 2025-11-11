Feature: Login

  Scenario: ingreso login exitoso
    Given ingreso a la aplicacion
    When  ingreso usuario "usuario1" y password "clave123"
    And   presiono el boton "ingresar" del login
    Then  visualizo la pantalla de bienvenida

  Scenario: ingreso login problemas con input usuario
    Given ingreso a la aplicacion
    When  no ingreso usuario  y password
    And   presiono el boton "ingresar" del login
    Then  visualizo la pantalla de bienvenida input sin llenar con texto en rojo
    
  Scenario: ingreso login fallido
    Given ingreso a la aplicacion
    When  ingreso usuario "usuario1" y password "clave321"
    And   presiono el boton "ingresar" del login
    Then  visualizo la pantalla de de usuario y contrasena incorreta
