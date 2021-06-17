Feature: HU-002 Buscador Aleatorio San Angel

  Scenario Outline: <Escenario>
    Given que me encuentro en la pagina de San Angel con la url <Url>
    When busco un producto aleatorio en la pagina
    Then podre ver un producto aleatorio en pantalla

    Examples: 
      | Escenario                                         | Url                      |
      | Buscar un producto aleatorio en San Angel exitoso | https://sanangel.com.co/ |
