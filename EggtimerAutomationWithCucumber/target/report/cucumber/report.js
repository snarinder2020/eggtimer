$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Eggtimer.feature");
formatter.feature({
  "name": "test eggtimer functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open the browser and load the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "EggtimerStepDefinition.user_open_the_browser_and_load_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "home page should be appear",
  "keyword": "Then "
});
formatter.match({
  "location": "EggtimerStepDefinition.home_page_should_be_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "test login functionality with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "enter time text \"25seconds\"",
  "keyword": "When "
});
formatter.match({
  "location": "EggtimerStepDefinition.enter_time_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on go button",
  "keyword": "When "
});
formatter.match({
  "location": "EggtimerStepDefinition.click_on_go_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "timer should start and shows remaining time",
  "keyword": "Then "
});
formatter.match({
  "location": "EggtimerStepDefinition.timer_should_start_and_shows_remaining_time()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});