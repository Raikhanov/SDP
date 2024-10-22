public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new RegularUser(mediator, "Adilet");
        User user2 = new RegularUser(mediator, "Adel");
        User user3 = new RegularUser(mediator, "Bexultan");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello, everyone!");
    }
}