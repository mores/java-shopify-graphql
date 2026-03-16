package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Basic events chronicle resource activities such as the creation of an article, the fulfillment of an order, or
 * the addition of a product.
 *
 * ### General events
 *
 * | Action | Description  |
 * |---|---|
 * | `create` | The item was created. |
 * | `destroy` | The item was destroyed. |
 * | `published` | The item was published. |
 * | `unpublished` | The item was unpublished. |
 * | `update` | The item was updated.  |
 *
 * ### Order events
 *
 * Order events can be divided into the following categories:
 *
 * - *Authorization*: Includes whether the authorization succeeded, failed, or is pending.
 * - *Capture*: Includes whether the capture succeeded, failed, or is pending.
 * - *Email*: Includes confirmation or cancellation of the order, as well as shipping.
 * - *Fulfillment*: Includes whether the fulfillment succeeded, failed, or is
 * pending. Also includes cancellation, restocking, and fulfillment updates.
 * - *Order*: Includess the placement, confirmation, closing, re-opening, and cancellation of the order.
 * - *Refund*: Includes whether the refund succeeded, failed, or is pending.
 * - *Sale*: Includes whether the sale succeeded, failed, or is pending.
 * - *Void*: Includes whether the void succeeded, failed, or is pending.
 *
 * | Action  | Message  | Description  |
 * |---|---|---|
 * | `authorization_failure` | The customer, unsuccessfully, tried to authorize:
 * `{money_amount}`. | Authorization failed. The funds cannot be captured. |
 * | `authorization_pending` | Authorization for `{money_amount}` is pending. | Authorization pending. |
 * | `authorization_success` | The customer successfully authorized us to capture:
 * `{money_amount}`. | Authorization was successful and the funds are available for capture. |
 * | `cancelled` | Order was cancelled by `{shop_staff_name}`. | The order was cancelled. |
 * | `capture_failure` | We failed to capture: `{money_amount}`. | The capture
 * failed. The funds cannot be transferred to the shop. |
 * | `capture_pending` | Capture for `{money_amount}` is pending. | The capture is
 * in process. The funds are not yet available to the shop. |
 * | `capture_success` | We successfully captured: `{money_amount}` | The capture
 * was successful and the funds are now available to the shop. |
 * | `closed` | Order was closed. | The order was closed. |
 * | `confirmed` | Received a new order: `{order_number}` by `{customer_name}`. | The order was confirmed. |
 * | `fulfillment_cancelled` | We cancelled `{number_of_line_items}` from being
 * fulfilled by the third party fulfillment service. | Fulfillment for one or more
 * of the line_items failed. |
 * | `fulfillment_pending` | We submitted `{number_of_line_items}` to the third
 * party service. | One or more of the line_items has been assigned to a third
 * party service for fulfillment. |
 * | `fulfillment_success` | We successfully fulfilled line_items. | Fulfillment was successful for one or more line_items. |
 * | `mail_sent` | `{message_type}` email was sent to the customer. | An email was sent to the customer. |
 * | `placed` | Order was placed. | An order was placed by the customer. |
 * | `re_opened` | Order was re-opened. | An order was re-opened. |
 * | `refund_failure` | We failed to refund `{money_amount}`. | The refund failed. The funds are still with the shop. |
 * | `refund_pending` | Refund of `{money_amount}` is still pending. | The refund
 * is in process. The funds are still with shop. |
 * | `refund_success` | We successfully refunded `{money_amount}`. | The refund was
 * successful. The funds have been transferred to the customer. |
 * | `restock_line_items` | We restocked `{number_of_line_items}`. |	One or more of
 * the order's line items have been restocked. |
 * | `sale_failure` | The customer failed to pay `{money_amount}`. | The sale
 * failed. The funds are not available to the shop. |
 * | `sale_pending` | The `{money_amount}` is pending. | The sale is in process. The funds are not yet available to the shop. |
 * | `sale_success` | We successfully captured `{money_amount}`. | The sale was successful. The funds are now with the shop. |
 * | `update` | `{order_number}` was updated. | The order was updated. |
 * | `void_failure` | We failed to void the authorization. | Voiding the
 * authorization failed. The authorization is still valid. |
 * | `void_pending` | Authorization void is pending. | Voiding the authorization is
 * in process. The authorization is still valid. |
 * | `void_success` | We successfully voided the authorization. | Voiding the
 * authorization was successful. The authorization is no longer valid. |
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class BasicEvent implements com.shopify.admin.types.Event, com.shopify.admin.types.Node {
  /**
   * The action that occured.
   */
  private String action;

  /**
   * Provides additional content for collapsible timeline events.
   */
  private String additionalContent;

  /**
   * Provides additional data for event consumers.
   */
  private String additionalData;

  /**
   * The name of the app that created the event.
   */
  private String appTitle;

  /**
   * Refers to a certain event and its resources.
   */
  private String arguments;

  /**
   * Whether the event was created by an app.
   */
  private boolean attributeToApp;

  /**
   * Whether the event was caused by an admin user.
   */
  private boolean attributeToUser;

  /**
   * The entity which performed the action that generated the event.
   */
  private String author;

  /**
   * The date and time when the event was created.
   */
  private OffsetDateTime createdAt;

  /**
   * Whether the event is critical.
   */
  private boolean criticalAlert;

  /**
   * Whether this event has additional content.
   */
  private boolean hasAdditionalContent;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Human readable text that describes the event.
   */
  private String message;

  /**
   * Human readable text that supports the event message.
   */
  private String secondaryMessage;

  /**
   * The resource that generated the event. To see a list of possible types,
   * refer to [HasEvents](https://shopify.dev/docs/api/admin-graphql/unstable/interfaces/HasEvents#implemented-in).
   */
  private HasEvents subject;

  /**
   * The ID of the resource that generated the event.
   */
  private String subjectId;

  /**
   * The type of the resource that generated the event.
   */
  private EventSubjectType subjectType;

  public BasicEvent() {
  }

  /**
   * The action that occured.
   */
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Provides additional content for collapsible timeline events.
   */
  public String getAdditionalContent() {
    return additionalContent;
  }

  public void setAdditionalContent(String additionalContent) {
    this.additionalContent = additionalContent;
  }

  /**
   * Provides additional data for event consumers.
   */
  public String getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(String additionalData) {
    this.additionalData = additionalData;
  }

  /**
   * The name of the app that created the event.
   */
  public String getAppTitle() {
    return appTitle;
  }

  public void setAppTitle(String appTitle) {
    this.appTitle = appTitle;
  }

  /**
   * Refers to a certain event and its resources.
   */
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  /**
   * Whether the event was created by an app.
   */
  public boolean getAttributeToApp() {
    return attributeToApp;
  }

  public void setAttributeToApp(boolean attributeToApp) {
    this.attributeToApp = attributeToApp;
  }

  /**
   * Whether the event was caused by an admin user.
   */
  public boolean getAttributeToUser() {
    return attributeToUser;
  }

  public void setAttributeToUser(boolean attributeToUser) {
    this.attributeToUser = attributeToUser;
  }

  /**
   * The entity which performed the action that generated the event.
   */
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * The date and time when the event was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Whether the event is critical.
   */
  public boolean getCriticalAlert() {
    return criticalAlert;
  }

  public void setCriticalAlert(boolean criticalAlert) {
    this.criticalAlert = criticalAlert;
  }

  /**
   * Whether this event has additional content.
   */
  public boolean getHasAdditionalContent() {
    return hasAdditionalContent;
  }

  public void setHasAdditionalContent(boolean hasAdditionalContent) {
    this.hasAdditionalContent = hasAdditionalContent;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Human readable text that describes the event.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Human readable text that supports the event message.
   */
  public String getSecondaryMessage() {
    return secondaryMessage;
  }

  public void setSecondaryMessage(String secondaryMessage) {
    this.secondaryMessage = secondaryMessage;
  }

  /**
   * The resource that generated the event. To see a list of possible types,
   * refer to [HasEvents](https://shopify.dev/docs/api/admin-graphql/unstable/interfaces/HasEvents#implemented-in).
   */
  public HasEvents getSubject() {
    return subject;
  }

  public void setSubject(HasEvents subject) {
    this.subject = subject;
  }

  /**
   * The ID of the resource that generated the event.
   */
  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  /**
   * The type of the resource that generated the event.
   */
  public EventSubjectType getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(EventSubjectType subjectType) {
    this.subjectType = subjectType;
  }

  @Override
  public String toString() {
    return "BasicEvent{action='" + action + "', additionalContent='" + additionalContent + "', additionalData='" + additionalData + "', appTitle='" + appTitle + "', arguments='" + arguments + "', attributeToApp='" + attributeToApp + "', attributeToUser='" + attributeToUser + "', author='" + author + "', createdAt='" + createdAt + "', criticalAlert='" + criticalAlert + "', hasAdditionalContent='" + hasAdditionalContent + "', id='" + id + "', message='" + message + "', secondaryMessage='" + secondaryMessage + "', subject='" + subject + "', subjectId='" + subjectId + "', subjectType='" + subjectType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BasicEvent that = (BasicEvent) o;
    return Objects.equals(action, that.action) &&
        Objects.equals(additionalContent, that.additionalContent) &&
        Objects.equals(additionalData, that.additionalData) &&
        Objects.equals(appTitle, that.appTitle) &&
        Objects.equals(arguments, that.arguments) &&
        attributeToApp == that.attributeToApp &&
        attributeToUser == that.attributeToUser &&
        Objects.equals(author, that.author) &&
        Objects.equals(createdAt, that.createdAt) &&
        criticalAlert == that.criticalAlert &&
        hasAdditionalContent == that.hasAdditionalContent &&
        Objects.equals(id, that.id) &&
        Objects.equals(message, that.message) &&
        Objects.equals(secondaryMessage, that.secondaryMessage) &&
        Objects.equals(subject, that.subject) &&
        Objects.equals(subjectId, that.subjectId) &&
        Objects.equals(subjectType, that.subjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, additionalContent, additionalData, appTitle, arguments, attributeToApp, attributeToUser, author, createdAt, criticalAlert, hasAdditionalContent, id, message, secondaryMessage, subject, subjectId, subjectType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The action that occured.
     */
    private String action;

    /**
     * Provides additional content for collapsible timeline events.
     */
    private String additionalContent;

    /**
     * Provides additional data for event consumers.
     */
    private String additionalData;

    /**
     * The name of the app that created the event.
     */
    private String appTitle;

    /**
     * Refers to a certain event and its resources.
     */
    private String arguments;

    /**
     * Whether the event was created by an app.
     */
    private boolean attributeToApp;

    /**
     * Whether the event was caused by an admin user.
     */
    private boolean attributeToUser;

    /**
     * The entity which performed the action that generated the event.
     */
    private String author;

    /**
     * The date and time when the event was created.
     */
    private OffsetDateTime createdAt;

    /**
     * Whether the event is critical.
     */
    private boolean criticalAlert;

    /**
     * Whether this event has additional content.
     */
    private boolean hasAdditionalContent;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Human readable text that describes the event.
     */
    private String message;

    /**
     * Human readable text that supports the event message.
     */
    private String secondaryMessage;

    /**
     * The resource that generated the event. To see a list of possible types,
     * refer to [HasEvents](https://shopify.dev/docs/api/admin-graphql/unstable/interfaces/HasEvents#implemented-in).
     */
    private HasEvents subject;

    /**
     * The ID of the resource that generated the event.
     */
    private String subjectId;

    /**
     * The type of the resource that generated the event.
     */
    private EventSubjectType subjectType;

    public BasicEvent build() {
      BasicEvent result = new BasicEvent();
      result.action = this.action;
      result.additionalContent = this.additionalContent;
      result.additionalData = this.additionalData;
      result.appTitle = this.appTitle;
      result.arguments = this.arguments;
      result.attributeToApp = this.attributeToApp;
      result.attributeToUser = this.attributeToUser;
      result.author = this.author;
      result.createdAt = this.createdAt;
      result.criticalAlert = this.criticalAlert;
      result.hasAdditionalContent = this.hasAdditionalContent;
      result.id = this.id;
      result.message = this.message;
      result.secondaryMessage = this.secondaryMessage;
      result.subject = this.subject;
      result.subjectId = this.subjectId;
      result.subjectType = this.subjectType;
      return result;
    }

    /**
     * The action that occured.
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Provides additional content for collapsible timeline events.
     */
    public Builder additionalContent(String additionalContent) {
      this.additionalContent = additionalContent;
      return this;
    }

    /**
     * Provides additional data for event consumers.
     */
    public Builder additionalData(String additionalData) {
      this.additionalData = additionalData;
      return this;
    }

    /**
     * The name of the app that created the event.
     */
    public Builder appTitle(String appTitle) {
      this.appTitle = appTitle;
      return this;
    }

    /**
     * Refers to a certain event and its resources.
     */
    public Builder arguments(String arguments) {
      this.arguments = arguments;
      return this;
    }

    /**
     * Whether the event was created by an app.
     */
    public Builder attributeToApp(boolean attributeToApp) {
      this.attributeToApp = attributeToApp;
      return this;
    }

    /**
     * Whether the event was caused by an admin user.
     */
    public Builder attributeToUser(boolean attributeToUser) {
      this.attributeToUser = attributeToUser;
      return this;
    }

    /**
     * The entity which performed the action that generated the event.
     */
    public Builder author(String author) {
      this.author = author;
      return this;
    }

    /**
     * The date and time when the event was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Whether the event is critical.
     */
    public Builder criticalAlert(boolean criticalAlert) {
      this.criticalAlert = criticalAlert;
      return this;
    }

    /**
     * Whether this event has additional content.
     */
    public Builder hasAdditionalContent(boolean hasAdditionalContent) {
      this.hasAdditionalContent = hasAdditionalContent;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Human readable text that describes the event.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * Human readable text that supports the event message.
     */
    public Builder secondaryMessage(String secondaryMessage) {
      this.secondaryMessage = secondaryMessage;
      return this;
    }

    /**
     * The resource that generated the event. To see a list of possible types,
     * refer to [HasEvents](https://shopify.dev/docs/api/admin-graphql/unstable/interfaces/HasEvents#implemented-in).
     */
    public Builder subject(HasEvents subject) {
      this.subject = subject;
      return this;
    }

    /**
     * The ID of the resource that generated the event.
     */
    public Builder subjectId(String subjectId) {
      this.subjectId = subjectId;
      return this;
    }

    /**
     * The type of the resource that generated the event.
     */
    public Builder subjectType(EventSubjectType subjectType) {
      this.subjectType = subjectType;
      return this;
    }
  }
}
