var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "2",
        "ok": "1",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "633",
        "ok": "633",
        "ko": "983"
    },
    "maxResponseTime": {
        "total": "983",
        "ok": "633",
        "ko": "983"
    },
    "meanResponseTime": {
        "total": "808",
        "ok": "633",
        "ko": "983"
    },
    "standardDeviation": {
        "total": "175",
        "ok": "0",
        "ko": "0"
    },
    "percentiles1": {
        "total": "808",
        "ok": "633",
        "ko": "983"
    },
    "percentiles2": {
        "total": "896",
        "ok": "633",
        "ko": "983"
    },
    "percentiles3": {
        "total": "965",
        "ok": "633",
        "ko": "983"
    },
    "percentiles4": {
        "total": "980",
        "ok": "633",
        "ko": "983"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 1,
        "percentage": 50
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
        "count": 1,
        "percentage": 50
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "0.167",
        "ok": "0.083",
        "ko": "0.083"
    }
},
contents: {
"req_home-8cf04": {
        type: "REQUEST",
        name: "Home",
path: "Home",
pathFormatted: "req_home-8cf04",
stats: {
    "name": "Home",
    "numberOfRequests": {
        "total": "1",
        "ok": "1",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "633",
        "ok": "633",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "633",
        "ok": "633",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "633",
        "ok": "633",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "percentiles1": {
        "total": "633",
        "ok": "633",
        "ko": "-"
    },
    "percentiles2": {
        "total": "633",
        "ok": "633",
        "ko": "-"
    },
    "percentiles3": {
        "total": "633",
        "ok": "633",
        "ko": "-"
    },
    "percentiles4": {
        "total": "633",
        "ok": "633",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 1,
        "percentage": 100
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
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "0.083",
        "ok": "0.083",
        "ko": "-"
    }
}
    },"req_compras-74dd5": {
        type: "REQUEST",
        name: "Compras",
path: "Compras",
pathFormatted: "req_compras-74dd5",
stats: {
    "name": "Compras",
    "numberOfRequests": {
        "total": "1",
        "ok": "0",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "983",
        "ok": "-",
        "ko": "983"
    },
    "maxResponseTime": {
        "total": "983",
        "ok": "-",
        "ko": "983"
    },
    "meanResponseTime": {
        "total": "983",
        "ok": "-",
        "ko": "983"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "-",
        "ko": "0"
    },
    "percentiles1": {
        "total": "983",
        "ok": "-",
        "ko": "983"
    },
    "percentiles2": {
        "total": "983",
        "ok": "-",
        "ko": "983"
    },
    "percentiles3": {
        "total": "983",
        "ok": "-",
        "ko": "983"
    },
    "percentiles4": {
        "total": "983",
        "ok": "-",
        "ko": "983"
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
        "count": 1,
        "percentage": 100
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "0.083",
        "ok": "-",
        "ko": "0.083"
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
