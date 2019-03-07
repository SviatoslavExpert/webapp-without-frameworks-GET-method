# webapp-without-frameworks-GET-method


Initial

1. Run Tomcat (pressing the button).

2. The Project is being built ( files compiled, dependencies loaded, Tomcat is started, web server is in standby mode.

3. Idea starts browser based on Run/Debug Configurations.
    (Run/Debug Configurations: open browser: browser name; After launch: default; URL: http://localhost:8080/)
    
4. GET request is sent to web server.

5. Code in MainServlet file is executed (because web.xml settings are set so.)


MainServlet code

1. Variable PrintWriter writer gets the link to PrintWriter object.

2. PrintWriter object is returned by getWriter() method and is in stored in variable resp.  
   (getWriter() works like a getter; getWriter() returns a PrintWriter object)
   
3. 



Notes:

getWriter() returns a PrintWriter object

a PrintWriter object that can return character data to the client

https://docs.oracle.com/javaee/7/api/javax/servlet/ServletResponse.html
