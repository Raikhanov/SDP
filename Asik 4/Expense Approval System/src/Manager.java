class Manager extends Approver {
    public void processRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Manager approved the expense of $" + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
