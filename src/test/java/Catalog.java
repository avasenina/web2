import com.sun.org.apache.xpath.internal.operations.Bool;

public class Catalog<Int> {

        String name;
        String description;
        String offersDescription;
        String productSpecs;
        Boolean type;
        Int valueText;

        public Catalog (){}

        public Catalog (String name, String description, String offersDescription, String productSpecs, Boolean type, Int valueText){
                this.name = name;
                this.description = description;
                this.offersDescription = offersDescription;
                this.productSpecs = productSpecs;
                this.type = type;
                this.valueText = valueText;
        }

        @Override
        public boolean equals(Object obj) {
                return super.equals(obj);
        }

}
