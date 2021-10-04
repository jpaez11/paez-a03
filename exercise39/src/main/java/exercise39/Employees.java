package exercise39;

public class Employees {
    private String firstName;
    private String lastName;
    private String dpt;
    private double Date;
    private String fName;

    //here's constructor
    public Employees(String fName, String lName,
                    String dpt,double separationDate)
    {
        this.firstName = fName;
        this.lastName = lName;

        this.dpt = dpt;
        this.Date=separationDate;
    }

    //first and last names
    public void setFirstName(String fName)
    {
        this.fName = fName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String lName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return lastName;
    }



    //for the department
    public void setDepartment(String department)
    {
        this.dpt = department;
    }

    public String getDepartment()
    {
        return dpt;
    }

    public void Date(double Date)
    {
        this.Date = Date;
    }


    public double getDate()
    {
        return Date;
    }

    //full name
    public String getName()
    {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    //returning a string with the employees' info
    @Override
    public String toString()
     {
        return String.format("%-8s %-8s %s %8.0f",
                getFirstName(), getLastName(), getDepartment(),getDate());
        }
    }

