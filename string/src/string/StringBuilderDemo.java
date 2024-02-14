package string;
import java.lang.String;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("hello");
		builder.append("world!");
		System.out.println(builder);
		System.out.println(builder.reverse());
		StringBuffer buffer = new StringBuffer("abc");
		buffer.append("xyz!");
		System.out.println(buffer);
		System.out.println(buffer.reverse());
		}
	}
