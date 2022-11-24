public class Voo {
    private String numero;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private int idPista;
    Pista pista;
    private int idAviao;
    Aviao aviao;
    private int idJato;
    Jato jato;
    private int idHelicoptero;
    Helicoptero helicoptero;

    public Voo(
        String numero, 
        String data, 
        String hora, 
        String origem, 
        String destino, 
        String piloto, 
        String copiloto, 
        String observacao, 
        int idPista, 
        int idAviao, 
        int idJato, 
        int idHelicoptero
    ){
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.idPista = idPista;
        this.idAviao = idAviao;
        this.idJato = idJato;
        this.idHelicoptero = idHelicoptero;
    }

    // numero
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // data
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    // hora
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    // origem
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    // destino
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    // piloto
    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    // copiloto
    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    // observacao
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    // idPista
    public int getIdPista() {
        return idPista;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }

    // Pista
    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
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

    // idJato
    public int getIdJato() {
        return idJato;
    }

    public void setIdJato(int idJato) {
        this.idJato = idJato;
    }

    // Jato
    public Jato getJato() {
        return jato;
    }

    public void setJato(Jato jato) {
        this.jato = jato;
    }

    // idHelicoptero
    public int getIdHelicoptero() {
        return idHelicoptero;
    }

    public void setIdHelicoptero(int idHelicoptero) {
        this.idHelicoptero = idHelicoptero;
    }

    // Helicoptero
    public Helicoptero getHelicoptero() {
        return helicoptero;
    }

    public void setHelicoptero(Helicoptero helicoptero) {
        this.helicoptero = helicoptero;
    }

    @Override
    public String toString() {
        return "Voo{" + "numero=" + numero + ", data=" + data + ", hora=" + hora + ", origem=" + origem + ", destino=" + destino + ", piloto=" + piloto + ", copiloto=" + copiloto + ", observacao=" + observacao + ", idPista=" + idPista + ", pista=" + pista + ", idAviao=" + idAviao + ", aviao=" + aviao + ", idJato=" + idJato + ", jato=" + jato + ", idHelicoptero=" + idHelicoptero + ", helicoptero=" + helicoptero + '}';
    }


}
