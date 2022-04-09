import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class EditorVideo extends Funcionario {

    public Double getBonificacao() {
        return 150.0;
    }

}
