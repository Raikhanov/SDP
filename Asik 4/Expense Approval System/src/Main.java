public class Main {
    public static void main(String[] args) {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        ExpenseRequest request1 = new ExpenseRequest(500, "Team Outing");
        teamLead.processRequest(request1);

        ExpenseRequest request2 = new ExpenseRequest(7000, "Project Expenses");
        teamLead.processRequest(request2);

        ExpenseRequest request3 = new ExpenseRequest(15000, "Office Renovation");
        teamLead.processRequest(request3);
    }
}