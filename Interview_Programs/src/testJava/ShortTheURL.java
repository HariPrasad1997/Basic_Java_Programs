package testJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class UrlService {
	String chars = "abc";

	Random random = new Random();
	List<String> urls = new ArrayList<>();

	public String generate() {
		String sUrl = "";
		StringBuilder builder = new StringBuilder();
		int index = 0;
		builder.setLength(0);
		for (int i = 0; i < 6; i++) {
			index = random.nextInt(chars.length());
			builder.append(chars.charAt(index));
		}
		sUrl = builder.toString();
//		urls.add(sUrl);
		return sUrl;
	}

	public void filterUrls() {
		for (int i = 1; i < 1000; i++) {
			urls.add(generate());
		}
	}

}

public class ShortTheURL {
	public static void main(String[] args) {
		String oUrl = "https://github.com/Deeksha2501/Data-Structures-and-Algorithms-Notes/blob/main/OOPS.pdf";
		String sUrl = "";// github.com/Deeksha
		int count = 0;
		UrlService service = new UrlService();
		service.filterUrls();
		do {
			sUrl = service.generate();
			count++;
			System.out.println("generted" + count);
		} while (service.urls.contains(sUrl));
		System.out.println("github.com/" + sUrl);
	}

}
