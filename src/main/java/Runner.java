public class Runner {

        public static void main(String[] args) {
            // Создаем нового пользователя
            User user = new User("john_doe", "john@example.com");

            // Выводим информацию о пользователе
            System.out.println("Username: " + user.getUsername());
            System.out.println("Email: " + user.getEmail());

            // Меняем имя пользователя и email
            user.setUsername("new_username");
            user.setEmail("new_email@example.com");

            // Выводим обновленную информацию о пользователе
            System.out.println("Updated Username: " + user.getUsername());
            System.out.println("Updated Email: " + user.getEmail());
        }
    }
