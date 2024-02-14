public class Main {
    public static void main(String[] args) {
        // Создаем нового пользователя с именем "john_doe" и паролем "password123"
        User user = new User("john_doe", "password123");

        // Выводим информацию о пользователе
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());

        // Меняем пароль пользователя
        user.setPassword("newPassword456");

        // Выводим обновленную информацию о пользователе
        System.out.println("Updated Password: " + user.getPassword());
    }
}
