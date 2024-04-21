package com.harsha.java8.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserImpl {
	public static void main(String[] args) {

		var allUsers = getAllUsers();
//		List<UserDTO> userDto = new ArrayList<>();
		// Iterating all userDTO objects using for-each loop
		/*
		 * for (User user : allUsers) { userDto.add(new UserDTO(user.getId(),
		 * user.getUserName(), user.getEmail())); }
		 * 
		 * for (UserDTO dto : userDto) { System.out.println(dto); }
		 */

		// using streams
		allUsers.stream().map(user -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
				.collect(Collectors.toList()).forEach((userDTO) -> System.out.println(userDTO));
//		System.out.println(collect);
	}

	private static List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Arya", "password", "arya@gmail.com"));
		users.add(new User(2, "Roja", "password", "roja@gmail.com"));
		users.add(new User(3, "Ramya", "password", "ramya@gmail.com"));
		users.add(new User(4, "Prasad", "password", "prasad@gmail.com"));
		return users;
	}
}
