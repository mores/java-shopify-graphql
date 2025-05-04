package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;

/**
 * Events chronicle resource activities such as the creation of an article, the fulfillment of an order, or the
 * addition of a product.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = BasicEvent.class, name = "BasicEvent"),
    @JsonSubTypes.Type(value = CommentEvent.class, name = "CommentEvent")
})
public interface Event {
  /**
   * The action that occured.
   */
  String getAction();

  /**
   * The name of the app that created the event.
   */
  String getAppTitle();

  /**
   * Whether the event was created by an app.
   */
  boolean getAttributeToApp();

  /**
   * Whether the event was caused by an admin user.
   */
  boolean getAttributeToUser();

  /**
   * The date and time when the event was created.
   */
  OffsetDateTime getCreatedAt();

  /**
   * Whether the event is critical.
   */
  boolean getCriticalAlert();

  /**
   * A globally-unique ID.
   */
  String getId();

  /**
   * Human readable text that describes the event.
   */
  String getMessage();
}
