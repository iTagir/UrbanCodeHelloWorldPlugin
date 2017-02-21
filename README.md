# UrbanCodeHelloWorldPlugin
Hello World plugin for UrbanCode deploy

This is a simple plugin in java for UrbanCode deploy.

To build:

1. mvn clean compile assembly:single
2. copy target/UCDHelloWorldPlugin-0.0.1-SNAPSHOT-jar-with-dependencies.jar plugin
3. rename the jar in plugin directory to UCDHelloWorldPlugin.jar
4. zip three files: plugin.xml info.xml and the UCDHelloWorldPlugin.jar
5. Install it to Urbancode deploy server.
