# JAXWSTomcatSpring
This application uses java api JAX-WS for creating web services and also publishes that web service locally using javax api also demo of webservice published on Tomcat

# Does Endpoint.publish use the tomcat server to host this or is it a mini glassfish kind of server?
- JAX-WS RI Endpoint.publish API uses by default a light-weight HTTP server implementation that is included in Sun's Java SE 6. So no, it does not use an embedded GlassFish nor an embedded Tomcat and even less your existing Tomcat install: it uses an embedded container i.e. something running inside the same JVM. Just FYI, it is however possible to plug other implementations as long as they provide a Service Provider Implementation (SPI). For example, Jetty 6 does so, see J2se6HttpServerSPI. But I'm not going to cover all the details here :)

# It doesn't seem to work with my installed tomcat server as is because it says the port is already in use.
- As I said above, the Enpoint.publish API doesn't use your existing Tomcat install. It uses its own server and allows you to deploy your web service without having to package and deploy your app. It is especially useful during development (as it speeds up things). Actually, it's extremely handy.

Now, if you have a Tomcat server running on port 8082 and if you try to publish your Endpoint using the same port, things won't work as you noticed. Use a different (and unused) port during development.

And if you want to deploy your web services to your existing Tomcat install, then you'll have to package them in a war and to deploy this war on Tomcat. But this is totally different and doesn't have anything to do with using the Endpoint.publish API.

# Importing web service in client program source directory
cd %project_home%/src
wsimport -s . http://localhost:8081/JAXWSServer/WS/HelloWorld?wsdl
-s source directory ( . means current dir)

# Generating web service to be deploy on tomcat
cd %project_home%
wsgen -verbose -keep -s src -d build/classes -cp build/classes ws.HelloWorldImpl -wsdl
-verbose display what compiler is doing
-keep keep generated files
-cp directory from where input classes to be taken
-d directory where output classes to be generated
-s source directory

Links Reffered: http://www.java2blog.com/2013/03/jaxws-web-service-eclipse-tutorial.html
