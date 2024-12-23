package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A default cursor that you can use in queries to paginate your results. Each edge in a connection can
 * return a cursor, which is a reference to the edge's position in the connection. You can use an edge's cursor as
 * the starting point to retrieve the nodes before or after it in a connection.
 *
 * To learn more about using cursor-based pagination, refer to
 * [Paginating results with GraphQL](https://shopify.dev/api/usage/pagination-graphql).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AbandonedCheckout.class, name = "AbandonedCheckout"),
    @JsonSubTypes.Type(value = Article.class, name = "Article"),
    @JsonSubTypes.Type(value = Company.class, name = "Company"),
    @JsonSubTypes.Type(value = CompanyLocation.class, name = "CompanyLocation"),
    @JsonSubTypes.Type(value = CustomerAccountAppExtensionPage.class, name = "CustomerAccountAppExtensionPage"),
    @JsonSubTypes.Type(value = CustomerAccountNativePage.class, name = "CustomerAccountNativePage"),
    @JsonSubTypes.Type(value = DraftOrder.class, name = "DraftOrder"),
    @JsonSubTypes.Type(value = Page.class, name = "Page"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = ProductVariant.class, name = "ProductVariant")
})
public interface Navigable {
  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  String getDefaultCursor();
}
