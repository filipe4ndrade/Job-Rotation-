/*4 - Em Java:  Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela 
mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 
110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 
km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?

IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em 
cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.
*/


public class Rodovia {
    public static void main(String[] args) {
        double distancia = 100; // distância entre as cidades em km
        double velocidadeCarro = 110; // velocidade do carro em km/h
        double velocidadeCaminhao = 80; // velocidade do caminhão em km/h
        double tempoPedagio = 5.0 / 60.0; // tempo em horas para passar por cada pedágio (5 minutos = 5/60 horas)
        double distanciaCarro = (distancia / 2) + (velocidadeCarro * tempoPedagio); // distância percorrida pelo carro até o ponto de encontro
        double distanciaCaminhao = (distancia / 2) + (velocidadeCaminhao * tempoPedagio * 2); // distância percorrida pelo caminhão até o ponto de encontro (2 pedágios)
        if (distanciaCarro < distanciaCaminhao) { // verifica qual veículo está mais próximo de Ribeirão Preto
            System.out.println("O carro estará mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão estará mais próximo de Ribeirão Preto.");
        }
    }
}


// Explicação
/* Com base nesses dados, o programa calcula a distância percorrida por cada veículo até o 
ponto de encontro na rodovia. O carro percorre metade da distância entre as cidades (50 km) 
mais o tempo adicional para passar pelo pedágio. Já o caminhão percorre metade da distância 
entre as cidades (50 km) mais o tempo adicional para passar pelos dois pedágios. Depois, o 
programa compara as distâncias percorridas pelos dois veículos e imprime a mensagem indicando 
qual deles estará mais próximo de Ribeirão Preto no momento do cruzamento na rodovia. */