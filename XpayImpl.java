public class XpayImpl implements Xpay {
    private String creditCardNo;
    private String customerName;
    private String expM,expY;
    private short cvv;
    private double amount;


    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getCardExpMonth() {
        return expM;
    }

    @Override
    public String getCardExpYear() {
        return expY;
    }

    @Override
    public Short getCardCVVNo() {
        return cvv;
    }

    @Override
    public Double getAmount() {
        return amount;
    }



    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.expM = cardExpMonth;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.expY = cardExpYear;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cvv = cardCVVNo;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }


}
