import java.util.ArrayList;

public class Node implements Comparable<Node>{
    int valeur;
    boolean isMax;
    ArrayList<Node> fils;

    public Node(int valeur, boolean isMax, ArrayList<Node> fils) {
        this.valeur = valeur;
        this.isMax = isMax;
        this.fils = fils;
    }

    public Node(int valeur) {
        this.valeur = valeur;
    }

    public Node(){
        this.valeur=0;
        this.isMax=false;
        this.fils=new ArrayList<>();
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setMax(boolean max) {
        isMax = max;
    }

    public void setFils(ArrayList<Node> fils) {
        this.fils = fils;
    }

    public boolean isMax() {
        return isMax;
    }

    public ArrayList<Node> getFils() {
        return fils;
    }

    @Override
    public int compareTo(Node o) {
        if (this.valeur<o.valeur) return -1;
        else if(this.valeur>o.valeur) return 1;
        return 0;
    }
    public boolean isTerminal(){
        if (this.fils==null)
            return true;
        return false;
    }
}



