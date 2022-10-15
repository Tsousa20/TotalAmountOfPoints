public class Main {
    public static int main(String[] args) {

        int pontos = 0; //contagem de pontos
        int posicao = 0;

        for (int i=0; i <= 10; i++){
            int x = args[posicao].charAt(0); // x -> recebe o valor da posição 0 da string
            int y = args[posicao].charAt(2); // y -> recebe o valor da posição 2 da string

            if (x>y){                  //win, recebe 3 pontos
                pontos += 3;
                posicao += 1;
            } else if (x<y){          //loss, não recebe pontos(fica com os mesmos pontos)
                pontos = pontos;
                posicao += 1;
            } else if (x == y){      //tie, recebe 1 ponto
                pontos += 1;
                posicao += 1;
            }
        }
        return pontos;

    }
}