public class Runner {
        public static void main(String[] args) {
            // Создаем нового пользователя
            User user = new User("john_doe");

            // Получаем и выводим имя пользователя
            String username = user.getUsername();
            System.out.println("Username: " + username);

            // Меняем имя пользователя
            user.setUsername("new_username");

            // Получаем и выводим обновленное имя пользователя
            String updatedUsername = user.getUsername();
            System.out.println("Updated Username: " + updatedUsername);
        }
    }
