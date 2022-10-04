
package org.goafabric.model.generated;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ops package. 
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

    private final static QName _LocalHeader_QNAME = new QName("urn:ehd/001", "local_header");
    private final static QName _Person_QNAME = new QName("urn:ehd/001", "person");
    private final static QName _Organization_QNAME = new QName("urn:ehd/001", "organization");
    private final static QName _Header_QNAME = new QName("urn:ehd/001", "header");
    private final static QName _DocumentRelationship_QNAME = new QName("urn:ehd/001", "document_relationship");
    private final static QName _Ehd_QNAME = new QName("urn:ehd/001", "ehd");
    private final static QName _ParticipationTmr_QNAME = new QName("urn:ehd/001", "participation_tmr");
    private final static QName _PersonName_QNAME = new QName("urn:ehd/001", "person_name");
    private final static QName _Keytabs_QNAME = new QName("urn:ehd/001", "keytabs");
    private final static QName _OriginationDttm_QNAME = new QName("urn:ehd/001", "origination_dttm");
    private final static QName _FunctionCd_QNAME = new QName("urn:ehd/001", "function_cd");
    private final static QName _Provider_QNAME = new QName("urn:ehd/001", "provider");
    private final static QName _Patient_QNAME = new QName("urn:ehd/001", "patient");
    private final static QName _Fkey_QNAME = new QName("urn:ehd/001", "fkey");
    private final static QName _Scope_QNAME = new QName("urn:ehd/001", "scope");
    private final static QName _SetId_QNAME = new QName("urn:ehd/001", "set_id");
    private final static QName _Telecom_QNAME = new QName("urn:ehd/001", "telecom");
    private final static QName _Id_QNAME = new QName("urn:ehd/001", "id");
    private final static QName _ServiceTmr_QNAME = new QName("urn:ehd/001", "service_tmr");
    private final static QName _State_QNAME = new QName("urn:ehd/001", "state");
    private final static QName _Addr_QNAME = new QName("urn:ehd/001", "addr");
    private final static QName _Group_QNAME = new QName("urn:ehd/001", "group");
    private final static QName _VersionNbr_QNAME = new QName("urn:ehd/001", "version_nbr");
    private final static QName _TRANSLTN_QNAME = new QName("urn:ehd/001", "TRANSLTN");
    private final static QName _IntendedRecipient_QNAME = new QName("urn:ehd/001", "intended_recipient");
    private final static QName _RelatedDocument_QNAME = new QName("urn:ehd/001", "related_document");
    private final static QName _DocumentTypeCd_QNAME = new QName("urn:ehd/001", "document_type_cd");
    private final static QName _Keytab_QNAME = new QName("urn:ehd/001", "keytab");
    private final static QName _Originator_QNAME = new QName("urn:ehd/001", "originator");
    private final static QName _Interface_QNAME = new QName("urn:ehd/001", "interface");
    private final static QName _GroupTypeCd_QNAME = new QName("urn:ehd/001", "group.type_cd");
    private final static QName _AddrTypSTR_QNAME = new QName("urn:ehd/001", "STR");
    private final static QName _AddrTypZIP_QNAME = new QName("urn:ehd/001", "ZIP");
    private final static QName _AddrTypSTA_QNAME = new QName("urn:ehd/001", "STA");
    private final static QName _AddrTypPOB_QNAME = new QName("urn:ehd/001", "POB");
    private final static QName _AddrTypCNT_QNAME = new QName("urn:ehd/001", "CNT");
    private final static QName _AddrTypCTY_QNAME = new QName("urn:ehd/001", "CTY");
    private final static QName _AddrTypADL_QNAME = new QName("urn:ehd/001", "ADL");
    private final static QName _AddrTypHNR_QNAME = new QName("urn:ehd/001", "HNR");
    private final static QName _PersonNameNmTypFAM_QNAME = new QName("urn:ehd/001", "FAM");
    private final static QName _PersonNameNmTypPFX_QNAME = new QName("urn:ehd/001", "PFX");
    private final static QName _PersonNameNmTypSFX_QNAME = new QName("urn:ehd/001", "SFX");
    private final static QName _PersonNameNmTypGIV_QNAME = new QName("urn:ehd/001", "GIV");
    private final static QName _PersonNameNmTypMID_QNAME = new QName("urn:ehd/001", "MID");
    private final static QName _PersonNameNmTypDEL_QNAME = new QName("urn:ehd/001", "DEL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ops
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Opscode }
     * 
     */
    public Opscode createOpscode() {
        return new Opscode();
    }

    /**
     * Create an instance of {@link VersionNbrTyp }
     * 
     */
    public VersionNbrTyp createVersionNbrTyp() {
        return new VersionNbrTyp();
    }

    /**
     * Create an instance of {@link TransltnTyp }
     * 
     */
    public TransltnTyp createTransltnTyp() {
        return new TransltnTyp();
    }

    /**
     * Create an instance of {@link IntendedRecipientTyp }
     * 
     */
    public IntendedRecipientTyp createIntendedRecipientTyp() {
        return new IntendedRecipientTyp();
    }

    /**
     * Create an instance of {@link RelatedDocumentTyp }
     * 
     */
    public RelatedDocumentTyp createRelatedDocumentTyp() {
        return new RelatedDocumentTyp();
    }

    /**
     * Create an instance of {@link DocumentTypeCdTyp }
     * 
     */
    public DocumentTypeCdTyp createDocumentTypeCdTyp() {
        return new DocumentTypeCdTyp();
    }

    /**
     * Create an instance of {@link KeytabTyp }
     * 
     */
    public KeytabTyp createKeytabTyp() {
        return new KeytabTyp();
    }

    /**
     * Create an instance of {@link OriginatorTyp }
     * 
     */
    public OriginatorTyp createOriginatorTyp() {
        return new OriginatorTyp();
    }

    /**
     * Create an instance of {@link InterfaceTyp }
     * 
     */
    public InterfaceTyp createInterfaceTyp() {
        return new InterfaceTyp();
    }

    /**
     * Create an instance of {@link VSStringTyp }
     * 
     */
    public VSStringTyp createVSStringTyp() {
        return new VSStringTyp();
    }

    /**
     * Create an instance of {@link OriginationDttmTyp }
     * 
     */
    public OriginationDttmTyp createOriginationDttmTyp() {
        return new OriginationDttmTyp();
    }

    /**
     * Create an instance of {@link FunctionCdTyp }
     * 
     */
    public FunctionCdTyp createFunctionCdTyp() {
        return new FunctionCdTyp();
    }

    /**
     * Create an instance of {@link ProviderTyp }
     * 
     */
    public ProviderTyp createProviderTyp() {
        return new ProviderTyp();
    }

    /**
     * Create an instance of {@link PatientTyp }
     * 
     */
    public PatientTyp createPatientTyp() {
        return new PatientTyp();
    }

    /**
     * Create an instance of {@link FkeyTyp }
     * 
     */
    public FkeyTyp createFkeyTyp() {
        return new FkeyTyp();
    }

    /**
     * Create an instance of {@link ScopeTyp }
     * 
     */
    public ScopeTyp createScopeTyp() {
        return new ScopeTyp();
    }

    /**
     * Create an instance of {@link IdTyp }
     * 
     */
    public IdTyp createIdTyp() {
        return new IdTyp();
    }

    /**
     * Create an instance of {@link VStringTyp }
     * 
     */
    public VStringTyp createVStringTyp() {
        return new VStringTyp();
    }

    /**
     * Create an instance of {@link ServiceTmrTyp }
     * 
     */
    public ServiceTmrTyp createServiceTmrTyp() {
        return new ServiceTmrTyp();
    }

    /**
     * Create an instance of {@link StateTyp }
     * 
     */
    public StateTyp createStateTyp() {
        return new StateTyp();
    }

    /**
     * Create an instance of {@link AddrTyp }
     * 
     */
    public AddrTyp createAddrTyp() {
        return new AddrTyp();
    }

    /**
     * Create an instance of {@link Key }
     * 
     */
    public Key createKey() {
        return new Key();
    }

    /**
     * Create an instance of {@link KeyTyp }
     * 
     */
    public KeyTyp createKeyTyp() {
        return new KeyTyp();
    }

    /**
     * Create an instance of {@link GroupTyp }
     * 
     */
    public GroupTyp createGroupTyp() {
        return new GroupTyp();
    }

    /**
     * Create an instance of {@link OpsRootTyp }
     * 
     */
    public OpsRootTyp createOpsRootTyp() {
        return new OpsRootTyp();
    }

    /**
     * Create an instance of {@link VZeitraumTyp }
     * 
     */
    public VZeitraumTyp createVZeitraumTyp() {
        return new VZeitraumTyp();
    }

    /**
     * Create an instance of {@link PersonNameTyp }
     * 
     */
    public PersonNameTyp createPersonNameTyp() {
        return new PersonNameTyp();
    }

    /**
     * Create an instance of {@link KeytabsTyp }
     * 
     */
    public KeytabsTyp createKeytabsTyp() {
        return new KeytabsTyp();
    }

    /**
     * Create an instance of {@link LocalHeaderContModel }
     * 
     */
    public LocalHeaderContModel createLocalHeaderContModel() {
        return new LocalHeaderContModel();
    }

    /**
     * Create an instance of {@link PersonTyp }
     * 
     */
    public PersonTyp createPersonTyp() {
        return new PersonTyp();
    }

    /**
     * Create an instance of {@link OrganizationTyp }
     * 
     */
    public OrganizationTyp createOrganizationTyp() {
        return new OrganizationTyp();
    }

    /**
     * Create an instance of {@link SdopsHeaderTyp }
     * 
     */
    public SdopsHeaderTyp createSdopsHeaderTyp() {
        return new SdopsHeaderTyp();
    }

    /**
     * Create an instance of {@link DocumentRelationshipTyp }
     * 
     */
    public DocumentRelationshipTyp createDocumentRelationshipTyp() {
        return new DocumentRelationshipTyp();
    }

    /**
     * Create an instance of {@link DescriptionTyp }
     * 
     */
    public DescriptionTyp createDescriptionTyp() {
        return new DescriptionTyp();
    }

    /**
     * Create an instance of {@link IntendedRecipientTypeCdTyp }
     * 
     */
    public IntendedRecipientTypeCdTyp createIntendedRecipientTypeCdTyp() {
        return new IntendedRecipientTypeCdTyp();
    }

    /**
     * Create an instance of {@link ScopeTypeCdTyp }
     * 
     */
    public ScopeTypeCdTyp createScopeTypeCdTyp() {
        return new ScopeTypeCdTyp();
    }

    /**
     * Create an instance of {@link ScopeIdTyp }
     * 
     */
    public ScopeIdTyp createScopeIdTyp() {
        return new ScopeIdTyp();
    }

    /**
     * Create an instance of {@link InterfaceNmTyp }
     * 
     */
    public InterfaceNmTyp createInterfaceNmTyp() {
        return new InterfaceNmTyp();
    }

    /**
     * Create an instance of {@link EhdRootTyp }
     * 
     */
    public EhdRootTyp createEhdRootTyp() {
        return new EhdRootTyp();
    }

    /**
     * Create an instance of {@link VDateTyp }
     * 
     */
    public VDateTyp createVDateTyp() {
        return new VDateTyp();
    }

    /**
     * Create an instance of {@link DocumentRelationshipTypeCdTyp }
     * 
     */
    public DocumentRelationshipTypeCdTyp createDocumentRelationshipTypeCdTyp() {
        return new DocumentRelationshipTypeCdTyp();
    }

    /**
     * Create an instance of {@link OriginatorTypeCdTyp }
     * 
     */
    public OriginatorTypeCdTyp createOriginatorTypeCdTyp() {
        return new OriginatorTypeCdTyp();
    }

    /**
     * Create an instance of {@link PnxpStringTyp }
     * 
     */
    public PnxpStringTyp createPnxpStringTyp() {
        return new PnxpStringTyp();
    }

    /**
     * Create an instance of {@link EhdHeaderTyp }
     * 
     */
    public EhdHeaderTyp createEhdHeaderTyp() {
        return new EhdHeaderTyp();
    }

    /**
     * Create an instance of {@link EhdBodyTyp }
     * 
     */
    public EhdBodyTyp createEhdBodyTyp() {
        return new EhdBodyTyp();
    }

    /**
     * Create an instance of {@link InterfaceIdTyp }
     * 
     */
    public InterfaceIdTyp createInterfaceIdTyp() {
        return new InterfaceIdTyp();
    }

    /**
     * Create an instance of {@link ProviderTypeCdTyp }
     * 
     */
    public ProviderTypeCdTyp createProviderTypeCdTyp() {
        return new ProviderTypeCdTyp();
    }

    /**
     * Create an instance of {@link SdopsBodyTyp }
     * 
     */
    public SdopsBodyTyp createSdopsBodyTyp() {
        return new SdopsBodyTyp();
    }

    /**
     * Create an instance of {@link PersonNameNmTyp }
     * 
     */
    public PersonNameNmTyp createPersonNameNmTyp() {
        return new PersonNameNmTyp();
    }

    /**
     * Create an instance of {@link InterfaceVersionTyp }
     * 
     */
    public InterfaceVersionTyp createInterfaceVersionTyp() {
        return new InterfaceVersionTyp();
    }

    /**
     * Create an instance of {@link DocIdTyp }
     * 
     */
    public DocIdTyp createDocIdTyp() {
        return new DocIdTyp();
    }

    /**
     * Create an instance of {@link OpscodeListe }
     * 
     */
    public OpscodeListe createOpscodeListe() {
        return new OpscodeListe();
    }

    /**
     * Create an instance of {@link Opscode.Gueltigkeit }
     * 
     */
    public Opscode.Gueltigkeit createOpscodeGueltigkeit() {
        return new Opscode.Gueltigkeit();
    }

    /**
     * Create an instance of {@link Opscode.Kzmedbegruendung }
     * 
     */
    public Opscode.Kzmedbegruendung createOpscodeKzmedbegruendung() {
        return new Opscode.Kzmedbegruendung();
    }

    /**
     * Create an instance of {@link Opscode.Kzseite }
     * 
     */
    public Opscode.Kzseite createOpscodeKzseite() {
        return new Opscode.Kzseite();
    }

    /**
     * Create an instance of {@link Opscode.Kz115B }
     * 
     */
    public Opscode.Kz115B createOpscodeKz115B() {
        return new Opscode.Kz115B();
    }

    /**
     * Create an instance of {@link Opscode.Kz115BInfo }
     * 
     */
    public Opscode.Kz115BInfo createOpscodeKz115BInfo() {
        return new Opscode.Kz115BInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalHeaderContModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "local_header")
    public JAXBElement<LocalHeaderContModel> createLocalHeader(LocalHeaderContModel value) {
        return new JAXBElement<LocalHeaderContModel>(_LocalHeader_QNAME, LocalHeaderContModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "person")
    public JAXBElement<PersonTyp> createPerson(PersonTyp value) {
        return new JAXBElement<PersonTyp>(_Person_QNAME, PersonTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "organization")
    public JAXBElement<OrganizationTyp> createOrganization(OrganizationTyp value) {
        return new JAXBElement<OrganizationTyp>(_Organization_QNAME, OrganizationTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdopsHeaderTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "header")
    public JAXBElement<SdopsHeaderTyp> createHeader(SdopsHeaderTyp value) {
        return new JAXBElement<SdopsHeaderTyp>(_Header_QNAME, SdopsHeaderTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentRelationshipTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "document_relationship")
    public JAXBElement<DocumentRelationshipTyp> createDocumentRelationship(DocumentRelationshipTyp value) {
        return new JAXBElement<DocumentRelationshipTyp>(_DocumentRelationship_QNAME, DocumentRelationshipTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpsRootTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "ehd")
    public JAXBElement<OpsRootTyp> createEhd(OpsRootTyp value) {
        return new JAXBElement<OpsRootTyp>(_Ehd_QNAME, OpsRootTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VZeitraumTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "participation_tmr")
    public JAXBElement<VZeitraumTyp> createParticipationTmr(VZeitraumTyp value) {
        return new JAXBElement<VZeitraumTyp>(_ParticipationTmr_QNAME, VZeitraumTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "person_name")
    public JAXBElement<PersonNameTyp> createPersonName(PersonNameTyp value) {
        return new JAXBElement<PersonNameTyp>(_PersonName_QNAME, PersonNameTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeytabsTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "keytabs")
    public JAXBElement<KeytabsTyp> createKeytabs(KeytabsTyp value) {
        return new JAXBElement<KeytabsTyp>(_Keytabs_QNAME, KeytabsTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginationDttmTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "origination_dttm")
    public JAXBElement<OriginationDttmTyp> createOriginationDttm(OriginationDttmTyp value) {
        return new JAXBElement<OriginationDttmTyp>(_OriginationDttm_QNAME, OriginationDttmTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionCdTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "function_cd")
    public JAXBElement<FunctionCdTyp> createFunctionCd(FunctionCdTyp value) {
        return new JAXBElement<FunctionCdTyp>(_FunctionCd_QNAME, FunctionCdTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "provider")
    public JAXBElement<ProviderTyp> createProvider(ProviderTyp value) {
        return new JAXBElement<ProviderTyp>(_Provider_QNAME, ProviderTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatientTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "patient")
    public JAXBElement<PatientTyp> createPatient(PatientTyp value) {
        return new JAXBElement<PatientTyp>(_Patient_QNAME, PatientTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FkeyTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "fkey")
    public JAXBElement<FkeyTyp> createFkey(FkeyTyp value) {
        return new JAXBElement<FkeyTyp>(_Fkey_QNAME, FkeyTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScopeTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "scope")
    public JAXBElement<ScopeTyp> createScope(ScopeTyp value) {
        return new JAXBElement<ScopeTyp>(_Scope_QNAME, ScopeTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "set_id")
    public JAXBElement<IdTyp> createSetId(IdTyp value) {
        return new JAXBElement<IdTyp>(_SetId_QNAME, IdTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "telecom")
    public JAXBElement<VStringTyp> createTelecom(VStringTyp value) {
        return new JAXBElement<VStringTyp>(_Telecom_QNAME, VStringTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "id")
    public JAXBElement<IdTyp> createId(IdTyp value) {
        return new JAXBElement<IdTyp>(_Id_QNAME, IdTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTmrTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "service_tmr")
    public JAXBElement<ServiceTmrTyp> createServiceTmr(ServiceTmrTyp value) {
        return new JAXBElement<ServiceTmrTyp>(_ServiceTmr_QNAME, ServiceTmrTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "state")
    public JAXBElement<StateTyp> createState(StateTyp value) {
        return new JAXBElement<StateTyp>(_State_QNAME, StateTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddrTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "addr")
    public JAXBElement<AddrTyp> createAddr(AddrTyp value) {
        return new JAXBElement<AddrTyp>(_Addr_QNAME, AddrTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "group")
    public JAXBElement<GroupTyp> createGroup(GroupTyp value) {
        return new JAXBElement<GroupTyp>(_Group_QNAME, GroupTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionNbrTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "version_nbr")
    public JAXBElement<VersionNbrTyp> createVersionNbr(VersionNbrTyp value) {
        return new JAXBElement<VersionNbrTyp>(_VersionNbr_QNAME, VersionNbrTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransltnTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "TRANSLTN")
    public JAXBElement<TransltnTyp> createTRANSLTN(TransltnTyp value) {
        return new JAXBElement<TransltnTyp>(_TRANSLTN_QNAME, TransltnTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntendedRecipientTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "intended_recipient")
    public JAXBElement<IntendedRecipientTyp> createIntendedRecipient(IntendedRecipientTyp value) {
        return new JAXBElement<IntendedRecipientTyp>(_IntendedRecipient_QNAME, IntendedRecipientTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedDocumentTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "related_document")
    public JAXBElement<RelatedDocumentTyp> createRelatedDocument(RelatedDocumentTyp value) {
        return new JAXBElement<RelatedDocumentTyp>(_RelatedDocument_QNAME, RelatedDocumentTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentTypeCdTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "document_type_cd")
    public JAXBElement<DocumentTypeCdTyp> createDocumentTypeCd(DocumentTypeCdTyp value) {
        return new JAXBElement<DocumentTypeCdTyp>(_DocumentTypeCd_QNAME, DocumentTypeCdTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeytabTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "keytab")
    public JAXBElement<KeytabTyp> createKeytab(KeytabTyp value) {
        return new JAXBElement<KeytabTyp>(_Keytab_QNAME, KeytabTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginatorTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "originator")
    public JAXBElement<OriginatorTyp> createOriginator(OriginatorTyp value) {
        return new JAXBElement<OriginatorTyp>(_Originator_QNAME, OriginatorTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "interface")
    public JAXBElement<InterfaceTyp> createInterface(InterfaceTyp value) {
        return new JAXBElement<InterfaceTyp>(_Interface_QNAME, InterfaceTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VSStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "group.type_cd")
    public JAXBElement<VSStringTyp> createGroupTypeCd(VSStringTyp value) {
        return new JAXBElement<VSStringTyp>(_GroupTypeCd_QNAME, VSStringTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "STR", scope = AddrTyp.class)
    public JAXBElement<VStringTyp> createAddrTypSTR(VStringTyp value) {
        return new JAXBElement<VStringTyp>(_AddrTypSTR_QNAME, VStringTyp.class, AddrTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "ZIP", scope = AddrTyp.class)
    public JAXBElement<VStringTyp> createAddrTypZIP(VStringTyp value) {
        return new JAXBElement<VStringTyp>(_AddrTypZIP_QNAME, VStringTyp.class, AddrTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "STA", scope = AddrTyp.class)
    public JAXBElement<VStringTyp> createAddrTypSTA(VStringTyp value) {
        return new JAXBElement<VStringTyp>(_AddrTypSTA_QNAME, VStringTyp.class, AddrTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "POB", scope = AddrTyp.class)
    public JAXBElement<VStringTyp> createAddrTypPOB(VStringTyp value) {
        return new JAXBElement<VStringTyp>(_AddrTypPOB_QNAME, VStringTyp.class, AddrTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "CNT", scope = AddrTyp.class)
    public JAXBElement<VStringTyp> createAddrTypCNT(VStringTyp value) {
        return new JAXBElement<VStringTyp>(_AddrTypCNT_QNAME, VStringTyp.class, AddrTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "CTY", scope = AddrTyp.class)
    public JAXBElement<VStringTyp> createAddrTypCTY(VStringTyp value) {
        return new JAXBElement<VStringTyp>(_AddrTypCTY_QNAME, VStringTyp.class, AddrTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "ADL", scope = AddrTyp.class)
    public JAXBElement<VStringTyp> createAddrTypADL(VStringTyp value) {
        return new JAXBElement<VStringTyp>(_AddrTypADL_QNAME, VStringTyp.class, AddrTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "HNR", scope = AddrTyp.class)
    public JAXBElement<VStringTyp> createAddrTypHNR(VStringTyp value) {
        return new JAXBElement<VStringTyp>(_AddrTypHNR_QNAME, VStringTyp.class, AddrTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "FAM", scope = PersonNameNmTyp.class)
    public JAXBElement<PnxpStringTyp> createPersonNameNmTypFAM(PnxpStringTyp value) {
        return new JAXBElement<PnxpStringTyp>(_PersonNameNmTypFAM_QNAME, PnxpStringTyp.class, PersonNameNmTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "PFX", scope = PersonNameNmTyp.class)
    public JAXBElement<PnxpStringTyp> createPersonNameNmTypPFX(PnxpStringTyp value) {
        return new JAXBElement<PnxpStringTyp>(_PersonNameNmTypPFX_QNAME, PnxpStringTyp.class, PersonNameNmTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "SFX", scope = PersonNameNmTyp.class)
    public JAXBElement<PnxpStringTyp> createPersonNameNmTypSFX(PnxpStringTyp value) {
        return new JAXBElement<PnxpStringTyp>(_PersonNameNmTypSFX_QNAME, PnxpStringTyp.class, PersonNameNmTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "GIV", scope = PersonNameNmTyp.class)
    public JAXBElement<PnxpStringTyp> createPersonNameNmTypGIV(PnxpStringTyp value) {
        return new JAXBElement<PnxpStringTyp>(_PersonNameNmTypGIV_QNAME, PnxpStringTyp.class, PersonNameNmTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "MID", scope = PersonNameNmTyp.class)
    public JAXBElement<PnxpStringTyp> createPersonNameNmTypMID(PnxpStringTyp value) {
        return new JAXBElement<PnxpStringTyp>(_PersonNameNmTypMID_QNAME, PnxpStringTyp.class, PersonNameNmTyp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnxpStringTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ehd/001", name = "DEL", scope = PersonNameNmTyp.class)
    public JAXBElement<PnxpStringTyp> createPersonNameNmTypDEL(PnxpStringTyp value) {
        return new JAXBElement<PnxpStringTyp>(_PersonNameNmTypDEL_QNAME, PnxpStringTyp.class, PersonNameNmTyp.class, value);
    }

}
