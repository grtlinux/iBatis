Spring-Maven-MyBatis-Hello
==========================

```
[ Project Facet Error ]

    1. .settings/org.eclipse.wst.common.project.facet.core.xml
        .....
        <installed facet="jst.web" version="2.5"/>
        .....
        <installed facet="java" version="1.8"/>
        .....

    2. webapp/WEB-INF/web.xml
        xsi:schemaLocation="
            .....
            http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd
            .....

        ---> Maven Update
        
    3. Project > Properties : Project Facets
        Dynamic Web Module: 2.5
        Java              : 1.8

    4. Project > Properties : Java Build Path   (auto after #3)
        JRE System Library [JavaSE-1.8]

    5. Project > Properties : Java Compiler    (auto after #3)
        Compiler compliance level: 1.8

```


References
----------
- []( ""):
- []( ""):
- []( ""):
- []( ""):
- []( ""):
- []( ""):
- []( ""):
- []( ""):

.....

