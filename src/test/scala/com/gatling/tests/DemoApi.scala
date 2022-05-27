package com.gatling.tests

//import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
//import io.gatling.jdbc.Predef._

class DemoApi extends Simulation {
  val httpProtocol = http
    .baseUrl(url = "http://127.0.0.1:5000//api/v1/resources/peliculas")

  val scn: ScenarioBuilder = scenario(scenarioName = "GET peliculas")
    .exec(
      http(requestName = "GET todos las peliculas")
        .get("/all")
        .check(status.is(200))
        .check(jsonPath(path = "$[2].title").is("Batman Forever"))

    )
    .pace(duration = 1)

  setUp(
   scn.inject(rampUsers(100).during(5))
    .protocols(httpProtocol))

  //setUp(
  //  scn.inject(atOnceUsers(1))
    //  .protocols(httpProtocol))



}