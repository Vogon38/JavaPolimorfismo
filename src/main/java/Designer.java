import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Designer extends Funcionario {

    @Override
    public Double getBonificacao() {
        return 200.0;
    }

}
