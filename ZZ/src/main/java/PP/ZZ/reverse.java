package PP.ZZ;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class reverse{
   private String name;
   
   @XmlElement
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}