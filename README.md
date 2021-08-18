# jarjar

This project is based on [openjdk/jdk8](https://github.com/openjdk/jdk8).

# Purpose of jarjar

jarjar is designed to support jar in jar (nested jar).

```java
URL url = new URL("jar:jarjar:file:/C:/mylibs/Outer.jar^/Inner.jar!/test.xml");
```
# Changes

- support jar in jar (nested jar)
  - Add JarJarUrlConnection.java
  - JarJarUrlConnection.java is based on http://pavel.savara.sweb.cz/files/JarJarURLConnection.java
- multiple call for URL.setURLStreamHandlerFactory()
  - Seperate Handler.java from JarJarUrlConnection.java
  
# License
Please check license comments at the top of each file.
