public class Dado {
    private int nFacce;

    public Dado(){
        this.nFacce=6;
    }
    public Dado(int N){
        if(N<2 || N==3){
            this.nFacce=6;
        }else{
            this.nFacce=N;
        }
    }
    public Dado(Dado d){
        this.nFacce=d.nFacce;
    }
    public int lancia(){
        return (int)(Math.random() * this.nFacce) +1;
    }
    @Override
    public String toString(){
        return "Dado a " + this.nFacce + " facce.";
    }
}
