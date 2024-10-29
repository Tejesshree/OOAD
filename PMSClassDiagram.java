public class Attendance {
  private String Empld;
  private String EmpName;
  private Date Intime;
  private Date Outtime;

  public String CalMonthlyatt(int EmpID) {
    // implementation
  }

  public int calOT(int Empld) {
    // implementation
  }
}

public class Allowance {
  private int AlwID;
  private String Alwtype;

  public long int getTotalAllowance() {
    // implementation
  }

  public String sendDetails() {
    // implementation
  }
}

public class Admin {
  private String Adminld;
  private String AdminName;

  public String AddEntries() {
    // implementation
  }

  public String updatedetails() {
    // implementation
  }

  public String deletedetails() {
    // implementation
  }
}

public class Employee {
  private String Empld;
  private String EmpName;
  private String Contactinfo;
  private String Email;
  private String Designation;
  private String Deptname;
  private Date JoinDate;

  public String ViewSalslip() {
    // implementation
  }

  public String ViewEmpAttendance() {
    // implementation
  }

  public String getDesignRank() {
    // implementation
  }

  public String getdeptdetails() {
    // implementation
  }
}

public class Loan {
  private String EmpID;
  private String LoanType;
  private double Amount;
  private float EmploanRate;

  public String getLoanInfo() {
    // implementation
  }

  public double CalculateAmount() {
    // implementation
  }
}

public class Tax {
  private String EmpID;
  private String TaxType;

  public float calTax() {
    // implementation
  }

  public float TaxRate() {
    // implementation
  }
}

public class Salary {
  private String EmpID;
  private double TotLoanAmt;
  private String SalaryDet;
  private double SalaryBonus;
  private double SalaryAdvance;
  private double GrossSalary;

  public String getSalinfo() {
    // implementation
  }

  public double CalNetSal() {
    // implementation
  }
}
