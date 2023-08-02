package Task1;

public enum Animals {
    CAT(4), DOG(3), WOLF(4), BEAR(5);


    int age;

    Animals(int age) {
        this.age = age;
    }

    public String toString() {
        return super.toString() +" " + age;
    }
}
