Feature: HU-001 Buscador San Angel

  Scenario Outline: <Escenario> <Producto>
    Given que me encuentro en la pagina de San Angel con la url <Url>
    When busco el producto <Producto> en el buscador
    Then podre ver el producto <Producto> en pantalla

    Examples: 
      | Escenario                                              | Producto                | Url                     |
     	| Buscar el producto en el buscador de San Angel exitoso | Universo encantado      | https://sanangel.com.co/ |
      | Buscar el producto en el buscador de San Angel exitoso | Deleite                 | https://sanangel.com.co/ |
      | Buscar el producto en el buscador de San Angel exitoso | Sansiviera              | https://sanangel.com.co/ |
      | Buscar el producto en el buscador de San Angel exitoso | Pesame                  | https://sanangel.com.co/ |
      | Buscar el producto en el buscador de San Angel exitoso | Mi cielo                | https://sanangel.com.co/ |