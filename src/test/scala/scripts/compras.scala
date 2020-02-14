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
    "Referer"->"https://ccstore-stage-ze8a.ora…/product/HER-B-RED-DEP-ACU-027",
    "X-CCProfileType"->"storefrontUI",
    "x-ccsite" ->"siteUS",
    "X-CCViewport"->"lg",
    "X-Requested-With"-> "XMLHttpRequest")

  val headers_3 = Map(
    "Accept" -> "atext/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Host"->"presso.compensar.com",
    "Referer"->"https://ccstore-stage-ze8a.oracleoutsourcing.com/checkout",
    "Sec-Fetch-Mode"->"navigate",
    "Sec-Fetch-Site" ->"cross-site")


  val headers_4 = Map(
    "Accept" -> "image/webp,*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3",
    "Host"->"presso.compensar.com")


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

    .exec(http("Buscar Producto=Gorro")
      .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/pages/layout/searchresults?" +
        "Ntt=gorro*&" +
        "Rdm=407  &" +
        "searchType=simple&" +
        "type=search" +
        "&Ns=product.displayName%7C0" +
        "ccvp=lg")
      .headers(headers_1)
      .check(status is (200))
     .check(bodyString.saveAs("Response")))
      .pause(5)

    .exec(http("Seleccionar Producto= Gorro Natacion")
      .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/pages/layout/gorros-de-nataci%25C3%25B3n/product/HER-B-RED-DEP-ACU-027?ccvp=lg")
      .headers(headers_2)
      .formParam("ccvp","lg")
      .check(status is (200))
      .check(bodyString.saveAs("Response")))
    .pause(5)

    .exec(http("Agregar Carro de Compra")
      .post("tps://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/orders/price?includeShippingGroups=true")
      .body(StringBody("""{"shoppingCart":{"items":[{"productId":"HER-B-RED-DEP-ACU-027","quantity":1,"repositoryId":"","availabilityDate":null,"catRefId":"HER-5-524","expanded":false,"stockStatus":true,"stockState":"IN_STOCK","commerceItemQuantity":1,"selectedOptions":[{"optionName":"Sede","optionValue":"CUR - Centro Urbano de Recreación","optionId":"x_headquarter","optionValueId":16}],"detailedItemPriceInfo":[],"detailedRecurringChargeInfo":[],"externalData":[],"addOnItem":false,"_date":null,"_endTimeItem":null,"_startTimeItem":null,"_discount":null,"_weekDays":null,"_headquarters":null,"_subStage":null,"_price":null,"_numberDocument":null,"_stage":null,"_level":null,"_nameServicesPyS":null,"_identificationType":null,"_nameClient":null,"_schedule":null,"_requirements":null,"displayName":"Gorros de natación","invalid":false,"commerceItemId":"ci1579706071249227481","priceListGroupId":"tarifaCategoriaA"}],"coupons":[]},"combineLineItems":"no","payments":[],"shippingGroups":[{"items":[{"productId":"HER-B-RED-DEP-ACU-027","catRefId":"HER-5-524","quantity":1,"commerceItemId":"ci1579706071249227481"}],"type":"hardgoodShippingGroup","shippingGroupId":"0"}]}"""))
      .check(status is (200))
      .check(bodyString.saveAs("Response")))
    .pause(5)

    .exec(http("Finalizar Compra")
      .get("thttps://ccstore-stage-ze8a.oracleoutsourcing.com/checkout")
      .check(status is (200))
      .check(bodyString.saveAs("Response")))
    .pause(5)
/*
    .exec(http("Envio a la pagina de Login")
      .get("https://presso.compensar.com/connect/authorize?client_id=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&redirect_uri=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&response_type=id_token%20token&scope=openid%20profile%20email&nonce=15797256243940.4965990154401929&state=15797256243940.3234154105824232")
      .headers(headers_3)
      .check(status is (200))
      .check(bodyString.saveAs("Response")))
      .pause(5)*/



  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpProtocol)
}