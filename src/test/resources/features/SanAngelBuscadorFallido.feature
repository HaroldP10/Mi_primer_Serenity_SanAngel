Feature: HU-004 Buscador San Angel fallido y exitoso

   Scenario: Buscar el producto en el buscador de San Angel fallido
   Given que me encuentro en la pagina de San Angel con la url  https://sanangel.com.co/
  
    When Deseo encontrar un producto en el buscador
      | nombreProducto                                            |
      | neveras                                       |
    Then validar el producto buscado en la pantalla

  Scenario: Buscar el producto en el buscador de San Angel exitoso
  Given que me encuentro en la pagina de San Angel con la url  https://sanangel.com.co/
  
    When Deseo encontrar un producto en el buscador
      | nombreProducto                                                        |
      | Destellos                                                             |
    Then validar el producto buscado en la pantalla
