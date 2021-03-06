package vertx;

import commons.Controller;
import commons.MyGraph;
import commons.View;

public class Main {

    public static void main(String[] args) {
        MyGraph graph = new MyGraph();
        Controller c = new AsyncController(graph);
        View v = new View(c, graph);
        v.start();
    }
}
