package Main.Java.MVC;

public class Controller {
    Model model;
    View view;

    public void draw(String label){
        view.drawNodes(label);
    }

    public void updateColor(String label, int i){
        view.updateColor(label, i);
    }

    public void drawEdge(String label1, String label2, int cost) {
        view.drawEdge(label1, label2, cost);
    }

    public void doBFS(String label) {
        System.out.println("Calling BFS");
        model.breadthFirstTraversal(label);
    }

    public void doDFS(String label) {
         model.depthFirstTraversal(label);

    }

    public void showButtons() {
        view.setButtons(false);
    }

    public void getGraph() {
        model.getGraph();
    }
}
