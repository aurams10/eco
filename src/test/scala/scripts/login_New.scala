
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class login_New extends Simulation {

  val httpProtocol = http
    .baseUrl("https://ccstore-stage-ze8a.oracleoutsourcing.com")
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_1 = Map("Accept" -> "text/css,*/*;q=0.1")

  val headers_2= Map(
      "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
      "Origin" -> "https://presso.compensar.com",
      "Upgrade-Insecure-Requests" -> "1")

  val headers_3= Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Host" -> "ccstore-stage-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com/gorros-de-nataci%C3%B3n/product/HER-B-RED-DEP-ACU-027",
    "Sec-Fetch-Mode:"->"cors",
    "Sec-Fetch-Site:"->"same-origin",
    "X-CCPriceListGroup:"->"tarifaCategoriaB",
    "X-CCProfileType:"->"storefrontUI",
    "siteUS"->"siteUS",
    "CCViewport"->"lg")



  val uri04 = "https://presso.compensar.com"


  val scn = scenario("AUTENTICACION DE USUARIO EN PORTAL E-COMMERCE")
    .exec(http("Home")
      .get("/")
      .headers(headers_0)
      .resources(http("Home")
       .get("/file/thirdparty/fonts/font-awesome.min.css")
       .headers(headers_1),
         /*CHEKEAR SESION*/
          http("Home")
          .get(uri04 + "/connect/checksession")
          .headers(headers_0)))

    .exec(http("Pagina Login")
      .get(uri04 + "/connect/authorize?client_id=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&redirect_uri=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&response_type=id_token%20token&scope=openid%20profile%20email&nonce=15801541163800.6495629771571915&state=15801541163800.876948323061112")
      .headers(headers_0)
      .check(status is 200)
      .check(css("#formLogin", "action").saveAs("TOKEN"))
      .check(css("[name=\"__RequestVerificationToken\"]", "value").saveAs("VERIFICAR")))


    .exec(http("Ingreso de Datos")
      .post(uri04 + """${TOKEN}""")
      .headers(headers_2)
      .formParam("__RequestVerificationToken", """${VERIFICAR}""")
      .formParam("DocumentType", "1")
      .formParam("DocumentID", "13718984")
      .formParam("Password", "Ab123456")
      .formParam("GoogleCaptchaToken", "")
      .check(status is 200)
     .check(bodyString.saveAs("Response")))



  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}