public class No {
    private char vInfo[];
    private Boolean vFim[];
    private No vLig[];


    public char getvInfo(int pos) {
        return vInfo[pos];
    }

    public void setvInfo(int pos, char info) {
        this.vInfo[pos] = info;
    }

    public boolean getVFim(int pos){
        return this.getVFim(pos);
    }

    public void setVFim(boolean resp, int pos){
        this.vFim[pos] = resp;
    }

    public boolean getvFim(int pos){
        return this.vFim[pos];
    }
}
