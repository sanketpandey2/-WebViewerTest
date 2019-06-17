package proj.maven.test.WebViewerTest;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML_Reader {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		
		Document doc=builder.parse("C:\\Users\\dtf8207\\Downloads\\cd_catalog.xml");
		
		System.out.println("root node is" + doc.getDocumentElement().getNodeName()
				);
		NodeList nl = doc.getElementsByTagName("CD");
		
		
		Node n= nl.item(1);
		System.out.println(n.getNodeType());
		Element e = (Element) n;
		System.out.println(e.getElementsByTagName("TITLE").item(0).getTextContent());
		
				
		
	}

}
