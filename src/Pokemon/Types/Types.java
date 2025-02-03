package Pokemon.Types;

public class Types {
    private TypeDetails type; 

    public Types() {
    }

    public Types(TypeDetails type) {
        this.type = type;
    }

    public TypeDetails getType() {
        return type;
    }

    public void setType(TypeDetails type) {
        this.type = type;
    }

   
    public static class TypeDetails {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
