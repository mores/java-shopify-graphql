package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.String;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CheckoutBrandingCustomFont.class, name = "CheckoutBrandingCustomFont"),
    @JsonSubTypes.Type(value = CheckoutBrandingShopifyFont.class, name = "CheckoutBrandingShopifyFont")
})
public interface CheckoutBrandingFont {
  
  String getSources();

  
  Integer getWeight();
}
