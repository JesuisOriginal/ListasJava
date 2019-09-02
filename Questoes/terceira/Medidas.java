package Questoes.terceira;

public class Medidas {
    private double dist;
    private double temp;
    private double mass;
    private String massUnit;
    private String tempUnit;
    private String distUnit;

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getDistUnit() {
        return distUnit;
    }

    public void setDistUnit(String distUnit) {
        this.distUnit = distUnit;
    }

    public String getMassUnit() {
        return massUnit;
    }

    public void setMassUnit(String massUnit) {
        this.massUnit = massUnit;
    }

    public String getTempUnit() {
        return tempUnit;
    }

    public void setTempUnit(String tempUnit) {
        this.tempUnit = tempUnit;
    }

    public ConversorDeMedidas conversor = new ConversorDeMedidas();

    public Medidas(double dist, double temp, double mass, String distUnit, String massUnit, String tempUnit) {
        this.dist = dist;
        this.temp = temp;
        this.mass = mass;
        this.distUnit = distUnit;
        this.massUnit = massUnit;
        this.tempUnit = tempUnit;

//        if (!this.tempUnit.equals("C") || !this.tempUnit.equals("F")) {
//            System.out.println("Unidade de temperatura invalida");
//            System.exit(1);
//        }
//        else if (!this.distUnit.equals("km") || !this.distUnit.equals("mi")) {
//            System.out.println("Unidade de distancia invalida");
//            System.exit(1);
//        } else if (!this.massUnit.equals("Kg") || !this.massUnit.equals("lb")) {
//            System.out.println("Unidade de massa invalida");
//            System.exit(1);
//        }
    }



}
