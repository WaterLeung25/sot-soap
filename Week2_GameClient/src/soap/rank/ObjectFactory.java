
package soap.rank;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.rank package. 
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

    private final static QName _UpdateWinArchive_QNAME = new QName("http://rank.soap/", "updateWinArchive");
    private final static QName _GetNewUserResponse_QNAME = new QName("http://rank.soap/", "getNewUserResponse");
    private final static QName _UpdateLoseArchive_QNAME = new QName("http://rank.soap/", "updateLoseArchive");
    private final static QName _UpdateWinArchiveResponse_QNAME = new QName("http://rank.soap/", "updateWinArchiveResponse");
    private final static QName _GetNewUser_QNAME = new QName("http://rank.soap/", "getNewUser");
    private final static QName _CreateRank_QNAME = new QName("http://rank.soap/", "createRank");
    private final static QName _CreateRankResponse_QNAME = new QName("http://rank.soap/", "createRankResponse");
    private final static QName _UpdateLoseArchiveResponse_QNAME = new QName("http://rank.soap/", "updateLoseArchiveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.rank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateRankResponse }
     * 
     */
    public CreateRankResponse createCreateRankResponse() {
        return new CreateRankResponse();
    }

    /**
     * Create an instance of {@link CreateRank }
     * 
     */
    public CreateRank createCreateRank() {
        return new CreateRank();
    }

    /**
     * Create an instance of {@link UpdateLoseArchiveResponse }
     * 
     */
    public UpdateLoseArchiveResponse createUpdateLoseArchiveResponse() {
        return new UpdateLoseArchiveResponse();
    }

    /**
     * Create an instance of {@link GetNewUserResponse }
     * 
     */
    public GetNewUserResponse createGetNewUserResponse() {
        return new GetNewUserResponse();
    }

    /**
     * Create an instance of {@link UpdateWinArchive }
     * 
     */
    public UpdateWinArchive createUpdateWinArchive() {
        return new UpdateWinArchive();
    }

    /**
     * Create an instance of {@link GetNewUser }
     * 
     */
    public GetNewUser createGetNewUser() {
        return new GetNewUser();
    }

    /**
     * Create an instance of {@link UpdateLoseArchive }
     * 
     */
    public UpdateLoseArchive createUpdateLoseArchive() {
        return new UpdateLoseArchive();
    }

    /**
     * Create an instance of {@link UpdateWinArchiveResponse }
     * 
     */
    public UpdateWinArchiveResponse createUpdateWinArchiveResponse() {
        return new UpdateWinArchiveResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWinArchive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rank.soap/", name = "updateWinArchive")
    public JAXBElement<UpdateWinArchive> createUpdateWinArchive(UpdateWinArchive value) {
        return new JAXBElement<UpdateWinArchive>(_UpdateWinArchive_QNAME, UpdateWinArchive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rank.soap/", name = "getNewUserResponse")
    public JAXBElement<GetNewUserResponse> createGetNewUserResponse(GetNewUserResponse value) {
        return new JAXBElement<GetNewUserResponse>(_GetNewUserResponse_QNAME, GetNewUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLoseArchive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rank.soap/", name = "updateLoseArchive")
    public JAXBElement<UpdateLoseArchive> createUpdateLoseArchive(UpdateLoseArchive value) {
        return new JAXBElement<UpdateLoseArchive>(_UpdateLoseArchive_QNAME, UpdateLoseArchive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWinArchiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rank.soap/", name = "updateWinArchiveResponse")
    public JAXBElement<UpdateWinArchiveResponse> createUpdateWinArchiveResponse(UpdateWinArchiveResponse value) {
        return new JAXBElement<UpdateWinArchiveResponse>(_UpdateWinArchiveResponse_QNAME, UpdateWinArchiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rank.soap/", name = "getNewUser")
    public JAXBElement<GetNewUser> createGetNewUser(GetNewUser value) {
        return new JAXBElement<GetNewUser>(_GetNewUser_QNAME, GetNewUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRank }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rank.soap/", name = "createRank")
    public JAXBElement<CreateRank> createCreateRank(CreateRank value) {
        return new JAXBElement<CreateRank>(_CreateRank_QNAME, CreateRank.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRankResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rank.soap/", name = "createRankResponse")
    public JAXBElement<CreateRankResponse> createCreateRankResponse(CreateRankResponse value) {
        return new JAXBElement<CreateRankResponse>(_CreateRankResponse_QNAME, CreateRankResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLoseArchiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rank.soap/", name = "updateLoseArchiveResponse")
    public JAXBElement<UpdateLoseArchiveResponse> createUpdateLoseArchiveResponse(UpdateLoseArchiveResponse value) {
        return new JAXBElement<UpdateLoseArchiveResponse>(_UpdateLoseArchiveResponse_QNAME, UpdateLoseArchiveResponse.class, null, value);
    }

}
