$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/search.feature");
formatter.feature({
  "line": 2,
  "name": "Duck Duck Go Search",
  "description": "",
  "id": "duck-duck-go-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Webdriver"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "I want to search on duck-duck-go site",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the website duck-duck-go",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"\u003ckeyword\u003e\" to search",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I navigate to videos search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get minimum 2 search results",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;",
  "rows": [
    {
      "cells": [
        "keyword"
      ],
      "line": 11,
      "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;1"
    },
    {
      "cells": [
        "java"
      ],
      "line": 12,
      "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;2"
    },
    {
      "cells": [
        "webdriver"
      ],
      "line": 13,
      "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;3"
    },
    {
      "cells": [
        "docker"
      ],
      "line": 14,
      "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;4"
    },
    {
      "cells": [
        "kubernetes"
      ],
      "line": 15,
      "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5111506600,
  "status": "passed"
});
formatter.before({
  "duration": 243100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "I want to search on duck-duck-go site",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Webdriver"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the website duck-duck-go",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"java\" to search",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I navigate to videos search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get minimum 2 search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.launchSite()"
});
formatter.result({
  "duration": 1519726700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "java",
      "offset": 13
    }
  ],
  "location": "SearchSteps.enterKeyword(String)"
});
formatter.result({
  "duration": 2344267300,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 706191900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "SearchSteps.verifySearchResults(int)"
});
formatter.result({
  "duration": 209781100,
  "status": "passed"
});
formatter.after({
  "duration": 120047300,
  "status": "passed"
});
formatter.after({
  "duration": 241400,
  "status": "passed"
});
formatter.before({
  "duration": 4560490500,
  "status": "passed"
});
formatter.before({
  "duration": 282100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "I want to search on duck-duck-go site",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Webdriver"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the website duck-duck-go",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"webdriver\" to search",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I navigate to videos search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get minimum 2 search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.launchSite()"
});
formatter.result({
  "duration": 1095428700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "webdriver",
      "offset": 13
    }
  ],
  "location": "SearchSteps.enterKeyword(String)"
});
formatter.result({
  "duration": 2234683600,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 310064100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "SearchSteps.verifySearchResults(int)"
});
formatter.result({
  "duration": 450681800,
  "status": "passed"
});
formatter.after({
  "duration": 94750300,
  "status": "passed"
});
formatter.after({
  "duration": 106000,
  "status": "passed"
});
formatter.before({
  "duration": 5655204800,
  "status": "passed"
});
formatter.before({
  "duration": 147000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "I want to search on duck-duck-go site",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Webdriver"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the website duck-duck-go",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"docker\" to search",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I navigate to videos search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get minimum 2 search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.launchSite()"
});
formatter.result({
  "duration": 1070261600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "docker",
      "offset": 13
    }
  ],
  "location": "SearchSteps.enterKeyword(String)"
});
formatter.result({
  "duration": 2181882000,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 607640900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "SearchSteps.verifySearchResults(int)"
});
formatter.result({
  "duration": 366685300,
  "status": "passed"
});
formatter.after({
  "duration": 105838200,
  "status": "passed"
});
formatter.after({
  "duration": 147400,
  "status": "passed"
});
formatter.before({
  "duration": 5405432100,
  "status": "passed"
});
formatter.before({
  "duration": 120300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "I want to search on duck-duck-go site",
  "description": "",
  "id": "duck-duck-go-search;i-want-to-search-on-duck-duck-go-site;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Webdriver"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the website duck-duck-go",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"kubernetes\" to search",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I navigate to videos search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get minimum 2 search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.launchSite()"
});
formatter.result({
  "duration": 1231854200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kubernetes",
      "offset": 13
    }
  ],
  "location": "SearchSteps.enterKeyword(String)"
});
formatter.result({
  "duration": 3579559200,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.navigateTovideos()"
});
formatter.result({
  "duration": 319324300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "SearchSteps.verifySearchResults(int)"
});
formatter.result({
  "duration": 288535300,
  "status": "passed"
});
formatter.after({
  "duration": 139252700,
  "status": "passed"
});
formatter.after({
  "duration": 224400,
  "status": "passed"
});
});