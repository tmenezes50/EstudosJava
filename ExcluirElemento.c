#include <stdio.h>

#define TAMANHO_VETOR 10

int main()
{   
    int n, aux;
    int vetor[TAMANHO_VETOR] = {3, 24, 5, 6, 2, 42, 12, 32, 8, 9};
    
    for (int i = 0; i < TAMANHO_VETOR; i++)
    {
        printf("%d ", vetor[i]);
    }
    printf("\nDigite posicao que deseja excluir: ");

    scanf("%d", &n);


    for (int i = n; i < TAMANHO_VETOR -1 ; i++)
    {
       
            
                aux = vetor[i+1];
                vetor[i+1] = vetor[i];
                vetor[i] = aux;
            
        
        
    }

    for (int i = 0; i < TAMANHO_VETOR - 1 ; i++)
    {
        printf("%d ", vetor[i]);
    }
    

    return 0;
}
