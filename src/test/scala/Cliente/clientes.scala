package Cliente

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class clientes extends Simulation {

  val httpProtocol = http
    .baseUrl("https://ccstore-stage-ze8a.oracleoutsourcing.com")
    .userAgentHeader("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Mobile Safari/537.36")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "none",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_9 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI")

  val headers_15 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaB",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
   // "X-CCVisitorId" -> "1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_24 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaB",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
   // "X-CCVisitorId" -> "1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_89 = Map(
    "Accept" -> "application/json",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/x-www-form-urlencoded",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-site")

  val headers_91 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "nested-navigate",
    "Sec-Fetch-Site" -> "cross-site",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_95 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Host"->"ccstore-stage-ze8a.oracleoutsourcing.com",
    "Origin" ->"https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Referer"->"https://ccstore-stage-ze8a.oracleoutsourcing.com/",
      "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaB",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
  //  "X-CCVisitId" -> "-4f1ef422:17058d19d30:1ab6-129.80.155.72",
   // "X-CCVisitorId" -> "1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_87 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_115 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaB",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
   // "X-CCVisitId" -> "-4f1ef422:17058d19d30:1ab6-129.80.155.72",
   // "X-CCVisitorId" -> "1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_182 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_103 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/plain;charset=UTF-8",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_114 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-site")

  val headers_165 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaB",
    "X-CCViewport" -> "lg",
  //  "X-CCVisitId" -> "-4f1ef422:17058d19d30:1ab6-129.80.155.72",
   // "X-CCVisitorId" -> "1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE",
    "X-Requested-With" -> "XMLHttpRequest",
    "authorization" -> "Bearer null")

  val headers_216 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json; charset=UTF-8",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_226 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_20 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaB",
    "X-CCViewport" -> "lg",
   // "X-CCVisitorId" -> "1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE",
    "X-Requested-With" -> "XMLHttpRequest",
    "authorization" -> "Bearer null")

  val headers_298 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "cross-site",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_338 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Origin" -> "https://presso.compensar.com",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_355 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCVisitorId" -> "1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_508 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_561 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCVisitorId" -> "1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_601 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaB",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
  //  "X-CCVisitorId" -> "1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE",
    "X-Requested-With" -> "XMLHttpRequest",
   // "authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsImprdSI6InN6ZThhMGMwIiwia2lkIjpudWxsLCJ4NWMiOm51bGwsIng1dSI6Imh0dHBzOi8vY2NzdG9yZS1zdGFnZS16ZThhLm9yYWNsZW91dHNvdXJjaW5nLmNvbS9jY3N0b3JlL3YxL3RlbmFudENlcnRDaGFpbiJ9.eyJpYXQiOjE1ODIwMzk2MDAsImV4cCI6MTYxMzU3NTYwMCwic3ViIjoiMzUyNzA4NSIsImF1ZCI6InN0b3JlZnJvbnRVSSIsImNvbS5vcmFjbGUuYXRnLmNsb3VkLmNvbW1lcmNlLnJvbGVzIjpudWxsLCJvY2NzLmFkbWluLnJvbGVzIjpudWxsLCJpc3MiOiJodHRwczovL2Njc3RvcmUtc3RhZ2UtemU4YS5vcmFjbGVvdXRzb3VyY2luZy5jb20vIiwib2Njcy5hZG1pbi5sb2NhbGUiOm51bGwsIm9jY3MuYWRtaW4udHoiOm51bGwsIm9jY3MuYWRtaW4udGVuYW50VHoiOiJBbWVyaWNhL0JvZ290YSIsIm9jY3MuYWRtaW4ua2VlcEFsaXZlVVJMIjoiaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tLyIsIm9jY3MuYWRtaW4udG9rZW5SZWZyZXNoVVJMIjoiaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL2Njc3RvcmUvdjEvc3NvVG9rZW5zL3JlZnJlc2giLCJvY2NzLmFkbWluLnZlcnNpb24iOiIyMC4xIiwib2Njcy5hZG1pbi5idWlsZCI6ImplbmtpbnMtQXNzZW1ibGVfQ2xvdWRfQ29tbWVyY2VfRUFSc18tbWFzdGVyLTEyOCIsIm9jY3MuYWRtaW4uZW1haWwiOm51bGwsIm9jY3MuYWRtaW4ucHJvZmlsZUlkIjoiMzUyNzA4NSIsIm9jY3MuYWdlbnQub2JvIjpudWxsLCJvY2NzLmFkbWluLmZpcnN0TmFtZSI6bnVsbCwib2Njcy5hZG1pbi5sYXN0TmFtZSI6bnVsbCwib2Njcy5hZG1pbi5wdW5jaG91dFVzZXIiOmZhbHNlLCJzdWJfdHlwZSI6bnVsbCwic2NvcGUiOm51bGx9.IEgaNFbrSf+NWHeTc1qbno/E5l07XHu/ikNMR0pnQQDSIKJsKJRHTo+lomXVnKME4zbnZALKaj9Wvfl/bQHVjtFh7sVbT0g/xZkcNNegJMsqKTKdwZgTlnZtu7QD/oKS/9zd6Kf+q4w2WGWjAwlxLGfQzHMPpA0WUchSvnRmE3lwPi/U8WbFV3yj9DZ/3F9rJluNfnace3jxT7V/SpI1Jd6HPvCXRhIuqM4Mcfj0pGF+V2dQJwwO+kDxJ8Ex4CgDUXTu8nXuSyjPDt7TVaAnFs98Vftw7wlSPxs3CPaJopCxJuYGcAVlqvgfQ2Eid0y+xzmzJIuOoLrdirBc2iS/dA==",
    "x-ccsite" -> "siteUS")

  val uri08 = "https://ccrules.oracleoutsourcing.com/EERules"
  val uri09 = "https://d.la1-c1-iad.salesforceliveagent.com/chat/rest"
  val uri19 = "https://cloud-commerce-visit.oracleoutsourcing.com/Visit"
  val uri13 = "https://image.flaticon.com/icons/png/512/38/38294.png"
  val uri14 = "https://presso.compensar.com"
  val uri17 = "https://d.la2-c2-ph2.salesforceliveagent.com/chat/rest/Visitor"
  val uri21 = "https://recs-stage.atgsvcs.com/pr"
  val uri26 = "https://dc.oracleinfinity.io/awlorq1lmp/wtid.js"


  val Escenario_0 = exec(http("Pagina Home")
    .get("/")
    .headers(headers_0))

    .exec(http("Pagina Home")
      .get("/ccstoreui/v1/registry")
      .headers(headers_9))

    .exec(http("Pagina Home")
      .get("/ccstoreui/v1/publish")
      //.headers(headers_15))
      .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))

    .exec(http("Pagina Home")
      .get("/ccstoreui/v1/pages/layout/home?ccvp=lg")
      .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
      //.headers(headers_15))
    .exec(http("Pagina Home")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
       .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
     // .headers(headers_15))
    .exec(http("Pagina Home")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&currentDataOnly=true")
       .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
      // .head ers(headers_15)
     .exec(http("Pagina Home")
      .get("/ccstoreui/v1/merchant/eetagdata")
      .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
     // .headers(headers_15))
     .exec(http("Pagina Home")
     .post("/ccstoreui/v1/ccm/page")
      .headers(headers_24)
      .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString())
      .body(StringBody("""{"pageViews":1}""")))

    .exec(http("Pagina Home")
      .get("/ccstoreui/v1/resources/ns.common?locale=es")
      //.headers(headers_15)
      .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
     .exec(http("Pagina Home")
      .get("/ccstoreui/v1/resources/ns.ccformats?locale=es")
      //.headers(headers_15))
      .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
    .exec(http("Pagina Home")
      .get("/ccstoreui/v1/sites/siteUS")
      .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
      //.headers(headers_15))
    .exec(http("Pagina Home")
      .get("/ccstoreui/v1/itemTypes/commerceItem?includeBase=false&parent=commerceItem")
    .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
    //.headers(headers_15))
    .exec(http("Pagina Home")
      .get("/ccstoreui/v1/currencies")
    .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
          //.headers(headers_15))
     .exec(http("Pagina Home")
     .get("/ccstoreui/v1/locations?fields=repositoryId%2Cname%2Clatitude%2Clongitude")
       header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
          //.headers(headers_15))
       .exec(http("Pagina Home")
       .get(uri19 + s"/unified/v1/visit/sze8a0c0_siteUS/${"X-CCVisitorId"}?dnc=1582039462214")
         .headers(headers_89))

        .exec(http("Pagina Home")
           .get("/ccstoreui/v1/merchant/production-Recommendations")
           .header("X-CCVisitorId", getCookieValue(CookieKey("xdsze8a0c0_siteUS")).toString()))
         //  .header("liveagent_sid", getCookieValue(CookieKey("liveagent_sid")).toString()))
                 // .headers(headers_15))

   .exec(http("Pagina Home")
   .get(uri14 + "/connect/checksession")
   .headers(headers_91))
//////////////////////////////////////////////////

/*PAGINA ALQUILAR CANCHA*/
  val Escenario_2 = exec(http("Seleccionar Chancha Tennis")
    .get("/ccstore/v1/images/?source=/file/v3703418252860892790/products/id317.03-alquiler-tenis.jpg&height=940&width=940"))
       //Remplazar cookie en el url: ccVisitorId
    .exec(http("request_193")
      .post(uri21 + "/view/3.0/json/sze8a0c0/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?sessionId=1545140199459712124951")
      .headers(headers_103)
    .body(StringBody("""{"locale":"es","ccSiteId":"siteUS","ccVisitorId":"1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE","view":{"url":"https://ccstore-stage-ze8a.oracleoutsourcing.com/alquiler-cancha-de-tenis/product/HER-B-RED-DEP-TER-013","referrer":"https://ccstore-stage-ze8a.oracleoutsourcing.com/","productId":"HER-B-RED-DEP-TER-013","pageTitle":"Alquiler cancha de tenis","storeId":"cloudCatalog","excludeDefaultStore":true}}""")))

    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/prices/HER-B-RED-DEP-TER-013")
      .headers(headers_115))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/products?productIds=HER-B-RED-DEP-TER-096&includeChildSKUsListingIds=true")
      .headers(headers_115))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/products/HER-B-RED-DEP-TER-013?fields=listPrices%2CsalePrices")
      .headers(headers_115))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/itemTypes?itemTypeIds=PySMaterial-Articulos")
      .headers(headers_115))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/products?productIds=HER-B-RED-DEP-TER-096&includeChildSKUsListingIds=true")
      .headers(headers_115))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/stockStatus?products=HER-B-RED-DEP-TER-096&catalogId=")
      .headers(headers_115))
    //Cambiar fecha de disponibilidad de reserva del producto
    .exec(http("Seleccionar Chancha Tennis")
      .post("/ccstorex/custom/v1/occ/practicalibre/162")
      .headers(headers_216)
      .body(StringBody("""{"filtro_disponibilidad":{"fecha_inicio":"2020-02-23T07:00:00","fecha_fin":"2020-4-26T21:00:00","inicio_inmediato":false}}""")))
    .exec(http("Seleccionar Chancha Tennis")
      .post("/ccstoreui/v1/orders/price?includeShippingGroups=true")
      .headers(headers_95)
      .body(StringBody("""{"shoppingCart":{"items":[{"productId":"HER-B-RED-DEP-TER-013","quantity":1,"repositoryId":"","availabilityDate":null,"catRefId":"HER-2-162-domingo-baja","expanded":false,"stockStatus":true,"stockState":"","commerceItemQuantity":1,"selectedOptions":[{"optionName":"Sede","optionValue":"Avenida 68","optionId":"x_headquarter","optionValueId":49},{"optionName":"Género","optionValue":"Mixto","optionId":"x_gender","optionValueId":6},{"optionName":"Modalidad","optionValue":"Cancha sintética","optionId":"x_modality","optionValueId":6},{"optionName":"Demanda","optionValue":"baja","optionId":"x_demand","optionValueId":1},{"optionName":"Dia","optionValue":"domingo","optionId":"x_day","optionValueId":6}],"detailedItemPriceInfo":[],"detailedRecurringChargeInfo":[],"externalData":[],"addOnItem":false,"_date":null,"_endTimeItem":null,"_startTimeItem":null,"_discount":null,"_weekDays":null,"_headquarters":null,"_subStage":null,"_price":null,"_numberDocument":null,"_stage":null,"_level":null,"_nameServicesPyS":null,"_identificationType":null,"_nameClient":null,"_schedule":null,"_requirements":null,"displayName":"Alquiler cancha de tenis","invalid":false,"commerceItemId":"ci1582116688892735291","priceListGroupId":"tarifaCategoriaA"}],"coupons":[]},"combineLineItems":"no","payments":[],"_tax":0,"_name":"nombre requerido","_paymentMethod":"Banco","_documentType":"CC","_orderExpirationDate":null,"_orderState":null,"_documentNumber2":null,"_discount":0,"_proveOfPayment":null,"_stateDescription":null,"_acceptanceRequirements":"campo requerido","_subtotal":0,"_total":0,"_phone":0,"_numberQuotation2":null,"_paymentDateTime":null,"_channel":"Virtual","shippingGroups":[{"items":[{"productId":"HER-B-RED-DEP-TER-013","catRefId":"HER-2-162-domingo-baja","quantity":1,"commerceItemId":"ci1582116688892735291"}],"type":"hardgoodShippingGroup","shippingGroupId":"0"}]}""")))
    .exec(http("Seleccionar Chancha Tennis")
      .post(uri21 + "/cart/3.0/json/sze8a0c0/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?sessionId=1545140199459712124951")
      .headers(headers_103)
      .body(StringBody("""{"cart":{"productIds":["HER-B-RED-DEP-TER-013"],"pricelistGroupId":"tarifaCategoriaA","currencyCode":"COP","totalPrice":7300}}""")))
    //Cambiar datos por los de cookie:sessionId
    .exec(http("Seleccionar Chancha Tennis")
      .post(uri08 + "/ccEvent/3.0/json/sze8a0c0/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?sessionId=-4f1ef422:17058d19d30:1ab6-129.80.155.72&E3SessionID=-4f1ef422:17058d19d30:1ab6-129.80.155.72")
      .headers(headers_114)
      .formParam("""{"uoid":"sze8a0c0","layoutId":"pl3500006","expid":"sze8a0c0","t":1,"d":[{"n":1,"v":"1"},{"n":2,"v":"9200"},{"n":3,"v":"9200"}],"c":"COP"}""", ""))
    .exec(http("Seleccionar Chancha Tennis")
      .post("/ccstoreui/v1/orders/price?includeShippingGroups=true")
      .headers(headers_95)
      .body(StringBody("""{"shoppingCart":{"items":[{"productId":"HER-B-RED-DEP-TER-013","quantity":1,"repositoryId":"","availabilityDate":null,"catRefId":"HER-2-162-domingo-baja","expanded":false,"stockStatus":true,"stockState":"","commerceItemQuantity":1,"selectedOptions":[{"optionName":"Sede","optionValue":"Avenida 68","optionId":"x_headquarter","optionValueId":49},{"optionName":"Género","optionValue":"Mixto","optionId":"x_gender","optionValueId":6},{"optionName":"Modalidad","optionValue":"Cancha sintética","optionId":"x_modality","optionValueId":6},{"optionName":"Demanda","optionValue":"baja","optionId":"x_demand","optionValueId":1},{"optionName":"Dia","optionValue":"domingo","optionId":"x_day","optionValueId":6}],"detailedItemPriceInfo":[],"detailedRecurringChargeInfo":[],"externalData":[],"addOnItem":false,"_date":null,"_endTimeItem":null,"_startTimeItem":null,"_discount":null,"_weekDays":null,"_headquarters":null,"_subStage":null,"_price":null,"_numberDocument":null,"_stage":null,"_level":null,"_nameServicesPyS":null,"_identificationType":null,"_nameClient":null,"_schedule":null,"_requirements":null,"displayName":"Alquiler cancha de tenis","invalid":false,"commerceItemId":"ci1582116688892735291","priceListGroupId":"tarifaCategoriaA"}],"coupons":[]},"combineLineItems":"no","payments":[],"_tax":0,"_name":"nombre requerido","_paymentMethod":"Banco","_documentType":"CC","_orderExpirationDate":null,"_orderState":null,"_documentNumber2":null,"_discount":0,"_proveOfPayment":null,"_stateDescription":null,"_acceptanceRequirements":"campo requerido","_subtotal":0,"_total":0,"_phone":0,"_numberQuotation2":null,"_paymentDateTime":null,"_channel":"Virtual","shippingGroups":[{"items":[{"productId":"HER-B-RED-DEP-TER-013","catRefId":"HER-2-162-domingo-baja","quantity":1,"commerceItemId":"ci1582116688892735291"}],"type":"hardgoodShippingGroup","shippingGroupId":"0"}]}""")))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/stockStatus?products=HER-B-RED-DEP-TER-013%3AHER-2-162-sabado-baja&catalogId=cloudCatalog&locationIds=")
      .headers(headers_115))
    .exec(http("requeSeleccionar Chancha Tennis")
      .post(uri21 + "/cart/3.0/json/sze8a0c0/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?sessionId=1545140199459712124951")
      .headers(headers_103)
      .body(StringBody("""products=HER-B-RED-DEP-TER-013%3AHER-2-162-domingo-baja%2CHER-B-RED-DEP-TER-013%3AHER-2-162-sabado-baja&catalogId=cloudCatalog&locationIds=""")))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/checkout")
      .headers(headers_226))
     .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/registry")
      .headers(headers_9))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/publish")
      .headers(headers_15))
   //Revisar
   // .exec(http("request_247")
   // .get(uri09 + "/Visitor/Settings.jsonp?sid=b8487f59-3e79-4820-acfe-cb0f6b559805&Settings.prefix=Visitor&Settings.buttonIds=[5736A000000H2uD]&Settings.updateBreadcrumb=1&Settings.urlPrefix=undefined&callback=liveagent._.handlePing&deployment_id=5726A000000HI4w&org_id=00D6A000001UfII&version=41")
   // .headers(headers_87))
    //.exec(http("request_248")
     //.get(uri17 + "/Settings.jsonp?sid=b8487f59-3e79-4820-acfe-cb0f6b559805&Settings.prefix=Visitor&Settings.buttonIds=[5736A000000H2uD]&Settings.updateBreadcrumb=1&Settings.urlPrefix=undefined&callback=liveagent._.handlePing&deployment_id=5726A000000HI4w&org_id=00D6A000001UfII&version=41")
      //.headers(headers_87))
    .exec(http("Seleccionar Chancha Tennis")
    .get("/ccstoreui/v1/pages/checkout?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
    .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/pages/checkout?dataOnly=false&currentDataOnly=true")
      .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/pages/layout/checkout?ccvp=lg")
      .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/merchant/eetagdata")
      .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/pages/css/checkout?occsite=siteUS")
      .headers(headers_20))
//ACTUALIZAR COOK
    .exec(http("Seleccionar Chancha Tennis")
      .post("/ccstoreui/v1/logging/log")
      .headers(headers_24)
      .body(StringBody("""{"logLevel":"info","messages":[{"LogData":"0001-[INFO] Landed on checkout page, -35283bb:1705d575154:-3cf7-129.80.155.72, 1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE"}]}""")))
   //
    .exec(http("Seleccionar Chancha Tennis")
      .post("/ccstoreui/v1/ccm/page")
      .headers(headers_24)
      .body(StringBody("""{"pageViews":1}""")))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/resources/ns.common?locale=es")
      .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/resources/ns.ccformats?locale=es")
      .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/sites/siteUS")
      .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/currencies")
      .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/itemTypes/commerceItem?includeBase=false&parent=commerceItem")
      .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/products?catalogId=cloudCatalog&productIds=HER-B-RED-DEP-TER-013&includeHistorical=true&storePriceListGroupId=tarifaCategoriaB&includeChildSKUsListingIds=true")
      .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/stockStatus?products=HER-B-RED-DEP-TER-013%3AHER-2-162-sabado-baja&catalogId=cloudCatalog&locationIds=")
      .headers(headers_15))
    .exec(http("Seleccionar Chancha Tennis")
      .get("/ccstoreui/v1/merchant/cloudConfiguration")
      .headers(headers_15))
/*REALIZAR LOGIN**********/

  val Escenario_3= exec(http("Login")
      .get(uri19 + "/unified/v1/visit/sze8a0c0_siteUS/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?dnc=1582039528163")
      .headers(headers_89))

    .exec(http("Login")
      .post(uri08 + "/view/rules/3.0/json/sze8a0c0/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?sessionId=-4f1ef422:17058d19d30:1ab6-129.80.155.72&E3SessionID=-4f1ef422:17058d19d30:1ab6-129.80.155.72")
      .headers(headers_114)
      .formParam("""{"uoid":"sze8a0c0","layoutId":"checkoutPageLayoutWithGiftCard","expid":"sze8a0c0","view":{"referrer":"https://ccstore-stage-ze8a.oracleoutsourcing.com/alquiler-cancha-de-tenis/product/HER-B-RED-DEP-TER-013","pageTitle":"Compensar DEV"},"rules":{"spa":"https://ccstore-stage-ze8a.oracleoutsourcing.com/checkout"}}""", ""))

    .exec(http("AUTORIZACION")
      .get(uri14 + "/connect/authorize?client_id=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&redirect_uri=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&response_type=id_token%20token&scope=openid%20profile%20email&nonce=15820395287560.21546587645155846&state=15820395287560.5871139462713151")
      .headers(headers_298)
        .check(header("Location").saveAs("AURA"))
        .check(css("#formLogin", "action").saveAs("TOKENLOGIN"))
        .check(css("[name=\"__RequestVerificationToken\"]", "value").saveAs("VERIFICAR")))
    .exec {session =>
      val response1 = session("AURA").as[String]
      println(response1)
      session}



    .exec(http("Login")
     //REVISAR
      .post("/ccstoreui/v1/analytics/visitorsMetric")
      .headers(headers_95)
      .body(StringBody("""{"visitorId":"1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE","visitId":"-35283bb:1705d575154:-3cf7-129.80.155.72"}""")))

      .exec(http("Login")
      .post("/ccstoreui/v1/orders/price?includeShippingGroups=false")
      .headers(headers_95)
      .body(StringBody("""{"shoppingCart":{"items":[{"productId":"HER-B-RED-DEP-TER-013","quantity":1,"repositoryId":"","availabilityDate":null,"catRefId":"HER-2-162-domingo-baja","expanded":false,"stockStatus":true,"stockState":"","commerceItemQuantity":1,"selectedOptions":[{"optionName":"Sede","optionValue":"Avenida 68"},{"optionName":"Género","optionValue":"Mixto"},{"optionName":"Modalidad","optionValue":"Cancha sintética"},{"optionName":"Demanda","optionValue":"baja"},{"optionName":"Dia","optionValue":"domingo"}],"selectedSkuProperties":[],"discountInfo":[],"rawTotalPrice":7300,"detailedItemPriceInfo":[{"discounted":false,"secondaryCurrencyTaxAmount":0,"amount":7300,"quantity":1,"tax":0,"orderDiscountShare":0,"detailedUnitPrice":7300,"currencyCode":"COP"}],"externalData":[],"addOnItem":false,"displayName":"","invalid":false,"commerceItemId":"ci1582116688892735291","priceListGroupId":"tarifaCategoriaA","giftWithPurchaseCommerceItemMarkers":[],"_date":"2020-02-23T00:00:00.000Z","_endTimeItem":"07:50:00","_startTimeItem":"07:00:00","_discount":null,"_weekDays":null,"_headquarters":null,"_subStage":"Tenis De Campo No. 11","_price":null,"_numberDocument":null,"_stage":"Canchas Tenis de Campo Avenida 68","_level":null,"_nameServicesPyS":null,"_identificationType":null,"_nameClient":null,"_schedule":null,"_requirements":null}],"coupons":[]},"combineLineItems":"yes","payments":[],"_tax":0,"_name":"nombre requerido","_paymentMethod":"Banco","_documentType":"CC","_orderExpirationDate":null,"_orderState":null,"_documentNumber2":null,"_discount":0,"_proveOfPayment":null,"_stateDescription":null,"_acceptanceRequirements":"campo requerido","_subtotal":0,"_total":0,"_phone":0,"_numberQuotation2":null,"_paymentDateTime":null,"_channel":"Virtual"}""")))
    .exec(http("Login")
      .get("/ccstoreui/v1/skus?skuIds=HER-2-162-sabado-baja&fields=repositoryId%2ClistPrices%2CsalePrices")
      .headers(headers_115))
    .exec(http("Login")
      .post("/ccstoreui/v1/shippingMethods")
      .headers(headers_95)
      .body(StringBody("""{"productIdForShippingSurcharge":["HER-B-RED-DEP-TER-013"],"priceInfo":{"amount":16500,"total":16500,"shipping":0,"totalWithoutTax":16500,"currencyCode":"COP","shippingSurchargeValue":0,"tax":0,"subTotal":16500,"orderDiscount":0,"coupons":[]},"items":[{"productId":"HER-B-RED-DEP-TER-013","quantity":1,"repositoryId":"","availabilityDate":null,"catRefId":"HER-2-162-domingo-baja","expanded":false,"stockStatus":true,"stockState":"","commerceItemQuantity":1,"selectedOptions":[{"optionName":"Sede","optionValue":"Avenida 68"},{"optionName":"Género","optionValue":"Mixto"},{"optionName":"Modalidad","optionValue":"Cancha sintética"},{"optionName":"Demanda","optionValue":"baja"},{"optionName":"Dia","optionValue":"domingo"}],"selectedSkuProperties":[],"discountInfo":[],"rawTotalPrice":7300,"detailedItemPriceInfo":[{"discounted":false,"secondaryCurrencyTaxAmount":0,"amount":7300,"quantity":1,"tax":0,"orderDiscountShare":0,"detailedUnitPrice":7300,"currencyCode":"COP"}],"externalData":[],"addOnItem":false,"displayName":"","invalid":false,"commerceItemId":"ci1582116688892735291","priceListGroupId":"tarifaCategoriaA","giftWithPurchaseCommerceItemMarkers":[],"_date":"2020-02-23T00:00:00.000Z","_endTimeItem":"07:50:00","_startTimeItem":"07:00:00","_discount":null,"_weekDays":null,"_headquarters":null,"_subStage":"Tenis De Campo No. 11","_price":null,"_numberDocument":null,"_stage":"Canchas Tenis de Campo Avenida 68","_level":null,"_nameServicesPyS":null,"_identificationType":null,"_nameClient":null,"_schedule":null,"_requirements":null,"price":7300},{"productId":"HER-B-RED-DEP-TER-013","quantity":1,"repositoryId":"","availabilityDate":null,"catRefId":"HER-2-162-sabado-baja","expanded":false,"stockStatus":true,"stockState":"","commerceItemQuantity":1,"selectedOptions":[{"optionName":"Sede","optionValue":"Avenida 68"},{"optionName":"Género","optionValue":"Mixto"},{"optionName":"Modalidad","optionValue":"Cancha sintética"},{"optionName":"Demanda","optionValue":"baja"},{"optionName":"Dia","optionValue":"sabado"}],"selectedSkuProperties":[],"discountInfo":[],"rawTotalPrice":7300,"detailedItemPriceInfo":[{"discounted":false,"secondaryCurrencyTaxAmount":0,"amount":9200,"quantity":1,"tax":0,"orderDiscountShare":0,"detailedUnitPrice":9200,"currencyCode":"COP"}],"externalPrice":9200,"externalPriceQuantity":-1,"externalData":[],"addOnItem":false,"shopperInput":{},"asset":false,"displayName":"","invalid":false,"commerceItemId":"ci1582039521420382431","priceListGroupId":"tarifaCategoriaA","giftWithPurchaseCommerceItemMarkers":[],"_date":"2020-02-22T00:00:00.000Z","_endTimeItem":"07:50:00","_startTimeItem":"07:00:00","_discount":null,"_weekDays":null,"_headquarters":null,"_subStage":"Tenis De Campo No. 11","_price":null,"_numberDocument":"13718984","_stage":"Canchas Tenis de Campo Avenida 68","_level":null,"_nameServicesPyS":null,"_identificationType":"1","_nameClient":"JUAN CARLOS","_schedule":null,"_requirements":null,"price":9200}],"shippingAddress":{"alias":"Address","prefix":"","firstName":"Aura","middleName":"","lastName":"Muñoz Samaca","suffix":"","country":"Colombia","postalCode":"11011","address1":"Cra 13 94a-20","address2":"","address3":"","city":"Bogota","state":"Distrito Capital de Bogotá","county":"","phoneNumber":"3143779391","email":null,"jobTitle":"","companyName":"","faxNumber":"","type":"","repositoryId":"3570336","isDefaultBillingAddress":false,"isDefaultShippingAddress":false,"selectedCountry":"CO","selectedState":"DC","state_ISOCode":"CO-DC","isDefaultAddress":true},"populateShippingMethods":true}""")))

    .exec(http("Login")
      .get("/ccstoreui/v1/merchant/production-Recommendations")
      .headers(headers_115))
    .exec(http("Login")
      .get(uri26 + "?callback=ORA.analytics.dcsRef.dcsGetIdCallback")
      .headers(headers_87))
    .exec(http("Login")
      .post(uri21 + "/view/3.0/json/sze8a0c0/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?sessionId=1545140199459712124951")
      .headers(headers_103)
      .body(StringBody("""{"locale":"es","ccSiteId":"siteUS","ccVisitorId":"1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE","view":{"url":"https://ccstore-stage-ze8a.oracleoutsourcing.com/alquiler-cancha-de-tenis/product/HER-B-RED-DEP-TER-013","referrer":"https://ccstore-stage-ze8a.oracleoutsourcing.com/","productId":"HER-B-RED-DEP-TER-013","pageTitle":"Alquiler cancha de tenis","storeId":"cloudCatalog","excludeDefaultStore":true}}""")))
    .exec(http("Login")
      .post("/ccstoreui/v1/orders/price")
      .headers(headers_95)
      .body(StringBody("""{"shoppingCart":{"items":[{"productId":"HER-B-RED-DEP-TER-013","quantity":1,"repositoryId":"","availabilityDate":null,"catRefId":"HER-2-162-domingo-baja","expanded":false,"stockStatus":true,"stockState":"","commerceItemQuantity":1,"selectedOptions":[{"optionName":"Sede","optionValue":"Avenida 68"},{"optionName":"Género","optionValue":"Mixto"},{"optionName":"Modalidad","optionValue":"Cancha sintética"},{"optionName":"Demanda","optionValue":"baja"},{"optionName":"Dia","optionValue":"domingo"}],"selectedSkuProperties":[],"discountInfo":[],"rawTotalPrice":7300,"detailedItemPriceInfo":[{"discounted":false,"secondaryCurrencyTaxAmount":0,"amount":7300,"quantity":1,"tax":0,"orderDiscountShare":0,"detailedUnitPrice":7300,"currencyCode":"COP"}],"externalData":[],"addOnItem":false,"displayName":"","invalid":false,"commerceItemId":"ci1582116688892735291","priceListGroupId":"tarifaCategoriaA","giftWithPurchaseCommerceItemMarkers":[],"_date":"2020-02-23T00:00:00.000Z","_endTimeItem":"07:50:00","_startTimeItem":"07:00:00","_discount":null,"_weekDays":null,"_headquarters":null,"_subStage":"Tenis De Campo No. 11","_price":null,"_numberDocument":null,"_stage":"Canchas Tenis de Campo Avenida 68","_level":null,"_nameServicesPyS":null,"_identificationType":null,"_nameClient":null,"_schedule":null,"_requirements":null}],"coupons":[]},"combineLineItems":"yes","payments":[],"_tax":0,"_name":"nombre requerido","_paymentMethod":"Banco","_documentType":"CC","_orderExpirationDate":null,"_orderState":null,"_documentNumber2":null,"_discount":0,"_proveOfPayment":null,"_stateDescription":null,"_acceptanceRequirements":"campo requerido","_subtotal":0,"_total":0,"_phone":0,"_numberQuotation2":null,"_paymentDateTime":null,"_channel":"Virtual","shippingGroups":[{"items":[{"productId":"HER-B-RED-DEP-TER-013","catRefId":"HER-2-162-domingo-baja","quantity":1,"commerceItemId":"ci1582116688892735291"}],"type":"hardgoodShippingGroup","shippingGroupId":"0"}]}""")))
    .exec(http("Login")
      .post(uri14 + """${TOKENLOGIN}""")
      .headers(headers_338)
      .formParam("__RequestVerificationToken", """${VERIFICAR}""")
      .formParam("DocumentType", "1")
      .formParam("DocumentID", "13718984")
      .formParam("Password", "Ab123456")
      .formParam("GoogleCaptchaToken", ""))
    .exec(http("request_353")
      .get("/ccstoreui/v1/registry")
      .headers(headers_9))
    .exec(http("Login")
      .get("/ccstoreui/v1/pages/css/home?occsite=siteUS")
      .headers(headers_20))
    .exec(http("Login")
      .get("/ccstoreui/v1/registry")
      .headers(headers_355))
    .exec(http("Login")
      .get("/ccstoreui/v1/pages/layout/home?ccvp=lg")
      .headers(headers_15))
    .exec(http("Login")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
      .headers(headers_15))
    .exec(http("Login")
      .get("/ccstoreui/v1/publish")
      .headers(headers_15))
    .exec(http("Login")
      .get("/ccstoreui/v1/merchant/eetagdata")
      .headers(headers_15))


    .exec(http("Login")
      .get(uri09 + "/Visitor/Settings.jsonp?sid=b8487f59-3e79-4820-acfe-cb0f6b559805&Settings.prefix=Visitor&Settings.buttonIds=[5736A000000H2uD]&Settings.updateBreadcrumb=1&Settings.urlPrefix=undefined&callback=liveagent._.handlePing&deployment_id=5726A000000HI4w&org_id=00D6A000001UfII&version=41")
      .headers(headers_87))
    .exec(http("request_363")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&currentDataOnly=true")
      .headers(headers_15))
    .pause(134 milliseconds)

    .exec(http("Login")
      .get(uri17 + "/Settings.jsonp?sid=b8487f59-3e79-4820-acfe-cb0f6b559805&Settings.prefix=Visitor&Settings.buttonIds=[5736A000000H2uD]&Settings.updateBreadcrumb=1&Settings.urlPrefix=undefined&callback=liveagent._.handlePing&deployment_id=5726A000000HI4w&org_id=00D6A000001UfII&version=41")
      .headers(headers_87))
    .exec(http("Login")
      .post("/ccstoreui/v1/ccm/page")
      .headers(headers_24)
      .body(StringBody("""{"pageViews":1}""")))
  .exec(http("Login")
    .get("/ccstoreui/v1/resources/ns.common?locale=es")
    .headers(headers_15))
    .exec(http("Login")
      .get("/ccstoreui/v1/resources/ns.ccformats?locale=es")
      .headers(headers_15))
/* SELECCIONAR CANCHA DE TENNIS*/
val Escenario_4 =exec(http("SeleccionarProducto")
  .get("/ccstoreui/v1/currencies")
  .headers(headers_15))
  .exec(http("SeleccionarProducto")
    .get("/ccstoreui/v1/sites/siteUS")
    .headers(headers_15))

  .exec(http("Carro de Compra")
    .get("/ccstoreui/v1/itemTypes/commerceItem?includeBase=false&parent=commerceItem")
    .headers(headers_15))
  .exec(http("Carro de Compra")
    .get("/ccstoreui/v1/products?catalogId=cloudCatalog&productIds=HER-B-RED-DEP-TER-013&includeHistorical=true&storePriceListGroupId=tarifaCategoriaB&includeChildSKUsListingIds=true")
    .headers(headers_15))
  .exec(http("Carro de Compra")
    .get("/ccstoreui/v1/stockStatus?products=HER-B-RED-DEP-TER-013%3AHER-2-162-sabado-baja&catalogId=cloudCatalog&locationIds=")
    .headers(headers_15))

  .exec(http("Carro de Compra")
    .get(uri19 + "/unified/v1/visit/sze8a0c0_siteUS/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?dnc=1582039546544")
    .headers(headers_89))
  .exec(http("Carro de Compra")
    .get("/ccstoreui/v1/locations?fields=repositoryId%2Cname%2Clatitude%2Clongitude")
    .headers(headers_15))

  .exec(http("Carro de Compra")
    .post("/ccstoreui/v1/orders/price?includeShippingGroups=true")
    .headers(headers_24)
    .body(StringBody("""{"shoppingCart":{"items":[{"productId":"HER-B-RED-DEP-TER-013","quantity":1,"repositoryId":"","availabilityDate":null,"catRefId":"HER-2-162-domingo-baja","expanded":false,"stockStatus":true,"stockState":"","commerceItemQuantity":1,"selectedOptions":[{"optionName":"Sede","optionValue":"Avenida 68"},{"optionName":"Género","optionValue":"Mixto"},{"optionName":"Modalidad","optionValue":"Cancha sintética"},{"optionName":"Demanda","optionValue":"baja"},{"optionName":"Dia","optionValue":"domingo"}],"selectedSkuProperties":[],"discountInfo":[],"rawTotalPrice":7300,"detailedItemPriceInfo":[{"discounted":false,"secondaryCurrencyTaxAmount":0,"amount":7300,"quantity":1,"tax":0,"orderDiscountShare":0,"detailedUnitPrice":7300,"currencyCode":"COP"}],"externalData":[],"addOnItem":false,"displayName":"","invalid":false,"commerceItemId":"ci1582116688892735291","priceListGroupId":"tarifaCategoriaA","giftWithPurchaseCommerceItemMarkers":[],"_date":"2020-02-23T00:00:00.000Z","_endTimeItem":"07:50:00","_startTimeItem":"07:00:00","_discount":null,"_weekDays":null,"_headquarters":null,"_subStage":"Tenis De Campo No. 11","_price":null,"_numberDocument":null,"_stage":"Canchas Tenis de Campo Avenida 68","_level":null,"_nameServicesPyS":null,"_identificationType":null,"_nameClient":null,"_schedule":null,"_requirements":null}],"coupons":[]},"combineLineItems":"yes","payments":[],"_tax":0,"_name":"nombre requerido","_paymentMethod":"Banco","_documentType":"CC","_orderExpirationDate":null,"_orderState":null,"_documentNumber2":null,"_discount":0,"_proveOfPayment":null,"_stateDescription":null,"_acceptanceRequirements":"campo requerido","_subtotal":0,"_total":0,"_phone":0,"_numberQuotation2":null,"_paymentDateTime":null,"_channel":"Virtual","shippingGroups":[{"items":[{"productId":"HER-B-RED-DEP-TER-013","catRefId":"HER-2-162-domingo-baja","quantity":1,"commerceItemId":"ci1582116688892735291"}],"type":"hardgoodShippingGroup","shippingGroupId":"0"}]}""")))

  .exec(http("Carro de Compra")
    .post(uri08 + "/view/rules/3.0/json/sze8a0c0/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?sessionId=-4f1ef422:17058d19d30:1ab6-129.80.155.72&E3SessionID=-4f1ef422:17058d19d30:1ab6-129.80.155.72")
    .headers(headers_114)
    .formParam("""{"uoid":"sze8a0c0","layoutId":"homePageLayout","expid":"sze8a0c0","view":{"referrer":"https://presso.compensar.com/","pageTitle":"Compensar DEV"},"rules":{"locHash":"#id_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSIsImtpZCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSJ9.eyJpc3MiOiJodHRwczovL3ByZXNzby5jb21wZW5zYXIuY29tIiwiYXVkIjoiaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL2hvbWUiLCJleHAiOjE1ODIwNDY3OTAsIm5iZiI6MTU4MjAzOTU5MCwibm9uY2UiOiIxNTgyMDM5NTI4NzU2MC4yMTU0NjU4NzY0NTE1NTg0NiIsImlhdCI6MTU4MjAzOTU5MCwiYXRfaGFzaCI6IkU3MjBwaE0yOGQ4Qm1yNjVXZDlJZWciLCJzaWQiOiIyN2Y5NTcxNWIxYTFmOTU5M2YxNWY2ZWYxYjJmMWQwZiIsInN1YiI6IjF8MDA4QDEzNzE4OTg0LTAwMC0wMCIsImF1dGhfdGltZSI6MTU4MjAzOTU5MCwiaWRwIjoiaWRzcnYiLCJVc2VySUQiOiIwMDhAMTM3MTg5ODQtMDAwLTAwIiwiRW1haWwiOiJKQ1NBTEFaQVJHVUBHTUFJTC5DT00iLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiSlVBTiBDQVJMT1MgU0FMQVpBUiBHVUFMRFJPTiIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL2dpdmVubmFtZSI6IkpVQU4gQ0FSTE9TIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvZW1haWxhZGRyZXNzIjoiSkNTQUxBWkFSR1VAR01BSUwuQ09NIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvc3VybmFtZSI6IlNBTEFaQVIgR1VBTERST04iLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9tb2JpbGVwaG9uZSI6IjMxNzM0MDkwOTgiLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjF8MDA4QDEzNzE4OTg0LTAwMC0wMCIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6WyJDb3RpemFudGUgUEJTIFNhbHVkIiwiQ29udHJhdGFudGUgUENFIEFmaWxpYWRvIFNhbHVkIiwiVHJhYmFqYWRvciBDYWphIl0sImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL2NsYWltcy9Hcm91cCI6WyJ7XCJHcm91cFwiOlwiQ290aXphbnRlIFBCUyBTYWx1ZFwiLFwiUm9sZVwiOlwiQ290aXphbnRlIFBCUyBTYWx1ZFwifSIsIntcIkdyb3VwXCI6XCJDb250cmF0YW50ZSBQQ0UgQWZpbGlhZG8gU2FsdWRcIixcIlJvbGVcIjpcIkNvbnRyYXRhbnRlIFBDRSBBZmlsaWFkbyBTYWx1ZFwifSIsIntcIkdyb3VwXCI6XCJUcmFiYWphZG9yIEFjdGl2byBDYWphXCIsXCJSb2xlXCI6XCJUcmFiYWphZG9yIENhamFcIn0iXSwiYW1yIjpbInBhc3N3b3JkIl19.T9r2LkZ1SLoHQVcBE4_ClcfyWUMUeN8fqOHxJQlh-pKnPRqEgD65I1lCeC8f-9oqobAGjf31sWWu7029hKKFZMgFPmX-n_jigTLTOhh1u1vbizUVq6_JUp3ZmqAmUOlLN4E-INJn8BCzEkuIwaTtMU0bd04bOfk7xvCd82gOotK0LDDKpGz4eI0X34sjvaTiigSd_mByySUbbXia-kYICMjJURinJGFh9_HGZypOqu17lKmK59nzCapRLAAaUN4DQf873rCRErQPrT0VsO5LWevoP7lyMrf_pzs9_RAYWA09VOGuBDadMA0eEWQhsGYn47xD-vwV6NXAS5B0w4QArg&access_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSIsImtpZCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSJ9.eyJpc3MiOiJodHRwczovL3ByZXNzby5jb21wZW5zYXIuY29tIiwiYXVkIjoiaHR0cHM6Ly9wcmVzc28uY29tcGVuc2FyLmNvbS9yZXNvdXJjZXMiLCJleHAiOjE1ODIwNDMxOTAsIm5iZiI6MTU4MjAzOTU5MCwiY2xpZW50X2lkIjoiaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL2hvbWUiLCJzY29wZSI6WyJvcGVuaWQiLCJwcm9maWxlIiwiZW1haWwiXSwic3ViIjoiMXwwMDhAMTM3MTg5ODQtMDAwLTAwIiwiYXV0aF90aW1lIjoxNTgyMDM5NTkwLCJpZHAiOiJpZHNydiIsImFtciI6WyJwYXNzd29yZCJdfQ.c2j44G8v5qHiS5XoBn6zonn7vC46ez9SAa3C_5YJx5kZINavtrwFOMkOq_k9CKAH6PlKUZFpAQ5uLXuzXtOPCPXYSsfR03Yfk6VVUl3NTJ08BoQ9-57KjdJn-r2vikmRjJxN1jyK1feFOtyMt4X31bq5vJRyWi3hVU4HD6JYm1kR3ArSgl4w8KY3QPDNv8VcbJinX_tHRWyFnhejQuYHmvzDKQuBKLyyf6HfI6srzdQdA1-BhuAEgRFTmHlYTdfcfOv5YiHykoE_x8c4ek7saOL_egtOPNv0zJvcCsRbBHeSk5CtY4oqwVcOi6R84mKlS4KiopVTU25ML7DGXzgoEw&token_type=Bearer&expires_in=3600&scope=openid%20profile%20email&state=15820395287560.5871139462713151&session_state=_NCoL3eQbUpWUAuCpihfYkc_OA5UkaDkrgYR1LaZVWw.b9aeeefea9d76e1e2c9c6b8d2c92c979","spa":"https://ccstore-stage-ze8a.oracleoutsourcing.com/home#id_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSIsImtpZCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSJ9.eyJpc3MiOiJodHRwczovL3ByZXNzby5jb21wZW5zYXIuY29tIiwiYXVkIjoiaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL2hvbWUiLCJleHAiOjE1ODIwNDY3OTAsIm5iZiI6MTU4MjAzOTU5MCwibm9uY2UiOiIxNTgyMDM5NTI4NzU2MC4yMTU0NjU4NzY0NTE1NTg0NiIsImlhdCI6MTU4MjAzOTU5MCwiYXRfaGFzaCI6IkU3MjBwaE0yOGQ4Qm1yNjVXZDlJZWciLCJzaWQiOiIyN2Y5NTcxNWIxYTFmOTU5M2YxNWY2ZWYxYjJmMWQwZiIsInN1YiI6IjF8MDA4QDEzNzE4OTg0LTAwMC0wMCIsImF1dGhfdGltZSI6MTU4MjAzOTU5MCwiaWRwIjoiaWRzcnYiLCJVc2VySUQiOiIwMDhAMTM3MTg5ODQtMDAwLTAwIiwiRW1haWwiOiJKQ1NBTEFaQVJHVUBHTUFJTC5DT00iLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiSlVBTiBDQVJMT1MgU0FMQVpBUiBHVUFMRFJPTiIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL2dpdmVubmFtZSI6IkpVQU4gQ0FSTE9TIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvZW1haWxhZGRyZXNzIjoiSkNTQUxBWkFSR1VAR01BSUwuQ09NIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvc3VybmFtZSI6IlNBTEFaQVIgR1VBTERST04iLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9tb2JpbGVwaG9uZSI6IjMxNzM0MDkwOTgiLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjF8MDA4QDEzNzE4OTg0LTAwMC0wMCIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6WyJDb3RpemFudGUgUEJTIFNhbHVkIiwiQ29udHJhdGFudGUgUENFIEFmaWxpYWRvIFNhbHVkIiwiVHJhYmFqYWRvciBDYWphIl0sImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL2NsYWltcy9Hcm91cCI6WyJ7XCJHcm91cFwiOlwiQ290aXphbnRlIFBCUyBTYWx1ZFwiLFwiUm9sZVwiOlwiQ290aXphbnRlIFBCUyBTYWx1ZFwifSIsIntcIkdyb3VwXCI6XCJDb250cmF0YW50ZSBQQ0UgQWZpbGlhZG8gU2FsdWRcIixcIlJvbGVcIjpcIkNvbnRyYXRhbnRlIFBDRSBBZmlsaWFkbyBTYWx1ZFwifSIsIntcIkdyb3VwXCI6XCJUcmFiYWphZG9yIEFjdGl2byBDYWphXCIsXCJSb2xlXCI6XCJUcmFiYWphZG9yIENhamFcIn0iXSwiYW1yIjpbInBhc3N3b3JkIl19.T9r2LkZ1SLoHQVcBE4_ClcfyWUMUeN8fqOHxJQlh-pKnPRqEgD65I1lCeC8f-9oqobAGjf31sWWu7029hKKFZMgFPmX-n_jigTLTOhh1u1vbizUVq6_JUp3ZmqAmUOlLN4E-INJn8BCzEkuIwaTtMU0bd04bOfk7xvCd82gOotK0LDDKpGz4eI0X34sjvaTiigSd_mByySUbbXia-kYICMjJURinJGFh9_HGZypOqu17lKmK59nzCapRLAAaUN4DQf873rCRErQPrT0VsO5LWevoP7lyMrf_pzs9_RAYWA09VOGuBDadMA0eEWQhsGYn47xD-vwV6NXAS5B0w4QArg&access_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSIsImtpZCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSJ9.eyJpc3MiOiJodHRwczovL3ByZXNzby5jb21wZW5zYXIuY29tIiwiYXVkIjoiaHR0cHM6Ly9wcmVzc28uY29tcGVuc2FyLmNvbS9yZXNvdXJjZXMiLCJleHAiOjE1ODIwNDMxOTAsIm5iZiI6MTU4MjAzOTU5MCwiY2xpZW50X2lkIjoiaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL2hvbWUiLCJzY29wZSI6WyJvcGVuaWQiLCJwcm9maWxlIiwiZW1haWwiXSwic3ViIjoiMXwwMDhAMTM3MTg5ODQtMDAwLTAwIiwiYXV0aF90aW1lIjoxNTgyMDM5NTkwLCJpZHAiOiJpZHNydiIsImFtciI6WyJwYXNzd29yZCJdfQ.c2j44G8v5qHiS5XoBn6zonn7vC46ez9SAa3C_5YJx5kZINavtrwFOMkOq_k9CKAH6PlKUZFpAQ5uLXuzXtOPCPXYSsfR03Yfk6VVUl3NTJ08BoQ9-57KjdJn-r2vikmRjJxN1jyK1feFOtyMt4X31bq5vJRyWi3hVU4HD6JYm1kR3ArSgl4w8KY3QPDNv8VcbJinX_tHRWyFnhejQuYHmvzDKQuBKLyyf6HfI6srzdQdA1-BhuAEgRFTmHlYTdfcfOv5YiHykoE_x8c4ek7saOL_egtOPNv0zJvcCsRbBHeSk5CtY4oqwVcOi6R84mKlS4KiopVTU25ML7DGXzgoEw&token_type=Bearer&expires_in=3600&scope=openid%20profile%20email&state=15820395287560.5871139462713151&session_state=_NCoL3eQbUpWUAuCpihfYkc_OA5UkaDkrgYR1LaZVWw.b9aeeefea9d76e1e2c9c6b8d2c92c979"}}""", ""))
  .exec(http("Carro de Compra")
    .post("/ccstoreui/v1/analytics/visitorsMetric")
    .headers(headers_95)
    .body(StringBody("""{"visitorId":"1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE","visitId":"-35283bb:1705d575154:-3cf7-129.80.155.72"}""")))
  .exec(http("Carro de Compra")
    .get(uri14 + "/connect/checksession")
    .headers(headers_91))
  .exec(http("Carro de Compra")
    .get("/ccstoreui/v1/merchant/production-Recommendations")
    .headers(headers_115))
  .exec(http("Carro de Compra")
    .get("/ccstoreui/v1/products?categoryId=Acueducto-Centro-Narino&includeChildren=true&storePriceListGroupId=tarifaCategoriaB")
    .headers(headers_115))
  .exec(http("Carro de Compra")
    .post(uri21 + "/view/cart/recommendations/3.0/json/sze8a0c0/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?sessionId=1545140199459712124951")
    .headers(headers_103)
    .body(StringBody("""{"cart":{"productIds":["HER-B-RED-DEP-TER-013"],"pricelistGroupId":"tarifaCategoriaA","currencyCode":"COP","totalPrice":7300},"locale":"es","ccSiteId":"siteUS","ccVisitorId":"1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE","slots":{"wi300014":{"numRecs":"12","rule":["mostRecentlyViewed"],"dataItems":["repositoryid"]}},"view":{"url":"https://ccstore-stage-ze8a.oracleoutsourcing.com/home#id_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSIsImtpZCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSJ9.eyJpc3MiOiJodHRwczovL3ByZXNzby5jb21wZW5zYXIuY29tIiwiYXVkIjoiaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL2hvbWUiLCJleHAiOjE1ODIxMjM5NjAsIm5iZiI6MTU4MjExNjc2MCwibm9uY2UiOiIxNTgyMTE2Njk0MTkyMC41MTM3MDI1NjUxMTkxNiIsImlhdCI6MTU4MjExNjc2MCwiYXRfaGFzaCI6IkgwcFhoa1JIb05DeE1RUnA4X0xuanciLCJzaWQiOiI0NjQyMTkzOWEyNDczYmJiODM1MzIzMGJiOTRhYTczOSIsInN1YiI6IjF8MDA4QDEzNzE4OTg0LTAwMC0wMCIsImF1dGhfdGltZSI6MTU4MjExNjc2MCwiaWRwIjoiaWRzcnYiLCJVc2VySUQiOiIwMDhAMTM3MTg5ODQtMDAwLTAwIiwiRW1haWwiOiJKQ1NBTEFaQVJHVTFYQFhHTUFJTDcuQ09NIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6IkpVQU4gQ0FSTE9TIFNBTEFaQVIgR1VBTERST04iLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9naXZlbm5hbWUiOiJKVUFOIENBUkxPUyIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL2VtYWlsYWRkcmVzcyI6IkpDU0FMQVpBUkdVMVhAWEdNQUlMNy5DT00iLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9zdXJuYW1lIjoiU0FMQVpBUiBHVUFMRFJPTiIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL21vYmlsZXBob25lIjoiMzE3MzQwOTA5OCIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL25hbWVpZGVudGlmaWVyIjoiMXwwMDhAMTM3MTg5ODQtMDAwLTAwIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjpbIkNvdGl6YW50ZSBQQlMgU2FsdWQiLCJDb250cmF0YW50ZSBQQ0UgQWZpbGlhZG8gU2FsdWQiLCJUcmFiYWphZG9yIENhamEiXSwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvY2xhaW1zL0dyb3VwIjpbIntcIkdyb3VwXCI6XCJDb3RpemFudGUgUEJTIFNhbHVkXCIsXCJSb2xlXCI6XCJDb3RpemFudGUgUEJTIFNhbHVkXCJ9Iiwie1wiR3JvdXBcIjpcIkNvbnRyYXRhbnRlIFBDRSBBZmlsaWFkbyBTYWx1ZFwiLFwiUm9sZVwiOlwiQ29udHJhdGFudGUgUENFIEFmaWxpYWRvIFNhbHVkXCJ9Iiwie1wiR3JvdXBcIjpcIlRyYWJhamFkb3IgQWN0aXZvIENhamFcIixcIlJvbGVcIjpcIlRyYWJhamFkb3IgQ2FqYVwifSJdLCJhbXIiOlsicGFzc3dvcmQiXX0.g6yaJkjUa6ncHKXlyjjjgbcM45i901CNr25jMiV_CgLiPIWfmkwTreUlHDgj8ArdK05mmXUfUUXaC_KIb8rIe2LYlZnkA18u1p4PiWepDof4wbfrQQ4ae9calkxci_33_N5i8gf0MbmbeCI3f25dblsC69OSSgYyiI0yVInxaDLR_-23qpeqnWvlEUDXYxx15OaiJTU7ByWFHi6s0My9mQG2D6l0jqO4_p_M2l52Iu4o4YE91uOB-5TYQv3b1dTgEYE5lP8t9qQY2Qj7qTW4yfKAQP3_VMDhkR5ytKqE4iiompO-jgrJ7Ylv_NAMTYmLZds10mD6Exwpl5av55VEVA&access_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSIsImtpZCI6ImFTTm1OYXgxaDY2bkJvQTRhZU9zakJlUnFzWSJ9.eyJpc3MiOiJodHRwczovL3ByZXNzby5jb21wZW5zYXIuY29tIiwiYXVkIjoiaHR0cHM6Ly9wcmVzc28uY29tcGVuc2FyLmNvbS9yZXNvdXJjZXMiLCJleHAiOjE1ODIxMjAzNjAsIm5iZiI6MTU4MjExNjc2MCwiY2xpZW50X2lkIjoiaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL2hvbWUiLCJzY29wZSI6WyJvcGVuaWQiLCJwcm9maWxlIiwiZW1haWwiXSwic3ViIjoiMXwwMDhAMTM3MTg5ODQtMDAwLTAwIiwiYXV0aF90aW1lIjoxNTgyMTE2NzYwLCJpZHAiOiJpZHNydiIsImFtciI6WyJwYXNzd29yZCJdfQ.PSL4iahMvoZIZm5z6V4P_7Cb4eogciCLpghAUZZIhDiYpL9kCrXehP4960p6Zz4Q26vpJFDUfDfWKFxUHdd7-KfXSQ9nMG0NR-itjcggoJ0c8V1oaLSNR4fqYYjdLanHGkFQn8gxj5oFsqz0HyvRv7oYWFDVJ2BB5Kd-QNB8eHUjgPvYiCADnW_IqQc8PhmlkGCP694FFXaHReAnUr5lO7P7lKhy2lrvpz1Qm6dwWpO_3weNXuOShozxmcP-u1Y671TIc0zL9PvBkTtSKWdvatFNU1yJiaXlrtErEvEad9d7GQY8yQSdoXGUKDc0Sh6ElClVCmabvoCzCa88xLrR2g&token_type=Bearer&expires_in=3600&scope=openid%20profile%20email&state=15821166941920.9863769365363404&session_state=cg2Z7s_Bapk_TyMDFNCf1jbFefuh9whvPGRPpL81xfE.0641c89dff1b0314f3389ce2b0c2c441","referrer":"https://presso.compensar.com/","pageTitle":"Compensar DEV","storeId":"cloudCatalog","excludeDefaultStore":true}}""")))

  .exec(http("Carro de Compra")
    .get("/ccstoreui/v1/products?categoryId=adultosFamily&includeChildren=true&storePriceListGroupId=tarifaCategoriaB")
    .headers(headers_15))
  //aCTUALIZAR COOKIE

  .exec(http("Carro de Compra")
    .get("/ccstoreui/v1/products?storePriceListGroupId=tarifaCategoriaB&productIds=HER-B-RED-DEP-TER-013")
    .headers(headers_115))

  .exec(http("Carro de Compra")
    .get("/ccstoreui/v1/products?categoryId=TopSeller&includeChildren=true&storePriceListGroupId=tarifaCategoriaB")
    .headers(headers_15))
  //ACTUALIZAR DATOS DE USUARIO
 /* .exec(http("request_463")
  .post("/ccstorex/custom/v1/sso/facebook/userData2")
  .headers(headers_463)
  .body(StringBody("""{"user":{"email": "1-13718984@compensar.com","login" : "1-13718984@compensar.com","first_name": "JUAN CARLOS","last_name": "SALAZAR GUALDRON","doc_num":"13718984","doc_type":"1"}""")))
  */
  .exec(http("Carro de Compra")
    .get(uri26 + "?callback=ORA.analytics.dcsRef.dcsGetIdCallback")
    .headers(headers_87))

  val Escenario_5 =exec(http("Autenticado")
    .post("/SAML/post")
    .headers(headers_508)
    .formParam("SAMLResponse", "PHNhbWxwOlJlc3BvbnNlIHhtbG5zOnNhbWxwPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6cHJvdG9jb2wiIElEPSJfY2RlNGEyMWI3MjBjNDczZDQzZDUiICBWZXJzaW9uPSIyLjAiIElzc3VlSW5zdGFudD0iMjAyMC0wMi0xOFQxNToyNjozNVoiICBEZXN0aW5hdGlvbj0iaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL1NBTUwvcG9zdCI+PHNhbWw6SXNzdWVyIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iPnVybjpleGFtcGxlOmlkcDwvc2FtbDpJc3N1ZXI+PHNhbWxwOlN0YXR1cz48c2FtbHA6U3RhdHVzQ29kZSBWYWx1ZT0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOnN0YXR1czpTdWNjZXNzIi8+PC9zYW1scDpTdGF0dXM+PHNhbWw6QXNzZXJ0aW9uIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iIFZlcnNpb249IjIuMCIgSUQ9Il9PZG9Pa1FCSmtJeURyWlh0Tzd5WkxETHB1MlUxeVZhVCIgSXNzdWVJbnN0YW50PSIyMDIwLTAyLTE4VDE1OjI2OjM1Ljc4M1oiPjxzYW1sOklzc3Vlcj51cm46ZXhhbXBsZTppZHA8L3NhbWw6SXNzdWVyPjxTaWduYXR1cmUgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPjxTaWduZWRJbmZvPjxDYW5vbmljYWxpemF0aW9uTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8xMC94bWwtZXhjLWMxNG4jIi8+PFNpZ25hdHVyZU1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZHNpZy1tb3JlI3JzYS1zaGEyNTYiLz48UmVmZXJlbmNlIFVSST0iI19PZG9Pa1FCSmtJeURyWlh0Tzd5WkxETHB1MlUxeVZhVCI+PFRyYW5zZm9ybXM+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNlbnZlbG9wZWQtc2lnbmF0dXJlIi8+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyIvPjwvVHJhbnNmb3Jtcz48RGlnZXN0TWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjc2hhMjU2Ii8+PERpZ2VzdFZhbHVlPjRhVlN1TUc0MVBkTEx1Q0RXcjQ1UlltMFNLcnlvSjY5NnNQaEZCbE1IMFU9PC9EaWdlc3RWYWx1ZT48L1JlZmVyZW5jZT48L1NpZ25lZEluZm8+PFNpZ25hdHVyZVZhbHVlPnE2MXRWcWFOQTNWYVpweW5zODJGSXBtK1NxamwxOXdmdmdQYk14TGoycm9uSTVCZE9yRkNaRVRSMW9iQXZ2Z3Y2Tmp2SWc4TE4vem4vUS8vcFBRMFJvVWlZUUI4OUhZeEViM0xUVHdQNzdlVHVNRlplY1YvaHNzRUNoTU1VaUNnMmtiaUMxZTlMY3hNWW5jcXp0ZzRuanFkeFFBVkIvajVvYmJ6RzJaM0FuRjlrcHk3eXVtY0RJVkZ1VHV5VGYxTkl5UmNLekwyVTRrQnZjWmMwRWlvWC95SHFRZGw0VXhVemNkei84OEZ2a0FSWXNnQi9XUk9NMEZuY3JRbFR6RFBMTFV0M3VrSW9zc004RlBPNlR4bTBhbmF3R1dXVExoY3pLWUg4S1hCRHA5UXdoTGYzWGZldGQyN2hHbDFhUlZBU0xiY1htRHR0NTJpRkdnZUNKYlBHQT09PC9TaWduYXR1cmVWYWx1ZT48S2V5SW5mbz48WDUwOURhdGE+PFg1MDlDZXJ0aWZpY2F0ZT5NSUlEclRDQ0FwV2dBd0lCQWdJSkFQSm9WYnNwZFpDZ01BMEdDU3FHU0liM0RRRUJDd1VBTUcweEN6QUpCZ05WQkFZVEFsVlRNUk13RVFZRFZRUUlEQXBEWVd4cFptOXlibWxoTVJZd0ZBWURWUVFIREExVFlXNGdSbkpoYm1OcGMyTnZNUkF3RGdZRFZRUUtEQWRLWVc1cmVVTnZNUjh3SFFZRFZRUUREQlpVWlhOMElFbGtaVzUwYVhSNUlGQnliM1pwWkdWeU1CNFhEVEUzTURreU5URTVOVEF6TTFvWERUTTNNRGt5TURFNU5UQXpNMW93YlRFTE1Ba0dBMVVFQmhNQ1ZWTXhFekFSQmdOVkJBZ01Da05oYkdsbWIzSnVhV0V4RmpBVUJnTlZCQWNNRFZOaGJpQkdjbUZ1WTJselkyOHhFREFPQmdOVkJBb01CMHBoYm10NVEyOHhIekFkQmdOVkJBTU1GbFJsYzNRZ1NXUmxiblJwZEhrZ1VISnZkbWxrWlhJd2dnRWlNQTBHQ1NxR1NJYjNEUUVCQVFVQUE0SUJEd0F3Z2dFS0FvSUJBUURjNjZ5SFR1YzJtdjYyN0pneVlDVllJUjVyUmkvMDFpOFczeHFnbHBZK2dwRXl3bTViU0ZMZVIzYUVNOS9OTEZHRDB6bTVoUDNGZEVkNmpSV1cxckZ3WWRjb25jS09TYmpQajlXV3VYUnpPTXdDTEtHQzMvcTZCT2tpc002UnlUV3hpWFZLZmZqZ1l6cCtRRDl6L2cyYU9pZnQycmlGT2JVZEdlS2ZCdTdmaTl1d2x0ZEpsVDdjdWJ4Vm5nRVhPc01IQnQwc01oTHFWWmxaMFdFcS9vcGtUa2ZvWDdpak9wVjViNGg4cGM1UGtmQ2FTa01Eb3lCdlJ1bkdwMXZmaGllR045b1RnRDAzOXk2ckw1QmFyamJGSnY2WEQ3SGZSWC9nVzJYSWVvS09zSE82aVhvckVHYXJmem5va3NlKzkySlJrZm5mWXR3b29oMDBTTFdqSnpzN0FnTUJBQUdqVURCT01CMEdBMVVkRGdRV0JCVE5KdXd0dUF1QVAzcFVqRHVoL1dvS3pjOTM1VEFmQmdOVkhTTUVHREFXZ0JUTkp1d3R1QXVBUDNwVWpEdWgvV29LemM5MzVUQU1CZ05WSFJNRUJUQURBUUgvTUEwR0NTcUdTSWIzRFFFQkN3VUFBNElCQVFBN2lhc1Noemt1VHFUd1grcDZjaFE3djh2ekd4YUxTRUtkcm44YWNEdzZSYm1BVVFsRENLaEtqaVprVmJscUNmMnNhdjlCWlM5YTQvL2JueEdNbDk5ZGttUDlnWUtHYVFzZzR6Z1VUajZuaWV6M3JIYkgrVTAxY2wzZnhWZzd6OGVsZ0RMdkNuV0hwNGh4Yk0zZHFNdEM0V25xcVBxWkQ1OXVicjZDSlZjSjd0U0FJZGNiVVlKaTlibmZXZCtuY01qUWs2UkhnMXhQWVN2UGpHLy9xZTdXTDRMbGtUQ1U1UzJSZm00d0ZDTWtXUVM0SUJNNHBscDFEaUJuR3BJSWFHU1ZCdC95Y3B3MENTWUZsRzk2T2k3M1B2dExKSGVubWhsb1p6UFZuTFBPdmlDbjY1a0hqNnoxM2t2dmxNWm1JUzRmWDN5eS8zaHM4SWR1VzgrcjkwZlg8L1g1MDlDZXJ0aWZpY2F0ZT48L1g1MDlEYXRhPjwvS2V5SW5mbz48L1NpZ25hdHVyZT48c2FtbDpTdWJqZWN0PjxzYW1sOk5hbWVJRCBGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpuYW1laWQtZm9ybWF0OnBlcnNpc3RlbnQiPjEtMTM3MTg5ODRAY29tcGVuc2FyLmNvbTwvc2FtbDpOYW1lSUQ+PHNhbWw6U3ViamVjdENvbmZpcm1hdGlvbiBNZXRob2Q9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpjbTpiZWFyZXIiPjxzYW1sOlN1YmplY3RDb25maXJtYXRpb25EYXRhIE5vdE9uT3JBZnRlcj0iMjAyMC0wMi0xOFQxNjoyNjozNS43ODNaIiBSZWNpcGllbnQ9Imh0dHBzOi8vY2NzdG9yZS1zdGFnZS16ZThhLm9yYWNsZW91dHNvdXJjaW5nLmNvbS9TQU1ML3Bvc3QiLz48L3NhbWw6U3ViamVjdENvbmZpcm1hdGlvbj48L3NhbWw6U3ViamVjdD48c2FtbDpDb25kaXRpb25zIE5vdEJlZm9yZT0iMjAyMC0wMi0xOFQxNToyNjozNS43ODNaIiBOb3RPbk9yQWZ0ZXI9IjIwMjAtMDItMThUMTY6MjY6MzUuNzgzWiI+PHNhbWw6QXVkaWVuY2VSZXN0cmljdGlvbj48c2FtbDpBdWRpZW5jZT5odHRwczovL2Njc3RvcmUtc3RhZ2UtemU4YS5vcmFjbGVvdXRzb3VyY2luZy5jb20vU0FNTC88L3NhbWw6QXVkaWVuY2U+PC9zYW1sOkF1ZGllbmNlUmVzdHJpY3Rpb24+PC9zYW1sOkNvbmRpdGlvbnM+PHNhbWw6QXR0cmlidXRlU3RhdGVtZW50IHhtbG5zOnhzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYSIgeG1sbnM6eHNpPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYS1pbnN0YW5jZSI+PHNhbWw6QXR0cmlidXRlIE5hbWU9ImZpcnN0TmFtZSIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PHNhbWw6QXR0cmlidXRlVmFsdWUgeHNpOnR5cGU9InhzOnN0cmluZyI+SlVBTiBDQVJMT1M8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgTmFtZT0ibGFzdE5hbWUiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpzdHJpbmciPlNBTEFaQVIgR1VBTERST048L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgTmFtZT0iZW1haWwiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpzdHJpbmciPjEtMTM3MTg5ODRAY29tcGVuc2FyLmNvbTwvc2FtbDpBdHRyaWJ1dGVWYWx1ZT48L3NhbWw6QXR0cmlidXRlPjxzYW1sOkF0dHJpYnV0ZSBOYW1lPSJsb2dpbiIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PHNhbWw6QXR0cmlidXRlVmFsdWUgeHNpOnR5cGU9InhzOnN0cmluZyI+MS0xMzcxODk4NEBjb21wZW5zYXIuY29tPC9zYW1sOkF0dHJpYnV0ZVZhbHVlPjwvc2FtbDpBdHRyaWJ1dGU+PHNhbWw6QXR0cmlidXRlIE5hbWU9ImRvY3VtVHlwZSIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PHNhbWw6QXR0cmlidXRlVmFsdWUgeHNpOnR5cGU9InhzOnN0cmluZyI+MTwvc2FtbDpBdHRyaWJ1dGVWYWx1ZT48L3NhbWw6QXR0cmlidXRlPjxzYW1sOkF0dHJpYnV0ZSBOYW1lPSJkb2N1bU51bSIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PHNhbWw6QXR0cmlidXRlVmFsdWUgeHNpOnR5cGU9InhzOmRvdWJsZSI+MTM3MTg5ODQ8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48L3NhbWw6QXR0cmlidXRlU3RhdGVtZW50PjxzYW1sOkF1dGhuU3RhdGVtZW50IEF1dGhuSW5zdGFudD0iMjAyMC0wMi0xOFQxNToyNjozNS43ODNaIj48c2FtbDpBdXRobkNvbnRleHQ+PHNhbWw6QXV0aG5Db250ZXh0Q2xhc3NSZWY+dXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmFjOmNsYXNzZXM6UGFzc3dvcmRQcm90ZWN0ZWRUcmFuc3BvcnQ8L3NhbWw6QXV0aG5Db250ZXh0Q2xhc3NSZWY+PC9zYW1sOkF1dGhuQ29udGV4dD48L3NhbWw6QXV0aG5TdGF0ZW1lbnQ+PC9zYW1sOkFzc2VydGlvbj48L3NhbWxwOlJlc3BvbnNlPg==")
    .formParam("RelayState", ""))

    .exec(http("Autenticado")
      .get("/ccstoreui/v1/registry")
      .headers(headers_9))
    .exec(http("Autenticado")
      .get("/ccstoreui/v1/publish")
      .headers(headers_15))

    .exec(http("Autenticado")
      .get("/ccstoreui/v1/merchant/eetagdata")
      .headers(headers_15))
    .exec(http("Autenticado")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
      .headers(headers_15))
    .exec(http("Autenticado")
      .get("/ccstoreui/v1/pages/layout/home?ccvp=lg")
      .headers(headers_15))
    .exec(http("Autenticado")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&currentDataOnly=true")
      .headers(headers_15))
    .exec(http("Autenticado")
      .get("/ccstoreui/v1/pages/css/home?occsite=siteUS")
      .headers(headers_20))
    .exec(http("Autenticado")
      .post("/ccstoreui/v1/ccm/page")
      .headers(headers_24)
      .body(StringBody("""{"pageViews":1}""")))
    .exec(http("Autenticado")
      .get("/ccstoreui/v1/resources/ns.common?locale=es")
      .headers(headers_15))
    .exec(http("Autenticado")
      .get("/ccstoreui/v1/resources/ns.ccformats?locale=es")
      .headers(headers_15))

    .exec(http("Autenticado")
      .get("/ccstoreui/v1/currencies")
      .headers(headers_15))
    .exec(http("Autenticado")
      .get("/ccstoreui/v1/sites/siteUS")
      .headers(headers_15))

    .exec(http("Autenticado")
      .get("/ccstoreui/v1/itemTypes/commerceItem?includeBase=false&parent=commerceItem")
      .headers(headers_15))

    .exec(http("Autenticado")
      .get("/ccstoreui/v1/stockStatus?products=HER-B-RED-DEP-TER-013%3AHER-2-162-sabado-baja&catalogId=cloudCatalog&locationIds=")
      .headers(headers_15))

    .exec(http("Autenticado")
      .get("/ccstoreui/v1/products?catalogId=cloudCatalog&productIds=HER-B-RED-DEP-TER-013&includeHistorical=true&storePriceListGroupId=tarifaCategoriaB&includeChildSKUsListingIds=true")
      .headers(headers_15))

    .exec(http("Bearer")
      .post("/ccstoreui/v1/login/")
      .headers(headers_561)
      .formParam("grant_type", "saml_credentials")
      .formParam("saml_response", "PHNhbWxwOlJlc3BvbnNlIHhtbG5zOnNhbWxwPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6cHJvdG9jb2wiIElEPSJfY2RlNGEyMWI3MjBjNDczZDQzZDUiICBWZXJzaW9uPSIyLjAiIElzc3VlSW5zdGFudD0iMjAyMC0wMi0xOFQxNToyNjozNVoiICBEZXN0aW5hdGlvbj0iaHR0cHM6Ly9jY3N0b3JlLXN0YWdlLXplOGEub3JhY2xlb3V0c291cmNpbmcuY29tL1NBTUwvcG9zdCI+PHNhbWw6SXNzdWVyIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iPnVybjpleGFtcGxlOmlkcDwvc2FtbDpJc3N1ZXI+PHNhbWxwOlN0YXR1cz48c2FtbHA6U3RhdHVzQ29kZSBWYWx1ZT0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOnN0YXR1czpTdWNjZXNzIi8+PC9zYW1scDpTdGF0dXM+PHNhbWw6QXNzZXJ0aW9uIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iIFZlcnNpb249IjIuMCIgSUQ9Il9PZG9Pa1FCSmtJeURyWlh0Tzd5WkxETHB1MlUxeVZhVCIgSXNzdWVJbnN0YW50PSIyMDIwLTAyLTE4VDE1OjI2OjM1Ljc4M1oiPjxzYW1sOklzc3Vlcj51cm46ZXhhbXBsZTppZHA8L3NhbWw6SXNzdWVyPjxTaWduYXR1cmUgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPjxTaWduZWRJbmZvPjxDYW5vbmljYWxpemF0aW9uTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8xMC94bWwtZXhjLWMxNG4jIi8+PFNpZ25hdHVyZU1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZHNpZy1tb3JlI3JzYS1zaGEyNTYiLz48UmVmZXJlbmNlIFVSST0iI19PZG9Pa1FCSmtJeURyWlh0Tzd5WkxETHB1MlUxeVZhVCI+PFRyYW5zZm9ybXM+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNlbnZlbG9wZWQtc2lnbmF0dXJlIi8+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyIvPjwvVHJhbnNmb3Jtcz48RGlnZXN0TWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjc2hhMjU2Ii8+PERpZ2VzdFZhbHVlPjRhVlN1TUc0MVBkTEx1Q0RXcjQ1UlltMFNLcnlvSjY5NnNQaEZCbE1IMFU9PC9EaWdlc3RWYWx1ZT48L1JlZmVyZW5jZT48L1NpZ25lZEluZm8+PFNpZ25hdHVyZVZhbHVlPnE2MXRWcWFOQTNWYVpweW5zODJGSXBtK1NxamwxOXdmdmdQYk14TGoycm9uSTVCZE9yRkNaRVRSMW9iQXZ2Z3Y2Tmp2SWc4TE4vem4vUS8vcFBRMFJvVWlZUUI4OUhZeEViM0xUVHdQNzdlVHVNRlplY1YvaHNzRUNoTU1VaUNnMmtiaUMxZTlMY3hNWW5jcXp0ZzRuanFkeFFBVkIvajVvYmJ6RzJaM0FuRjlrcHk3eXVtY0RJVkZ1VHV5VGYxTkl5UmNLekwyVTRrQnZjWmMwRWlvWC95SHFRZGw0VXhVemNkei84OEZ2a0FSWXNnQi9XUk9NMEZuY3JRbFR6RFBMTFV0M3VrSW9zc004RlBPNlR4bTBhbmF3R1dXVExoY3pLWUg4S1hCRHA5UXdoTGYzWGZldGQyN2hHbDFhUlZBU0xiY1htRHR0NTJpRkdnZUNKYlBHQT09PC9TaWduYXR1cmVWYWx1ZT48S2V5SW5mbz48WDUwOURhdGE+PFg1MDlDZXJ0aWZpY2F0ZT5NSUlEclRDQ0FwV2dBd0lCQWdJSkFQSm9WYnNwZFpDZ01BMEdDU3FHU0liM0RRRUJDd1VBTUcweEN6QUpCZ05WQkFZVEFsVlRNUk13RVFZRFZRUUlEQXBEWVd4cFptOXlibWxoTVJZd0ZBWURWUVFIREExVFlXNGdSbkpoYm1OcGMyTnZNUkF3RGdZRFZRUUtEQWRLWVc1cmVVTnZNUjh3SFFZRFZRUUREQlpVWlhOMElFbGtaVzUwYVhSNUlGQnliM1pwWkdWeU1CNFhEVEUzTURreU5URTVOVEF6TTFvWERUTTNNRGt5TURFNU5UQXpNMW93YlRFTE1Ba0dBMVVFQmhNQ1ZWTXhFekFSQmdOVkJBZ01Da05oYkdsbWIzSnVhV0V4RmpBVUJnTlZCQWNNRFZOaGJpQkdjbUZ1WTJselkyOHhFREFPQmdOVkJBb01CMHBoYm10NVEyOHhIekFkQmdOVkJBTU1GbFJsYzNRZ1NXUmxiblJwZEhrZ1VISnZkbWxrWlhJd2dnRWlNQTBHQ1NxR1NJYjNEUUVCQVFVQUE0SUJEd0F3Z2dFS0FvSUJBUURjNjZ5SFR1YzJtdjYyN0pneVlDVllJUjVyUmkvMDFpOFczeHFnbHBZK2dwRXl3bTViU0ZMZVIzYUVNOS9OTEZHRDB6bTVoUDNGZEVkNmpSV1cxckZ3WWRjb25jS09TYmpQajlXV3VYUnpPTXdDTEtHQzMvcTZCT2tpc002UnlUV3hpWFZLZmZqZ1l6cCtRRDl6L2cyYU9pZnQycmlGT2JVZEdlS2ZCdTdmaTl1d2x0ZEpsVDdjdWJ4Vm5nRVhPc01IQnQwc01oTHFWWmxaMFdFcS9vcGtUa2ZvWDdpak9wVjViNGg4cGM1UGtmQ2FTa01Eb3lCdlJ1bkdwMXZmaGllR045b1RnRDAzOXk2ckw1QmFyamJGSnY2WEQ3SGZSWC9nVzJYSWVvS09zSE82aVhvckVHYXJmem5va3NlKzkySlJrZm5mWXR3b29oMDBTTFdqSnpzN0FnTUJBQUdqVURCT01CMEdBMVVkRGdRV0JCVE5KdXd0dUF1QVAzcFVqRHVoL1dvS3pjOTM1VEFmQmdOVkhTTUVHREFXZ0JUTkp1d3R1QXVBUDNwVWpEdWgvV29LemM5MzVUQU1CZ05WSFJNRUJUQURBUUgvTUEwR0NTcUdTSWIzRFFFQkN3VUFBNElCQVFBN2lhc1Noemt1VHFUd1grcDZjaFE3djh2ekd4YUxTRUtkcm44YWNEdzZSYm1BVVFsRENLaEtqaVprVmJscUNmMnNhdjlCWlM5YTQvL2JueEdNbDk5ZGttUDlnWUtHYVFzZzR6Z1VUajZuaWV6M3JIYkgrVTAxY2wzZnhWZzd6OGVsZ0RMdkNuV0hwNGh4Yk0zZHFNdEM0V25xcVBxWkQ1OXVicjZDSlZjSjd0U0FJZGNiVVlKaTlibmZXZCtuY01qUWs2UkhnMXhQWVN2UGpHLy9xZTdXTDRMbGtUQ1U1UzJSZm00d0ZDTWtXUVM0SUJNNHBscDFEaUJuR3BJSWFHU1ZCdC95Y3B3MENTWUZsRzk2T2k3M1B2dExKSGVubWhsb1p6UFZuTFBPdmlDbjY1a0hqNnoxM2t2dmxNWm1JUzRmWDN5eS8zaHM4SWR1VzgrcjkwZlg8L1g1MDlDZXJ0aWZpY2F0ZT48L1g1MDlEYXRhPjwvS2V5SW5mbz48L1NpZ25hdHVyZT48c2FtbDpTdWJqZWN0PjxzYW1sOk5hbWVJRCBGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpuYW1laWQtZm9ybWF0OnBlcnNpc3RlbnQiPjEtMTM3MTg5ODRAY29tcGVuc2FyLmNvbTwvc2FtbDpOYW1lSUQ+PHNhbWw6U3ViamVjdENvbmZpcm1hdGlvbiBNZXRob2Q9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpjbTpiZWFyZXIiPjxzYW1sOlN1YmplY3RDb25maXJtYXRpb25EYXRhIE5vdE9uT3JBZnRlcj0iMjAyMC0wMi0xOFQxNjoyNjozNS43ODNaIiBSZWNpcGllbnQ9Imh0dHBzOi8vY2NzdG9yZS1zdGFnZS16ZThhLm9yYWNsZW91dHNvdXJjaW5nLmNvbS9TQU1ML3Bvc3QiLz48L3NhbWw6U3ViamVjdENvbmZpcm1hdGlvbj48L3NhbWw6U3ViamVjdD48c2FtbDpDb25kaXRpb25zIE5vdEJlZm9yZT0iMjAyMC0wMi0xOFQxNToyNjozNS43ODNaIiBOb3RPbk9yQWZ0ZXI9IjIwMjAtMDItMThUMTY6MjY6MzUuNzgzWiI+PHNhbWw6QXVkaWVuY2VSZXN0cmljdGlvbj48c2FtbDpBdWRpZW5jZT5odHRwczovL2Njc3RvcmUtc3RhZ2UtemU4YS5vcmFjbGVvdXRzb3VyY2luZy5jb20vU0FNTC88L3NhbWw6QXVkaWVuY2U+PC9zYW1sOkF1ZGllbmNlUmVzdHJpY3Rpb24+PC9zYW1sOkNvbmRpdGlvbnM+PHNhbWw6QXR0cmlidXRlU3RhdGVtZW50IHhtbG5zOnhzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYSIgeG1sbnM6eHNpPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYS1pbnN0YW5jZSI+PHNhbWw6QXR0cmlidXRlIE5hbWU9ImZpcnN0TmFtZSIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PHNhbWw6QXR0cmlidXRlVmFsdWUgeHNpOnR5cGU9InhzOnN0cmluZyI+SlVBTiBDQVJMT1M8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgTmFtZT0ibGFzdE5hbWUiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpzdHJpbmciPlNBTEFaQVIgR1VBTERST048L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgTmFtZT0iZW1haWwiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6YmFzaWMiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlIHhzaTp0eXBlPSJ4czpzdHJpbmciPjEtMTM3MTg5ODRAY29tcGVuc2FyLmNvbTwvc2FtbDpBdHRyaWJ1dGVWYWx1ZT48L3NhbWw6QXR0cmlidXRlPjxzYW1sOkF0dHJpYnV0ZSBOYW1lPSJsb2dpbiIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PHNhbWw6QXR0cmlidXRlVmFsdWUgeHNpOnR5cGU9InhzOnN0cmluZyI+MS0xMzcxODk4NEBjb21wZW5zYXIuY29tPC9zYW1sOkF0dHJpYnV0ZVZhbHVlPjwvc2FtbDpBdHRyaWJ1dGU+PHNhbWw6QXR0cmlidXRlIE5hbWU9ImRvY3VtVHlwZSIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PHNhbWw6QXR0cmlidXRlVmFsdWUgeHNpOnR5cGU9InhzOnN0cmluZyI+MTwvc2FtbDpBdHRyaWJ1dGVWYWx1ZT48L3NhbWw6QXR0cmlidXRlPjxzYW1sOkF0dHJpYnV0ZSBOYW1lPSJkb2N1bU51bSIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PHNhbWw6QXR0cmlidXRlVmFsdWUgeHNpOnR5cGU9InhzOmRvdWJsZSI+MTM3MTg5ODQ8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48L3NhbWw6QXR0cmlidXRlU3RhdGVtZW50PjxzYW1sOkF1dGhuU3RhdGVtZW50IEF1dGhuSW5zdGFudD0iMjAyMC0wMi0xOFQxNToyNjozNS43ODNaIj48c2FtbDpBdXRobkNvbnRleHQ+PHNhbWw6QXV0aG5Db250ZXh0Q2xhc3NSZWY+dXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmFjOmNsYXNzZXM6UGFzc3dvcmRQcm90ZWN0ZWRUcmFuc3BvcnQ8L3NhbWw6QXV0aG5Db250ZXh0Q2xhc3NSZWY+PC9zYW1sOkF1dGhuQ29udGV4dD48L3NhbWw6QXV0aG5TdGF0ZW1lbnQ+PC9zYW1sOkFzc2VydGlvbj48L3NhbWxwOlJlc3BvbnNlPg==")
      .formParam("relay_state", ""))



    .exec(http("Autenticado")
      .get(uri19 + "/unified/v1/visit/sze8a0c0_siteUS/1168ORzCUl2Et2IdP0sSi2RayAfNIuiB7RTUJZw47i3kXk07DFE?dnc=1582039551989")
      .headers(headers_89))

  val Escenario_6 =exec(http("Seleccionar Participante")
    .get("/ccstoreui/v1/locations?fields=repositoryId%2Cname%2Clatitude%2Clongitude")
    .headers(headers_15))

    /* En este metodo se obtiene el Bearer=cookiie:oauth_token_secret-storefrontUI
    .exec(http("request_601")
      .get("/ccstoreui/v1/profiles/current")
      .headers(headers_601))*/




  val scn = scenario("clientes").exec(
Escenario_0,Escenario_2,Escenario_3,Escenario_4,Escenario_5, Escenario_6)


setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}