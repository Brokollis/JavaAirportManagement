public class Hangar {
    private String local;
    private int idAviao;
    Aviao aviao;

    public Hangar(String local, int idAviao) {
        this.local = local;
        this.idAviao = idAviao;
    }

    // local
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    // idAviao
    public int getIdAviao() {
        return idAviao;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    // Aviao
    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    @Override
    public String toString() {
        return "Hangar{" + "local=" + local + ", idAviao=" + idAviao + ", aviao=" + aviao + '}';
    }
}
