public class Tree {
    private No raiz;
    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

   public void inserir(String palavra){
        No aux = raiz;

        if(raiz == null){
            inserirNaArvore(palavra);
        }
   }

   public void inserirNaArvore(String palavra){

   }
}
