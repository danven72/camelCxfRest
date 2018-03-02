# camelCxfRest
Java Project Example that expose how implements Web Services REST using Camel, Cxf and ActiveMQ

This is an example of ESB architecture for expose API REST/JSON

Prerequisite:
You must have installed maven and git in your pc
You must install ActiveMQ in your pc. In baseConfig.xml you can configure URL and Port of your broker JMX

Import project in Eclipse ad Maven Web archetype and start it under Tomcat 8

There 4 services exposed in two EndPoints CXF started by Camel Context. Each end point ha a Camel Route
that drive the message

http://localhost:8080/CamelCxfGirexLike/cxf/services/api/servizio1/{aName}
http://localhost:8080/CamelCxfGirexLike/cxf/services/api/servizio2/{aNumber}

http://localhost:8080/CamelCxfGirexLike/cxf/services2/api2/servizio1/en/{aName}
http://localhost:8080/CamelCxfGirexLike/cxf/services2/api2/servizio1/it/{aName}

