package Task3;

public enum Vehicles {
    TOYOTA(23987){
        @Override
        public String getColor() {
            return "blue";
        }
    },
    MAZDA(30000){
        @Override
        public String getColor() {
            return "black";
        }
    },
    VOLVO(70000){
        @Override
        public String getColor() {
            return "dark grey";
        }
    };

    double price;
    Vehicles( double price){
        this.price = price;
    }
    public abstract String getColor();
    public String toString() {
        return super.toString() +" " + price + " " + getColor();
    }
}
