public class Televisore {
    private int canaleSintonizzato;
    private boolean acceso;
    private int volumeAttuale;
    private int canali;

    public Televisore(){
        canali=999;
        acceso=false;
        volumeAttuale=0;
    }

    public int getVolume(){
        return volumeAttuale;
    }

    public int getCanale(){
        return canaleSintonizzato;
    }

    public boolean setVolume(int volume){
        if(volume<0 || volume >100 || !acceso){     // vuol dire che acceso==false
            return false;
        }
        volumeAttuale=volume;
        return true;
    }

    public boolean canaleSuccessivo(){
        if(!acceso){
            return false;
        }
        if(canaleSintonizzato==999){
            canaleSintonizzato=1;
        }else{
            canaleSintonizzato++;
        }
        return true;
    }

    public boolean canalePrecedente(){
        if(!acceso){
            return false;
        }
        if (canaleSintonizzato==1){
            canaleSintonizzato=999;
        }else{
            canaleSintonizzato--;
        }
        return true;
    }

    public boolean selezionaCanale(int canale){
        if(!acceso || canale<1 || canale>999){
            return false;
        }else{
            canaleSintonizzato=canale;
            return true;
        }
    }

    @Override
    public String toString(){
        String stato;
        if(acceso){
            stato = "acceso";
        }else{
            stato="spento";
        }
        return "Il televisore e " + acceso + ", sul canale " + canaleSintonizzato + ", con volume a " + volumeAttuale;
    }
}
