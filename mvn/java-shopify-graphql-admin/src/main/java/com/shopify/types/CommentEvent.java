package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CommentEvent implements com.shopify.types.Event, com.shopify.types.Node {
  
  private String action;

  
  private String appTitle;

  
  private List<CommentEventAttachment> attachments;

  
  private boolean attributeToApp;

  
  private boolean attributeToUser;

  /**
   * The name of the user that authored the comment event.
   */
  private StaffMember author;

  
  private boolean canDelete;

  
  private boolean canEdit;

  
  private OffsetDateTime createdAt;

  
  private boolean criticalAlert;

  
  private boolean edited;

  
  private CommentEventEmbed embed;

  
  private String id;

  
  private String message;

  
  private String rawMessage;

  
  private CommentEventSubject subject;

  public CommentEvent() {
  }

  
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  
  public String getAppTitle() {
    return appTitle;
  }

  public void setAppTitle(String appTitle) {
    this.appTitle = appTitle;
  }

  
  public List<CommentEventAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<CommentEventAttachment> attachments) {
    this.attachments = attachments;
  }

  
  public boolean getAttributeToApp() {
    return attributeToApp;
  }

  public void setAttributeToApp(boolean attributeToApp) {
    this.attributeToApp = attributeToApp;
  }

  
  public boolean getAttributeToUser() {
    return attributeToUser;
  }

  public void setAttributeToUser(boolean attributeToUser) {
    this.attributeToUser = attributeToUser;
  }

  /**
   * The name of the user that authored the comment event.
   */
  public StaffMember getAuthor() {
    return author;
  }

  public void setAuthor(StaffMember author) {
    this.author = author;
  }

  
  public boolean getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(boolean canDelete) {
    this.canDelete = canDelete;
  }

  
  public boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(boolean canEdit) {
    this.canEdit = canEdit;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public boolean getCriticalAlert() {
    return criticalAlert;
  }

  public void setCriticalAlert(boolean criticalAlert) {
    this.criticalAlert = criticalAlert;
  }

  
  public boolean getEdited() {
    return edited;
  }

  public void setEdited(boolean edited) {
    this.edited = edited;
  }

  
  public CommentEventEmbed getEmbed() {
    return embed;
  }

  public void setEmbed(CommentEventEmbed embed) {
    this.embed = embed;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  
  public String getRawMessage() {
    return rawMessage;
  }

  public void setRawMessage(String rawMessage) {
    this.rawMessage = rawMessage;
  }

  
  public CommentEventSubject getSubject() {
    return subject;
  }

  public void setSubject(CommentEventSubject subject) {
    this.subject = subject;
  }

  @Override
  public String toString() {
    return "CommentEvent{action='" + action + "', appTitle='" + appTitle + "', attachments='" + attachments + "', attributeToApp='" + attributeToApp + "', attributeToUser='" + attributeToUser + "', author='" + author + "', canDelete='" + canDelete + "', canEdit='" + canEdit + "', createdAt='" + createdAt + "', criticalAlert='" + criticalAlert + "', edited='" + edited + "', embed='" + embed + "', id='" + id + "', message='" + message + "', rawMessage='" + rawMessage + "', subject='" + subject + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentEvent that = (CommentEvent) o;
    return Objects.equals(action, that.action) &&
        Objects.equals(appTitle, that.appTitle) &&
        Objects.equals(attachments, that.attachments) &&
        attributeToApp == that.attributeToApp &&
        attributeToUser == that.attributeToUser &&
        Objects.equals(author, that.author) &&
        canDelete == that.canDelete &&
        canEdit == that.canEdit &&
        Objects.equals(createdAt, that.createdAt) &&
        criticalAlert == that.criticalAlert &&
        edited == that.edited &&
        Objects.equals(embed, that.embed) &&
        Objects.equals(id, that.id) &&
        Objects.equals(message, that.message) &&
        Objects.equals(rawMessage, that.rawMessage) &&
        Objects.equals(subject, that.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, appTitle, attachments, attributeToApp, attributeToUser, author, canDelete, canEdit, createdAt, criticalAlert, edited, embed, id, message, rawMessage, subject);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String action;

    
    private String appTitle;

    
    private List<CommentEventAttachment> attachments;

    
    private boolean attributeToApp;

    
    private boolean attributeToUser;

    /**
     * The name of the user that authored the comment event.
     */
    private StaffMember author;

    
    private boolean canDelete;

    
    private boolean canEdit;

    
    private OffsetDateTime createdAt;

    
    private boolean criticalAlert;

    
    private boolean edited;

    
    private CommentEventEmbed embed;

    
    private String id;

    
    private String message;

    
    private String rawMessage;

    
    private CommentEventSubject subject;

    public CommentEvent build() {
      CommentEvent result = new CommentEvent();
      result.action = this.action;
      result.appTitle = this.appTitle;
      result.attachments = this.attachments;
      result.attributeToApp = this.attributeToApp;
      result.attributeToUser = this.attributeToUser;
      result.author = this.author;
      result.canDelete = this.canDelete;
      result.canEdit = this.canEdit;
      result.createdAt = this.createdAt;
      result.criticalAlert = this.criticalAlert;
      result.edited = this.edited;
      result.embed = this.embed;
      result.id = this.id;
      result.message = this.message;
      result.rawMessage = this.rawMessage;
      result.subject = this.subject;
      return result;
    }

    
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    
    public Builder appTitle(String appTitle) {
      this.appTitle = appTitle;
      return this;
    }

    
    public Builder attachments(List<CommentEventAttachment> attachments) {
      this.attachments = attachments;
      return this;
    }

    
    public Builder attributeToApp(boolean attributeToApp) {
      this.attributeToApp = attributeToApp;
      return this;
    }

    
    public Builder attributeToUser(boolean attributeToUser) {
      this.attributeToUser = attributeToUser;
      return this;
    }

    /**
     * The name of the user that authored the comment event.
     */
    public Builder author(StaffMember author) {
      this.author = author;
      return this;
    }

    
    public Builder canDelete(boolean canDelete) {
      this.canDelete = canDelete;
      return this;
    }

    
    public Builder canEdit(boolean canEdit) {
      this.canEdit = canEdit;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder criticalAlert(boolean criticalAlert) {
      this.criticalAlert = criticalAlert;
      return this;
    }

    
    public Builder edited(boolean edited) {
      this.edited = edited;
      return this;
    }

    
    public Builder embed(CommentEventEmbed embed) {
      this.embed = embed;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    
    public Builder rawMessage(String rawMessage) {
      this.rawMessage = rawMessage;
      return this;
    }

    
    public Builder subject(CommentEventSubject subject) {
      this.subject = subject;
      return this;
    }
  }
}
