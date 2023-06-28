# Headless chrome browser running using Selenium and Java
### How to achieve headless running in chrome browser using Selenium and Java?
1. Create the object of ChromOptions class
```bash
ChromeOptions options = new ChromeOptions();
```
2. Use addArguments() method of ChromeOptions run the tests on the headless mode by passing headless or –headless as an argument
```bash
options.addArguments("headless");
or
options.addArguments("--headless");
or
options.setHeadless(true);
```
3. After this, pass the options as an argument when instantiating the ChromeDriver object.
```bash
WebDriver driver = new ChromeDriver(options);
```
