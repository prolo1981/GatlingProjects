var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "35",
        "ok": "35",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "4798",
        "ok": "4798",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "19247",
        "ok": "19247",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "12716",
        "ok": "12716",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "3860",
        "ok": "3860",
        "ko": "-"
    },
    "percentiles1": {
        "total": "13442",
        "ok": "13442",
        "ko": "-"
    },
    "percentiles2": {
        "total": "15352",
        "ok": "15352",
        "ko": "-"
    },
    "percentiles3": {
        "total": "18153",
        "ok": "18153",
        "ko": "-"
    },
    "percentiles4": {
        "total": "18883",
        "ok": "18883",
        "ko": "-"
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
    "count": 35,
    "percentage": 100
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.4",
        "ok": "1.4",
        "ko": "-"
    }
},
contents: {
"req_ventas-adcc3": {
        type: "REQUEST",
        name: "Ventas",
path: "Ventas",
pathFormatted: "req_ventas-adcc3",
stats: {
    "name": "Ventas",
    "numberOfRequests": {
        "total": "35",
        "ok": "35",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "4798",
        "ok": "4798",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "19247",
        "ok": "19247",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "12716",
        "ok": "12716",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "3860",
        "ok": "3860",
        "ko": "-"
    },
    "percentiles1": {
        "total": "13442",
        "ok": "13442",
        "ko": "-"
    },
    "percentiles2": {
        "total": "15352",
        "ok": "15352",
        "ko": "-"
    },
    "percentiles3": {
        "total": "18153",
        "ok": "18153",
        "ko": "-"
    },
    "percentiles4": {
        "total": "18883",
        "ok": "18883",
        "ko": "-"
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
    "count": 35,
    "percentage": 100
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.4",
        "ok": "1.4",
        "ko": "-"
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
