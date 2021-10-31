@SmokeTest
Feature:  Busqueda de Productos
  Esta caracteristica permite a los clientes realizar busquedas de
  productos que desean comprar en la tienda virtual.
  Se presenta informacion como precio, stock, colores.

  @BusquedaProducto
  Scenario Outline: Busqueda exitosa de producto
    Este escenario consiste en realizar una busqueda
    que retorne al menos un producto como resultado.

    Given El cliente se encuentra en la pagina de busqueda
    When  realice la busqueda de productos con el termino <producto>
    And   cambia la visualizacion a modo lista
    Then  se muestra el producto con el precio <precio>

    Examples:
    |producto |precio|
    |Blouse   |$27.00|