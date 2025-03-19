public class Grafos {

    public class Arista {
        private Nodo v1;
        private Nodo v2;
        private int peso;

        public Arista(Nodo v1, Nodo v2, int peso) {
            this.v1 = v1;
            this.v2 = v2;
            this.peso = peso;
        }

        public Nodo getV1() {
            return this.v1;
        }

        public Nodo getV2() {
            return this.v2;
        }

        public int getPeso() {
            return this.peso;
        }
    }
    public static void main(String[] args) {
        Grafos grafo = new Grafos();
        Nodo n1 = new Nodo("A");
        Nodo n2 = new Nodo("B");
        Arista arista = grafo.new Arista(n1, n2, 5);

        System.out.println("Arista creada con peso: " + arista.getPeso());
    }
}
