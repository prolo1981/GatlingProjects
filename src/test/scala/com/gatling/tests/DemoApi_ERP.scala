package com.gatling.tests
import io.gatling.core.Predef._
import io.gatling.http.Predef._


class DemoApi_ERP extends Simulation {

  val httpConf = http
    .baseUrl(url = "https://apitesting.memory.com.uy")
    .basicAuth("212192950017","Test001")
    .header(name = "Accept",value = "application/json")



  val scn = scenario(scenarioName = "producto por codigo")
    .exec(
      http(requestName = "producto")
        .get("/Productos/GetByCode?Code=1981")
        .check(status.is(200))


    )
  pause(1)

/*
  val scnProducto = scenario(scenarioName = "Producto por pagina")
    .exec(
      http(requestName = "Solicitar productos en pagina 1")
        .get("/Productos/GetPage?page=1&length=5&search=")
        .check(status.is(200))
        .check(jsonPath(path = "$.data[0].Descripcion").is("DJI CARCASA PARA MAVIC PRO"))


    )*/
/*

  setUp(
    scn.inject(atOnceUsers(users = 500)).protocols(httpConf))
*/

  setUp(
    scn.inject(rampUsers(1).during(5)).protocols(httpConf))
}
