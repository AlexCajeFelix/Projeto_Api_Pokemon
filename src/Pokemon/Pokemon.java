package Pokemon;
import java.util.List;
import Pokemon.Types.Types; 

public class Pokemon {
    private String name;
    private List<Types> types;

    public Pokemon() {
    }

    public Pokemon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Types> getTypes() {
        return types;
    }

    public void setTypes(List<Types> types) {
        this.types = types;
    }
}
