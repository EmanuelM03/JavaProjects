public class SistemaEstoque {
    public static void main(String[] args) {

        Produto produto = new Produto(null, 0, 0);

        produto.setEstoque();
        produto.fileDB();
    }
}
