import io.gatling.core.Predef._
import io.gatling.http.Predef._

class user extends Simulation {
  val data = csv("data/data1.csv").circular

  val httpProtocol = http
    .baseUrl("https://prucorporativo.compensar.com/")
    .acceptHeader("ext/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
    .acceptLanguageHeader("es - ES es")
    .acceptEncodingHeader("gzip deflatebr")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36")


  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Cookie" -> "ORA_FPC=id=3708fb18-6de0-4336-bffa-2f6819896710; _ga=GA1.2.1768184364.1576593068; ASP.NET_SessionId=irq5o4vfrvwq2w4girmnlihg; SearchSession=01b5fc71%2D68b8%2D46de%2D8455%2D68e2cc79d0b4; TS01e3202d=0149b1e14b61e0a3987507f9416ff4d10de8db8ea47a96e5382c9f351db0e12fed68040db0e68add40b21192e058d8f783303cbadc3c7182f422bebbc043f34fc8310af4140be3378bddd6b9dd0eec8988e1915bf88d96fa187d045ce8b3766df3f4fc61561d4de0f554bd868158df6658f19785c17ca05534e573c72cbc99cf5eb2b255c0; WSS_FullScreenMode=false; _gid=GA1.2.592517611.1579270703; _gat_UA-90763271-1=1; TSPD_101=0841a3cdb3ab2800aeca07c6caa6563ba60f07e020762c2c8a03614dac8cf23505eafe3ebd0d44a46c9fa1e57c847655:0841a3cdb3ab2800aeca07c6caa6563ba60f07e020762c2c8a03614dac8cf23505eafe3ebd0d44a46c9fa1e57c84765508d5e1df1f063800485e2a733c523cf983bde4d7a62d2a7f1383b4648884c84dd0065d9f2ac3bc8dfc91d254b6630f88443b06f92d56c3ce82a0b56bf05ff95b; mmapi.store.p.0=%7B%22mmparams.d%22%3A%7B%7D%2C%22mmparams.p%22%3A%7B%22pd%22%3A%221610806803570%7C%5C%22-684191751%7CCwAAAApVAwDdNufEfRIx5wEwARIAAUIAI0DHtQQAZlYNZlib10j19MzD%2FYLXSAAAAAD%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwAGRGlyZWN0AZwSAQAAAAAAAAAAAP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEAOg0BALwnPHF1nBIA%2F%2F%2F%2F%2FwGcEpwS%2F%2F8DAAABAAAAAAF5dQIAvrcDAAAAAAAAAAFF%5C%22%22%2C%22bid%22%3A%221579271403189%7C%5C%22nycvwcgus06%5C%22%22%2C%22srv%22%3A%221610806803576%7C%5C%22nycvwcgus06%5C%22%22%2C%22ids%22%3A%221610806804555%7C%7B%5C%221%5C%22%3A%5C%220%5C%22%7D%22%7D%7D; mmapi.store.s.0=%7B%22mmparams.d%22%3A%7B%7D%2C%22mmparams.p%22%3A%7B%7D%7D; f5avr1704738681aaaaaaaaaaaaaaaa=EDBGDODPIKNBNNLAECAJIJENMILLANKDLEPFLECPJMELLPINAOGMLDMCGLNCDIKABKBGIEFHDDPCMBMAKLJCENAAGEHAPDEAPNBBODAGILPAAFJAAPNHMLKDPGCDAAEK",
    "Accept-Language" -> "es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3",
    "Host" -> "prucorporativo.compensar.com")

  val headers_1 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Host" -> "presso.compensar.com")

  val headers_2 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Host" -> "presso.compensar.com")
  "Origin" -> "https://presso.compensar.com"
  "Referent" -> "https://presso.compensar.com/"
  "Upgrade-Insecure-Requests" -> 1

  val uri01 = "https://presso.compensar.com"


  val scn = scenario("Escenario1: Ingreso al Portal")
    .feed(data)
    .exec(http("Home")
      .get("/")
      .check(status is (200))
      .check(bodyString.saveAs("Response")))
    .pause(5)

    .exec(http("Pagina de Autenticacion 1")
      .get("https://prucorporativo.compensar.com/_trust/default.aspx?trust=IdentityServer&ReturnUrl=/")
      .headers(headers_0)
      .check(status is 200)
      .check(bodyString.saveAs("Response")))
    //.check(css("#formLogin","action").saveAs("token")))
    .pause(5)

    .exec(http("Pagina de Autenticacion 2")
      .get("https://presso.compensar.com/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fprucorporativo.compensar.com%2f_trust%2f&wctx=https%3a%2f%2fprucorporativo.compensar.com%2f")
      .headers(headers_1)
      .check(status is 200)
      // .check(bodyString.saveAs("Response")))
      .check(css("#formLogin", "action").saveAs("token"))
      .check(css("[name=\"__RequestVerificationToken\"]", "value").saveAs("verificar")))
    .pause(5)

    .exec(http("Pagina de Login")
      .get(uri01 + """${token}""")
      .headers(headers_1)
      .check(status is 200)
      .check(bodyString.saveAs("Response")))
    .pause(5)

    .exec(http("Pagina para envio de Usuario y Clave")
      .post(uri01 + """${token}""")
      .headers(headers_2)
      .formParam("__RequestVerificationToken", """${verificar}""")
      .formParam("DocumentType", "1")
      .formParam("DocumentID", "${DocumentID}")
      .formParam("Password", "Ab123456")
      .formParam("GoogleCaptchaToken", "")
      .check(status is 200)
      .check(bodyString.saveAs("Response")))
    .pause(5)

    .exec(http("Pagina Usuario Autenticado")
      .get("https://presso.compensar.com/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fprucorporativo.compensar.com%2f_trust%2f&wctx=https%3a%2f%2fprucorporativo.compensar.com%2f")
      .headers(headers_2)
      .formParam("wa", "wsignin1.0")
      .formParam("wtrealm", "https://prucorporativo.compensar.com/_trust/")
      .formParam("wctx", "https://prucorporativo.compensar.com/_layouts/15/Authenticate.aspx?Source=%2FProspectados%2DCredito")
      .check(status is 200)
      .check(bodyString.saveAs("Response")))
    .pause(5)

/*
    .exec(http("Pagina que nuestra los datos del usuario autenticado")
      .post("https://prucorporativo.compensar.com/_trust/default.aspx?trust=IdentityServer&ReturnUrl=/")
      .headers(headers_2)
      .formParam("wa",	"wsignin1.0")
      .formParam("wresult","${Auth_Response}")
      .formParam("wctx","https://prucorporativo.compensar.com/_layouts/15/Authenticate.aspx?Source=%2FProspectados%2DCredito")
      .check (status is 200)
     // .check(bodyString.saveAs("response"))
      .check(bodyString.saveAs("Auth_Response")))
    .pause(5)
    +/
 */

  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpProtocol)
}
