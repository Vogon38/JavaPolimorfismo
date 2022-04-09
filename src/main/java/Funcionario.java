import lombok.Data;

@Data
//nao pode mais instanciar dessa classe porque é abstrata
public abstract class Funcionario {

    private String nome, cpf;
    private Double salario;

    //metodo sem corpo, nao ha implementacao
    public abstract Double getBonificacao();

}
