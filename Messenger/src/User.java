import java.util.Scanner;

public class User {
	private String name;
    private static long id = 0;
    Scanner sc = new Scanner(System.in);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(User user, Message message) {
        System.out.println("Введите сообщение:");
        String text = sc.nextLine();
        id++;
        Message message = new Message(id, name, user.getName(), text);
        System.out.println("Сообщение отправлено");
    }

    public void sendMessage(Group group, Message message) {
        System.out.println("Введите сообщение:");
        String text = sc.nextLine();
        id++;
        Message message = new Message(id, name, group.getName(), text);
        System.out.println("Сообщение отправлено");
    }

    public void sendMessage(Channel channel, Message message) {
        if (channel.getOwner.equals(user)) {
            System.out.println("Введите сообщение:");
            String text = sc.nextLine();
            id++;
            Message message = new Message(id, name, channel.getName(), text);
            System.out.println("Сообщение отправлено");
        } else {
            System.out.println("Недостаточно прав");
        }
    }
}