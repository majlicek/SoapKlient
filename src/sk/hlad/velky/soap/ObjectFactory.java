
package sk.hlad.velky.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sk.hlad.velky.soap package. 
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

    private final static QName _GetAllRecipesResponse_QNAME = new QName("http://soap.velky.hlad.sk/", "getAllRecipesResponse");
    private final static QName _GetRecipeResponse_QNAME = new QName("http://soap.velky.hlad.sk/", "getRecipeResponse");
    private final static QName _DeleteRecipeResponse_QNAME = new QName("http://soap.velky.hlad.sk/", "deleteRecipeResponse");
    private final static QName _GetRecipesByKeyWord_QNAME = new QName("http://soap.velky.hlad.sk/", "getRecipesByKeyWord");
    private final static QName _EditRecipeResponse_QNAME = new QName("http://soap.velky.hlad.sk/", "editRecipeResponse");
    private final static QName _AddRecipeResponse_QNAME = new QName("http://soap.velky.hlad.sk/", "addRecipeResponse");
    private final static QName _GetRecipesByIng_QNAME = new QName("http://soap.velky.hlad.sk/", "getRecipesByIng");
    private final static QName _EditRecipe_QNAME = new QName("http://soap.velky.hlad.sk/", "editRecipe");
    private final static QName _GetRecipesByKeyWordResponse_QNAME = new QName("http://soap.velky.hlad.sk/", "getRecipesByKeyWordResponse");
    private final static QName _GetAllRecipes_QNAME = new QName("http://soap.velky.hlad.sk/", "getAllRecipes");
    private final static QName _AddRecipe_QNAME = new QName("http://soap.velky.hlad.sk/", "addRecipe");
    private final static QName _GetRecipesByIngResponse_QNAME = new QName("http://soap.velky.hlad.sk/", "getRecipesByIngResponse");
    private final static QName _DeleteRecipe_QNAME = new QName("http://soap.velky.hlad.sk/", "deleteRecipe");
    private final static QName _GetRecipe_QNAME = new QName("http://soap.velky.hlad.sk/", "getRecipe");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sk.hlad.velky.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRecipesByKeyWord }
     * 
     */
    public GetRecipesByKeyWord createGetRecipesByKeyWord() {
        return new GetRecipesByKeyWord();
    }

    /**
     * Create an instance of {@link EditRecipeResponse }
     * 
     */
    public EditRecipeResponse createEditRecipeResponse() {
        return new EditRecipeResponse();
    }

    /**
     * Create an instance of {@link DeleteRecipeResponse }
     * 
     */
    public DeleteRecipeResponse createDeleteRecipeResponse() {
        return new DeleteRecipeResponse();
    }

    /**
     * Create an instance of {@link GetAllRecipesResponse }
     * 
     */
    public GetAllRecipesResponse createGetAllRecipesResponse() {
        return new GetAllRecipesResponse();
    }

    /**
     * Create an instance of {@link GetRecipeResponse }
     * 
     */
    public GetRecipeResponse createGetRecipeResponse() {
        return new GetRecipeResponse();
    }

    /**
     * Create an instance of {@link AddRecipeResponse }
     * 
     */
    public AddRecipeResponse createAddRecipeResponse() {
        return new AddRecipeResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByIng }
     * 
     */
    public GetRecipesByIng createGetRecipesByIng() {
        return new GetRecipesByIng();
    }

    /**
     * Create an instance of {@link AddRecipe }
     * 
     */
    public AddRecipe createAddRecipe() {
        return new AddRecipe();
    }

    /**
     * Create an instance of {@link GetRecipesByIngResponse }
     * 
     */
    public GetRecipesByIngResponse createGetRecipesByIngResponse() {
        return new GetRecipesByIngResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByKeyWordResponse }
     * 
     */
    public GetRecipesByKeyWordResponse createGetRecipesByKeyWordResponse() {
        return new GetRecipesByKeyWordResponse();
    }

    /**
     * Create an instance of {@link GetAllRecipes }
     * 
     */
    public GetAllRecipes createGetAllRecipes() {
        return new GetAllRecipes();
    }

    /**
     * Create an instance of {@link EditRecipe }
     * 
     */
    public EditRecipe createEditRecipe() {
        return new EditRecipe();
    }

    /**
     * Create an instance of {@link GetRecipe }
     * 
     */
    public GetRecipe createGetRecipe() {
        return new GetRecipe();
    }

    /**
     * Create an instance of {@link DeleteRecipe }
     * 
     */
    public DeleteRecipe createDeleteRecipe() {
        return new DeleteRecipe();
    }

    /**
     * Create an instance of {@link Recipe }
     * 
     */
    public Recipe createRecipe() {
        return new Recipe();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRecipesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "getAllRecipesResponse")
    public JAXBElement<GetAllRecipesResponse> createGetAllRecipesResponse(GetAllRecipesResponse value) {
        return new JAXBElement<GetAllRecipesResponse>(_GetAllRecipesResponse_QNAME, GetAllRecipesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "getRecipeResponse")
    public JAXBElement<GetRecipeResponse> createGetRecipeResponse(GetRecipeResponse value) {
        return new JAXBElement<GetRecipeResponse>(_GetRecipeResponse_QNAME, GetRecipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRecipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "deleteRecipeResponse")
    public JAXBElement<DeleteRecipeResponse> createDeleteRecipeResponse(DeleteRecipeResponse value) {
        return new JAXBElement<DeleteRecipeResponse>(_DeleteRecipeResponse_QNAME, DeleteRecipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipesByKeyWord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "getRecipesByKeyWord")
    public JAXBElement<GetRecipesByKeyWord> createGetRecipesByKeyWord(GetRecipesByKeyWord value) {
        return new JAXBElement<GetRecipesByKeyWord>(_GetRecipesByKeyWord_QNAME, GetRecipesByKeyWord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRecipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "editRecipeResponse")
    public JAXBElement<EditRecipeResponse> createEditRecipeResponse(EditRecipeResponse value) {
        return new JAXBElement<EditRecipeResponse>(_EditRecipeResponse_QNAME, EditRecipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRecipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "addRecipeResponse")
    public JAXBElement<AddRecipeResponse> createAddRecipeResponse(AddRecipeResponse value) {
        return new JAXBElement<AddRecipeResponse>(_AddRecipeResponse_QNAME, AddRecipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipesByIng }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "getRecipesByIng")
    public JAXBElement<GetRecipesByIng> createGetRecipesByIng(GetRecipesByIng value) {
        return new JAXBElement<GetRecipesByIng>(_GetRecipesByIng_QNAME, GetRecipesByIng.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRecipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "editRecipe")
    public JAXBElement<EditRecipe> createEditRecipe(EditRecipe value) {
        return new JAXBElement<EditRecipe>(_EditRecipe_QNAME, EditRecipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipesByKeyWordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "getRecipesByKeyWordResponse")
    public JAXBElement<GetRecipesByKeyWordResponse> createGetRecipesByKeyWordResponse(GetRecipesByKeyWordResponse value) {
        return new JAXBElement<GetRecipesByKeyWordResponse>(_GetRecipesByKeyWordResponse_QNAME, GetRecipesByKeyWordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRecipes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "getAllRecipes")
    public JAXBElement<GetAllRecipes> createGetAllRecipes(GetAllRecipes value) {
        return new JAXBElement<GetAllRecipes>(_GetAllRecipes_QNAME, GetAllRecipes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRecipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "addRecipe")
    public JAXBElement<AddRecipe> createAddRecipe(AddRecipe value) {
        return new JAXBElement<AddRecipe>(_AddRecipe_QNAME, AddRecipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipesByIngResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "getRecipesByIngResponse")
    public JAXBElement<GetRecipesByIngResponse> createGetRecipesByIngResponse(GetRecipesByIngResponse value) {
        return new JAXBElement<GetRecipesByIngResponse>(_GetRecipesByIngResponse_QNAME, GetRecipesByIngResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRecipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "deleteRecipe")
    public JAXBElement<DeleteRecipe> createDeleteRecipe(DeleteRecipe value) {
        return new JAXBElement<DeleteRecipe>(_DeleteRecipe_QNAME, DeleteRecipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.velky.hlad.sk/", name = "getRecipe")
    public JAXBElement<GetRecipe> createGetRecipe(GetRecipe value) {
        return new JAXBElement<GetRecipe>(_GetRecipe_QNAME, GetRecipe.class, null, value);
    }

}
