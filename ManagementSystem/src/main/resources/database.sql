INSERT INTO role (name) VALUES ('ROLE_ADMIN');
INSERT INTO role (name) VALUES ('ROLE_SALES');
INSERT INTO role (name) VALUES ('ROLE_ACCOUNTANT');
INSERT INTO role (name) VALUES ('ROLE_HR');

-- Password encoded using BCrypt: "password"
INSERT INTO user (username, password) VALUES ('admin', '$2a$10$EIX/AKxZR4CRy5D1dTQyXu7LTlA8Dj8f0flRAsFDvUeNUjP6/4Z7O');
INSERT INTO user_roles (user_id, roles_id) VALUES (1, 1);
