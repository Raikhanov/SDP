class TeamLead extends Approver {
    public void processRequest(ExpenseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("TeamLead approved the expense of $" + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}