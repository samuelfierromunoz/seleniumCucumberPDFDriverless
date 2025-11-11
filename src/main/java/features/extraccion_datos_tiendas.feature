Feature: Extraccion de datos tiendas

  Scenario Outline: extraccion de datos en tienda paris
    Given ingreso a la tienda paris chile "https://www.paris.cl/"
    When  selecciono la categoria "<categoria>" donde se extraeran los datos
    Then  selecciono 3 productos y extraigo los datos solicitados

    Examples:
    | categoria  |
    | TV y Audio |
    | Tecno      |
    | Dormitorio |