package com.gatling.tests

//import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
//import io.gatling.jdbc.Predef._

class LoginRecordedSimulation extends Simulation {

	val httpProtocol: HttpProtocolBuilder = http
		.baseUrl("https://cuentas.memory.com.uy")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())

	val headers_0 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-419,es;q=0.9,en;q=0.8",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "https://cuentas.memory.com.uy",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-419,es;q=0.9,en;q=0.8",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-site",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_12 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "es-419,es;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "style",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36",
		"x-client-data" -> "CIi2yQEIorbJAQjBtskBCKmdygEIk6HLAQin+csBCOeEzAEIm4/MAQjQoswB")

	val headers_15 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-419,es;q=0.9,en;q=0.8",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_21 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-419,es;q=0.9,en;q=0.8",
		"Origin" -> "https://gestiontesting.memory.com.uy",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_22 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-419,es;q=0.9,en;q=0.8",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_23 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-419,es;q=0.9,en;q=0.8",
		"Origin" -> "https://gestiontesting.memory.com.uy",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_24 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-419,es;q=0.9,en;q=0.8",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "https://gestiontesting.memory.com.uy",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_26 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-419,es;q=0.9,en;q=0.8",
		"Content-Type" -> "application/json; charset=utf-8",
		"Origin" -> "https://gestiontesting.memory.com.uy",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_32 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-419,es;q=0.9,en;q=0.8",
		"Origin" -> "https://gestiontesting.memory.com.uy",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

    val uri1 = "https://find.userpilot.io/v1/lookups/39ij40s4"
    val uri2 = "https://memory-cors-proxy-server.herokuapp.com/http:/www.gales.com.uy/home"
    val uri3 = "https://gestiontesting.memory.com.uy"
    val uri5 = "https://fonts.googleapis.com/css"

	val scn: ScenarioBuilder = scenario("LoginRecordedSimulation")
		.exec(http("request_0")
			.post("/Account/SignIn")
			.headers(headers_0)
			.formParam("AceptoTerminosYCondiciones", "False")
			.formParam("ParametrosSinDatos", "False")
			.formParam("Partner", "1")
			.formParam("Aplicacion", "1")
			.formParam("BaseDeDatos", "999")
			.formParam("LoginConCedula", "False")
			.formParam("IsMobile", "False")
			.formParam("BaseUrl", "https://gestiontesting.memory.com.uy")
			.formParam("RedirectToUrl", "")
			.formParam("GuidLicencia", "AD0DA431-D13B-4F11-98E7-06112CE9B2C6")
			.formParam("Mode", "TESTING")
			.formParam("AlertasActivas", "False")
			.formParam("Email", "tester0001@memory.com.uy")
			.formParam("Password", "Test1ng147852369")
			.formParam("UsuarioId", "0"))
		.pause(1)
		.exec(http("request_1")
			.post("/Account/SingIn_Step2")
			.headers(headers_0)
			.formParam("AceptoTerminosYCondiciones", "true")
			.formParam("ParametrosSinDatos", "False")
			.formParam("Partner", "1")
			.formParam("Aplicacion", "1")
			.formParam("BaseDeDatos", "999")
			.formParam("LoginConCedula", "False")
			.formParam("IsMobile", "False")
			.formParam("BaseUrl", "https://gestiontesting.memory.com.uy")
			.formParam("RedirectToUrl", "")
			.formParam("GuidLicencia", "AD0DA431-D13B-4F11-98E7-06112CE9B2C6")
			.formParam("Mode", "TESTING")
			.formParam("AlertasActivas", "False")
			.formParam("Email", "tester0001@memory.com.uy")
			.formParam("Password", "Test1ng147852369")
			.formParam("EmpresaId", "3216")
			.formParam("SucursalId", "6499")
			.formParam("PuntoEmisionId", "3248")
			.formParam("UsuarioId", "3553")
			.resources(http("request_2")
			.get(uri3 + "/Account/LoginExt?data=A88wSl5fXHyO1wixGlAvb87cveTWkf/MN2sYyKWVUNiCmR6SUkPJJuJVNBptz2HUz94L26uOk+5FVaA7YQcv5+xXkq++9vqNvYuipwOOKWf3n/s6uPVNhWWReRErRhbZRH1LvvgE34kppPzYnSiM42by4KUCQdzM")
			.headers(headers_2),
            http("request_3")
			.get(uri5 + "?family=Ubuntu:300"),
            http("request_4")
			.get(uri5 + "?family=Open+Sans+Condensed:300"),
            http("request_5")
			.get(uri3 + "/bundles/jquery?v=DilzeZuJxdbQsfc_JOwsWB4VFDhTPM73urYeggaKdL81"),
            http("request_6")
			.get(uri3 + "/bundles/datatables/css?v=WQUiwA5xAtgwDrjQPMwtaGJabD1p4A3JoUVyuGw0U7w1"),
            http("request_7")
			.get(uri3 + "/bundles/modernizr?v=inCVuEFe6J4Q07A0AcRsbJic_UE5MwpRMNGcOtk94TE1"),
            http("request_8")
			.get(uri3 + "/Content/css?v=a8x3ti9fdz3p3_ngT1F3d1b13jJxetXPB8HX1xR7u241"),
            http("request_9")
			.get(uri3 + "/Content/components?v=kh_428AH6BSZdDjNnym7MeX_8asynpgGfH7Hi9bL5sc1"),
            http("request_10")
			.get(uri3 + "/ERP/Dashboard")
			.headers(headers_2),
            http("request_11")
			.get(uri3 + "/bundles/figaro/css?v=thht7H-DM5NRlejYLQWLAotN5jLlZtT09N0yGERuUlE1"),
            http("request_12")
			.get(uri5 + "?family=Muli:300")
			.headers(headers_12),
            http("request_13")
			.get(uri5 + "?family=Open+Sans+Condensed:300")
			.headers(headers_12),
            http("request_14")
			.get(uri5 + "?family=Ubuntu:300")
			.headers(headers_12),
            http("request_15")
			.get(uri3 + "/bundles/bootstrap?v=-g7cxTWQV6ve_iRyKtg7LoBytQltgj_w8zTNeaLaBc41?version=0411183354")
			.headers(headers_15),
            http("request_16")
			.get(uri1),
            http("request_17")
			.get(uri3 + "/bundles/admin?v=KMRcZCKP85eRucanzCbqTFbCl9CwW8E0SMQ5db9cdD81?version=0411183354")
			.headers(headers_15),
            http("request_18")
			.get(uri3 + "/bundles/datatables/js?v=-7PxarmepLXFnjpwblS8K7wZgVqP2Xp2qRQU_VkZ4Zo1?version=0411183354")
			.headers(headers_15),
            http("request_19")
			.get(uri3 + "/bundles/figaro/js?v=tFqiI0IIVkiBgKYdqG9vcb4labaizAi1uoNNXm41p_U1?version=0411183354")
			.headers(headers_15),
            http("request_20")
			.get(uri3 + "/bundles/plugins?v=lERr6jEI8VaqDsWZfLlg66X_YLYAoXrWTd6Si9RsSCw1?version=0411183354")
			.headers(headers_15),
            http("request_21")
			.post(uri3 + "/ERP/Ventas/GetDatosEmpresaLayout")
			.headers(headers_21),
            http("request_22")
			.get(uri3 + "/APP/Alerta/MostrarMensajesYAlertasServerSide")
			.headers(headers_22),
            http("request_23")
		//	.get(https://memory-cors-proxy-server.herokuapp.com/http://www.gales.com.uy/home/)
		//	.headers(headers_23),
            //http("request_24")
			.post(uri3 + "/ERP/Dashboard/GetDataForDashboardchartsVentas/")
			.headers(headers_24)
			.formParam("fecInicial", "11/04/2022")
			.formParam("fecFinal", "11/04/2022"),
            http("request_25")
			.post(uri3 + "/ERP/Dashboard/GetTopGastosForDashboard/")
			.headers(headers_24)
			.formParam("periodo", "6")
			.formParam("moneda", "1")
			.formParam("fechaInicial", "01/04/2022")
			.formParam("fechaFinal", "30/04/2022"),
            http("request_26")
			.post(uri3 + "/ERP/Usuario/RenderPopupCuestionarioSatisfaccion")
			.headers(headers_26),
            http("request_27")
			.post(uri3 + "/ERP/Dashboard/GetDataForDashboardPerdidasYGanancias/")
			.headers(headers_24)
			.formParam("FechaInicialPYG", "10/01/2021")
			.formParam("FechaFinalPYG", "11/04/2022")
			.formParam("MonedaIdPYG", "1")
			.formParam("PeriodoFechasPYG", "29"),
            http("request_28")
			.post(uri3 + "/ERP/Dashboard/GetDataForDashboardChartsTopClientes/")
			.headers(headers_24)
			.formParam("FechaInicialCliente", "01/04/2022")
			.formParam("FechaFinalCliente", "30/04/2022")
			.formParam("PeriodoFechasCliente", "6")
			.formParam("MoneIdClientes", "1")
			.formParam("Top", "5"),
            http("request_29")
			.post(uri3 + "/ERP/Dashboard/GetDataForDashboardCBT/")
			.headers(headers_24)
			.formParam("start", "2022/04/11 00:00:00.000"),
            http("request_30")
			.get(uri3 + "/Account/GetUsuariosForPopupSeguridad/")
			.headers(headers_22),
            http("request_31")
			.post(uri3 + "/ERP/Dashboard/GetTopProductosForDashboard/")
			.headers(headers_24)
			.formParam("OrdenarPor", "1")
			.formParam("FechaIncialProd", "01/04/2022")
			.formParam("FechaFinalProd", "30/04/2022")
			.formParam("MonedaIdProducto", "1")
			.formParam("PeriodoFechasProducto", "6"),
            http("request_32")
			.post(uri3 + "/ERP/Cliente/GetWidgetDataMesAnteriorDolares/")
			.headers(headers_32),
            http("request_33")
			.post(uri3 + "/ERP/Cliente/GetWidgetDataMesActualPesos/")
			.headers(headers_32),
            http("request_34")
			.post(uri3 + "/ERP/Cliente/GetWidgetDataMesActualDolares/")
			.headers(headers_32),
            http("request_35")
			.post(uri3 + "/ERP/Cliente/GetWidgetDataAnioActualDolares/")
			.headers(headers_32),
            http("request_36")
			.post(uri3 + "/ERP/Cliente/GetWidgetDataAnioActualPesos/")
			.headers(headers_32),
            http("request_37")
			.post(uri3 + "/ERP/Dashboard/GetDataForDashboardChartsInvoices/")
			.headers(headers_24)
			.formParam("ListaValores", "")
			.formParam("PeriodoFechasFacturas", "6")
			.formParam("MonedaIdFacturas", "1")
			.formParam("FechaInicialFacturas", "01/04/2022")
			.formParam("FechaFinalFacturas", "30/04/2022"),
            http("request_38")
			.post(uri3 + "/ERP/Cliente/GetWidgetDataMesAnteriorPesos/")
			.headers(headers_32)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}