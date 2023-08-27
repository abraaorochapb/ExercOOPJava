package Entities;

public class Grades {

    public String name;
    public double FirstTrim;
    public double SecondTrim;

    public double ThirdTrim;

    public String passed(){
       return (FirstTrim + SecondTrim+ ThirdTrim)/3 >= 60 ? "Passed" : "Failed";
    }

    public double getFinalGrade(){
        return (FirstTrim + SecondTrim+ ThirdTrim)/3;
    }

}
