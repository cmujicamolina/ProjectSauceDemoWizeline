@SmokeTest
Feature:  Realizar el contacto con la empresa
  Esta caracteristica permite a los clientes realizar el contacto
  con la empresa en relacion a uno o mas productos.

  @ContactUS
  Scenario: Contacto inicial con la empresa.

    Given El cliente se encuentra en la pagina de busqueda
    When El usuario hacer click en el boton 'ContactUS'