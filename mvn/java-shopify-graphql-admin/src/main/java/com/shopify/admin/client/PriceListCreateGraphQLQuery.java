package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PriceListCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`PriceList`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PriceList). Price lists enable contextual pricing by defining fixed prices or
 * percentage-based adjustments.
 *   
 * The price list requires a unique name, currency for fixed prices, and parent
 * adjustment settings that determine how the system calculates prices relative
 * to base prices. To apply contextual pricing, link the price list to a [`Catalog`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/Catalog).
 * When that catalog's context is matched, customers receive the price list's prices.
 *   
 * Learn more about [building catalogs with price lists](https://shopify.dev/docs/apps/build/markets/build-catalog#step-2-associate-a-price-list-with-the-catalog).
 */
public class PriceListCreateGraphQLQuery extends GraphQLQuery {
  public PriceListCreateGraphQLQuery(PriceListCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PriceListCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceListCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PriceListCreateInput input;

    private String queryName;

    public PriceListCreateGraphQLQuery build() {
      return new PriceListCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new price list.
     */
    public Builder input(PriceListCreateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
