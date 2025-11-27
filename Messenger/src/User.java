public class User {
	private String name;
    private static int id = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(User user, String message) {
        System.out.println("Сообщение отправлено");
        id++;
    }

    public void sendMessage(Group group, String message) {
        System.out.println("Сообщение отправлено");
        id++;
    }

    public void sendMessage(Channel channel, String message) {
        if (channel.getOwner.equals(user)) {
            System.out.println("Сообщение отправлено");
            id++;
        } else {
            System.out.println("Недостаточно прав");
        }
    }
}