package webserver;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

public class WebServer {
    private final Server server;

    public WebServer() {
        this.server = new Server();

        ServerConnector serverConnector = new ServerConnector(server);
        serverConnector.setPort(8080);

        server.addConnector(serverConnector);
    }

    private void start() throws Exception {
        server.start();
    }

    public static void main(String[] args) throws Exception {
        WebServer webServer = new WebServer();

        webServer.start();
    }
}
