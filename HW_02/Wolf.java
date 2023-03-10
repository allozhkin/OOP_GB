package HW_02;

public class Wolf extends WildAnimal implements Sound {
    private String leader;

    public Wolf(Integer height, Integer weight, String eyes, String dateOfBeen, String placeOf,
            String leader) {
        super(height, weight, eyes, dateOfBeen, placeOf);
        this.leader = leader;
    }

    public void getLeader() {
        System.out.println(this.leader = leader);
    }

    @Override
    public void makeASound() {
        System.out.println("YYYYYYYYYY");
    }

    @Override
    public String getInfo() {
        return "Волк: " + super.getInfo();
    }

}
