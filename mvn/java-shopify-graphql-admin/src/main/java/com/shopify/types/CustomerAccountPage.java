package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CustomerAccountAppExtensionPage.class, name = "CustomerAccountAppExtensionPage"),
    @JsonSubTypes.Type(value = CustomerAccountNativePage.class, name = "CustomerAccountNativePage")
})
public interface CustomerAccountPage {
  
  String getDefaultCursor();

  
  String getHandle();

  
  String getId();

  
  String getTitle();
}
