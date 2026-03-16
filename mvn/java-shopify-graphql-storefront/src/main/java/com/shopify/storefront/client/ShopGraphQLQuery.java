package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the [`Shop`](https://shopify.dev/docs/api/storefront/current/objects/Shop)
 * associated with the storefront access token. The `Shop` object provides
 * general store information such as the shop name, description, and primary domain.
 *   
 * Use this query to access data like store policies, [`PaymentSettings`](https://shopify.dev/docs/api/storefront/current/objects/PaymentSettings),
 * [`Brand`](https://shopify.dev/docs/api/storefront/current/objects/Brand)
 * configuration, and shipping destinations. It also exposes [`ShopPayInstallmentsPricing`](https://shopify.dev/docs/api/storefront/current/objects/ShopPayInstallmentsPricing) and [`SocialLoginProvider`](https://shopify.dev/docs/api/storefront/current/objects/SocialLoginProvider)
 * options for customer accounts.
 */
public class ShopGraphQLQuery extends GraphQLQuery {
  public ShopGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public ShopGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shop";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public ShopGraphQLQuery build() {
      return new ShopGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
