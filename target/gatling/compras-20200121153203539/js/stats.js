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
        "total": "975",
        "ok": "6708",
        "ko": "975"
    },
    "maxResponseTime": {
        "total": "6708",
        "ok": "6708",
        "ko": "975"
    },
    "meanResponseTime": {
        "total": "3842",
        "ok": "6708",
        "ko": "975"
    },
    "standardDeviation": {
        "total": "2867",
        "ok": "0",
        "ko": "0"
    },
    "percentiles1": {
        "total": "3842",
        "ok": "6708",
        "ko": "975"
    },
    "percentiles2": {
        "total": "5275",
        "ok": "6708",
        "ko": "975"
    },
    "percentiles3": {
        "total": "6421",
        "ok": "6708",
        "ko": "975"
    },
    "percentiles4": {
        "total": "6651",
        "ok": "6708",
        "ko": "975"
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
        "count": 1,
        "percentage": 50
    },
    "group4": {
        "name": "failed",
        "count": 1,
        "percentage": 50
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "0.111",
        "ok": "0.056",
        "ko": "0.056"
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
        "total": "6708",
        "ok": "6708",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "6708",
        "ok": "6708",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "6708",
        "ok": "6708",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "percentiles1": {
        "total": "6708",
        "ok": "6708",
        "ko": "-"
    },
    "percentiles2": {
        "total": "6708",
        "ok": "6708",
        "ko": "-"
    },
    "percentiles3": {
        "total": "6708",
        "ok": "6708",
        "ko": "-"
    },
    "percentiles4": {
        "total": "6708",
        "ok": "6708",
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
        "count": 1,
        "percentage": 100
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "0.056",
        "ok": "0.056",
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
        "total": "975",
        "ok": "-",
        "ko": "975"
    },
    "maxResponseTime": {
        "total": "975",
        "ok": "-",
        "ko": "975"
    },
    "meanResponseTime": {
        "total": "975",
        "ok": "-",
        "ko": "975"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "-",
        "ko": "0"
    },
    "percentiles1": {
        "total": "975",
        "ok": "-",
        "ko": "975"
    },
    "percentiles2": {
        "total": "975",
        "ok": "-",
        "ko": "975"
    },
    "percentiles3": {
        "total": "975",
        "ok": "-",
        "ko": "975"
    },
    "percentiles4": {
        "total": "975",
        "ok": "-",
        "ko": "975"
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
        "total": "0.056",
        "ok": "-",
        "ko": "0.056"
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
