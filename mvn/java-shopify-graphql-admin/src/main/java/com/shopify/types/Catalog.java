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
    @JsonSubTypes.Type(value = AppCatalog.class, name = "AppCatalog"),
    @JsonSubTypes.Type(value = CompanyLocationCatalog.class, name = "CompanyLocationCatalog"),
    @JsonSubTypes.Type(value = MarketCatalog.class, name = "MarketCatalog")
})
public interface Catalog {
  
  String getId();

  
  PriceList getPriceList();

  
  Publication getPublication();

  
  CatalogStatus getStatus();

  
  String getTitle();
}
