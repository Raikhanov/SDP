class CEO extends Approver {
    public void processRequest(ExpenseRequest request) {
        if (request.getAmount() > 10000) {
            System.out.println("CEO approved the expense of $" + request.getAmount());
        }
    }
}