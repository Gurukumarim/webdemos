package com.movieapp.services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoviceServiceImpl implements IMoviesService {

	@Override
	public List<String> getLanguage(String language) {

		if (language.equals("english")) {
			return Arrays.asList("titanic", "wonder", "kashmir", "way");
		} else if (language.equals("kannada")) {
			return Arrays.asList("kgf", "kirataka", "rajahuli", "rajadani");
		} else if (language.equals("hindi")) {
			return Arrays.asList("the kashmir files", "war", "tiger", "bazigar");
		} else {
			return Arrays.asList("urvi", "talapathi", "master", "surooyi poutryi");

		}

	}
}
