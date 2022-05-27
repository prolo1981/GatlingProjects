var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "500",
        "ok": "0",
        "ko": "500"
    },
    "minResponseTime": {
        "total": "1490",
        "ok": "-",
        "ko": "1490"
    },
    "maxResponseTime": {
        "total": "48824",
        "ok": "-",
        "ko": "48824"
    },
    "meanResponseTime": {
        "total": "25753",
        "ok": "-",
        "ko": "25753"
    },
    "standardDeviation": {
        "total": "13542",
        "ok": "-",
        "ko": "13542"
    },
    "percentiles1": {
        "total": "25756",
        "ok": "-",
        "ko": "25756"
    },
    "percentiles2": {
        "total": "37445",
        "ok": "-",
        "ko": "37445"
    },
    "percentiles3": {
        "total": "46320",
        "ok": "-",
        "ko": "46320"
    },
    "percentiles4": {
        "total": "48079",
        "ok": "-",
        "ko": "48079"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 500,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "10",
        "ok": "-",
        "ko": "10"
    }
},
contents: {
"req_solicitar-produ-2728c": {
        type: "REQUEST",
        name: "Solicitar productos en pagina 1",
path: "Solicitar productos en pagina 1",
pathFormatted: "req_solicitar-produ-2728c",
stats: {
    "name": "Solicitar productos en pagina 1",
    "numberOfRequests": {
        "total": "500",
        "ok": "0",
        "ko": "500"
    },
    "minResponseTime": {
        "total": "1490",
        "ok": "-",
        "ko": "1490"
    },
    "maxResponseTime": {
        "total": "48824",
        "ok": "-",
        "ko": "48824"
    },
    "meanResponseTime": {
        "total": "25753",
        "ok": "-",
        "ko": "25753"
    },
    "standardDeviation": {
        "total": "13542",
        "ok": "-",
        "ko": "13542"
    },
    "percentiles1": {
        "total": "25756",
        "ok": "-",
        "ko": "25756"
    },
    "percentiles2": {
        "total": "37445",
        "ok": "-",
        "ko": "37445"
    },
    "percentiles3": {
        "total": "46320",
        "ok": "-",
        "ko": "46320"
    },
    "percentiles4": {
        "total": "48079",
        "ok": "-",
        "ko": "48079"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 500,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "10",
        "ok": "-",
        "ko": "10"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
