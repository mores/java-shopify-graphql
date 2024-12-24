package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;


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
  
  String getAction();

  
  String getAppTitle();

  
  boolean getAttributeToApp();

  
  boolean getAttributeToUser();

  
  OffsetDateTime getCreatedAt();

  
  boolean getCriticalAlert();

  
  String getId();

  
  String getMessage();
}
