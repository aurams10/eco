var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "2",
        "ok": "2",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "857",
        "ok": "857",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "24177",
        "ok": "24177",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "12517",
        "ok": "12517",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "11660",
        "ok": "11660",
        "ko": "-"
    },
    "percentiles1": {
        "total": "12517",
        "ok": "12517",
        "ko": "-"
    },
    "percentiles2": {
        "total": "18347",
        "ok": "18347",
        "ko": "-"
    },
    "percentiles3": {
        "total": "23011",
        "ok": "23011",
        "ko": "-"
    },
    "percentiles4": {
        "total": "23944",
        "ok": "23944",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 0,
        "percentage": 0
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 1,
        "percentage": 50
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 1,
        "percentage": 50
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
        "total": "24177",
        "ok": "24177",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "24177",
        "ok": "24177",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "24177",
        "ok": "24177",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "percentiles1": {
        "total": "24177",
        "ok": "24177",
        "ko": "-"
    },
    "percentiles2": {
        "total": "24177",
        "ok": "24177",
        "ko": "-"
    },
    "percentiles3": {
        "total": "24177",
        "ok": "24177",
        "ko": "-"
    },
    "percentiles4": {
        "total": "24177",
        "ok": "24177",
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
        "total": "0.028",
        "ok": "0.028",
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
        "ok": "1",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "857",
        "ok": "857",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "857",
        "ok": "857",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "857",
        "ok": "857",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "percentiles1": {
        "total": "857",
        "ok": "857",
        "ko": "-"
    },
    "percentiles2": {
        "total": "857",
        "ok": "857",
        "ko": "-"
    },
    "percentiles3": {
        "total": "857",
        "ok": "857",
        "ko": "-"
    },
    "percentiles4": {
        "total": "857",
        "ok": "857",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 0,
        "percentage": 0
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 1,
        "percentage": 100
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
        "total": "0.028",
        "ok": "0.028",
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
