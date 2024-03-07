set projectLocation=C:\Users\nimje\Desktop\Ritu-AutomationTraining\SeleniumLearningHRMS\TestNGAutomationFrameworkWithLog4jJenkins
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause