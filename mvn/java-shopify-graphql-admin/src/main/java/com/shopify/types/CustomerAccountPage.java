package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A customer account page.
 */
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
  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  String getDefaultCursor();

  /**
   * A unique, human-friendly string for the customer account page.
   */
  String getHandle();

  /**
   * The unique ID for the customer account page.
   */
  String getId();

  /**
   * The title of the customer account page.
   */
  String getTitle();
}
