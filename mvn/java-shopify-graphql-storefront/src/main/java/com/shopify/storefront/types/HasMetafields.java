package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.List;

/**
 * Implemented by resources that support custom metadata through
 * [`Metafield`](https://shopify.dev/docs/api/storefront/current/objects/Metafield)
 * objects. Types like
 * [`Product`](https://shopify.dev/docs/api/storefront/current/objects/Product), [`Collection`](https://shopify.dev/docs/api/storefront/current/objects/Collection), and
 * [`Customer`](https://shopify.dev/docs/api/storefront/current/objects/Customer)
 * implement this interface to provide consistent access to metafields.
 *
 * You can retrieve a [single metafield](https://shopify.dev/docs/api/storefront/current/interfaces/HasMetafields#fields-metafield)
 * by namespace and key, or fetch [multiple metafields](https://shopify.dev/docs/api/storefront/current/interfaces/HasMetafields#fields-metafields)
 * in a single request. If you omit the namespace, then the [app-reserved
 * namespace](https://shopify.dev/docs/apps/build/metafields#app-owned-metafields)
 * is used by default.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Article.class, name = "Article"),
    @JsonSubTypes.Type(value = Blog.class, name = "Blog"),
    @JsonSubTypes.Type(value = Cart.class, name = "Cart"),
    @JsonSubTypes.Type(value = Collection.class, name = "Collection"),
    @JsonSubTypes.Type(value = Company.class, name = "Company"),
    @JsonSubTypes.Type(value = CompanyLocation.class, name = "CompanyLocation"),
    @JsonSubTypes.Type(value = Customer.class, name = "Customer"),
    @JsonSubTypes.Type(value = Location.class, name = "Location"),
    @JsonSubTypes.Type(value = Market.class, name = "Market"),
    @JsonSubTypes.Type(value = Order.class, name = "Order"),
    @JsonSubTypes.Type(value = Page.class, name = "Page"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = ProductVariant.class, name = "ProductVariant"),
    @JsonSubTypes.Type(value = SellingPlan.class, name = "SellingPlan"),
    @JsonSubTypes.Type(value = Shop.class, name = "Shop")
})
public interface HasMetafields {
  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  Metafield getMetafield();

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  List<Metafield> getMetafields();
}
