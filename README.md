# UrbanCodeHelloWorldPlugin
Hello World plugin for UrbanCode deploy

This is a simple plugin in java for UrbanCode deploy.

To build:
mvn clean compile assembly:single
copy target/UCDHelloWorldPlugin-0.0.1-SNAPSHOT-jar-with-dependencies.jar plugin
rename the jar in plugin directory to UCDHelloWorldPlugin.jar
zip three files: plugin.xml info.xml and the UCDHelloWorldPlugin.jar
Install it to Urbancode deploy server.
