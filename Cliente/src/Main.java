import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
            SOAPConnection conexion = factory.createConnection();
            String urlConexion = "http://localhost:8081/estados";
            SOAPMessage response = conexion.call(generarMensaje(), urlConexion);
            //generarMensaje();
            imprimirRespuesta(response);
            conexion.close();


        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void imprimirRespuesta(SOAPMessage response) throws SOAPException{

        SOAPBody body = response.getSOAPBody();
        SOAPElement elemento = (SOAPElement) body.getChildElements(
                new QName("http://ws/", "getCapitalResponse")).next();

        SOAPElement elemento2 = (SOAPElement) elemento.getChildElements(
                new QName("return")).next();

        String mensaje = elemento2.getTextContent();
        System.out.println("\n" + mensaje);
    }

    public static SOAPMessage generarMensaje() throws SOAPException, IOException{

        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage mensaje = factory.createMessage();
        SOAPPart soapPart = mensaje.getSOAPPart();
        String servicioUri = "http://ws/";
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("ws",servicioUri);
        SOAPBody body = envelope.getBody();
        SOAPElement elemento = body.addChildElement("getCapital", "ws");
        SOAPElement elemnetoInterno = elemento.addChildElement("estado");
        elemnetoInterno.addTextNode("Michoacan");

        mensaje.saveChanges();

        mensaje.writeTo(System.out);

        return mensaje;
    }
}
