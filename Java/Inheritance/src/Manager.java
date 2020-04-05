class Manager extends Employee{	
    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary); // will call the parameterised constructor of super class
        bonus=0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
		// we are overwritting the getsalary() of super class - may be
   public double getSalary(){
        // actually salary is base salary + bonus , but it cannt access base salary directly;
        // only the getSalary() of employee can access it ;
        // we can only access bonus here directly

        double baseSalary = super.getSalary();
        return baseSalary+bonus;

   }

}
