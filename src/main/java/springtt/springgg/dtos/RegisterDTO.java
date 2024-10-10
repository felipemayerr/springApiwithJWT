package springtt.springgg.dtos;

import springtt.springgg.user.UserRole;

public record RegisterDTO (String login, String password, UserRole role ) {
}
