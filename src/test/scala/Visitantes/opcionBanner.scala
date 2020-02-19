package Visitantes



import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
class opcionBanner extends Simulation {

  val httpProtocol = http
    .baseUrl("https://ccstore-stage-ze8a.oracleoutsourcing.com")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "none",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_1=Map(
    "Accept"->"application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding"->"gzip, deflate, br",
    "Accept-Language"->"es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Connection"->"keep-alive",
    "Content-Type"->"application/json",
    "Sec-Fetch-Mode"->"cors",
    "Sec-Fetch-Site"->"same-origin",
    "X-CCProfileType"->"storefrontUI",
    "x-ccsite"->"siteUS",
    "X-CCViewport"->"xs",
    "X-Requested-With"->"XMLHttpRequest"
  )

  val headers_2=Map(
    "Accept"->"application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding"->"gzip, deflate, br",
    "Accept-Language"->"es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Connection"->"keep-alive",
    "Content-Type"->"application/json",
    "Sec-Fetch-Mode"->"cors",
    "Sec-Fetch-Site"->"same-origin",
    "X-CCProfileType"->"storefrontUI",
    "x-ccsite"->"siteUS",
    "X-CCViewport"->"sm",
    "X-Requested-With"->"XMLHttpRequest"
  )


  val headers_94 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "sm",
    //  "X-CCVisitId" -> "62720554:1703af9069c:133b-129.80.155.73",
    //  "X-CCVisitorId" -> "127EphHhytfxWL4Lokun3PHKhVcRmW9lU1y_Faid7IeZofAC5A4",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val Home_0 = exec(http("Home")
    .get("/")
    .headers(headers_0))


    .exec(http("flujo_275")
      .get("/ccstoreui/v1/products?categoryId=Acueducto-Centro-Narino&includeChildren=true&storePriceListGroupId=tarifaCategoriaA")
      .headers(headers_94))



  val OpcionBanner_1 = exec(http("")
    .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/pages/layout/muro-de-escalar/product/HER-B-RED-REC-REC-018?ccvp=sm")
    .headers(headers_2))


     .exec(http("")
    .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/pages/muro-de-escalar/product/HER-B-RED-REC-REC-018?dataOnly=false&currentDataOnly=true")
    .headers(headers_2))

    .exec(http("")
      .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/products?catalogId=cloudCatalog&productIds=HER-B-RED-REC-REC-018&includeHistorical=true&storePriceListGroupId=tarifaCategoriaA&includeChildSKUsListingIds=true")
      .headers(headers_1))

    .exec(http("")
      .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/stockStatus?products=HER-B-RED-REC-REC-018%3AHER-2-392-lunes-baja&catalogId=cloudCatalog&locationIds=")
      .headers(headers_1))

    .exec(http("")
      .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/itemTypes/sku-PySPracticaLibre?includeBase=true&parent=sku")
      .headers(headers_1))
    .exec(http("")
      .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/collections/rootCategory?catalogId=cloudCatalog&maxLevel=3&expand=childCategories&fields=childCategories(items)")
      .headers(headers_1))


    .exec(http("Opcion Muro Escalar")
      .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/prices/HER-B-RED-REC-REC-018")
    .headers(headers_1))





  val scn = scenario("opcionBanner").exec(Home_0,OpcionBanner_1)


  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)


}




