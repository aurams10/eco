package scripts

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class flujo extends Simulation {

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

  val headers_1 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "nested-navigate",
    "Sec-Fetch-Site" -> "cross-site",
    "Upgrade-Insecure-Requests" -> "1")


  val headers_2 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "cross-site",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_3 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Origin" -> "https://presso.compensar.com",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_4 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI")

  val headers_5 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "sm",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_6 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "sm",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_7 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "sm",
    "X-CCVisitId" -> "62720554:1703af9069c:133b-129.80.155.73",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")


  val headers_8 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_9 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCViewport" -> "sm",
    "X-Requested-With" -> "XMLHttpRequest",
    "authorization" -> "Bearer null")

  val headers_10 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCVisitorId" -> "127EphHhytfxWL4Lokun3PHKhVcRmW9lU1y_Faid7IeZofAC5A4",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")


  val uri1 = "https://presso.compensar.com"

  val Home_0 = exec(http("home")
    .get("/")
    .headers(headers_0))
    .exec(http("home")
      .get("/file/thirdparty/libraries/chatScript.js?bust=19.5.5"))
    .exec(http("home")
      .get(uri1 + "/connect/checksession")
      .headers(headers_1))

  val BotonLogin_1 = exec(http("Ingresar Datos")
     .get(uri1 + "/connect/authorize?client_id=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&redirect_uri=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&response_type=id_token%20token&scope=openid%20profile%20email&nonce=15815430062000.8656349467888638&state=15815430062000.38022991515818716")
    .headers(headers_2)
    .check(css("#formLogin", "action").saveAs("TOKEN"))
    .check(css("[name=\"__RequestVerificationToken\"]", "value").saveAs("VERIFICAR")))

    .exec(http("Ingreso de Datos")
      .post(uri1 + """${TOKEN}""")
      .headers(headers_3)
      .formParam("__RequestVerificationToken", """${VERIFICAR}""")
      .formParam("DocumentType", "1")
      .formParam("DocumentID", "13718984")
      .formParam("Password", "Ab123456")
      .formParam("GoogleCaptchaToken", ""))
   // .exec(http("Login")
    //  .get("/file/thirdparty/fonts/font-awesome.min.css"))
    .exec(http("Login")
      .get("/ccstoreui/v1/registry")
      .headers(headers_4))


  val homenLogin_2 = exec(http("Despues de login")
       .get("/file/thirdparty/libraries/chatScript.js?bust=19.5.5"))
       .exec(http("Despues de login")
       .get("/ccstoreui/v1/publish")
         .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
    .exec {session =>
      val response1 = session("AURA").as[String]
      println(response1)
      session}

       exec(http("Despues de login")
    .post("/ccstoreui/v1/ccm/page")
     .headers(headers_6)
     .body(StringBody("""{pageViews: 1}""")))

     .exec(http("Despues de login")
      .get("/ccstoreui/v1/currencies")
      .headers(headers_5))

     .exec(http("Despues de login")
        .get("/ccstoreui/v1/sites/siteUS")
        .headers(headers_5))

     .exec(http("Despues de login")
        .get("/ccstoreui/v1/itemTypes/commerceItem?includeBase=false&parent=commerceItem")
        .headers(headers_5))

      .exec(http("Despues de login")
        .get("/ccstoreui/v1/locations?fields=repositoryId%2Cname%2Clatitude%2Clongitude")
        .headers(headers_5))
/*
      .exec(http("Despues de login")
         .post("/ccstoreui/v1/analytics/visitorsMetric")
        .headers(headers_7)
        .body(StringBody("""{"visitorId":"1103XzpChhJB0XX7pbhBMGOgspRq_BZDDPdtS9O4AVTpe8IA04E","visitId":"-4d211ae0:1703ecc846e:139e-129.80.155.74"}""")))
*/
         .exec(http("Despues de login")
        .get(uri1 + "/connect/checksession")
        .headers(headers_1))

         .exec(http("Despues de login")
        .get("/ccstoreui/v1/merchant/production-Recommendations")
        .headers(headers_7))

      .exec(http("Despues de login")
        .get("/ccstoreui/v1/products?storePriceListGroupId=tarifaCategoriaA&productIds=HER-B-RED-DEP-TER-096")
        .headers(headers_7))

  val opcionlomasVendido_3 = exec(http("Seleccionar Imagen Lo mas vendido")
       .get("/file/v1568716789352612004/general/sin-imagen.png"))

    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/products?categoryId=adultosFamily&includeChildren=true&storePriceListGroupId=tarifaCategoriaA")
      .headers(headers_5))
    .exec(http("cookie")
      .post("/SAML/post")
      .headers(headers_8)
      .formParam("SAMLResponse", "PHNhbWxwOlJlc3BvbnNlIHhtbG5zOnNhbWxwPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6cHJvdG9jb2wiIElEPSJfNDM2NzMwMjZjZTA2Y2FhMGQ0ZGMiICBWZXJzaW9uPSIyLjAiIElzc3VlSW5zdGFudD0iMjAyMC0wMi0xMlQyMTozMDowMVoiICBEZXN0aW5hdGlvbj0iaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL1NBTUwvcG9zdCI+PHNhbWw6SXNzdWVyIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iPnVybjpleGFtcGxlOmlkcDwvc2FtbDpJc3N1ZXI+PHNhbWxwOlN0YXR1cz48c2FtbHA6U3RhdHVzQ29kZSBWYWx1ZT0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOnN0YXR1czpTdWNjZXNzIi8+PC9zYW1scDpTdGF0dXM+PHNhbWw6QXNzZXJ0aW9uIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iIFZlcnNpb249IjIuMCIgSUQ9Il9UMThCMHdnOTR3MER0aHdJUUlEM3BtYzJGV2tsNTBOaCIgSXNzdWVJbnN0YW50PSIyMDIwLTAyLTEyVDIxOjMwOjAxLjQ2OVoiPjxzYW1sOklzc3Vlcj51cm46ZXhhbXBsZTppZHA8L3NhbWw6SXNzdWVyPjxTaWduYXR1cmUgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPjxTaWduZWRJbmZvPjxDYW5vbmljYWxpemF0aW9uTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8xMC94bWwtZXhjLWMxNG4jIi8+PFNpZ25hdHVyZU1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZHNpZy1tb3JlI3JzYS1zaGEyNTYiLz48UmVmZXJlbmNlIFVSST0iI19UMThCMHdnOTR3MER0aHdJUUlEM3BtYzJGV2tsNTBOaCI+PFRyYW5zZm9ybXM+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNlbnZlbG9wZWQtc2lnbmF0dXJlIi8+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyIvPjwvVHJhbnNmb3Jtcz48RGlnZXN0TWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjc2hhMjU2Ii8+PERpZ2VzdFZhbHVlPmJIdnhZdEJTVzdMVFhCQ3J2UlBTelhmS0tRMkxPMFRkNktpUG9FZFlJUWs9PC9EaWdlc3RWYWx1ZT48L1JlZmVyZW5jZT48L1NpZ25lZEluZm8+PFNpZ25hdHVyZVZhbHVlPktMaElJak1rbUc1ekIvOXRCUDU4aCtEdVpFNzZzUjhGSHZ5WHVpTDZjTjAzZ0gvUTlYZDZjNVUzOHhMNDNJcnI2Z1NoMlZTTVRjUUFYSE9sZ3RyV2s1OGt2TjJHYlRBUm9oKzVGMVNRQjdpSy9oOHIrNHBKY1FaWUZzd1ZRQW5PTys1MXNUVFNYRTk3TkhXKzJ4MDlqT2R5Y0RxUm01QnQ3cUV3d3d2Q3VXZlN6T2F2eG1rdnJoZGM0WVR1cWhHbDJLM3lWRDNtd01RSUh1MXR0Z0EzTHYzUmt5QUo5S1dkNi9EUlZUTDFhVXlLUEZRWWc3cFZoNUFhdXFmM1NiZUNlQkplU3N2Q0JpYkFvakdOcXIySXlZbHl4WUh2c3c5SHF3aXh5d0ZxSzhRVzhabnlZaDlmSHFwUHhHSFg3YTZYcjRPRjI0bHJZdy9ZUmYyOFYwZ0NNUT09PC9TaWduYXR1cmVWYWx1ZT48S2V5SW5mbz48WDUwOURhdGE+PFg1MDlDZXJ0aWZpY2F0ZT5NSUlEclRDQ0FwV2dBd0lCQWdJSkFQSm9WYnNwZFpDZ01BMEdDU3FHU0liM0RRRUJDd1VBTUcweEN6QUpCZ05WQkFZVEFsVlRNUk13RVFZRFZRUUlEQXBEWVd4cFptOXlibWxoTVJZd0ZBWURWUVFIREExVFlXNGdSbkpoYm1OcGMyTnZNUkF3RGdZRFZRUUtEQWRLWVc1cmVVTnZNUjh3SFFZRFZRUUREQlpVWlhOMElFbGtaVzUwYVhSNUlGQnliM1pwWkdWeU1CNFhEVEUzTURreU5URTVOVEF6TTFvWERUTTNNRGt5TURFNU5UQXpNMW93YlRFTE1Ba0dBMVVFQmhNQ1ZWTXhFekFSQmdOVkJBZ01Da05oYkdsbWIzSnVhV0V4RmpBVUJnTlZCQWNNRFZOaGJpQkdjbUZ1WTJselkyOHhFREFPQmdOVkJBb01CMHBoYm10NVEyOHhIekFkQmdOVkJBTU1GbFJsYzNRZ1NXUmxiblJwZEhrZ1VISnZkbWxrWlhJd2dnRWlNQTBHQ1NxR1NJYjNEUUVCQVFVQUE0SUJEd0F3Z2dFS0FvSUJBUURjNjZ5SFR1YzJtdjYyN0pneVlDVllJUjVyUmkvMDFpOFczeHFnbHBZK2dwRXl3bTViU0ZMZVIzYUVNOS9OTEZHRDB6bTVoUDNGZEVkNmpSV1cxckZ3WWRjb25jS09TYmpQajlXV3VYUnpPTXdDTEtHQzMvcTZCT2tpc002UnlUV3hpWFZLZmZqZ1l6cCtRRDl6L2cyYU9pZnQycmlGT2JVZEdlS2ZCdTdmaTl1d2x0ZEpsVDdjdWJ4Vm5nRVhPc01IQnQwc01oTHFWWmxaMFdFcS9vcGtUa2ZvWDdpak9wVjViNGg4cGM1UGtmQ2FTa01Eb3lCdlJ1bkdwMXZmaGllR045b1RnRDAzOXk2ckw1QmFyamJGSnY2WEQ3SGZSWC9nVzJYSWVvS09zSE82aVhvckVHYXJmem5va3NlKzkySlJrZm5mWXR3b29oMDBTTFdqSnpzN0FnTUJBQUdqVURCT01CMEdBMVVkRGdRV0JCVE5KdXd0dUF1QVAzcFVqRHVoL1dvS3pjOTM1VEFmQmdOVkhTTUVHREFXZ0JUTkp1d3R1QXVBUDNwVWpEdWgvV29LemM5MzVUQU1CZ05WSFJNRUJUQURBUUgvTUEwR0NTcUdTSWIzRFFFQkN3VUFBNElCQVFBN2lhc1Noemt1VHFUd1grcDZjaFE3djh2ekd4YUxTRUtkcm44YWNEdzZSYm1BVVFsRENLaEtqaVprVmJscUNmMnNhdjlCWlM5YTQvL2JueEdNbDk5ZGttUDlnWUtHYVFzZzR6Z1VUajZuaWV6M3JIYkgrVTAxY2wzZnhWZzd6OGVsZ0RMdkNuV0hwNGh4Yk0zZHFNdEM0V25xcVBxWkQ1OXVicjZDSlZjSjd0U0FJZGNiVVlKaTlibmZXZCtuY01qUWs2UkhnMXhQWVN2UGpHLy9xZTdXTDRMbGtUQ1U1UzJSZm00d0ZDTWtXUVM0SUJNNHBscDFEaUJuR3BJSWFHU1ZCdC95Y3B3MENTWUZsRzk2T2k3M1B2dExKSGVubWhsb1p6UFZuTFBPdmlDbjY1a0hqNnoxM2t2dmxNWm1JUzRmWDN5eS8zaHM4SWR1VzgrcjkwZlg8L1g1MDlDZXJ0aWZpY2F0ZT48L1g1MDlEYXRhPjwvS2V5SW5mbz48L1NpZ25hdHVyZT48c2FtbDpTdWJqZWN0PjxzYW1sOk5hbWVJRCBGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpuYW1laWQtZm9ybWF0OnBlcnNpc3RlbnQiPjEtMTM3NDAyNThAY29tcGVuc2FyLmNvbTwvc2FtbDpOYW1lSUQ+PHNhbWw6U3ViamVjdENvbmZpcm1hdGlvbiBNZXRob2Q9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpjbTpiZWFyZXIiPjxzYW1sOlN1YmplY3RDb25maXJtYXRpb25EYXRhIE5vdE9uT3JBZnRlcj0iMjAyMC0wMi0xMlQyMjozMDowMS40NjlaIiBSZWNpcGllbnQ9Imh0dHBzOi8vY2NzdG9yZS1zdGFnZS16ZThhLm9yYWNsZW91dHNvdXJjaW5nLmNvbS9TQU1ML3Bvc3QiLz48L3NhbWw6U3ViamVjdENvbmZpcm1hdGlvbj48L3NhbWw6U3ViamVjdD48c2FtbDpDb25kaXRpb25zIE5vdEJlZm9yZT0iMjAyMC0wMi0xMlQyMTozMDowMS40NjlaIiBOb3RPbk9yQWZ0ZXI9IjIwMjAtMDItMTJUMjI6MzA6MDEuNDY5WiI+PHNhbWw6QXVkaWVuY2VSZXN0cmljdGlvbj48c2FtbDpBdWRpZW5jZT5odHRwczovL2Njc3RvcmUtc3RhZ2UtemU4YS5vcmFjbGVvdXRzb3VyY2luZy5jb20vU0FNTC88L3NhbWw6QXVkaWVuY2U+PC9zYW1sOkF1ZGllbmNlUmVzdHJpY3Rpb24+PC9zYW1sOkNvbmRpdGlvbnM+PHNhbWw6QXR0cmlidXRlU3RhdGVtZW50IHhtbG5zOnhzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYSIgeG1sbnM6eHNpPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYS1pbnN0YW5jZSI+PHNhbWw6QXR0cmlidXRlIE5hbWU9ImZpcnN0TmFtZSIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PHNhbWw6QXR0cmlidXRlVmFsdWUgeHNpOnR5cGU9InhzOnN0cmluZyI+UEVEUk8gTUFSSUE8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgTmFtZT0ibGFzdE5hbWUiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpzdHJpbmciPkJVSVRSQUdPIE1BTlRJTExBPC9zYW1sOkF0dHJpYnV0ZVZhbHVlPjwvc2FtbDpBdHRyaWJ1dGU+PHNhbWw6QXR0cmlidXRlIE5hbWU9ImVtYWlsIiBOYW1lRm9ybWF0PSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXR0cm5hbWUtZm9ybWF0OmJhc2ljIj48c2FtbDpBdHRyaWJ1dGVWYWx1ZSB4c2k6dHlwZT0ieHM6c3RyaW5nIj4xLTEzNzQwMjU4QGNvbXBlbnNhci5jb208L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgTmFtZT0ibG9naW4iIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpzdHJpbmciPjEtMTM3NDAyNThAY29tcGVuc2FyLmNvbTwvc2FtbDpBdHRyaWJ1dGVWYWx1ZT48L3NhbWw6QXR0cmlidXRlPjxzYW1sOkF0dHJpYnV0ZSBOYW1lPSJkb2N1bVR5cGUiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpzdHJpbmciPjE8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgTmFtZT0iZG9jdW1OdW0iIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpkb3VibGUiPjEzNzQwMjU4PC9zYW1sOkF0dHJpYnV0ZVZhbHVlPjwvc2FtbDpBdHRyaWJ1dGU+PC9zYW1sOkF0dHJpYnV0ZVN0YXRlbWVudD48c2FtbDpBdXRoblN0YXRlbWVudCBBdXRobkluc3RhbnQ9IjIwMjAtMDItMTJUMjE6MzA6MDEuNDY5WiI+PHNhbWw6QXV0aG5Db250ZXh0PjxzYW1sOkF1dGhuQ29udGV4dENsYXNzUmVmPnVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphYzpjbGFzc2VzOlBhc3N3b3JkUHJvdGVjdGVkVHJhbnNwb3J0PC9zYW1sOkF1dGhuQ29udGV4dENsYXNzUmVmPjwvc2FtbDpBdXRobkNvbnRleHQ+PC9zYW1sOkF1dGhuU3RhdGVtZW50Pjwvc2FtbDpBc3NlcnRpb24+PC9zYW1scDpSZXNwb25zZT4=")
      .formParam("RelayState", ""))

    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/products?categoryId=TopSeller&includeChildren=true&storePriceListGroupId=tarifaCategoriaA")
      .headers(headers_5))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/registry")
      .headers(headers_4))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/publish")
      .headers(headers_5))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/pages/layout/home?ccvp=sm")
      .headers(headers_5))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
      .headers(headers_5))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&currentDataOnly=true")
      .headers(headers_5))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/pages/css/home?occsite=siteUS")
      .headers(headers_9))


  .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/file/v41543645472865082/css/homePageLayout.css?occsite=siteUS"))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .post("/ccstoreui/v1/ccm/page")
      .headers(headers_6)
      .body(StringBody("""{pageViews: 1}""")))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/resources/ns.common?locale=es")
      .headers(headers_5))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/resources/ns.ccformats?locale=es")
      .headers(headers_5))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/currencies")
      .headers(headers_5))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/sites/siteUS")
      .headers(headers_5))
    .exec(http("Seleccionar Imagen Lo mas vendido")
      .get("/ccstoreui/v1/itemTypes/commerceItem?includeBase=false&parent=commerceItem")
      .headers(headers_5))
/*
    .exec(http("flujo_345")
      .post("/ccstoreui/v1/login/")
      .headers(headers_10)
      .formParam("grant_type", "saml_credentials")
      .formParam("saml_response", "PHNhbWxwOlJlc3BvbnNlIHhtbG5zOnNhbWxwPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6cHJvdG9jb2wiIElEPSJfNDM2NzMwMjZjZTA2Y2FhMGQ0ZGMiICBWZXJzaW9uPSIyLjAiIElzc3VlSW5zdGFudD0iMjAyMC0wMi0xMlQyMTozMDowMVoiICBEZXN0aW5hdGlvbj0iaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL1NBTUwvcG9zdCI+PHNhbWw6SXNzdWVyIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iPnVybjpleGFtcGxlOmlkcDwvc2FtbDpJc3N1ZXI+PHNhbWxwOlN0YXR1cz48c2FtbHA6U3RhdHVzQ29kZSBWYWx1ZT0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOnN0YXR1czpTdWNjZXNzIi8+PC9zYW1scDpTdGF0dXM+PHNhbWw6QXNzZXJ0aW9uIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iIFZlcnNpb249IjIuMCIgSUQ9Il9UMThCMHdnOTR3MER0aHdJUUlEM3BtYzJGV2tsNTBOaCIgSXNzdWVJbnN0YW50PSIyMDIwLTAyLTEyVDIxOjMwOjAxLjQ2OVoiPjxzYW1sOklzc3Vlcj51cm46ZXhhbXBsZTppZHA8L3NhbWw6SXNzdWVyPjxTaWduYXR1cmUgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPjxTaWduZWRJbmZvPjxDYW5vbmljYWxpemF0aW9uTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8xMC94bWwtZXhjLWMxNG4jIi8+PFNpZ25hdHVyZU1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZHNpZy1tb3JlI3JzYS1zaGEyNTYiLz48UmVmZXJlbmNlIFVSST0iI19UMThCMHdnOTR3MER0aHdJUUlEM3BtYzJGV2tsNTBOaCI+PFRyYW5zZm9ybXM+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNlbnZlbG9wZWQtc2lnbmF0dXJlIi8+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyIvPjwvVHJhbnNmb3Jtcz48RGlnZXN0TWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjc2hhMjU2Ii8+PERpZ2VzdFZhbHVlPmJIdnhZdEJTVzdMVFhCQ3J2UlBTelhmS0tRMkxPMFRkNktpUG9FZFlJUWs9PC9EaWdlc3RWYWx1ZT48L1JlZmVyZW5jZT48L1NpZ25lZEluZm8+PFNpZ25hdHVyZVZhbHVlPktMaElJak1rbUc1ekIvOXRCUDU4aCtEdVpFNzZzUjhGSHZ5WHVpTDZjTjAzZ0gvUTlYZDZjNVUzOHhMNDNJcnI2Z1NoMlZTTVRjUUFYSE9sZ3RyV2s1OGt2TjJHYlRBUm9oKzVGMVNRQjdpSy9oOHIrNHBKY1FaWUZzd1ZRQW5PTys1MXNUVFNYRTk3TkhXKzJ4MDlqT2R5Y0RxUm01QnQ3cUV3d3d2Q3VXZlN6T2F2eG1rdnJoZGM0WVR1cWhHbDJLM3lWRDNtd01RSUh1MXR0Z0EzTHYzUmt5QUo5S1dkNi9EUlZUTDFhVXlLUEZRWWc3cFZoNUFhdXFmM1NiZUNlQkplU3N2Q0JpYkFvakdOcXIySXlZbHl4WUh2c3c5SHF3aXh5d0ZxSzhRVzhabnlZaDlmSHFwUHhHSFg3YTZYcjRPRjI0bHJZdy9ZUmYyOFYwZ0NNUT09PC9TaWduYXR1cmVWYWx1ZT48S2V5SW5mbz48WDUwOURhdGE+PFg1MDlDZXJ0aWZpY2F0ZT5NSUlEclRDQ0FwV2dBd0lCQWdJSkFQSm9WYnNwZFpDZ01BMEdDU3FHU0liM0RRRUJDd1VBTUcweEN6QUpCZ05WQkFZVEFsVlRNUk13RVFZRFZRUUlEQXBEWVd4cFptOXlibWxoTVJZd0ZBWURWUVFIREExVFlXNGdSbkpoYm1OcGMyTnZNUkF3RGdZRFZRUUtEQWRLWVc1cmVVTnZNUjh3SFFZRFZRUUREQlpVWlhOMElFbGtaVzUwYVhSNUlGQnliM1pwWkdWeU1CNFhEVEUzTURreU5URTVOVEF6TTFvWERUTTNNRGt5TURFNU5UQXpNMW93YlRFTE1Ba0dBMVVFQmhNQ1ZWTXhFekFSQmdOVkJBZ01Da05oYkdsbWIzSnVhV0V4RmpBVUJnTlZCQWNNRFZOaGJpQkdjbUZ1WTJselkyOHhFREFPQmdOVkJBb01CMHBoYm10NVEyOHhIekFkQmdOVkJBTU1GbFJsYzNRZ1NXUmxiblJwZEhrZ1VISnZkbWxrWlhJd2dnRWlNQTBHQ1NxR1NJYjNEUUVCQVFVQUE0SUJEd0F3Z2dFS0FvSUJBUURjNjZ5SFR1YzJtdjYyN0pneVlDVllJUjVyUmkvMDFpOFczeHFnbHBZK2dwRXl3bTViU0ZMZVIzYUVNOS9OTEZHRDB6bTVoUDNGZEVkNmpSV1cxckZ3WWRjb25jS09TYmpQajlXV3VYUnpPTXdDTEtHQzMvcTZCT2tpc002UnlUV3hpWFZLZmZqZ1l6cCtRRDl6L2cyYU9pZnQycmlGT2JVZEdlS2ZCdTdmaTl1d2x0ZEpsVDdjdWJ4Vm5nRVhPc01IQnQwc01oTHFWWmxaMFdFcS9vcGtUa2ZvWDdpak9wVjViNGg4cGM1UGtmQ2FTa01Eb3lCdlJ1bkdwMXZmaGllR045b1RnRDAzOXk2ckw1QmFyamJGSnY2WEQ3SGZSWC9nVzJYSWVvS09zSE82aVhvckVHYXJmem5va3NlKzkySlJrZm5mWXR3b29oMDBTTFdqSnpzN0FnTUJBQUdqVURCT01CMEdBMVVkRGdRV0JCVE5KdXd0dUF1QVAzcFVqRHVoL1dvS3pjOTM1VEFmQmdOVkhTTUVHREFXZ0JUTkp1d3R1QXVBUDNwVWpEdWgvV29LemM5MzVUQU1CZ05WSFJNRUJUQURBUUgvTUEwR0NTcUdTSWIzRFFFQkN3VUFBNElCQVFBN2lhc1Noemt1VHFUd1grcDZjaFE3djh2ekd4YUxTRUtkcm44YWNEdzZSYm1BVVFsRENLaEtqaVprVmJscUNmMnNhdjlCWlM5YTQvL2JueEdNbDk5ZGttUDlnWUtHYVFzZzR6Z1VUajZuaWV6M3JIYkgrVTAxY2wzZnhWZzd6OGVsZ0RMdkNuV0hwNGh4Yk0zZHFNdEM0V25xcVBxWkQ1OXVicjZDSlZjSjd0U0FJZGNiVVlKaTlibmZXZCtuY01qUWs2UkhnMXhQWVN2UGpHLy9xZTdXTDRMbGtUQ1U1UzJSZm00d0ZDTWtXUVM0SUJNNHBscDFEaUJuR3BJSWFHU1ZCdC95Y3B3MENTWUZsRzk2T2k3M1B2dExKSGVubWhsb1p6UFZuTFBPdmlDbjY1a0hqNnoxM2t2dmxNWm1JUzRmWDN5eS8zaHM4SWR1VzgrcjkwZlg8L1g1MDlDZXJ0aWZpY2F0ZT48L1g1MDlEYXRhPjwvS2V5SW5mbz48L1NpZ25hdHVyZT48c2FtbDpTdWJqZWN0PjxzYW1sOk5hbWVJRCBGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpuYW1laWQtZm9ybWF0OnBlcnNpc3RlbnQiPjEtMTM3NDAyNThAY29tcGVuc2FyLmNvbTwvc2FtbDpOYW1lSUQ+PHNhbWw6U3ViamVjdENvbmZpcm1hdGlvbiBNZXRob2Q9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpjbTpiZWFyZXIiPjxzYW1sOlN1YmplY3RDb25maXJtYXRpb25EYXRhIE5vdE9uT3JBZnRlcj0iMjAyMC0wMi0xMlQyMjozMDowMS40NjlaIiBSZWNpcGllbnQ9Imh0dHBzOi8vY2NzdG9yZS1zdGFnZS16ZThhLm9yYWNsZW91dHNvdXJjaW5nLmNvbS9TQU1ML3Bvc3QiLz48L3NhbWw6U3ViamVjdENvbmZpcm1hdGlvbj48L3NhbWw6U3ViamVjdD48c2FtbDpDb25kaXRpb25zIE5vdEJlZm9yZT0iMjAyMC0wMi0xMlQyMTozMDowMS40NjlaIiBOb3RPbk9yQWZ0ZXI9IjIwMjAtMDItMTJUMjI6MzA6MDEuNDY5WiI+PHNhbWw6QXVkaWVuY2VSZXN0cmljdGlvbj48c2FtbDpBdWRpZW5jZT5odHRwczovL2Njc3RvcmUtc3RhZ2UtemU4YS5vcmFjbGVvdXRzb3VyY2luZy5jb20vU0FNTC88L3NhbWw6QXVkaWVuY2U+PC9zYW1sOkF1ZGllbmNlUmVzdHJpY3Rpb24+PC9zYW1sOkNvbmRpdGlvbnM+PHNhbWw6QXR0cmlidXRlU3RhdGVtZW50IHhtbG5zOnhzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYSIgeG1sbnM6eHNpPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYS1pbnN0YW5jZSI+PHNhbWw6QXR0cmlidXRlIE5hbWU9ImZpcnN0TmFtZSIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PHNhbWw6QXR0cmlidXRlVmFsdWUgeHNpOnR5cGU9InhzOnN0cmluZyI+UEVEUk8gTUFSSUE8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgTmFtZT0ibGFzdE5hbWUiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpzdHJpbmciPkJVSVRSQUdPIE1BTlRJTExBPC9zYW1sOkF0dHJpYnV0ZVZhbHVlPjwvc2FtbDpBdHRyaWJ1dGU+PHNhbWw6QXR0cmlidXRlIE5hbWU9ImVtYWlsIiBOYW1lRm9ybWF0PSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXR0cm5hbWUtZm9ybWF0OmJhc2ljIj48c2FtbDpBdHRyaWJ1dGVWYWx1ZSB4c2k6dHlwZT0ieHM6c3RyaW5nIj4xLTEzNzQwMjU4QGNvbXBlbnNhci5jb208L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgTmFtZT0ibG9naW4iIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpzdHJpbmciPjEtMTM3NDAyNThAY29tcGVuc2FyLmNvbTwvc2FtbDpBdHRyaWJ1dGVWYWx1ZT48L3NhbWw6QXR0cmlidXRlPjxzYW1sOkF0dHJpYnV0ZSBOYW1lPSJkb2N1bVR5cGUiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpzdHJpbmciPjE8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgTmFtZT0iZG9jdW1OdW0iIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpkb3VibGUiPjEzNzQwMjU4PC9zYW1sOkF0dHJpYnV0ZVZhbHVlPjwvc2FtbDpBdHRyaWJ1dGU+PC9zYW1sOkF0dHJpYnV0ZVN0YXRlbWVudD48c2FtbDpBdXRoblN0YXRlbWVudCBBdXRobkluc3RhbnQ9IjIwMjAtMDItMTJUMjE6MzA6MDEuNDY5WiI+PHNhbWw6QXV0aG5Db250ZXh0PjxzYW1sOkF1dGhuQ29udGV4dENsYXNzUmVmPnVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphYzpjbGFzc2VzOlBhc3N3b3JkUHJvdGVjdGVkVHJhbnNwb3J0PC9zYW1sOkF1dGhuQ29udGV4dENsYXNzUmVmPjwvc2FtbDpBdXRobkNvbnRleHQ+PC9zYW1sOkF1dGhuU3RhdGVtZW50Pjwvc2FtbDpBc3NlcnRpb24+PC9zYW1scDpSZXNwb25zZT4=")
      .formParam("relay_state", "")
      .check(status is 200)
      .check(bodyString.saveAs("Response")))

    .exec(http("flujo_384")
      .get("/ccstoreui/v1/profiles/current")
      .headers(headers_5)
     .check(status is 200)
     .check(bodyString.saveAs("Response")))*/


  val scn = scenario("flujo").exec(Home_0,BotonLogin_1,homenLogin_2,opcionlomasVendido_3)


  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
