@echo off
set BROWSER=%1
if "%BROWSER%"=="" set BROWSER=chrome
mvn clean test -Dbrowser=%BROWSER%
pause