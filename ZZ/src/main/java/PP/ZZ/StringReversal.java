package PP.ZZ;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class StringReversal {
	public static void main(String[] args) {
		try {
			File file=new File("data.xml");
			JAXBContext jaxbContext=JAXBContext.newInstance(reverse.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			reverse add = (reverse) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println("Original number:"+add.getName());
			
		} catch (JAXBException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}