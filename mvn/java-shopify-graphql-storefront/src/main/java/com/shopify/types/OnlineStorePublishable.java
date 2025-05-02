package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * Represents a resource that can be published to the Online Store sales channel.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Article.class, name = "Article"),
    @JsonSubTypes.Type(value = Blog.class, name = "Blog"),
    @JsonSubTypes.Type(value = Collection.class, name = "Collection"),
    @JsonSubTypes.Type(value = Metaobject.class, name = "Metaobject"),
    @JsonSubTypes.Type(value = Page.class, name = "Page"),
    @JsonSubTypes.Type(value = Product.class, name = "Product")
})
public interface OnlineStorePublishable {
  /**
   * The URL used for viewing the resource on the shop's Online Store. Returns
   * `null` if the resource is currently not published to the Online Store sales channel.
   */
  String getOnlineStoreUrl();
}
