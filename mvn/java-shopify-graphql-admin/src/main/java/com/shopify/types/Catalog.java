package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A list of products with publishing and pricing information.
 * A catalog can be associated with a specific context, such as a
 * [`Market`](https://shopify.dev/api/admin-graphql/current/objects/market), [`CompanyLocation`](https://shopify.dev/api/admin-graphql/current/objects/companylocation),
 * or [`App`](https://shopify.dev/api/admin-graphql/current/objects/app).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppCatalog.class, name = "AppCatalog"),
    @JsonSubTypes.Type(value = CompanyLocationCatalog.class, name = "CompanyLocationCatalog"),
    @JsonSubTypes.Type(value = MarketCatalog.class, name = "MarketCatalog")
})
public interface Catalog {
  /**
   * A globally-unique ID.
   */
  String getId();

  /**
   * The price list associated with the catalog.
   */
  PriceList getPriceList();

  /**
   * A group of products and collections that's published to a catalog.
   */
  Publication getPublication();

  /**
   * The status of the catalog.
   */
  CatalogStatus getStatus();

  /**
   * The name of the catalog.
   */
  String getTitle();
}
