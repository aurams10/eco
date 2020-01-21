package scripts

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class compras extends Simulation {

  val httpProtocol = http
    .baseUrl("https://prucorporativo.compensar.com/")
    .acceptHeader("ext/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
    .acceptLanguageHeader("es - ES es")
    .acceptEncodingHeader("gzip deflatebr")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36")


  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")

  val headers_1 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3",
    "Content-Type"->"application/json",
    "Host"->"ccstore-stage-ze8a.oracleoutsourcing.com",
     "Referer"->"https://ccstore-stage-ze8a.ora…rch&Ns=product.displayName%7C0",
     "X-CCProfileType"->"storefrontUI",
     "x-ccsite" ->"siteUS",
     "X-CCViewport"->"lg",
    "X-Requested-With"-> "XMLHttpRequest")

  val headers_2 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3",
    "Content-Type"->"application/json",
    "Host"->"ccstore-stage-ze8a.oracleoutsourcing.com",
    "Referer"->"https://ccstore-stage-ze8a.ora…/product/HER-B-RED-DEP-ACU-003",
    "X-CCProfileType"->"storefrontUI",
    "x-ccsite" ->"siteUS",
    "X-CCViewport"->"lg",
    "X-Requested-With"-> "XMLHttpRequest")


  val scn = scenario("Escenario1: Ingreso al Portal")

    .exec(http("Home")
      .get("/")
      .check(status is (200))
      .check(bodyString.saveAs("Response")))
    .pause(5)

    .exec(http("Compras")
      .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/")
      .check(status is (200))
      .check(bodyString.saveAs("Response")))
      .pause(5)

    .exec(http("Buscar Producto=Natacion")
      .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/pages/layout/searchresults?" +
        "Ntt=natacion*&" +
        "Rdm=190&" +
        "searchType=simple&" +
        "type=search" +
        "&Ns=product.displayName%257C0&" +
        "ccvp=xs")
      .headers(headers_1)
      .check(status is (200))
     .check(bodyString.saveAs("Response")))
      .pause(5)

    .exec(http("Seleccionar= Curso Natacion")
      .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/curso-de-nataci%C3%B3n-estilo-espalda/product/HER-B-RED-DEP-ACU-003")
      .headers(headers_2)
      .formParam("ccvp","lg")
      .check(status is (200))
      .check(bodyString.saveAs("Response")))
    .pause(5)

  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpProtocol)
}

