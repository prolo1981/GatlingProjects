package com.gatling.tests
import io.gatling.core.Predef._
import io.gatling.http.Predef._
/*
* En este caso estoy generando comprobante de ventas para Delivery Hero
* Con payload json guardado en resources como datos.json
* Los comprobantes se emiten en la sucursal Tricotta en ERP Gestion Testing
*
* */

class DemoApi_ERP_2 extends Simulation{

  val httpConf = http                                               // conf de protocolo http
    .baseUrl(url = "https://apitesting.memory.com.uy")
    .basicAuth("212192950017","Test001")
    .header(name = "Accept",value = "application/json")
    .header(name = "content-type",value = "application/json")

  val scn = scenario(scenarioName = "Crear comprobante de Ventas")   // creo scenario para comprobante de ventas
    .exec(
      http(requestName = "Ventas")
        .post("/Ventas/SendCFE?request=CFERequest")
        .body(RawFileBody(filePath = "src/test/resources/datos.json")).asJson
        .header(name = "content-type",value = "application/json")
        .check(status.is(200))
    )

pause(1)


  //setUp(
    //scn.inject(atOnceUsers(1))
  //    .protocols(httpConf))                               // carga de vusers en este caso uno


    //.assertions(global.responseTime.max.lt(1200))
    //.assertions(global.responseTime.min.lte(1200))


  setUp(
  scn.inject(rampUsers(35).during(10)).protocols(httpConf))

}
