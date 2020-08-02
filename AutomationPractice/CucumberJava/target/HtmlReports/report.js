$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AutomationPractice.feature");
formatter.feature({
  "name": "Automation Practice web page functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AutomationPracticeFeature"
    }
  ]
});
formatter.scenario({
  "name": "Adding and Ordering product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AutomationPracticeFeature"
    },
    {
      "name": "@AutomationPracticeTest"
    }
  ]
});
formatter.step({
  "name": "Open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.AutomationPracticeSteps.open_Chrome_Browser()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d84.0.4147.105)\nBuild info: version: \u00274.0.0-alpha-5\u0027, revision: \u0027b3a0d621cc\u0027\nSystem info: host: \u0027ARC415NB\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.105, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\syilmaz\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:53405}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 122870496508a71d29ff18292290ae9b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:639)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:643)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:906)\r\n\tat StepDefinitions.AutomationPracticeSteps.open_Chrome_Browser(AutomationPracticeSteps.java:38)\r\n\tat ✽.Open Chrome Browser(file:///C:/Users/syilmaz/eclipse-workspace/CucumberJava/src/test/resources/Features/AutomationPractice.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Open Automation Practice page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.AutomationPracticeSteps.open_Automation_Practice_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Sign Up",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.AutomationPracticeSteps.sign_Up()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Add products to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.AutomationPracticeSteps.add_products_to_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Proceed to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.AutomationPracticeSteps.proceed_to_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Order history and details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.AutomationPracticeSteps.order_history_and_details()"
});
formatter.result({
  "status": "skipped"
});
});