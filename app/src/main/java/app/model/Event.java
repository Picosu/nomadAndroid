
package app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Event {

    @SerializedName("form")
    @Expose
    private String form;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("excerp")
    @Expose
    private String excerp;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = new ArrayList<Category>();
    @SerializedName("dateStart")
    @Expose
    private String dateStart;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("dateEnd")
    @Expose
    private String dateEnd;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("publishState")
    @Expose
    private String publishState;
    @SerializedName("medias")
    @Expose
    private List<Object> medias = new ArrayList<Object>();
    @SerializedName("linksToItem")
    @Expose
    private List<Object> linksToItem = new ArrayList<Object>();
    @SerializedName("payload_schema")
    @Expose
    private String payloadSchema;
    @SerializedName("payload")
    @Expose
    private Payload payload;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("appIds")
    @Expose
    private String appIds;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("entireDays")
    @Expose
    private Boolean entireDays;
    @SerializedName("publishDateStart")
    @Expose
    private String publishDateStart;
    @SerializedName("publishDateEnd")
    @Expose
    private String publishDateEnd;
    @SerializedName("parentsFixedAt")
    @Expose
    private String parentsFixedAt;
    @SerializedName("editor_access")
    @Expose
    private Boolean editorAccess;
    @SerializedName("id")
    @Expose
    private String id;

    /**
     * @return The form
     */
    public String getForm() {
        return form;
    }

    /**
     * @param form The form
     */
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * @return The createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy The createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return The excerp
     */
    public String getExcerp() {
        return createdBy;
    }

    /**
     * @param excerp The excerp
     */
    public void setExcerp(String excerp) {
        this.excerp = excerp;
    }
    /**
     * @return The owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner The owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return The categories
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * @param categories The categories
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     * @return The dateStart
     */
    public String getDateStart() {
        return dateStart;
    }

    /**
     * @param dateStart The dateStart
     */
    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The dateEnd
     */
    public String getDateEnd() {
        return dateEnd;
    }

    /**
     * @param dateEnd The dateEnd
     */
    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The publishState
     */
    public String getPublishState() {
        return publishState;
    }

    /**
     * @param publishState The publishState
     */
    public void setPublishState(String publishState) {
        this.publishState = publishState;
    }

    /**
     * @return The medias
     */
    public List<Object> getMedias() {
        return medias;
    }

    /**
     * @param medias The medias
     */
    public void setMedias(List<Object> medias) {
        this.medias = medias;
    }

    /**
     * @return The linksToItem
     */
    public List<Object> getLinksToItem() {
        return linksToItem;
    }

    /**
     * @param linksToItem The linksToItem
     */
    public void setLinksToItem(List<Object> linksToItem) {
        this.linksToItem = linksToItem;
    }

    /**
     * @return The payloadSchema
     */
    public String getPayloadSchema() {
        return payloadSchema;
    }

    /**
     * @param payloadSchema The payload_schema
     */
    public void setPayloadSchema(String payloadSchema) {
        this.payloadSchema = payloadSchema;
    }

    /**
     * @return The payload
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * @param payload The payload
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * @return The address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address The address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * @param slug The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updatedAt
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return The appIds
     */
    public String getAppIds() {
        return appIds;
    }

    /**
     * @param appIds The appIds
     */
    public void setAppIds(String appIds) {
        this.appIds = appIds;
    }

    /**
     * @return The content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return The entireDays
     */
    public Boolean getEntireDays() {
        return entireDays;
    }

    /**
     * @param entireDays The entireDays
     */
    public void setEntireDays(Boolean entireDays) {
        this.entireDays = entireDays;
    }

    /**
     * @return The publishDateStart
     */
    public String getPublishDateStart() {
        return publishDateStart;
    }

    /**
     * @param publishDateStart The publishDateStart
     */
    public void setPublishDateStart(String publishDateStart) {
        this.publishDateStart = publishDateStart;
    }

    /**
     * @return The publishDateEnd
     */
    public String getPublishDateEnd() {
        return publishDateEnd;
    }

    /**
     * @param publishDateEnd The publishDateEnd
     */
    public void setPublishDateEnd(String publishDateEnd) {
        this.publishDateEnd = publishDateEnd;
    }

    /**
     * @return The parentsFixedAt
     */
    public String getParentsFixedAt() {
        return parentsFixedAt;
    }

    /**
     * @param parentsFixedAt The parentsFixedAt
     */
    public void setParentsFixedAt(String parentsFixedAt) {
        this.parentsFixedAt = parentsFixedAt;
    }

    /**
     * @return The editorAccess
     */
    public Boolean getEditorAccess() {
        return editorAccess;
    }

    /**
     * @param editorAccess The editor_access
     */
    public void setEditorAccess(Boolean editorAccess) {
        this.editorAccess = editorAccess;
    }

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

}
