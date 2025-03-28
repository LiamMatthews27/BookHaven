package ac.za.mycput.domain;

// *Zintle Mgqongose*
// 214280829
import java.time.LocalDate;

public class Fine {

    private int fineID;
    private int returnID;
    private double fineAmount;
    private String fineStatus;
    private LocalDate fineDate;
    private User userOfFine;
    private Loan loanOfFine;

    public Fine() {
    }

    private Fine(Builder builder) {
        this.fineID = builder.fineID;
        this.returnID = builder.returnID;
        this.fineAmount = builder.fineAmount;
        this.fineStatus = builder.fineStatus;
        this.fineDate = builder.fineDate;
        this.userOfFine = builder.userOfFine;
        this.loanOfFine = builder.loanOfFine;
    }

    public int getFineID() {
        return fineID;
    }

    public int getReturnID() {
        return returnID;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public String getFineStatus() {
        return fineStatus;
    }

    public LocalDate getFineDate() {
        return fineDate;
    }

    public User getUserOfFine() {
        return userOfFine;
    }

    public Loan getLoanOfFine() {
        return loanOfFine;
    }


    @Override
    public String toString() {
        return "Fine{" +
                "fineID=" + fineID +
                ", returnID=" + returnID +
                ", fineAmount=" + fineAmount +
                ", fineStatus='" + fineStatus + '\'' +
                ", fineDate=" + fineDate +
                ", userOfFine=" + userOfFine +
                ", loanOfFine=" + loanOfFine +
                '}';
    }

    public static class Builder {
        private int fineID;
        private int returnID;
        private double fineAmount;
        private String fineStatus = "Pending";
        private LocalDate fineDate;
        private User userOfFine;
        private Loan loanOfFine;

        public Builder setFineID(int fineID) {
            this.fineID = fineID;
            return this;
        }

        public Builder setReturnID(int returnID) {
            this.returnID = returnID;
            return this;
        }

        public Builder setFineAmount(double fineAmount) {
            this.fineAmount = fineAmount;
            return this;
        }

        public Builder setFineStatus(String fineStatus) {
            this.fineStatus = fineStatus;
            return this;
        }

        public Builder setFineDate(LocalDate fineDate) {
            this.fineDate = fineDate;
            return this;
        }

        public Builder setUserOfFine(User userOfFine) {
            this.userOfFine = userOfFine;
            return this;
        }

        public Builder setLoanOfFine(Loan loanOfFine) {
            this.loanOfFine = loanOfFine;
            return this;
        }


        public Fine build() {
            return new Fine(this);
        }
    }

}