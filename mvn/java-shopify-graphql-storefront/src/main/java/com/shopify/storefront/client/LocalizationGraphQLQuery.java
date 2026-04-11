package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the shop's localization settings. Use this query to build [country and language selectors](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/markets)
 * for your storefront.
 *   
 * The [`country`](https://shopify.dev/docs/api/storefront/latest/queries/localization#returns-Localization.fields.country) and [`language`](https://shopify.dev/docs/api/storefront/latest/queries/localization#returns-Localization.fields.language) fields reflect the active localized experience. To change the context, use the
 * [`@inContext`](https://shopify.dev/docs/api/storefront#directives) directive
 * with your desired country or language code.
 */
public class LocalizationGraphQLQuery extends GraphQLQuery {
  public LocalizationGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public LocalizationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "localization";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public LocalizationGraphQLQuery build() {
      return new LocalizationGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
