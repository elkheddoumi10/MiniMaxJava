import java.util.ArrayList;
import java.util.Collections;

public class MiniMaxMain {
    public static int minimax(Arbre abr){
         if(abr.racine.fils!=null){
            if(!abr.racine.isMax ){
                abr.racine.fils.forEach(f->{
                    f.setMax(!abr.racine.isMax);
                    if (!f.isTerminal())
                         f.setValeur(minimax(new Arbre(f)));
                });
                Node min= Collections.min(abr.racine.fils);
                abr.racine.setValeur(min.valeur);
            }
            else{
                abr.racine.fils.forEach(f->{
                f.setMax(!abr.racine.isMax);
                if (!f.isTerminal())
                      f.setValeur(minimax(new Arbre(f)));
            });
                Node max= Collections.max(abr.racine.fils);
                abr.racine.setValeur(max.valeur);
            }
        }
        else{
             if(!abr.racine.isMax ){
             Node min= Collections.min(abr.racine.fils);
             abr.racine.setValeur(min.valeur);}
             else{
                 Node max= Collections.max(abr.racine.fils);
                 abr.racine.setValeur(max.valeur);
             }
        }
        return abr.racine.valeur;
    }
    public void generateArbre(Node racine, int prof){

    }
    public static void main(String[] args){

        ArrayList<Node> fils=new ArrayList<>(2);
        ArrayList<Node> fils1=new ArrayList<>(2);
        ArrayList<Node> fils2=new ArrayList<>(2);
        ArrayList<Node> fils3=new ArrayList<>(2);
        ArrayList<Node> fils4=new ArrayList<>(2);
        ArrayList<Node> fils5=new ArrayList<>(2);
        ArrayList<Node> fils6=new ArrayList<>(2);
        Node racine=new Node(0,true,fils);
        int[] payOf={3, 5, 2, 9, 12, 5};
        fils5.add(new Node(3));
        fils5.add(new Node(5));
        fils6.add(new Node(2));
        fils6.add(new Node(9));
        fils3.add(new Node(0));
        fils3.add(new Node(5));
        fils4.add(new Node(7));
        fils4.add(new Node(23));
        fils.add(new Node());
        fils.add(new Node());
        fils1.add(new Node());
        fils1.add(new Node());
        fils2.add(new Node());
        fils2.add(new Node());
        fils.get(0).setFils(fils1);
        fils.get(1).setFils(fils2);
        fils2.get(0).setFils(fils3);
        fils2.get(1).setFils(fils4);
        fils1.get(0).setFils(fils5);
        fils1.get(1).setFils(fils6);
        Arbre abr=new Arbre(racine);
       System.out.println("La valeur optimale est: "+minimax(abr));

    }
}
