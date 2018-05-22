
package soap.game_result;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.game_result package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WinResponse_QNAME = new QName("http://game_result.soap/", "winResponse");
    private final static QName _Win_QNAME = new QName("http://game_result.soap/", "win");
    private final static QName _LoseResponse_QNAME = new QName("http://game_result.soap/", "loseResponse");
    private final static QName _Lose_QNAME = new QName("http://game_result.soap/", "lose");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.game_result
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Lose }
     * 
     */
    public Lose createLose() {
        return new Lose();
    }

    /**
     * Create an instance of {@link WinResponse }
     * 
     */
    public WinResponse createWinResponse() {
        return new WinResponse();
    }

    /**
     * Create an instance of {@link LoseResponse }
     * 
     */
    public LoseResponse createLoseResponse() {
        return new LoseResponse();
    }

    /**
     * Create an instance of {@link Win }
     * 
     */
    public Win createWin() {
        return new Win();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game_result.soap/", name = "winResponse")
    public JAXBElement<WinResponse> createWinResponse(WinResponse value) {
        return new JAXBElement<WinResponse>(_WinResponse_QNAME, WinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Win }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game_result.soap/", name = "win")
    public JAXBElement<Win> createWin(Win value) {
        return new JAXBElement<Win>(_Win_QNAME, Win.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game_result.soap/", name = "loseResponse")
    public JAXBElement<LoseResponse> createLoseResponse(LoseResponse value) {
        return new JAXBElement<LoseResponse>(_LoseResponse_QNAME, LoseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lose }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://game_result.soap/", name = "lose")
    public JAXBElement<Lose> createLose(Lose value) {
        return new JAXBElement<Lose>(_Lose_QNAME, Lose.class, null, value);
    }

}
