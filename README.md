# camelCxfRest
Java Project Example that exposes how implements Web Services REST using Apache Camel, Apache Cxf and Apache ActiveMQ

This is an example of ESB architecture for expose API REST/JSON

Prerequisite:
You must have installed maven and git in your pc
You must install ActiveMQ in your pc. In baseConfig.xml you can configure URL and Port of your broker JMS

Import project in Eclipse ad Maven Web archetype and start it under Tomcat 8

There are 4 services exposed in two EndPoints CXF, started by Camel Context. Each end point has a Camel Route
that drive the message

http://localhost:8080/CamelCxfGirexLike/cxf/services/api/servizio1/{aName}
http://localhost:8080/CamelCxfGirexLike/cxf/services/api/servizio2/{aNumber}

http://localhost:8080/CamelCxfGirexLike/cxf/services2/api2/servizio1/en/{aName}
http://localhost:8080/CamelCxfGirexLike/cxf/services2/api2/servizio1/it/{aName}

