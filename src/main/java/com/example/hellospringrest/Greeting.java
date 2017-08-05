package com.example.hellospringrest;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class Greeting {

	@Getter
	@Setter
	private final long id;

	@Getter
	@Setter
	private final String content;
}
