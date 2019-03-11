# webapp-without-frameworks-GET-method


Initial

1. Run Tomcat (pressing the button).

2. The Project is being built ( files compiled, dependencies loaded, Tomcat is started, web server is in standby mode.

3. Idea starts browser based on Run/Debug Configurations.
    (Run/Debug Configurations: open browser: browser name; After launch: default; URL: http://localhost:8080/)
    
4. GET request is sent to web server.

5. Code in MainServlet file is executed (because web.xml settings are set so.)


MainServlet code

1. PrintWriter prints text data (strings in this case) to a character stream (text-output stream). 
    (PrintWriter is buffered.)

2. .getWriter method is called for the response object.

3. .getWriter method returns a PrintWriter object (that can send character text to the client).   

4. The response obj gets the stream on which the output is written.




Notes:

PrintWriter prints formatted representations of objects to a text-output stream.

getWriter() returns a PrintWriter object

a PrintWriter object that can return character data to the client

https://docs.oracle.com/javaee/7/api/javax/servlet/ServletResponse.html

https://docs.oracle.com/javase/7/docs/api/java/io/PrintWriter.html

https://stackoverflow.com/questions/25780467/what-is-printwriter-out-response-getwriter-in-servlet
