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
    @JsonSubTypes.Type(value = AddAllProductsOperation.class, name = "AddAllProductsOperation"),
    @JsonSubTypes.Type(value = CatalogCsvOperation.class, name = "CatalogCsvOperation"),
    @JsonSubTypes.Type(value = PublicationResourceOperation.class, name = "PublicationResourceOperation")
})
public interface ResourceOperation {
  
  String getId();

  
  Integer getProcessedRowCount();

  
  RowCount getRowCount();

  
  ResourceOperationStatus getStatus();
}
