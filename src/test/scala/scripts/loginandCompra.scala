package scripts

  import scala.concurrent.duration._

  import io.gatling.core.Predef._
  import io.gatling.http.Predef._
  import io.gatling.jdbc.Predef._

  class loginandCompra extends Simulation {

    val httpProtocol = http
      .baseUrl("https://ccstore-stage-ze8a.oracleoutsourcing.com")
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate")
      .acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0")

      .silentUri(".*connect")

    val headers_0 = Map(
      "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
      "Sec-Fetch-Mode" -> "navigate",
      "Upgrade-Insecure-Requests" -> "1")


    val headers_1 = Map("Accept" -> "text/css,*/*;q=0.1")

    val headers_2= Map(
      "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
      "Origin" -> "https://presso.compensar.com",
      "Upgrade-Insecure-Requests" -> "1")

    val headers_3= Map(
      "Accept" -> "application/json, text/javascript, */*; q=0.01",
      "Host" -> "ccstore-stage-ze8a.oracleoutsourcing.com",
      "Referer" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com/candado/product/HER-B-RED-DEP-TER-096",
      "Sec-Fetch-Mode:"->"cors",
      "Sec-Fetch-Site:"->"same-origin",
      "X-CCPriceListGroup:"->"tarifaCategoriaB",
      "X-CCProfileType:"->"storefrontUI",
      "siteUS"->"siteUS",
      "CCViewport"->"lg")


    val headers_4= Map(
      "Accept" -> "application/json, text/javascript, */*; q=0.01",
      "Content-Type" -> "application/json",
      "Host"->"ccstore-stage-ze8a.oracleoutsourcing.com",
      "Referer" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com/candado/product/HER-B-RED-DEP-TER-096",
      "Sec-Fetch-Mode:"->"cors",
      "Sec-Fetch-Site:"->"same-origin",
      "X-CCProfileType:"->"storefrontUI",
      "x-ccsite"->"siteUS",
      "CCViewport"->"xs",
      "X-Requested-With"->"XMLHttpRequest")


    val headers_5= Map(
      "Accept" -> "application/json, text/javascript, */*; q=0.01",
      "Content-Type" -> "application/json",
      "Host"->"ccstore-stage-ze8a.oracleoutsourcing.com",
      "Origin"->"https://ccstore-stage-ze8a.oracleoutsourcing.com",
      "Referer" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com/candado/product/HER-B-RED-DEP-TER-096",
      "Sec-Fetch-Mode:"->"cors",
      "Sec-Fetch-Site:"->"same-origin",
      "X-CCProfileType:"->"storefrontUI",
      "x-ccsite"->"siteUS",
      "CCViewport"->"xs",
      "X-Requested-With"->"XMLHttpRequest")

    val headers_6= Map(
      "Accept" -> "application/json, text/javascript, */*; q=0.01",
      "Content-Type" -> "application/json",
      "Host"->"ccstore-stage-ze8a.oracleoutsourcing.com",
      "Origin"->"https://ccstore-stage-ze8a.oracleoutsourcing.com",
      "Referer" -> "https://ccstore-stage-ze8a.oracleoutsourcing.com/candado/product/HER-B-RED-DEP-TER-096",
      "Sec-Fetch-Mode:"->"cors",
      "Sec-Fetch-Site:"->"same-origin",
      "X-CCProfileType:"->"storefrontUI",
      "x-ccsite"->"siteUS",
      "CCViewport"->"md",
      "X-Requested-With"->"XMLHttpRequest")


    val uri01 = "https://presso.compensar.com"


    val scn = scenario("AUTENTICACION DE USUARIO EN PORTAL E-COMMERCE")
      .exec(http("Home")
        .get("/")
        .resources(http("Home")
          .get("/file/thirdparty/fonts/font-awesome.min.css")
          .headers(headers_1),
          /*CHEKEAR SESION*/
          http("Home")
            .get(uri01 + "/connect/checksession")
            .headers(headers_0)))

      .exec(http("Pagina Login")
        .get(uri01 + "/connect/authorize?client_id=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&redirect_uri=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&response_type=id_token%20token&scope=openid%20profile%20email&nonce=15801541163800.6495629771571915&state=15801541163800.876948323061112")
        .headers(headers_0)
       // .check(status is 200)
        .check(css("#formLogin", "action").saveAs("TOKEN"))
        .check(css("[name=\"__RequestVerificationToken\"]", "value").saveAs("VERIFICAR")))


      .exec(http("Ingreso de Datos")
        .post(uri01 + """${TOKEN}""")
        .headers(headers_2)
        .formParam("__RequestVerificationToken", """${VERIFICAR}""")
        .formParam("DocumentType", "1")
        .formParam("DocumentID", "13718984")
        .formParam("Password", "Ab123456")
        .formParam("GoogleCaptchaToken", "")
      //  .check(status is 200)
        .check(bodyString.saveAs("Response")))

      .exec(http("Lo mas vendido>Canndado")
        .post("https://ccstore-stage-ze8a.oracleoutsourcing.com/candado/product/HER-B-RED-DEP-TER-096")
        .headers(headers_3)
        .formParam("occsite","siteUS")
        .check(status is 200)
        .check(bodyString.saveAs("Response")))

      .exec(http("Seleccionar Sede")
        .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/itemTypes/sku-PySMaterial-Articulos?includeBase=true&parent=sku")
        .headers(headers_4)
        .check(status is 200)
        .check(bodyString.saveAs("Response")))

/*
      .exec(http("Agregar Carrito Commpras")
        .post("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/orders/current?includeShippingGroups=true")
        .headers(headers_5)
        .body(StringBody("""{
            shoppingCart: {items: [{productId: "HER-B-RED-DEP-TER-096", quantity: 1, repositoryId: "",…}], coupons: []}
            items: [{productId: "HER-B-RED-DEP-TER-096", quantity: 1, repositoryId: "",…}]
            0: {productId: "HER-B-RED-DEP-TER-096", quantity: 1, repositoryId: "",…}
            productId: "HER-B-RED-DEP-TER-096"
            quantity: 1
            repositoryId: ""
            availabilityDate: "2019-12-31T00:00:00.000Z"
            catRefId: "HER-5-162"
            expanded: false
            stockStatus: true
            stockState: "IN_STOCK"
            commerceItemQuantity: 1
            selectedOptions: [{optionName: "Sede", optionValue: "Avenida 68", optionId: "x_headquarter", optionValueId: 19}]
            0: {optionName: "Sede", optionValue: "Avenida 68", optionId: "x_headquarter", optionValueId: 19}
            optionName: "Sede"
            optionValue: "Avenida 68"
            optionId: "x_headquarter"
            optionValueId: 19
            detailedItemPriceInfo: []
            detailedRecurringChargeInfo: []
            externalData: []
            addOnItem: false
            _date: null
            _endTimeItem: null
          _startTimeItem: null
          _discount: null
          _weekDays: null
          _headquarters: null
          _subStage: null
          _price: null
         _numberDocument: 13718984
          _stage: null
         _level: null
        _nameServicesPyS: null
        _identificationType: null
        _nameClient: null
        _schedule: null
        _requirements: null
        displayName: "Candado"
        invalid: false
        commerceItemId: "ci1581523760687655841"
        priceListGroupId: "tarifaCategoriaA"
        coupons: []
        combineLineItems: "no"
        payments: []
        _tax: 0
        _name: "nombre requerido"
        _paymentMethod: "Banco"
        _documentType: "CC"
        _orderExpirationDate: null
        _orderState: null
      _documentNumber2: null
      _discount: 0
      _proveOfPayment: null
      _stateDescription: null
      _acceptanceRequirements: "campo requerido"
      _subtotal: 0
      _total: 0
      _phone: 0
      _numberQuotation2: null
      _paymentDateTime: null
      _channel: "Virtual",
  shippingGroups: [{items: [{productId: "HER-B-RED-DEP-TER-096", catRefId: "HER-5-162", quantity: 1,…}],…}]
    0: {items: [{productId: "HER-B-RED-DEP-TER-096", catRefId: "HER-5-162", quantity: 1,…}],…}
    items: [{productId: "HER-B-RED-DEP-TER-096", catRefId: "HER-5-162", quantity: 1,…}]
    0: {productId: "HER-B-RED-DEP-TER-096", catRefId: "HER-5-162", quantity: 1,…}
    productId: "HER-B-RED-DEP-TER-096"
    catRefId: "HER-5-162"
    quantity: 1
    commerceItemId: "ci1581523760687655841"
    type: "hardgoodShippingGroup"
    shippingGroupId: "0"}"""))
        .check(status is 200)
        .check(bodyString.saveAs("Response")))


      .exec(http("Ver Carrito")
        .get("https://ccstore-stage-ze8a.oracleoutsourcing.com/ccstoreui/v1/pages/layout/cart?ccvp=md")
        .headers(headers_6)
        .check(status is 200)
        .check(bodyString.saveAs("Response")))
*/
    setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
  }
