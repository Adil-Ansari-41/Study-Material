# This script sets the Java environment to JDK 23 for the current terminal session.

Write-Host "Setting JAVA_HOME to JDK 23..."
$env:JAVA_HOME = "C:\Program Files\Java\jdk-23"

Write-Host "Updating PATH to prioritize JDK 23..."
$env:PATH = "$($env:JAVA_HOME)\bin;" + $env:PATH

Write-Host -ForegroundColor Green "Environment is ready for Java 23."
Write-Host "Current Java version:"
java -version


#Run using .\setup-java23.ps1