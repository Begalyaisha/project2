public class User {
    private String username;
    private String password;

    // Конструктор класса User
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Геттер для имени пользователя
    public String getUsername() {
        return username;
    }

    // Сеттер для имени пользователя
    public void setUsername(String username) {
        this.username = username;
    }

    // Геттер для пароля пользователя
    public String getPassword() {
        return password;
    }

    // Сеттер для пароля пользователя
    public void setPassword(String password) {
        this.password = password;
    }
}
