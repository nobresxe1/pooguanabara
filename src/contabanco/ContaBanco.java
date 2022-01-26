package contabanco;

public class ContaBanco {
    public int numConta;
    protected String tipo;   //parei na aula 5a do guanabara
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC" ){
            setSaldo(50);
        }
        if (t =="CP"){
            setSaldo(150);
        }
    }
    public void fecharConta(){

    }
    public void depositar(){

    }
    public void sacar(){

    }
    public void pagarMensal(){

    }

    public ContaBanco(int numConta) {
        saldo = 0;
        status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean setStatus(boolean status) {
        return status;
    }
}
