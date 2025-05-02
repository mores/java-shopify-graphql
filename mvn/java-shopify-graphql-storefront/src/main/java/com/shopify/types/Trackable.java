package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * Represents a resource that you can track the origin of the search traffic.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Article.class, name = "Article"),
    @JsonSubTypes.Type(value = Collection.class, name = "Collection"),
    @JsonSubTypes.Type(value = Page.class, name = "Page"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = SearchQuerySuggestion.class, name = "SearchQuerySuggestion")
})
public interface Trackable {
  /**
   * URL parameters to be added to a page URL to track the origin of on-site search
   * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
   * Returns a result when accessed through the
   * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
   * queries, otherwise returns null.
   */
  String getTrackingParameters();
}
