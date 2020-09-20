${at}echo off

setlocal enableextensions enabledelayedexpansion

set "DIRNAME=%~dp0"
if [%DIRNAME:~-1%] == [\] set "DIRNAME=%DIRNAME:~0,-1%"

set "DATADIR=%DIRNAME%"

if defined JAVA goto :java_found

for %%I in (java.exe) do set "JAVA=%%~$PATH:I"
if defined JAVA goto :java_found

if defined JAVA_HOME goto :java_home_found

echo Unable to start a JVM : %%JAVA%% is not set and java.exe is not in PATH and %%JAVA_HOME%% is not set
exit /B 1

:java_home_found
set "JAVA=%JAVA_HOME%\bin\java.exe"

:java_found

if not defined JAVA_OPTS set JAVA_OPTS=-Djava.net.useSystemProxies=true

set VESTIGE_CORE_RELATIVE_DIRECTORY=%DATADIR%

"%JAVA%" --add-modules java.base -version 2> nul > nul
if %ERRORLEVEL% equ 0 (
  set "VESTIGE_CORE_MODULEPATH_FILE=%DATADIR%\windows-classpath.txt"
  set DEMO2_OPTS=!DEMO2_OPTS! --add-modules ALL-DEFAULT
  set DEMO2_ARGS=-p "%DATADIR%\lib\vestige.core-${vestige.core.version}.jar" -m fr.gaellalire.vestige.core --add-modules fr.gaellalire.vestige.edition.maven_main_launcher emp fr.gaellalire.vestige_app.demo2.mod1/fr.gaellalire.vestige_app.demo2.mod1.Mod1
) else (
  set "VESTIGE_CORE_CLASSPATH_FILE=%DATADIR%\windows-classpath.txt"
  set DEMO2_ARGS=-jar "%DATADIR%\lib\vestige.core-${vestige.core.version}.jar" --before javax/xml/bind/.* ecp fr.gaellalire.vestige_app.demo2.mod1.Mod1
)

"%JAVA%" %DEMO2_OPTS% %DEMO2_ARGS% || exit /B 2

endlocal
