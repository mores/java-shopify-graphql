package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * Online Store preview URL of the object.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes(@JsonSubTypes.Type(value = Product.class, name = "Product"))
public interface OnlineStorePreviewable {
  /**
   * The [preview URL](https://help.shopify.com/manual/online-store/setting-up#preview-your-store) for the online store.
   */
  String getOnlineStorePreviewUrl();
}
