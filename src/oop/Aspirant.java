package oop;

/**
 * Created by Student on 17.12.2018.
 */
public class Aspirant extends Student {
    private String work;
    private String summ;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String work) {
        super(firstName, lastName, group, avgMark);
        this.work = work;
        this.summ = summ;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getSumm() {
        return summ;
    }
    public void setSumm(String summ) {
        this.summ = summ;
    }
    public  double getScholarship() {
        return getAvgMark() == 5 ? 200 : 180;
    }

}
