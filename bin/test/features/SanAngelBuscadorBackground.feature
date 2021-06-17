Feature: HU-003 Background

  Background:
  Given que me encuentro en la pagina de San Angel con la url  https://sanangel.com.co/
  
  Scenario: Buscar el producto en el buscador de San Angel
    When busco un producto en el buscador
      | nombreProducto                                            |
      | Mini Anturio                                              |
    Then podre ver el producto buscado en la pantalla

  Scenario: Buscar el producto en el buscador de San Angel
    When busco un producto en el buscador
      | nombreProducto                                                        |
      | Destellos                                                             |
    Then podre ver el producto buscado en la pantalla
