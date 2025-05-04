package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.String;

/**
 * Represents a merchandising background operation interface.
 */
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
  /**
   * A globally-unique ID.
   */
  String getId();

  /**
   * The count of processed rows, summing imported, failed, and skipped rows.
   */
  Integer getProcessedRowCount();

  /**
   * Represents a rows objects within this background operation.
   */
  RowCount getRowCount();

  /**
   * The status of this operation.
   */
  ResourceOperationStatus getStatus();
}
