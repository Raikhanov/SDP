class Director extends Approver {
    public void processRequest(ExpenseRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Director approved the expense of $" + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
